d = {6: 1, 5: 2, 4: 3, 3: 4, 2: 5, 0:6}
def solution(num,lotto):
    answer = []
    c = 0
    for i in lotto:
        for j in num:
            if i == j:
                c += 1
    if c == 0 or c == 1:
        answer.append(d.get(c + num.count(0)))
        answer.append(6)
    elif c == 6:
        answer.append(1)
        answer.append(1)
    else:
        answer.append(d.get(num.count(0)+c)) 
        answer.append(d.get(c))
    return answer