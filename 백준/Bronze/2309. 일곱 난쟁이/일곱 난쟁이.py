import sys

input = sys.stdin.readline

arr = []
for _ in range(9):
    arr.append(int(input()))
arr.sort()

for i in range(len(arr)):
    for j in range(i+1, len(arr)):
        if sum(arr) - arr[i] - arr[j] == 100:
            for k in range(len(arr)):
                if k == i or k == j:
                    pass
                else:
                    print(arr[k])
            exit()