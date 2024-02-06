from collections import deque
import sys
input = sys.stdin.readline

def BFS(x,y):
    q.append((x, y))
    visited[x][y] = 1
    while q:
        x, y = q.popleft()
        for i in range(4):
            nx, ny = x + dx[i], y + dy[i]
            if 0 <= nx < n and 0 <= ny < n and a[nx][ny] == a[x][y] and not visited[nx][ny]:
                visited[nx][ny] = 1
                q.append((nx,ny))


n = int(input())
a = [list(input()) for _ in range(n)]
q = deque()
visited = [[0] * n for _ in range(n)]
dx, dy = [-1,0,1,0], [0,1,0,-1]

cnt1 = 0
for i in range(n):
    for j in range(n):
        if not visited[i][j]:
            BFS(i,j)
            cnt1 += 1

for i in range(n):
    for j in range(n):
        if a[i][j] == 'G':
            a[i][j] = 'R'

visited = [[0] * n for _ in range(n)]
cnt2 = 0
for i in range(n):
    for j in range(n):
        if not visited[i][j]:
            BFS(i,j)
            cnt2 += 1

print(cnt1, cnt2)