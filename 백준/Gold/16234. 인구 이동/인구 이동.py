from collections import deque 
import sys
input = sys.stdin.readline

N, L, R = map(int, input().split())
pan = [list(map(int, input().split())) for _ in range(N)]
q = deque()
dx, dy = [1,0,-1,0], [0,1,0,-1]

def bfs(x,y):
    q.append((x,y))
    union = []
    union.append((x,y))
    
    while q:
        x, y = q.popleft()
        for i in range(4):
            nx, ny = x + dx[i], y + dy[i]
            if nx>=N or ny>=N or ny<0 or nx<0 or visited[nx][ny]==1:
                continue
            if R>=abs(pan[x][y]-pan[nx][ny])>=L:
                visited[nx][ny] = 1
                q.append((nx,ny))
                union.append((nx,ny))
                
    if len(union)<=1:
        return 0
    
    result = sum(pan[x][y] for x, y in union)//len(union)
    
    for a, b in union:
        pan[a][b] = result
        
    return 1

day = 0
while 1:
    stop = 0
    visited = [[0]*N for _ in range(N)]
    for i in range(N):
        for j in range(N):
            if visited[i][j] == 0:
                visited[i][j] = 1
                stop += bfs(i,j)
    if stop==0:
        break
    day += 1
print(day)