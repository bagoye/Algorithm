import sys

input = sys.stdin.readline

m, n = map(int, input().split())
l = list(map(int, input().split()))
s, e = 1, int(1e9)
answer = 0
while s <= e:
    mid =( s + e) // 2
    cnt = 0
    for i in l:
        cnt += i // mid
    if cnt >= m:
        answer = max(answer, mid)
        s = mid + 1
    else:
        e = mid - 1
print(answer)