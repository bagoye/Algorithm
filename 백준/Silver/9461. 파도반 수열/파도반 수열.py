import sys
input = sys.stdin.readline
arr = [0, 1, 1, 1] + [0 for x in range(97)]

for _ in range(int(input())):
  n = int(input())
  for x in range(4, n + 1):
        arr[x] = arr[x - 2] + arr[x - 3]

  print(arr[n])