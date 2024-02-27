import sys
input = sys.stdin.readline

arr = [int(input()) for _ in range(9)]
arr.sort()

sumArr = sum(arr)
for i in range(len(arr)):
  for j in range(i + 1, len(arr)):
    if sumArr - arr[i] - arr[j] == 100:
      for k in range(len(arr)):
        if k == i or k == j:
          pass
        else:
          print(arr[k])
      exit()