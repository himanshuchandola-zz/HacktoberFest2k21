def ISort(arr):

    #traverse through range of array
   for i in range(1, len(arr)):
      #move elements of array
      # greater than ele, to one position ahead
      # of their current position
      ele = arr[i]
      j = i-1
      while j >= 0 and ele < arr[j] :
            arr[j + 1] = arr[j]
            j -= 1
      arr[j + 1] = ele

arr=[]

#get an array as an input
arr = [int(item) for item in input("Enter elements of an array: ").split()]

ISort(arr)
#print array
print ("Sorted elements are: ")
for i in range(len(arr)):
   print (arr[i])
