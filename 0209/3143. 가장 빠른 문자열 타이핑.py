t = int(input())
for tc in range(1, t+1):
    a, b = input().split()
    N, M = len(a), len(b)

    i = 0
    cnt = 0
    while i <= N - M:
        for j in range(M):
            if a[i + j] != b[j]:
                break
        else:
            cnt += 1
            i = i + M - 1
        i += 1
    print(f'#{tc} {N - cnt * M + cnt}')