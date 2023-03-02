for tc in range(1, int(input())+1):
    N = float(input())
    ans = ''
    n = -1
    while N != 0:
        num = (2 ** n)
        n -= 1
        if N >= num:
            N -= num
            ans += '1'
        else:
            ans += '0'
    if len(ans) > 12:
        ans = 'overflow'

    print(f'#{tc}', ans)