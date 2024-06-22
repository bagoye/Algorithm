import sys

input = sys.stdin.readline

n, k = map(int, input().split())
arr = [int(input()) for _ in range(n)]

point = 0
m = 0

for i in range(n):
    target = arr[point]
    m += 1
    if target == k:
        print(m)
        break
    point = target

else:
    print(-1)