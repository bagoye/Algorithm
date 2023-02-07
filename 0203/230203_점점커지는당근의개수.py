t = int(input())
for tc in range(1, t + 1):
    n = int(input())
    c = list(map(int, input().split()))

    max_cnt = 1
    cnt = 1

    for i in range(0, n - 1):
        if c[i] == c[i + 1] - 1:
            cnt += 1
            if max_cnt < cnt:
                max_cnt = cnt
        else:
            cnt = 1

    print(f'#{tc} {max_cnt}')