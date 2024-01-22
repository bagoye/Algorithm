def solution(brown, yellow):
    
    x = 0
    sum = (brown - 4) // 2

    for r in range(sum):
        if r * (sum-r) == yellow:
            x = max(r, sum-r)
            break
            
    answer = [x + 2 , sum-x + 2]
    return answer