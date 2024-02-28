import sys
input = sys.stdin.readline

vowel = ['a', 'e', 'i', 'o', 'u']
l, c = map(int, input().split())
words = sorted(list(input().split()))
res = []

def bfs(start):
  if len(res) == l:
    vo, co = 0, 0

    for i in range(l):
      if res[i] in vowel:
        vo += 1
      else:
        co += 1

    if vo >= 1 and co >= 2:
      print(''.join(res))

    return
  
  for i in range(start, c):
    if words[i] not in res:
      res.append(words[i])
      bfs(i+1)
      res.pop()

bfs(0)