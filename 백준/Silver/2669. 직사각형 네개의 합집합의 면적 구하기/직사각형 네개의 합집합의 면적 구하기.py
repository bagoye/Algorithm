import sys

ipnut = sys.stdin.readline

arr = [[0 for _ in range(101)] for _ in range(101)]

for _ in range(4):
    x1, y1, x2, y2 = map(int, input().split())

    for i in range(x1, x2):
        for j in range(y1, y2):
            arr[i][j] = 1

answer = 0
for i in arr:
    answer += sum(i)

print(answer)
