import sys

input = sys.stdin.readline

n = sorted(input().strip(), reverse=True)
sum = 0

if '0' not in n:
    print(-1)
else:
    for i in n:
        sum += int(i)
    if sum % 3 != 0:
        print(-1)
    else:
        print(''.join(n))