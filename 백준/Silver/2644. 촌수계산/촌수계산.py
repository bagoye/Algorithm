from collections import deque
import sys
input = sys.stdin.readline

n = int(input())
a, b = map(int, input().split())
m = int(input())

graph = [[] for _ in range(n + 1)]
v = [0 for _ in range(n+1)]

for i in range(m):
  x, y= map(int, input().split())
  graph[x].append(y)
  graph[y].append(x)

def bfs(x, y):
  q = deque([x])
  v[x] = 0

  while q:
    people = q.popleft()
    if people == y:
      return v[y]
    for i in graph[people]:
      if v[i] == 0:
        q.append(i)
        v[i] = v[people] + 1
    
  return -1

print(bfs(a, b))