import sys 
input = sys.stdin.readline

n, m = map(int, input().split())
arr = sorted(list(map(int, input().split())))
res = []

def bfs():
  if len(res) == m:
    print(*res)
    return
  
  for i in range(n):
    res.append(arr[i])
    bfs()
    res.pop()

bfs()