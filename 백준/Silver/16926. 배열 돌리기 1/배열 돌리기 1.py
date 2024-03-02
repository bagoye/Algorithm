import sys
input = sys.stdin.readline

n, m, r = map(int, input().split())
a = [list(map(int, input().split())) for _ in range(n)]

for _ in range(r):
    for i in range(min(n, m) // 2):
        x, y = i, i
        temp = a[x][y]

        for j in range(i + 1, n - i):
            x = j
            prev = a[x][y]
            a[x][y] = temp
            temp = prev

        for j in range(i + 1, m - i):  # 하
            y = j
            prev = a[x][y]
            a[x][y] = temp
            temp = prev

        for j in range(i + 1, n - i):  # 우
            x = n - j - 1
            prev = a[x][y]
            a[x][y] = temp
            temp = prev

        for j in range(i + 1, m - i):  # 상
            y = m - j - 1
            prev = a[x][y]
            a[x][y] = temp
            temp = prev

for i in range(n):
    for j in range(m):
        print(a[i][j], end=' ')
    print()