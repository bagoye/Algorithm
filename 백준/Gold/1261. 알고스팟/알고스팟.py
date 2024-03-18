from collections import deque

n, m = map(int, input().split())
graph = [list(map(int, input())) for _ in range(m)]
visited = [[-1] * n for _ in range(m)]
dx, dy = [1, 0, -1, 0], [0, 1, 0, -1]


def bfs(a, b):
    queue = deque()
    queue.append([a, b])
    visited[0][0] = 0

    while queue:
        x, y = queue.popleft()
        for i in range(4):
            nx, ny = x + dx[i], y + dy[i] 
            if nx < 0 or nx >= m or ny < 0 or ny >= n:
                continue

            if visited[nx][ny] == -1:
                if graph[nx][ny] == 0:
                    visited[nx][ny] = visited[x][y]
                    queue.appendleft([nx, ny])
                else:
                    visited[nx][ny] = visited[x][y] + 1
                    queue.append([nx, ny])


bfs(0, 0)
print(visited[m - 1][n - 1])