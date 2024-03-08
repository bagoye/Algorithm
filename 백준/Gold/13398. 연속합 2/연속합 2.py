import sys
input = sys.stdin.readline

n = int(input())
nums = list(map(int, input().split()))
dp = [[i for i in nums] for _ in range(2)]

for i in range(1, n):
    # 특정 원소 제거하지 않고 일반적인 연속합 구하는 경우
    dp[0][i] = max(dp[0][i-1] + nums[i], dp[0][i])
    # 특정 원소를 제거하고 연속합 구하는 경우
    dp[1][i] = max(dp[1][i-1] + nums[i], dp[0][i-1])

print(max(max(dp[0]), max(dp[1])))