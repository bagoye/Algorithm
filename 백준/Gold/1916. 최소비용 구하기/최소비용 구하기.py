import sys
input = sys.stdin.readline
INF = int(1e9)

n = int(input())
m = int(input())

edges = []
for i in range(m): #간선 저장
    edges.append(tuple(map(int, input().split())))

st, ed = map(int, input().split())

dist = [INF]*(n+1)
def bf(start): #벨만-포드 알고리즘
    dist[start] = 0
    for i in range(n):
        for j in range(m):
            cur = edges[j][0]
            dest = edges[j][1]
            cost = edges[j][2]
            if dist[cur] != INF and dist[dest] > dist[cur] + cost:
                dist[dest] = dist[cur]+cost
                if i == n-1:
                    return True #사이클이 존재함
    return False
hasCycle = bf(st)

print(dist[ed])