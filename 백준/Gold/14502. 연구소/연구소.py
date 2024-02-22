from collections import deque
import sys
input = sys.stdin.readline

n, m = map(int, input().split())
lab = [list(map(int, input().split())) for _ in range(n)]
dx, dy = [0, 1, 0, -1], [1, 0, -1, 0]
res = 0

def wall(cnt):
  if cnt == 3:
    bfs()
    return
  
  for i in range(n):
    for j in range(m):
      if lab[i][j] == 0:
        lab[i][j] = 1
        wall(cnt + 1)
        lab[i][j] = 0

def bfs():
  q = deque()
  for i in range(n):
      for j in range(m):
          if lab[i][j] == 2:
              q.append((i, j))
  newLab = [a[:] for a in lab]

  while q:
    x, y = q.popleft()
    for i in range(4):
       nx, ny = x + dx[i], y + dy[i]
       if 0 <= nx < n and 0 <= ny < m:
          if newLab[nx][ny] == 0: # 감염 여부 확인
             newLab[nx][ny] = 2
             q.append((nx, ny))

  global res
  cnt = 0

  for i in range(n):
     cnt += newLab[i].count(0)

  res = max(res, cnt)

wall(0)
print(res)