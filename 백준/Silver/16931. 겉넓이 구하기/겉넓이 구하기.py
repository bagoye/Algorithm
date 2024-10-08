import sys
input = sys.stdin.readline

n, m = map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(n)]

up = n * m
left = 0
for i in range(n):
    for j in range(m):
        if j == 0:
            left += arr[i][j]
        else:
            if arr[i][j-1] < arr[i][j]:
                left += arr[i][j] - arr[i][j-1]

front = 0
for j in range(m):
    for i in range(n):
        if i == 0:
            front += arr[i][j]
        else:
            if arr[i-1][j] < arr[i][j]:
                front += arr[i][j] - arr[i-1][j]

print(2 * (up + left + front))
