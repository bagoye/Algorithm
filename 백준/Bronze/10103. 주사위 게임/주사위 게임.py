n = int(input())
c = s = 100
for i in range(1, 1+n):
    cy, sd = map(int, input().split())
    if cy < sd:
        c -= sd
    elif cy > sd:
        s -= cy
print(c)
print(s)