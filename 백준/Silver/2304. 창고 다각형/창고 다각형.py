import sys
input = sys.stdin.readline

n = int(input())
arr = sorted([[l, h] for l, h in [map(int, input().split()) for _ in range(n)]])

result = 0

i = 0
for a in arr:
    if a[1] > result:
        result = a[1]
        idx = i
    i += 1

height = arr[0][1]

for i in range(idx):
    if height < arr[i+1][1]:
        result += height * (arr[i+1][0] - arr[i][0])
        height = arr[i+1][1]
    else:
        result += height * (arr[i+1][0] - arr[i][0])

height = arr[-1][1]

for i in range(n-1, idx, -1):
    if height < arr[i-1][1]:
        result += height * (arr[i][0] - arr[i-1][0])
        height = arr[i-1][1]
    else:
        result += height * (arr[i][0] - arr[i-1][0])

print(result)