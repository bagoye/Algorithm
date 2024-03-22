from collections import deque
import sys
input = sys.stdin.readline

N, M, r = map(int, input().split())
a = [list(map(int, input().split())) for _ in range(N)]

dx, dy = [0, 1, 0, -1], [1, 0, -1, 0]
depth = min(N, M) // 2

for d in range(depth):
    x, y = d, d
    n, m = N - d*2, M - d*2
    q = deque()
    for i in range(4):
        while True:
            nx, ny = x + dx[i], y + dy[i]
            if d <= nx < d + n and d <= ny < d + m:
                q.append(a[nx][ny])
                x, y = nx, ny
            else:
                break

    rotate = r % (2*(n-1) + 2*(m-1))
    for _ in range(rotate):
        q.append(q.popleft())

    for i in range(4):
        while True:
            nx, ny = x + dx[i], y + dy[i]
            if d <= nx < d + n and d <= ny < d + m:
                a[nx][ny] = q.popleft()
                x, y = nx, ny
            else:
                break

for x in a:
    print(' '.join(map(str, x)))
