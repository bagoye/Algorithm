from collections import deque
import sys

input = sys.stdin.readline

n, m = map(int, input().split())

board = [0] * 101
visited = [False] * 101

ladder = dict()
snake = dict()

for _ in range(n):
    x, y = map(int, input().split())
    ladder[x] = y
for _ in range(m):
    x, y = map(int, input().split())
    snake[x] = y

q = deque()
q.append(1)
while q:
    v = q.popleft()
    if v == 100:
        print(board[v])
        break
    for i in range(1, 7):
        next = v + i
        if next <= 100 and not visited[next]:
            if next in ladder.keys():
                next = ladder[next]
            if next in snake.keys():
                next = snake[next]
            if not visited[next]:
                visited[next] = True
                board[next] = board[v] + 1
                q.append(next)