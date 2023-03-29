for tc in range(1, int(input())+1):
    N = int(input())
    arr = [list(map(int, input().split())) for _ in range(N)]
    arr.sort(key=lambda x: x[1])
    cnt = time = 0
    for i in range(N):
        s = arr[i][0]
        e = arr[i][1]
        if time <= s:
            cnt += 1
            time = e
    print(f'#{tc}', cnt)