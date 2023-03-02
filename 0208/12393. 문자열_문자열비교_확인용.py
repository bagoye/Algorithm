t = int(input())
for tc in range(1, t+1):
    str1 = input()
    str2 = input()
    N = len(str1)
    M = len(str2)

    rst = 0
    for i in range(0, M - N + 1):
        for j in range(N):
            if str1[j] != str2[i + j]:
                rst = 0
                break
        else:
            rst = 1
            break

    print(f'#{tc} {rst}')
