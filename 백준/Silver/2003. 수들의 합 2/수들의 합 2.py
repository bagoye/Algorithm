import sys

input = sys.stdin.readline

n, m = map(int, input().split())
nums = list(map(int, input().split()))

s, e = 0, 0
sum = nums[0]
cnt = 0

while True:
    if sum == m:
        cnt += 1

    if sum >= m:
        s += 1
        sum -= nums[s - 1]
    else:
        if e == n-1:
            break
        e += 1
        sum += nums[e]

print(cnt)