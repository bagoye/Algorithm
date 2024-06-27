import sys

input = sys.stdin.readline
print = sys.stdout.write

n = int(input())
dp = [0] * (n+1)
dp[0], dp[1] = 0, 1

for i in range(2, len(dp)):
    dp[i] = dp[i-1] + dp[i-2]

print(str(dp[n]))