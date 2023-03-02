def subtree(v):
    if v == 0:
        return
    global cnt
    cnt += 1
    subtree(L[v])
    subtree(R[v])

for tc in range(1, int(input())+1):
    E, N = map(int, input().split())    # 간선의 수: E, 노드: N
    L = [0] * (E + 2)
    R = [0] * (E + 2)
    arr = list(map(int, input().split()))
    cnt = 0
    for i in range(0, E*2, 2):
        p, c = arr[i], arr[i + 1]
        if L[p] == 0:
            L[p] = c
        else:
            R[p] = c

    subtree(N)
    print(f'#{tc}', cnt)