for tc in range(1, 11):
    t = int(input())
    arr = [list(map(int, input().split())) for _ in range(100)]

    max_sum = 0
    for r in range(100):  # 행인덱스
        r_sum = 0
        for c in range(100):  # 열인덱스
            r_sum += arr[r][c]
        if max_sum < r_sum:
            max_sum = r_sum

    for c in range(100):
        c_sum = 0
        for r in range(100):
            c_sum += arr[r][c]
        if max_sum < c_sum:
            max_sum = c_sum

    cross_sum1 = 0
    cross_sum2 = 0
    for i in range(100):
        cross_sum1 += arr[i][i]
        cross_sum2 += arr[i][99 - i]
    if max_sum < cross_sum1:
        max_sum = cross_sum1
    if max_sum < cross_sum2:
        max_sum = cross_sum2

    print(f'#{tc} {max_sum}')