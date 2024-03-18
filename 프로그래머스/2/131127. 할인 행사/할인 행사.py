def solution(want, number, discount):
    # 10일 회원자격, 할인제품 하루 한가지 .., 회원 등록 시 원하는 제품을 모두 할인받을수 있는 날짜
    answer = 0
    items = {}
    
    for i in range(len(want)):
        items[want[i]] = number[i]
    
    # discount 배열을 10개씩 묶어서 열흘동안 할인하는 목록 만들고 확인하기
    for i in range(len(discount) - 9):
        shop = discount[i : i+10] # 10일간 할인 목록
        purchase = True
        # 원하는 목록의 할인하는 날이랑 구매해야 할 수량 비교
        for j in range(len(want)):
            if shop.count(want[j]) != number[j]:
                purchase = False
                break
        
        if purchase:
            answer += 1
            
    return answer