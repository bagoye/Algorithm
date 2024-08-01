import sys
input = sys.stdin.readline

n, m = map(int, input().split())
p = sorted([int(input()) for _ in range(m)])
answer = 0
target = 0
for i in range(m):
    egg = min(m - i, n)

    if answer < p[i] * egg:
        answer = p[i] * egg
        target = p[i]

print(target, answer)