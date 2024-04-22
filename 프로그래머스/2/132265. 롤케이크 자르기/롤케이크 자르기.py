def solution(topping):
    answer = 0
    a = {} # 토핑 빈도수
    for i in topping:
        if i in a:
            a[i] += 1
        else:
            a[i] = 1
    
    b = {} # 철스가 가질 토핑 빈도수
    for i in topping:
        a[i] -= 1 # 전체 토핑에서 현재 토핑 빼주기
        
        if a[i] == 0:
            del a[i] # 특정 토핑 빈도수 0되면 a딕셔너리에서 토핑 삭제
        
        if i in b:
            b[i] += 1
        else:
            b[i] = 1
        
        if len(a) == len(b):
            answer += 1
    
    return answer