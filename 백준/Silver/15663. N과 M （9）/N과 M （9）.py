import sys
input = sys.stdin.readline

n, m = map(int, input().split())
arr = sorted(list(map(int, input().split())))
visited = [0] * n
res = []

def dfs():
  if len(res) == m:
    print(*res)
    return
  temp = 0
  for i in range(n):
    if not visited[i] and temp != arr[i]:
      visited[i] = 1
      res.append(arr[i])
      temp = arr[i]
      dfs()
      visited[i] = 0
      res.pop()

dfs()