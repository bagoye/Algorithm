import sys
input = sys.stdin.readline

n, m = map(int, input().split())
arr = sorted(list(map(int, input().split())))
result = []

def bfs():
  if len(result) == m:
    print(*result)
    return
  
  for i in arr:
    if i not in result:
      result.append(i)
      bfs()
      result.pop()

bfs()