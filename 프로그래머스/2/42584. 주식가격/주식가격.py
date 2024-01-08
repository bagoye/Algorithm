def solution(prices):
    answer = []
    # 전체 리스트 돌거임
    for i in range(len(prices)):
        sec = 0
        # i보다 큰 인덱스랑 이제 비교할거임 ,,
        for j in range(i + 1, len(prices)):
            if prices[i] <= prices[j]:
                sec += 1
            else:
                sec += 1
                break
        answer.append(sec)
    return answer