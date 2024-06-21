import sys

input = sys.stdin.readline

n, m = map(int, input().split())
arr = [list(input()) for _ in range(n)]

answer = 0
size = min(n, m)

for i in range(n):
    for j in range(m):
        for k in range(size):
            if ((i + k) < n) and ((j + k) < m) and (arr[i][j] == arr[i][j+k] == arr[i+k][j] == arr[i+k][j+k]):
                answer = max(answer, (k + 1) ** 2)

print(answer)