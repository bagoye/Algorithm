for tc in range(1, 11):
    N, test = input().split()
    S = []

    for i in test:
        if len(S) == 0:
            S.append(i)
        elif S[-1] == i:
            S.pop()
        else:
            S.append(i)

    print(f'#{tc}', ''.join(S))