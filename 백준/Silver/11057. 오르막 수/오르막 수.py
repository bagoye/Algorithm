import sys
input = sys.stdin.readline

n = int(input())
# dp 테이블 2차원으로 실계, 초기화
dp = [[0] * 10 for _ in range(n+1)]
dp[1] = [1] * 10

for i in range(2, n+1):
    for j in range(10):
        dp[i][j] = sum(dp[i-1][j:])

answer = sum(dp[n]) % 10007

print(answer)