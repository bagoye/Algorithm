from itertools import permutations
import sys

input = sys.stdin.readline

n = int(input())
arr = list(map(int, input().split()))

max_diff_sum = 0

for a in permutations(arr, n):
    diff_sum = 0
    for i in range(n-1):
        diff_sum += abs(a[i] - a[i + 1])

    max_diff_sum = max(max_diff_sum, diff_sum)

print(max_diff_sum)