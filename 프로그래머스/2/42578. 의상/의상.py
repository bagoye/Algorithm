def solution(clothes):
    answer = 1
    a = {}
    for i in range(len(clothes)):
        type = clothes[i][1]
        if type in a:
            a[type] += 1
        else:
            a[type] = 1
            
    for i in a.values():
        answer *=  i + 1 
        
    return answer - 1