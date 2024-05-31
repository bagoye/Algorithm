import sys

input = sys.stdin.readline

arr = [0] * 31
for i in range(1, 29):
    student = int(input())
    arr[student] = 1

for i in range(1, len(arr)):
    if arr[i] != 1:
        print(i)
