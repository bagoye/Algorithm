N = int(input())        # 스위치 개수
s_lst = [-1] + list(map(int, input().split()))
S = int(input())
for _ in range(S):
    gender, s_num = map(int, input().split())
    if gender == 1:    # 남자인 경우
        for i in range(s_num, N+1, s_num):
            if s_lst[i] == 0:
                s_lst[i] = 1
            else:
                s_lst[i] = 0
    else:              # 여자면
        if s_lst[s_num] == 0:
            s_lst[s_num] = 1
        else:
            s_lst[s_num] = 0
        for i in range(1, N//2):
            if s_num - i < 1 or s_num + i > N: break
            if s_lst[s_num-i] == s_lst[s_num+i]:
                if s_lst[s_num-i] == 0:
                    s_lst[s_num-i] = 1
                    s_lst[s_num+i] = 1
                else:
                    s_lst[s_num-i] = 0
                    s_lst[s_num+i] = 0
            else:
                break

for i in range(1, N+1):
    print(s_lst[i], end=' ')
    if i % 20 == 0:
        print()