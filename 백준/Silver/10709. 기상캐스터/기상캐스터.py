import sys
input = sys.stdin.readline

h, w = map(int, input().split())
arr = [input().rstrip() for _ in range(h)]
answer = [[-1] * w for _ in range(h)]

for i in range(h):
    time = -1
    for j in range(w):
        if arr[i][j] == 'c':
            time = 0
            answer[i][j] = time
        elif time != -1:
            time += 1
            answer[i][j] = time

for i in answer:
    print(" ".join(map(str, i)))