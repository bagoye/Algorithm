for tc in range(1, 11):
    n = int(input())
    infix = input()
    postfix = ''
    S = []
    icp = {'+': 1, '*': 2}      # 스택 밖
    isp = {'+': 1, '*': 2}      # 스택 안

    for token in infix:
        if token in icp:        # 연산자
            while S and icp[token] <= isp[S[-1]]:
                postfix += S.pop()
            S.append(token)
        else:                   # 피연산자
            postfix += token

    while S:
        postfix += S.pop()

    for token in postfix:
        if token in icp:
            b = S.pop()
            a = S.pop()
            if token == '+':
                S.append(a + b)
            else:
                S.append(a * b)
        else:
            S.append(int(token))

    print(f'#{tc}', S[0])