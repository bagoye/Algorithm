import sys
input = sys.stdin.readline

n = int(input())
for i in range(n):
    nums = sorted(list(map(int, input().split())))
    print(nums[-3])