for tc in range(1, 11):
    _ = int(input())
    arr = [list(map(int, input().split())) for _ in range(100)]
    dx, dy = [1, 0, 0], [0, 1, -1]
    result = 0

    for i in range(100):
        if arr[0][i]:
            x, y = 0, i
            d = 0
            while x < 99:
                if d == 0:
                    if y > 0 and arr[x][y - 1]:
                        d = 2
                    elif y < 99 and arr[x][y + 1]:
                        d = 1

                else:
                    if arr[x + 1][y]:
                        d = 0

                x += dx[d]
                y += dy[d]

            if arr[x][y] == 2:
                result = i
                break

    print(f'#{tc}', result)