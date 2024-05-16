import sys

input = sys.stdin.readline

n = int(input())
nums = list(map(int, input().split()))
sum = [0] * (n+1)

for i in range(1, n+1):
    sum[i] = sum[i-1] + nums[i-1]

for _ in range(int(input())):
    i, j = map(int, input().split())
    print(str(sum[j] - sum[i-1]))
