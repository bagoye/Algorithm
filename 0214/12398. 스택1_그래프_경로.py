def DFS(v):
    visited[v] = 1
    for w in G[v]:
        if not visited[w]:
            DFS(w)

for tc in range(1, int(input())+1):
    V, E = map(int, input().split())  # V: 노드 수, E: 간선 수
    G = [[] for _ in range(V+1)]  # 인접리스트
    visited = [0] * (V+1)

    for _ in range(E):  # 간선 수만큼 반복
        u, v = map(int, input().split())
        G[u].append(v)

    s, e = map(int, input().split())  # s: 출발, e: 도착

    DFS(s)
    print(f'#{tc} {visited[e]}')