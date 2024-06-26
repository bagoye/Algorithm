import sys

input = sys.stdin.readline

n = int(input())
nums = [str(input().rstrip()) for _ in range(n)]

for i in range(1, len(nums[0]) + 1):
    answer = []
    for j in range(n):
        if nums[j][-i:] in answer:
            break
        else:
            answer.append(nums[j][-i:])
    if len(answer) == n:
        print(i)
        break