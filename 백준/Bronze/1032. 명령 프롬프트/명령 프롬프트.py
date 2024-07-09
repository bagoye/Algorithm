import sys
input = sys.stdin.readline

n = int(input())
name = list(input().rstrip())

for i in range(n - 1):
    other = list(input().rstrip())
    for j in range(len(name)):
        if name[j] != other[j]:
            name[j] = '?'

print(''.join(name))