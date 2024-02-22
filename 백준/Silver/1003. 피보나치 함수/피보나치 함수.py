import sys
input = sys.stdin.readline

for _ in range(int(input())):
    n = int(input())
    zero, one = 1, 0
    for i in range(n):
        zero ,one = one, zero + one
    print(zero, one)