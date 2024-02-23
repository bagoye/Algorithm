def solution(name, yearning, photo):
    answer = []

    for i in photo:
        score = 0
        for n in i:
            if n in name:
                score += yearning[name.index(n)]
        answer.append(score)

    return answer