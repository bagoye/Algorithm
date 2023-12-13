n = int(input())
p = sorted(list(map(int, input().split())))

ans = 0
for i in range(1, n+1):
  ans += sum(p[:i])

print(ans)