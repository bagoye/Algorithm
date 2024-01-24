from collections import deque
import sys
input = sys.stdin.readline

n = int(input())
bridge = list(map(int, input().split()))
a, b = map(int, input().split())

def bfs(a, b, bridge, n):
    q = deque()
    q.append(a-1)
    visited = [-1]*n
    visited[a-1] = 0

    while q:
        node = q.popleft()
        for i in range(n):
            if (i-node) % bridge[node] == 0 and visited[i] == -1:
                q.append(i)
                visited[i] = visited[node] + 1
                if i == b-1:
                    return visited[i]
    return -1


print(bfs(a, b, bridge, n))