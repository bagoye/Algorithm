import sys

input = sys.stdin.readline

n = int(input())
arr = list(map(int, input().split()))
m = int(input())

s = 0
e = max(arr)
answer = -1

while s <= e:
    middle = (s + e) // 2

    sum = 0
    for i in range(n):
        sum += min(middle, arr[i])

    if sum <= m:
        answer = middle
        s = middle + 1
    else:
        e = middle - 1

print(answer)