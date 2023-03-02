t = int(input())
for tc in range(1, t+1):
    test, N = input().split()
    lst = list(input().split())
    n_lst = ["ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN"]
    ans = []

    for i in range(len(n_lst)):
        for j in lst:
            if n_lst[i] == j:
                ans.append(j)

    print(f'#{tc}')
    print(*ans)