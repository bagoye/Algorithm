import sys

input = sys.stdin.readline

k = int(input())
s = []
for i in range(k):
    n = int(input())
    if n == 0:
        s.pop()
    else:
        s.append(n)

print(sum(s))
