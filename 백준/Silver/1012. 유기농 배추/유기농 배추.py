import sys
input = sys.stdin.readline

def bfs(x, y):
  q = [(x, y)]
  land[x][y] = 0

  while q:
    x, y = q.pop(0)

    for i in range(4):
      nx, ny = x + dx[i], y + dy[i]

      if nx < 0 or nx >= m or ny < 0 or ny >= n:
        continue

      if land[nx][ny] == 1:
        q.append((nx, ny))
        land[nx][ny] = 0

dx, dy = [-1, 1, 0, 0], [0, 0, -1, 1]

for _  in range(int(input())):
  m, n, k = map(int, input().split())
  land = [[0] * n for _ in range(m)]
  cnt = 0

  for j in range(k):
    x, y = map(int, input().split())
    land[x][y] = 1
  
  for x in range(m):
    for y in range(n):
      if land[x][y] == 1:
        bfs(x, y)
        cnt += 1
    
  print(cnt)