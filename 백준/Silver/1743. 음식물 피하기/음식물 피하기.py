import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**5)

n, m, k = map(int, input().split())
graph = [[0]*m for _ in range(n)]

for _ in range(k):
    a, b = map(int, input().split())
    graph[a-1][b-1] = 1
    
visit = [[False]*m for _ in range(n)]
dx, dy = [0, 0, -1, 1], [-1, 1, 0, 0]
answer = 0

def dfs(x, y):
    global cnt
    for i in range(4):
        nx, ny = x + dx[i], y + dy[i]
        if 0 <= nx < n and 0 <= ny < m:
            if graph[nx][ny] == 1 and not visit[nx][ny]:
                visit[nx][ny] = True
                cnt += 1
                dfs(nx, ny)

for i in range(n):
    for j in range(m):
        if graph[i][j] == 1 and not visit[i][j]:
            cnt = 0
            dfs(i, j)
            answer = max(answer, cnt)
            
print(answer)