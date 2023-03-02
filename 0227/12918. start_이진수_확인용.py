for tc in range(1, int(input())+1):
    N, n16 = input().split()
    ans = ''
    for i in n16:
        n10 = int(i, 16)
        n2 = bin(n10)[2:]
        rlt = '{0:04}'.format(int(n2))
        ans += rlt
    print(f'#{tc}', ans)