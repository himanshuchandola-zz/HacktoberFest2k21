def ISort(arr):

    #traverse through range of array
   for i in range(1, len(arr)):
      #move elements of array
      # greater than ele, to one position ahead
      # of their current position
      ele = arr[i]
      pos = i-1
      while pos >= 0 and ele < arr[pos] :
            arr[pos + 1] = arr[pos]
            pos -= 1
      arr[pos + 1] = ele

arr=[]

#get an array as an input
arr = [int(item) for item in input("Enter elements of an array: ").split()]

ISort(arr)
#print array
print ("Sorted elements are: ")
for i in range(len(arr)):
   print (arr[i])
