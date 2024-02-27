import sys
input = sys.stdin.readline

n = int(input())
m = int(input())
btn = list(map(int, input().split()))

cnt = abs(100 - n)

for nums in range(1000001):
    nums = str(nums)
    for j in range(len(nums)):
        if int(nums[j]) in btn:
            break
        elif j == len(nums) - 1:
            cnt = min(cnt, abs(int(nums) - n) + len(nums))

print(cnt)