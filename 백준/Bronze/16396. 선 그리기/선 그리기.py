import sys
input = sys.stdin.readline

arr = [0] * 10001
for _ in range(int(input())):
    x, y = map(int, input().split())
    for i in range(x, y):
        arr[i] = 1
        
print(sum(arr))