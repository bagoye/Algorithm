import sys
from collections import deque

input = sys.stdin.readline

n = int(input())
graph = [[] for i in range(n+1)]
for _ in range(n-1):
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)

q = deque()
q.append(1)

ans = [0]*(n+1)

def bfs():
    while q:
        x = q.popleft()
        for i in graph[x]:
            if ans[i] == 0:
                ans[i] = x
                q.append(i)

bfs()
res = ans[2:]
for x in res:
    print(x)