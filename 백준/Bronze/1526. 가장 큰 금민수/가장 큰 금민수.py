import sys
input = sys.stdin.readline
n = int(input().strip())

while True:
    button = True
    for i in str(n):
        if i != '4' and i != '7':
            button = False
            n -= 1
    if button:
        print(n)
        break