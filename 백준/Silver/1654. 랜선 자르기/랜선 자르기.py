import sys
input = sys.stdin.readline

k, n = map(int, input().split())
lan = [int(input()) for _ in range(k)]
left, right = 1, max(lan)

while left <= right:
    mid = (left + right) // 2
    lines = 0

    for i in lan:
        lines += i // mid 
        
    if lines >= n:
        left = mid + 1
    else:
        right = mid - 1

print(right)