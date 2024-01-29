def solution(clothes):
    answer = 1
    a = {}
    for i in range(len(clothes)):
        if clothes[i][1] in a:
            a[clothes[i][1]] += 1
        else:
            a[clothes[i][1]] = 1
            
    for i in a.values():
        answer *=  i + 1 
        
    return answer - 1