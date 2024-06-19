import sys

input = sys.stdin.readline

n, l = map(int, input().split())
arr = sorted(list(map(int, input().split())))

s = arr[0]
cnt = 1

for i in arr[1:]:
    if i in range(s, s+l):
        continue
    else:
        s = i
        cnt += 1

print(cnt)