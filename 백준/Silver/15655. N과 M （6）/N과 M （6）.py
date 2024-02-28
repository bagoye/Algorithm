import sys
input = sys.stdin.readline

n, m = map(int, input().split())
arr = sorted(list(map(int, input().split())))
result = []

def bfs(start):
  if len(result) == m:
    print(*result)
    return
  
  for i in range(start, n):
    if arr[i] not in result:
      result.append(arr[i])
      bfs(i+1)
      result.pop()

bfs(0)