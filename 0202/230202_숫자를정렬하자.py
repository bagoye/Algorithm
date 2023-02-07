t = int(input())
for tc in range(1, t + 1):
    n = int(input())
    lst = list(map(int, input().split()))
    for i in range(n - 1, 0, -1):  # 각 구간의 끝
        for j in range(i):  # 비교할 왼쪽 원소
            if lst[j] > lst[j + 1]:
                lst[j], lst[j + 1] = lst[j + 1], lst[j]

    print(f'#{tc}', *lst)