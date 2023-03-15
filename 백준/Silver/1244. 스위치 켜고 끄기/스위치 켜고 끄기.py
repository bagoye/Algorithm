N = int(input())                        # 방의 갯수
lst = list(map(int,input().split()))    # 각 방들의 상태

for i in range(int(input())):       # 인원 수
    a,b = map(int,input().split())  # 성별 과 방을 받아줌

    if a == 1:                      # 남자
        for i in range(b-1, N, b):      # b의 배수
            if i > N: break             # 범위 벗어날 경우
            lst[i] = 1 - lst[i]
    else:                           # 여자
        y = b - 1
        lst[y] = 1 - lst[y]
        for num in range(1,N//2):
            if y < num or y + num > N-1: break      # 범위 벗어날 경우
            if lst[y - num] != lst[y + num]: break  # 양쪽 방이 다를 경우
            if lst[y - num] == lst[y + num]:
                lst[y-num] = 1 - lst[y-num]     # 좌측방
                lst[y+num] = 1 - lst[y+num]     # 우측방

for i in range(0, len(lst), 20):
    print(*lst[i:i + 20])
