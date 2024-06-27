import sys
from collections import deque
input = sys.stdin.readline

n = int(input())
q = deque()
q.append([n])

def bfs():
    while q:
        a = q.popleft()
        x = a[0]

        if x == 1:
            return a
        if x % 3 == 0:
            q.append([x//3] + a)
        if x % 2 == 0:
            q.append([x//2] + a)

        q.append([x-1] + a)

answer = bfs()
print(len(answer) - 1)
print(*answer[::-1])