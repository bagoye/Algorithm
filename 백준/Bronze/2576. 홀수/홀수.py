import sys
input = sys.stdin.readline

lst = []
for _ in range(7):
    n = int(input())
    if n % 2 != 0:
        lst.append(n)
        
if not lst:
    print(-1)
else:
    print(sum(lst))
    print(min(lst))