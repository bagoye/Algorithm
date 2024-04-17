from collections import deque
import sys
input = sys.stdin.readline

dx, dy, dz = [0, 0, 1, -1, 0, 0], [0, 0, 0, 0, 1, -1], [1, -1, 0, 0, 0, 0]

def bfs(x, y, z):
    q.append([x, y, z])
    visited[x][y][z] = 1
    while q:
        x, y, z = q.popleft()
        for i in range(6):
            nx, ny, nz = x + dx[i], y + dy[i], z + dz[i]
            if 0<=nx<l and 0<=ny<r and 0<=nz<c:
                if board[nx][ny][nz] == "E":
                    print(f"Escaped in {visited[x][y][z]} minute(s).")
                    return
                if board[nx][ny][nz] == "." and visited[nx][ny][nz] == 0:
                    visited[nx][ny][nz] = visited[x][y][z] + 1
                    q.append([nx, ny, nz])
    print("Trapped!")

while True:
    l, r, c = map(int, input().split())
    if l == 0 and r == 0 and c == 0:
        break
    
    board = []
    for _ in range(l):
        board.append([list(input().strip()) for _ in range(r)])
        input()

    visited = [[[0] * c for _ in range(r)] for _ in range(l)]
    q = deque()

    for i in range(l):
        for j in range(r):
            for k in range(c):
                if board[i][j][k] == 'S':
                    bfs(i, j, k)