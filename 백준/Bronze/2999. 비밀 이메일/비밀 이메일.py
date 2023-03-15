N = input()
l = len(N)

for i in range(1, l):
    if l % i == 0:
        if i > l//i: break
        else:
            n, m = i, l//i

if n > m:n, m = m, n

p = [[0]*m for i in range(n)]
a = 0
for i in range(m):
    for j in range(n):
        p[j][i], a = N[a], a+1

for i in p:
    print(''.join(i), end='')

