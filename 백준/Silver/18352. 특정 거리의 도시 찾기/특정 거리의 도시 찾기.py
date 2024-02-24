from collections import deque
import sys
input = sys.stdin.readline

n, m, k, x = map(int, input().split())
graph = [[] for _ in range(n + 1)]
distance = [0] * (n + 1)
visited = [0] * (n + 1)

for _ in range(m):
  a, b =  map(int, input().split())  
  graph[a].append(b)

def bfs(start):
    answer = []
    q = deque()
    q.append(start)
    visited[start] = 1
    distance[start] = 0
    while q:
        temp = q.popleft()
        for i in graph[temp]:
            if not visited[i]:
                visited[i] = 1
                q.append(i)
                distance[i] = distance[temp] + 1
                if distance[i] == k:
                    answer.append(i)
                    
    if len(answer) == 0:
        print(-1)
    else:
        answer.sort()
        for i in answer:
            print(i, end='\n')

bfs(x)