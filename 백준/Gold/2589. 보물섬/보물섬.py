from collections import deque
import sys
input = sys.stdin.readline

n, m = map(int, input().split())
map = [list(input().rstrip()) for _ in range(n)]

dx, dy = [0, 1, 0, -1], [-1, 0, 1, 0]

def bfs(x, y):
    q = deque()
    q.append([x, y])
    visited = [[0] * m for _ in range(n)]
    visited[x][y] = 1
    num = 0
    while q:
        x, y = q.popleft()
        for i in range(4):
            nx, ny = x + dx[i], y + dy[i]
            if 0 <= nx < n and 0 <= ny < m:
                if map[nx][ny] == 'L' and visited[nx][ny] == 0:
                    visited[nx][ny] = visited[x][y] + 1
                    num = max(num, visited[nx][ny])
                    q.append([nx, ny])
    return num-1

cnt = 0
for i in range(n):
    for j in range(m):
        if map[i][j] == 'L':
            cnt = max(cnt, bfs(i, j))

print(cnt)