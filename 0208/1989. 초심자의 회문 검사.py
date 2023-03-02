t = int(input())
for tc in range(1, t+1):
    val = list(input())
    N = len(val)
    for i in range(N // 2):
        if val[i] != val[N - 1 - i]:
            result = 0
            break
        else:
            result = 1

    print(f'#{tc} {result}')