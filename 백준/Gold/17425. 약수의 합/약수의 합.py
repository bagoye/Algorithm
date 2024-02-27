import sys
input = sys.stdin.readline

max = 1000000

M = [0 for _ in range(max+1)]
m = [0 for _ in range(max+1)]

for i in range(1, max+1):
  j = 1
  while i * j <= max:
    m[i*j] += i
    j += 1
  M[i] = M[i-1] + m[i]

n = int(input())
div = []
for i in range(n):
  a = int(input())
  div.append(a)
for i in div:
  print(M[i])