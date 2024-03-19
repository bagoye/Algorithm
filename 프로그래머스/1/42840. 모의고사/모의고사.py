def solution(answers):
    answer = []
    p1 = [1, 2, 3, 4, 5]
    p2 = [2, 1, 2, 3, 2, 4, 2, 5]
    p3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    
    cnt1, cnt2, cnt3 = 0, 0, 0
    for i in range(len(answers)):
        if answers[i] == p1[i % 5]:
            cnt1 += 1
        if answers[i] == p2[i % 8]:
            cnt2 += 1
        if answers[i] == p3[i % 10]:
            cnt3 += 1
    
    value = max(cnt1, cnt2, cnt3)
    if cnt1 == value:
        answer.append(1)
    if cnt2 == value:
        answer.append(2)
    if cnt3 == value:
        answer.append(3)
        
    return answer