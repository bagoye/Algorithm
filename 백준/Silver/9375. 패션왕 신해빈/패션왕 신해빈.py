import sys
input = sys.stdin.readline

for _ in range(int(input())):
  n = int(input())
  a = {}
  for j in range(n):
      wear = list(input().split())
      if wear[1] in a:
          a[wear[1]].append(wear[0])
      else:
          a[wear[1]] = [wear[0]]

  cnt = 1

  for i in a:
      cnt *= (len(a[i]) + 1)
  print(cnt - 1)