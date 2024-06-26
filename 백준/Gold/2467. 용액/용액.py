import sys
input = sys.stdin.readline

n = int(input())
arr = list(map(int, input().split()))
s, e = 0, n-1
a, b = 0, 0
answer = abs(arr[s] + arr[e])

while s < e:
    if arr[s] + arr[e] == 0:
        a, b = arr[s], arr[e]
        break
    elif abs(arr[s] + arr[e]) <= answer:
        a, b = arr[s], arr[e]
        answer = abs(arr[s] + arr[e])

    if arr[s] + arr[e] < 0:
        s += 1
    else:
        e -= 1

print(a, b)