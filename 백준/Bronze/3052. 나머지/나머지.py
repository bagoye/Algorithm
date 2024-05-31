import sys

input = sys.stdin.readline

nums = []
for i in range(0, 10):
    n = int(input())
    nums.append(n % 42)


print(len(set(nums)))