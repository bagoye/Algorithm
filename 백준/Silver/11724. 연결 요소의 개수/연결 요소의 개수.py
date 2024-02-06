import sys
from collections import deque

input = sys.stdin.readline

def bfs(v):
    q = deque([v])
    visited[v] = 1
    while q:
        x = q.popleft()
        for i in graph[x]:
            if not visited[i]:
                visited[i] = 1
                q.append(i)

n, m = map(int, input().split())
graph = [[] for _ in range(n + 1)]

for _ in range(m):
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)

visited = [0] * (1 + n)
cnt = 0

for i in range(1, n + 1):
    if not visited[i]:
        if not graph[i]:
            cnt += 1
            visited[i] = 1
        else:
            bfs(i)
            cnt += 1
print(cnt)