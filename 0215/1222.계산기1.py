for tc in range(1, 11):
    n = int(input())
    infix = input()
    postfix = ''
    S = []

    for token in infix:
        if token == '+':    # 연산자
            S.append(token)
        else:               # 피연산자
            postfix += token
    while S:
        postfix += S.pop()

    for token in postfix:
        if token == '+':
            b = S.pop()
            a = S.pop()
            S.append(a + b)
        else:
            S.append(int(token))

    print(f'#{tc}', S[0])