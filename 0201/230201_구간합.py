t = int(input())

for tc in range(1, t + 1):
    N, M = map(int, input().split())
    arr = list(map(int, input().split()))

    maxV = -9999999
    minV = 9999999

    for i in range(0, N - M + 1):
        sum_num = 0

        for j in range(i, M + i):
            sum_num += arr[j]

        if maxV < sum_num:
            maxV = sum_num

        if minV > sum_num:
            minV = sum_num

    print(f'#{tc} {maxV - minV}')
