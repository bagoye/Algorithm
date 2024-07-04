import sys

input = sys.stdin.readline

n, k = map(int, input().split())
arr = list(map(int, input().split()))
s, e = 0, 0

answer = 0
cnt = dict()

while e < n:
    if arr[e] not in cnt:
        cnt[arr[e]] = 0

    if cnt[arr[e]] != k:
        cnt[arr[e]] += 1
        e += 1

    else:
        cnt[arr[s]] -= 1
        s += 1

    answer = max(answer, e - s)

print(answer)