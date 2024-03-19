def solution(a, b):
    answer = ''
    month = [0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
    day =  ["SUN","MON","TUE","WED","THU","FRI","SAT"]
    
    cnt = 0
    
    for i in range(a):
        cnt += month[i]
        
    cnt += b
    cnt += 4
    answer = day[cnt % 7]
    
    return answer