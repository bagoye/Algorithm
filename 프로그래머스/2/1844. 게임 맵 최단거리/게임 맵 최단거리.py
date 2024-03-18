from collections import deque

dx, dy = [1, 0, -1, 0], [0, 1, 0, -1]

def solution(maps):
    n = len(maps[0])
    m = len(maps)
    visited = [[0 for _ in range(n)] for _ in range(m)]
    visited[0][0] = 1
    
    q = deque()
    q.append((0, 0))
    
    while len(q):
        x, y = q.popleft()
        for i in range(4):
            nx, ny = x + dx[i], y + dy[i]
            if nx < 0 or nx >= m or ny < 0 or ny >= n:
                continue
            if maps[nx][ny] == 1 and visited[nx][ny] == 0:
                visited[nx][ny] = visited[x][y] + 1
                q.append((nx, ny))
                
    if visited[m-1][n-1] == 0:
        return -1
    
    return visited[m-1][n-1]