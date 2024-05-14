import sys

input = sys.stdin.readline

n = int(input())
arr = list(map(int, input().split()))
answer = [0] * n
stack = []
for i in range(n):
    tower = arr[i]
    while stack and arr[stack[-1]] < tower:
        stack.pop()
    if stack:
        answer[i] = stack[-1] + 1
    stack.append(i)
print(*answer)