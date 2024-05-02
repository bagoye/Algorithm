import sys
input = sys.stdin.readline

h, w = map(int, input().split())
arr = list(map(int, input().split()))

result = 0
for i in range(1, w-1):
    left = max(arr[:i])
    right = max(arr[i+1:])
    min_ = min(left, right)
    if min_ > arr[i]:
        result += min_ - arr[i]

print(result)