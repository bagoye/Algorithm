from collections import deque
import sys
input = sys.stdin.readline

def bfs():
  q = deque()
  q.append(home)
  while q:
    x, y = q.popleft()
    if abs(x - rock[0]) + abs(y - rock[1]) <= 1000:
      print('happy')
      return
    for i in range(n):
      if not visitied[i]:
        nx, ny = store[i]
        if abs(x - nx) + abs(y - ny) <= 1000:
          q.append([nx, ny])
          visitied[i] = 1
  print('sad')
  return

for _ in range(int(input())):
  n = int(input())
  home = list(map(int, input().split()))
  store = [list(map(int, input().split())) for _ in range(n)]
  rock = list(map(int, input().split()))
  visitied = [0 for _ in range(n)]
  bfs()