import sys
input = sys.stdin.readline

n = int(input())
a = list(map(int, input().split()))

NGE = [-1] * n

stack = []
for i in range(n):
    while stack and a[i] > a[stack[-1]]:
        NGE[stack[-1]] = a[i]
        stack.pop()
    stack.append(i)
print(*NGE)