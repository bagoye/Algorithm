import sys

input = sys.stdin.readline

n, m = map(int, input().split())
a = [list(map(int, input().split())) for _ in range(n)]

m, k = map(int, input().split())
b = [list(map(int, input().split())) for _ in range(m)]

c = [[0 for _ in range(k)] for _ in range(n)]

for x in range(n):
    for y in range(k):
        for z in range(m):
            c[x][y] += a[x][z] * b[z][y]

for i in c:
    for j in i:
        print(j, end=" ")
    print()