t = int(input())
for tc in range(1, t + 1):
    n = int(input())
    lst = list(map(int, input().split()))
    max_val = -999999999

    for i in range(0, len(lst) - 1):
        s = lst[i] + lst[i + 1]
        if max_val < s:
            max_val = s

    print(f'#{tc} {max_val}')