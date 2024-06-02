import sys

input = sys.stdin.readline

n, m = map(int, input().split())
arr = list(map(int, input().split()))

s = max(arr)
e = sum(arr)
answer = -1

while s <= e:
    mid = (s + e) // 2
    a = 1 # 블루레이 번호
    remain = mid # 블루레이에 남아있는 용량

    for i in range(n):
        if remain < arr[i]:
            a += 1
            remain = mid

        remain -= arr[i]

    if a <= m:
        answer = mid
        e = mid - 1
    else:
        s = mid + 1

print(answer)