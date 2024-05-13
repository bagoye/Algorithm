import sys

input = sys.stdin.readline

for _ in range(int(input())):
    n = int(input())
    arr = list(map(int, input().split()))

    profit = 0
    max_price = 0
    for i in range(len(arr)-1, -1, -1):
        if arr[i] > max_price:
            max_price = arr[i]
        else:
            profit += max_price - arr[i]

    print(profit)