t = int(input())
for tc in range(1, t + 1):
    n = int(input())
    n_lst = list(map(int, input()))

    max_cnt = 0
    cnt = 1
    for i in range(len(n_lst) - 1):
        if n_lst[i] == 1:
            if max_cnt < cnt:
                max_cnt = cnt
            if n_lst[i] == n_lst[i + 1]:
                cnt += 1
                if max_cnt < cnt:
                    max_cnt = cnt
            else:
                cnt = 1

    print(f'#{tc} {max_cnt}')