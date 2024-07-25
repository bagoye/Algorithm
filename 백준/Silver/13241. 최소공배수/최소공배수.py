import sys
input = sys.stdin.readline

a, b = map(int, input().split())
answer = a * b

while b:
    if a > b:
        a, b = b, a
    b %= a

print(answer // a)