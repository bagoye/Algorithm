def solution(numbers):

    dict = {'zero' : 0, 'one':1, 'two':2, 'three' : 3, 'four':4, 
            'five':5,'six' : 6, 'seven' : 7, 'eight':8,'nine':9}

    for en_num, num in dict.items(): # item() 함수 이용 -> 키, 밸류 얻기
        numbers = numbers.replace(en_num,str(num)) # repalce(old, new, 반복횟수)를 사용해서 키값으로 받은 문자를 밸류값으로 변경

    return int(numbers)


