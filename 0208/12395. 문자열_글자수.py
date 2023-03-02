t = int(input())

for tc in range(1, t+1):
    str1 = input()
    str2 = input()
    cnt, max_cnt = 0, 0

    for i in str1:
        for j in str2:
            if i == j:
                cnt += 1
        if max_cnt < cnt:
            max_cnt = cnt
        cnt = 0
    print(f'#{tc} {max_cnt}')