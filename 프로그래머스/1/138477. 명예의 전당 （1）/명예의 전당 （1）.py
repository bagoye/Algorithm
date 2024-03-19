def solution(k, score):
    answer = []
    singer = []
    for i in range(len(score)):
        if i < k:
            singer.append(score[i]) 
            singer.sort()
            answer.append(singer[0])
        else:
            if score[i] > singer[0]:
                singer[0] = score[i]
                singer.sort()
        
        if i >= k:
            answer.append(singer[0])
            
    return answer