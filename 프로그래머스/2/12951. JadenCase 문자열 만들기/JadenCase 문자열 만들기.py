def solution(s):
    answer = s.split(' ') # 문자열을 공백을 기준으로 나눠 리스트로 만듦
    
    for i in range(len(answer)):
        if answer[i]:
            answer[i] = answer[i][0].upper() + answer[i][1:].lower()
        else:
            continue
        
    return " ".join(answer)