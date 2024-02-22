import sys
sys.setrecursionlimit(300000)

def dfs(node):
    for n in graph[node]:
        if v[n] == 0:
            v[n] = v[node]+1
            dfs(n)
            
n = int(input())
a, b = map(int, input().split())
m = int(input())

graph = [[] for _ in range(n + 1)]
v = [0] * (n + 1)

for _ in range(m):
    x, y = map(int, input().split())
    graph[x].append(y)
    graph[y].append(x)
    
dfs(a)

print(v[b] if v[b] > 0 else -1)