import sys
input = sys.stdin.readline
n, m = map(int, input().split())

now = 1
apples = []
ans = 0

for _ in range(int(input())):
    apples.append(int(input()))

for apple in apples:
    if now <= apple and now + (m-1) >= apple:
        pass
    elif now > apple:
        ans += abs(apple - now)
        now = apple
    else:
        ans += apple - (m-1) - now
        now = apple - (m-1)
        
print(ans)