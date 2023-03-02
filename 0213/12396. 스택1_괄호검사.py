for tc in range(1, int(input())+1):
    inp = input()
    S = [] # 빈 스택 생성

    for i in inp:
        if i == '(' or i == '{':
            S.append(i)
        elif S and i == ')' and S[-1] == '(':
            S.pop()
        elif S and i == '}' and S[-1] == '{':
            S.pop()
        elif i == ')' or i == '}':
            S.append(i)
            break
    if S:
        rlt = 0
    else:
        rlt = 1

    print(f'#{tc}', rlt)