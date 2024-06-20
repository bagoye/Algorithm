import sys

input = sys.stdin.readline

s = []
answer = 0
for _ in range(int(input())):
    task = list(map(int, input().split()))
    if task[0] == 1:
        if task[2] == 1:
            answer += task[1]
        else:
            s.append([task[1], task[2]-1])
        continue

    if s:
        s[-1][1] -= 1
        if s[-1][1] == 0:
            x = s.pop()
            answer += x[0]
print(answer)