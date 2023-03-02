for tc in range(1, int(input())+1):
    test = list(input())
    S = []

    for i in test:
        if len(S) == 0:
            S.append(i)
        elif S[-1] == i:
            S.pop()
        else:
            S.append(i)

    print(f'#{tc}', len(S))