import sys

input = sys.stdin.readline

n, l = map(int, input().split())
answer = 0
now = 0 # 현재 위치
for _ in range(n):
    d, r, g = map(int, input().split())
    answer += (d - now)
    now = d
    if answer % (r + g) <= r:
        answer += (r - (answer % (r + g)))

answer += l - now
print(answer)
