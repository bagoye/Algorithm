import sys
input = sys.stdin.readline

arr = [int(input()) for _ in range(9)]
arr.sort()

seven = []
def dfs(depth, s):
  if depth == 7:
    if sum(seven) == 100:
      for j in sorted(seven):
        print(j)
      exit()
    else:
      return
  
  for i in range(s, len(arr)):
    seven.append(arr[i])
    dfs(depth + 1, i + 1)
    seven.pop()

dfs(0, 0)