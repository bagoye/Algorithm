import sys
input = sys.stdin.readline

n, m = map(int, input().split())
s = []
cnt = 0

for _ in range(n):
  s.append(input().strip())

for _ in range(m):
  word = input().strip()
  if word in s:
    cnt += 1

print(cnt)