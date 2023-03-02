for tc in range(1, int(input())+1):
    N = int(input())
    arr = [list(map(int, input())) for _ in range(N)]
    rlt = []
    mid = N // 2

    for r in range(N):
        if r < mid:
            rlt += arr[r][mid - r:mid + r + 1]
        elif r == mid:
            rlt += arr[r]
        elif r > mid:
            rlt += arr[r][r - mid:N - r + mid]

    print(f'#{tc}', sum(rlt))