from collections import deque

def solution(n, computers):
    answer = 0
    visited = [0] * n
    q = deque()
    def bfs(start):
        q.append(start)
        while q:
            v = q.popleft()
            if visited[v] == 0:
                visited[v] = 1
            for i in range(len(computers)):
                if computers[v][i] == 1 and visited[i] == 0:
                    q.append(i)
    while 0 in visited:
        answer += 1
        bfs(visited.index(0))
    return answer