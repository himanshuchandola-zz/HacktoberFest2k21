# 1. Add Single player option
# 2. Add difficulty level
#     a. Easy : Will move or mark randomly at any available location. 
#               The computer will play games without any intelligence 
#               and purely on luck
#     b. Medium : Use AI to determine all possible best moves for 
#                 itself and opponent. If occupy any two places from three 
#                 winning places and third one is empty then absolutely 
#                 that is the best move for relative player.

#   What strategy will the computer follow
#   --------------------------------------
#   1. if best move available for computer then will move or mark at that place
#   2. Otherwise Check best move available for opponent / user
#   3. if yes, then will move or mark at that place and stop opponent to won 
#   4. Otherwise move or mark randomly

'''

# What's learn New 
# ----------------
# clr scr option 1
# from google.colab import output
# output.clear()

# clr scr option 2
# from IPython.display import clear_output
# clear_output()

# winner cases
# https://reactjs.org/tutorial/tutorial.html#declaring-a-winner
winCases = [['1', '2', '3'],['4', '5', '6'],['7', '8', '9'], (horizontal)
            ['1', '4', '7'],['2', '5', '8'],['3', '6', '9'], (vertical)
            ['1', '5', '9'],['3', '5', '7']]  (diagonal)

# use random module to select random element from list or dict

# global keyword used to modify the global variable 
# outside of the current scope like inside function. 


print(" 1 | 2 | 3 ")
print("---+---+---")
print(" 4 | 5 | 6 ")
print("---+---+---")
print(" 7 | 8 | 9 ")

'''


from google.colab import output
import random

board = {"1":"1", "2":"2", "3":"3",
          "4":"4", "5":"5", "6":"6",
          "7":"7", "8":"8", "9":"9"
          }
symb = ["✘","♜"]
moves = 0
msg = ''
p1 = ''
p2 = ''
activePlayer = 'none'
difficultyLevel = 'Easy'
isSinglePlayer = False
# for bot ai move
bestMove = {'player1':[],'player2':[]}


def enterInGame():
  global p1, p2, activePlayer, isSinglePlayer, difficultyLevel

  print("\n      Tic Tac Toe       \n      ............ \n ")
  print(" Select an Option: ")
  print(" ----------------- \n 1 - Single Player \n 2 - MultiPlayer \n")
  user = input("\n")
  if user == "1":
    output.clear() 
    print("\n      Tic Tac Toe       \n      ............ \n ")
    print(" Select Difficulty Level: ")
    print(" ----------------- \n 1 - Easy \n 2 - Medium \n")
    lev = input("\n")
    output.clear()
    print("\n      Tic Tac Toe       \n      ............ \n ")
    if lev == "1":
      difficultyLevel = "Easy"
    elif lev == "2":
      difficultyLevel = "Medium"
    else:
      output.clear()
      enterInGame()
    p1 = input("Enter Your Name - (" + symb[0] + "):").upper()
    p2 = "Computer"
    isSinglePlayer = True
  elif user == "2":
    output.clear()
    print("\n      Tic Tac Toe       \n      ............ \n ")
    p1 = input("Enter Name of Player 1 - (" + symb[0] + "):").upper()
    p2 = input("Enter Name of Player 2 - (" + symb[1] + "):").upper()
  else:
    output.clear()
    enterInGame()  
  activePlayer = p1


def randMove(d):
  ls = []
  for i in d.values():
    if i != symb[0] and i !=  symb[1]:
      ls.append(i)
  return random.choice(ls)



def computersTurn():
   if difficultyLevel == "Easy":    
      validateInput(randMove(board)) 
   if difficultyLevel == "Medium":    
      difMedium()



def difMedium():
  winCases = [['1', '2', '3'],['4', '5', '6'],['7', '8', '9'],
              ['1', '4', '7'],['2', '5', '8'],['3', '6', '9'],
              ['1', '5', '9'],['3', '5', '7']]

  bestMove['player1'].clear()
  bestMove['player2'].clear()

  for i in winCases:
        # check if any two pos. same and 3rd null
        if board[i[0]] == board[i[1]] and not(board[i[2]] in symb):
          # add pos to bestMove list for relative player
          if board[i[0]] == symb[0]:
            bestMove['player1'].append(i[2])
          else:
            bestMove['player2'].append(i[2])
        elif board[i[0]] == board[i[2]] and not(board[i[1]] in symb):
          if board[i[0]] == symb[0]:
            bestMove['player1'].append(i[1])
          else:
            bestMove['player2'].append(i[1])
        elif board[i[1]] == board[i[2]] and not(board[i[0]] in symb):  
          if board[i[0]] == symb[0]:
            bestMove['player1'].append(i[0])
          else:
            bestMove['player2'].append(i[0])

  # first try to win by done 3 match
  if len(bestMove['player2']) > 0:
    validateInput(random.choice(bestMove['player2']))
  # else Try to stop the opponent from winning 
  elif len(bestMove['player1']) > 0:
    validateInput(random.choice(bestMove['player1'])) 
   # else random move
  else:
    validateInput(randMove(board))

# end difMedium()


def isWinner():
    global activePlayer, moves, msg
    winCases = [['1', '2', '3'],['4', '5', '6'],['7', '8', '9'],
                ['1', '4', '7'],['2', '5', '8'],['3', '6', '9'],
                ['1', '5', '9'],['3', '5', '7']]
    winplayer = False
    
    for i in winCases:
      if board[i[0]] == board[i[1]] and board[i[1]] == board[i[2]]:
        winplayer = True
        if activePlayer == p1:
          msg = " >>  Winner: " + p2 +"  << "          
        else:
           msg = " >>  Winner: " + p1 +"  << "        
        refreshScr(msg)         
        break
        # end loop

    if winplayer == False:
      if moves == 9:
        msg = " >>  DRAW !  << "
        refreshScr(msg)
      else:
        refreshScr("none")




def resetGame():
    global board, moves, msg
    board = {"1":"1", "2":"2", "3":"3",
             "4":"4", "5":"5", "6":"6",
             "7":"7", "8":"8", "9":"9"
             }
    moves = 0
    msg = ''
    refreshScr("none")


def validateInput(key):
    global board, activePlayer, moves, msg    
    if key == "N" or key == 'n':
      resetGame()

    elif key == "Q" or key == 'q':
      pass
    elif len(msg) > 5:
      refreshScr(msg)

    elif key in board and board[key] != symb[0]  and board[key] != symb[1]:
      moves += 1
      if(activePlayer == p1):
        board[key] = symb[0]
        activePlayer = p2
      else:
        board[key] = symb[1]
        activePlayer = p1
      isWinner()
    else:
      refreshScr("err")
      


def refreshScr(typ):
  output.clear()
  
  print("\n      Tic Tac Toe       \n      ............ \n ")

  print("   Player 1 (" + symb[0] + ") - ", p1)
  print("   Player 2 (" + symb[1] + ") - ", p2)

  print('\n N - New Game | Q - Exit \n')
  
  print("    ", board['1'], "|", board['2'], "|", board['3'], "     ")
  print("    ---+---+---    ")
  print("    ", board['4'], "|", board['5'], "|", board['6'], "     ")
  print("    ---+---+---    ")
  print("    ", board['7'], "|", board['8'], "|", board['9'], "     ")

  print("")

  if isSinglePlayer and activePlayer == p2 and p2 == "Computer" and typ == "none":
    computersTurn()
  elif(typ == "none"):
    key = input(activePlayer + ", enter a number : ")
  elif(typ == 'err'):
    key = input(activePlayer + ", enter a valid number : ")
  else:
    print(typ,"\n")
    print(" Select an Option: ")
    print(" ----------------- \n N - New Game \n Q - Exit \n")
    key = input("")

  validateInput(key)

# start Game
enterInGame()
refreshScr("none")