from collections import deque
import sys
input = sys.stdin.readline

n, m = map(int, input().split())
graph = [list(map(int, input().split())) for _ in range(n)]
visited = [[0] * m for _ in range(n)]
dx, dy = [0, 1, 0, -1], [-1, 0, 1, 0]
result = []

def bfs(x, y):
  cnt = 1
  q = deque()
  q.append([x, y])
  while q:
    x, y = q.popleft()
    for i in range(4):
      nx, ny = x + dx[i], y + dy[i]
      if 0 <= nx < n and 0<= ny < m:
        if visited[nx][ny] == 0 and graph[nx][ny] == 1:
          cnt += 1
          visited[nx][ny] += 1
          q.append([nx, ny])

  return cnt

for i in range(n):
  for j in range(m):
    if graph[i][j] == 1 and visited[i][j] == 0:
      visited[i][j] += 1
      pic = bfs(i, j)
      result.append(pic)

if len(result) == 0:
  print(len(result))
  print(0)
else: 
  print(len(result))
  print(max(result))