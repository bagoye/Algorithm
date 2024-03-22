for tc in range(1, 11):
    n = int(input())
    arr = [list(input()) for _ in range(8)]
    result = 0

    # 가로 확인
    for i in range(8):
        for j in range(8 - n + 1):
            a = arr[i][j:j + n]
            if a == a[::-1]:
                result += 1

    # 세로 확인
    for i in range(8 - n + 1):
        for j in range(8):
            a = ''
            for k in range(n):
                a += arr[i + k][j]
            if a == a[::-1]:
                result += 1

    print(f"#{tc}", result)