import sys
input = sys.stdin.readline

file = dict()
for _ in range(int(input())):
    name = (input().rstrip().split('.'))[1]
    if not name in file:
        file[name] = 1
    else:
        file[name] += 1

file = sorted(file.items())

for key, val in file:
    print(key, val)
