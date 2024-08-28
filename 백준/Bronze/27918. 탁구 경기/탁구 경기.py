import sys
input = sys.stdin.readline

d = 0
p = 0
for _ in range(int(input())):
    s = input().rstrip()
    if abs(d-p) >= 2:
        continue

    if s == "D":
        d += 1
    else:
        p += 1

print(f'{d}:{p}')
