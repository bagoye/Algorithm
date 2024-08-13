import sys
input = sys.stdin.readline

a, b = map(int, input().split())
m = int(input())

arr = list(map(int,input().split()))
arr.reverse()

num = 0
for i in range(m):
    num += arr[i]*(a**i)

result = []
while num // b:
    result.append(num % b)
    num = num // b
result.append(num)

result.reverse()
print(' '.join(map(str,result)))