def solution(s):
    answer = []
    s = s.lstrip('{').rstrip('}').split('},{')
    
    arr = []
    for i in s:
        arr.append(i.split(','))
    
    arr.sort(key = len)
    
    for i in arr:
        for j in range(len(i)):
            if int(i[j]) not in answer:
                answer.append(int(i[j]))
                
    return answer