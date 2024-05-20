from collections import deque

def bfs(x, y, maps, visited):
    dx, dy = [1, -1, 0, 0], [0, 0, 1, -1]
    q = deque()
    q.append([x, y])
    visited[x][y] = 1

    stay = int(maps[x][y])

    while q:
        x, y = q.popleft()
        for i in range(4):
            nx, ny = x + dx[i], y + dy[i]
            if 0 <= nx < len(maps) and 0 <= ny < len(maps[0]):
                if maps[nx][ny] != 'X' and visited[nx][ny] != 1:
                    q.append((nx, ny))
                    visited[nx][ny] = 1
                    stay += int(maps[nx][ny])
    return stay

def solution(maps):
    answer = []
    n, m = len(maps), len(maps[0])
    visited = [[0] * m for _ in range(n)]
    
    for i in range(n):
        for j in range(m):
            if maps[i][j] != 'X' and visited[i][j] == 0:
                answer.append(bfs(i, j, maps, visited))
                
    if answer:
        return sorted(answer) 
    else:
        return [-1]