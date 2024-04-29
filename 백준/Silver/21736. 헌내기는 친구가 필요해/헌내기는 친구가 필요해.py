from collections import deque
import sys
input = sys.stdin.readline

n, m = map(int, input().split())
campus = []
start = ()

for i in range(n):
    row = list(input().rstrip())
    for j in range(m):
        if row[j] == 'I':
            start = (i, j)
    campus.append(row)
    

# BFS
dx, dy = [1, 0, -1, 0], [0, 1, 0, -1]
visited = [[0]*m for _ in range(n)]
res = 0 # 만날 수 있는 사람 수

q = deque()
q.append(start)
visited[start[0]][start[1]] = 1

while(q):
    x, y = q.popleft()
    
    for i in range(4):
        nx, ny = x + dx[i], y + dy[i]
        
        # 캠퍼스를 벗어나지 않는 구역이고
        if 0 <= nx < n and 0 <= ny < m:
            # 벽이 아니고 방문하지 않은 곳이면 방문
            if campus[nx][ny] != 'X' and not visited[nx][ny]:
                q.append((nx, ny))
                visited[nx][ny] = 1
                
                # 사람이면 +1
                if campus[nx][ny] == 'P':
                    res += 1
                    
print(res if res > 0 else 'TT')