import sys

input = sys.stdin.readline

for t in range(int(input())):
    arr = list(map(int, input().split()))
    del arr[0]
    arr.sort()
    diff = []
    print("Class", t + 1)
    for i in range(len(arr)-1):
        diff.append(arr[i+1] - arr[i])
    print("Max", str(max(arr)) + ",", "Min", str(min(arr)) + ",", "Largest gap", str(max(diff)))