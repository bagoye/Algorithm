t = int(input())
for tc in range(1, t + 1):
    n = int(input())
    arr = [[0] * 10 for _ in range(10)]
    for _ in range(n):
        r1, c1, r2, c2, color = map(int, input().split())
        for r in range(r1, r2 + 1):
            for c in range(c1, c2 + 1):
                if color == 1:
                    arr[r][c] += 1  # 빨강
                else:
                    arr[r][c] += 2  # 파랑

        cnt = 0
        for r in range(10):
            for c in range(10):
                if arr[r][c] == 3:
                    cnt += 1

    print(f'#{tc} {cnt}')