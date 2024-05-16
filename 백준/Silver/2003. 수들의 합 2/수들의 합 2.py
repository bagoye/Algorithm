import sys

input = sys.stdin.readline

n, m = map(int, input().split())
arr = list(map(int, input().split()))

s, e, cnt, sum = 0, 0, 0, 0

while True:
    if sum < m:
        if e < n:
            sum += arr[e]
            e += 1
        else:
            break
    elif sum == m:
        cnt += 1
        sum -= arr[s]
        s += 1
    else:
        sum -= arr[s]
        s += 1

print(cnt)