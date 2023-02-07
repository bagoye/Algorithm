t = int(input())
for tc in range(1, t + 1):

    test_case = int(input())
    scores = list(map(int, input().split()))
    C = [0] * 101

    for val in scores:
        C[val] += 1

    max_score = 0

    for i in range(0, 101):
        if max_score <= C[i]:
            max_index = i
            max_score = C[i]

    print(f'#{tc} {max_index}')