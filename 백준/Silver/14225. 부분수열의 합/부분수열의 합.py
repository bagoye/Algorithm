import sys
input = sys.stdin.readline

n = int(input())
s = sorted(list(map(int, input().split())))
target = 0
for i in s:
    if target + 1 < i:
        break
    target += i
print(target +1)
