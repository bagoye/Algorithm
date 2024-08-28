import sys
input = sys.stdin.readline

for _ in range(int(input())):
    p = int(input())
    max_price = 0
    max_name = ""
    for i in range(p):
        c, name = input().split()
        if int(c) > max_price:
            max_price = int(c)
            max_name = name

    print(max_name)
