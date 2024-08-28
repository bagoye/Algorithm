import sys
input = sys.stdin.readline

answer = 1001
for _ in range(int(input())):
    a, b = map(int, input().split())
    if b >= a:
        if b < answer:
            answer = b
if answer == 1001:
    print(-1)
else:
    print(answer)