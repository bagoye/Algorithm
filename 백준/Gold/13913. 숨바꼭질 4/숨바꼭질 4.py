from collections import deque

import sys
input = sys.stdin.readline

n, k = map(int, input().split())
visited = [0] * 100001
check = [0] * 100001

def bfs():
    q = deque()
    q.append(n)
    while q:
        v = q.popleft()
        if v == k:
            print(visited[v])
            ans = []
            while v != n:
                ans.append(v)
                v = check[v]
            ans.append(n)
            ans.reverse()
            print(' '.join(map(str, ans)))
            return
        for nx in (v - 1, v + 1, v * 2):
            if 0 <= nx < 100001 and not visited[nx]:
                visited[nx] = visited[v] + 1
                q.append(nx)
                check[nx] = v

bfs()