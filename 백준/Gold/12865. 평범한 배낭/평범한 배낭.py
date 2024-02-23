import sys
input = sys.stdin.readline

n, k = map(int, input().split())
lst = []

for i in range(n):
  w, v = map(int, input().split())
  lst.append((w, v))

dp = [0 for _ in range(k+1)]

for i in lst:
    w,v = i
    for i in range(k, w-1, -1):
        dp[i] = max(dp[i], dp[i-w] + v)

print(dp[-1])