from collections import deque
import sys
input = sys.stdin.readline

N, M, R = map(int, input().split())
graph = [[] for _ in range(N+1)]

# BFS 탐색 (탐색할 그래프, 노드 수, 시작 지점)
for _ in range(M):
    u, v = map(int, input().split())
    graph[u].append(v)
    graph[v].append(u)

visited = [0]*(N+1) #방문 여부를 확인할 리스트
visited[R] = 1 #시작 노드 방문

queue = deque([R]) #인접 노드를 저장할 Queue

#모든 노드를 탐색할 때까지 반복
cnt = 1
while queue:
    #방문 노드
    node = queue.popleft()
    graph[node].sort()  # 오름차순으로 방문

    #방문한 노드의 주변 노드를 큐에 삽입
    for i in graph[node]:
        #방문하지 않는 주변 노드일 경우
        if not visited[i]:
            queue.append(i) #큐에 추가
            cnt += 1
            visited[i] = cnt #방문

#출력
for i in visited[1:]:
    print(i)