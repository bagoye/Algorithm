def _gcd(a, b):
    while a % b != 0:
        temp = a % b
        a = b
        b = temp

    return b

def _lcm(a, b):
    return a*b // gcd

gcd, lcm= map(int, input().split())
maxg = gcd * lcm

answer = []

for i in range(gcd, int(maxg**0.5) + 1, gcd):
    if _gcd(i, (maxg//i)) == gcd:
        if _lcm(i, (maxg//i)) == lcm:
            answer.append((i, maxg//i))

print(*answer[-1])