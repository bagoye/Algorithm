def solution(n):
    # 1, 2, 4, 11, 12, 14, 21, 22, 24, 41, 42, 44, 111, 112, 114, 121, 122, 124 ...
    # n이 3의 배수면 answer에 4를 붙임
    # n이 3이의 배수가 아니면 .. 1 2만 반복 ,, n을 3으로 나눈 나머지를 answer에 이어붙임
    answer = ''
    while n > 0:
        if n % 3 == 0:
            answer += str(4)
            n = n // 3 - 1
        else:
            answer += str(n % 3)
            n = n // 3
        
    return answer[::-1]