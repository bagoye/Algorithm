for tc in range(1, int(input()) + 1):
    lst = ['+', '-', '*', '/']
    forth = list(input().split())
    S = []
    error = 0
    for i in forth:
        if i in lst:
            if len(S) < 2:
                error = 1
                break
            else:
                b = S.pop()
                a = S.pop()
                if i == '+':
                    S.append(a + b)
                elif i == '-':
                    S.append(a - b)
                elif i == '*':
                    S.append(a * b)
                else:
                    S.append(a // b)
        elif i == '.':
            if len(S) != 1:
                error = 1
                break
            else:
                print(f'#{tc}', S.pop())
        else:
            S.append(int(i))

    if error == 1:
        print(f'#{tc} error')