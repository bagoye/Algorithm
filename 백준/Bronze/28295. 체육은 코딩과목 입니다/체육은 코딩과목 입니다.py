import sys
input = sys.stdin.readline

d = 0
for i in range(10):
    n = int(input())
    if n == 1:
        d += 90
    if n == 2:
        d += 180
    if n == 3:
        d -= 90

ans = d % 360
if ans == 0:
    print("N")
if ans == 90:
    print("E")
if ans == 180:
    print("S")
if ans == 270:
    print("W")