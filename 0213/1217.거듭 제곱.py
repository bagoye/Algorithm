for tc in range(1, 11):
    t = int(input())
    N, M = map(int, input().split())
    def f(N, M):
        if M == 0:
            return 1
        else:
            return N * f(N, M-1)


    print(f'#{tc}', f(N, M))