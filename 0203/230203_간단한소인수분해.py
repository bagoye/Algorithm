t = int(input())

for tc in range(1, t + 1):
    n = int(input())
    n_lst = [2, 3, 5, 7, 11]
    result = [0] * 5

    for i in range(len(n_lst)):
        while n % n_lst[i] == 0:  # n을 n_lst 로 나눴을 때 나머지가 0이면 소인수
            n = n // n_lst[i]
            result[i] += 1  # 나머지가 0이면 1 추가

    print(f'#{tc}', *result)