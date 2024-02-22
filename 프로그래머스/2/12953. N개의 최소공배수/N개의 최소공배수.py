def check(arr, target) :
    for i in range(len(arr)) :
        if target % arr[i] != 0 :
            return False
    return True

def solution(arr) :
    value = max(arr)
    add_value = max(arr)
    while True :
        if check(arr, value) :
            return value
        else :
            value += add_value