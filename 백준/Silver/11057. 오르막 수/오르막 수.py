import sys

input = sys.stdin.readline
n = int(input())

dp = [1] * 10

for i in range(2, n+1):
    for j in range(10):
        dp[j] = sum(dp[j:])

answer = sum(dp) % 10007
print(answer)