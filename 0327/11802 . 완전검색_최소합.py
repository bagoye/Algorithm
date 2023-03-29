def path(r, c):
    if r == 0 and c == 0:
        return arr[0][0]
    else:
        left = up = 0xffff
        if c > 0:
            left = path(r, c - 1)
        if r > 0:
            up = path(r - 1, c)
        return min(left, up) + arr[r][c]


for tc in range(1, int(input()) + 1):
    N = int(input())
    arr = [list(map(int, input().split())) for _ in range(N)]

    print(f'#{tc}', path(N - 1, N - 1))