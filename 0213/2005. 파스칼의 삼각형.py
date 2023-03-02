t = int(input())
for tc in range(1, t+1):
    N = int(input())
    for n in range(1, N+1):
        n_lst = [[1] * n for n in range(1, N+1)]

    if N > 2:
        for i in range(2, N):
            for j in range(1, i):
                n_lst[i][j] = n_lst[i-1][j-1] + n_lst[i-1][j]

    print(f'#{tc}')
    for lst in n_lst:
        print(*lst)