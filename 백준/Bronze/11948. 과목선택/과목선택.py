import sys
input = sys.stdin.readline

arr = [int(input()) for _ in range(6)]
arr1 = sorted(arr[:4])
arr2 = arr[4:]
print(sum(arr1[1:]) + max(arr2))