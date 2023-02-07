t = int(input())
for tc in range(1, t + 1):
    n = int(input())
    a = list(map(int, input()))
    c = [0] * 10

    for i in a:
        c[i] += 1

    max_num = 0
    for j in range(10):
        if max_num <= c[j]:
            max_index = j
            max_num = c[j]

    print(f'#{tc} {max_index} {max_num}')