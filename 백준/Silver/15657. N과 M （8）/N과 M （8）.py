import sys
input = sys.stdin.readline

n, m = map(int, input().split())
arr = sorted(list(map(int, input().split())))
res = []

def bfs(start):
  if len(res) == m:
    print(*res)
    return
  
  for i in range(start, n):
    res.append(arr[i])
    bfs(i)
    res.pop()

bfs(0)