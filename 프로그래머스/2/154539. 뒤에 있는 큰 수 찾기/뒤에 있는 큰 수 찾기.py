def solution(numbers):
    answer = [-1] * len(numbers)
    stack = []
    
    for i in range(len(numbers)):
        temp = numbers[i]
        
        while stack and numbers[stack[-1]] < temp:
            answer[stack.pop()] = temp
        
        stack.append(i)
    
    # for i in range(len(numbers)-1):
    #     for j in numbers[i+1:len(numbers)]:
    #         if numbers[i] < j:
    #             answer[i] = j
    #             break
        
    return answer