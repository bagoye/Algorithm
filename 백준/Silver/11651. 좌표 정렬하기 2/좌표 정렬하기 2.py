import sys
input = sys.stdin.readline

arr = []

for _ in range(int(input())):
  x, y = map(int, input().split())
  arr.append([y, x])

arr.sort()

for y, x in arr:
  print(x, y)