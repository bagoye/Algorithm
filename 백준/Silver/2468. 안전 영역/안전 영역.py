from collections import deque
import sys
input = sys.stdin.readline

n = int(input())
graph = []
maxNum = 0
 
for i in range(n):
    graph.append(list(map(int, input().rstrip().split())))
    for j in range(n):
        if graph[i][j] > maxNum:
            maxNum = graph[i][j] 
 
dx, dy = [0 ,0, 1, -1], [1, -1, 0 ,0]

def bfs(a, b, value, visited):
    q = deque()
    q.append((a, b))
    visited[a][b] = 1
 
    while q:
        x, y = q.popleft()
 
        for i in range(4):
            nx, ny = x + dx[i], y + dy[i]
            if 0 <= nx < n and 0 <= ny < n:
                if graph[nx][ny] > value and visited[nx][ny] == 0:
                    visited[nx][ny] = 1
                    q.append((nx, ny))
ans = 0
for i in range(maxNum): 
    visited = [[0] * n for i in range(n)]
    cnt = 0
 
    for j in range(n):
        for k in range(n):
            if graph[j][k] > i and visited[j][k] == 0: 
                bfs(j, k, i, visited)
                cnt += 1
 
    if ans < cnt:
        ans = cnt
 
print(ans)