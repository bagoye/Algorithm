import sys

input = sys.stdin.readline

# 접시의 수 n, 초밥의 가짓수 d, 연속해서 먹는 접시의 수 k, 쿠폰 번호 c
n, d, k, c = map(int, input().split())
arr = [int(input()) for _ in range(n)]

max_ = 0
for i in range(n):
    if i <= n - k:
        temp = set(arr[i:i+k])
    else:
        temp = set(arr[i:])
        temp.update(arr[:(i+k)%n])
    temp.add(c)
    max_ = max(max_, len(temp))
print(max_)