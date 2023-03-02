T = int(input())
for tc in range(1, T + 1):
    N = int(input())  # 직사각형 가로길이


    def paper(n):
        if n == 10:
            return 1
        if n == 20:
            return 3

        return paper(n - 10) + paper(n - 20) * 2


    print(f'#{tc}', paper(N))