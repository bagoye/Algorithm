n, k = map(int, input().split())
a_lst = []
for _ in range(n):
  a = int(input())
  a_lst.append(a)
a_lst.sort(reverse=True)
cnt = 0
for i in a_lst:
  cnt += k // i
  k %= i

print(cnt)
