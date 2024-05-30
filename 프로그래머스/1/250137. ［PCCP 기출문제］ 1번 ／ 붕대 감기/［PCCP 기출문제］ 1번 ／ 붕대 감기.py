def solution(bandage, health, attacks):
    dic = {} #attacks 딕셔너리
    count = 0 #연속 성공 시간
    max_health = health #최대 체력
    
    for attack in attacks: #attacks 배열을 {공격시간:피해량} 형태의 딕셔너리로 만든다
        dic[attack[0]] = attack[1]
        
    for i in range(1, attacks[-1][0]+1): #1초부터 마지막 공격시간까지 반복
        if i in dic:
            health -= dic[i] #공격 시 체력 감소
            count = 0 #연속 성공 초기화
        else:
            health += bandage[1] #공격 없을 시 체력 회복
            count += 1 #연속 성공 증가
            if count == bandage[0]:
                health += bandage[2] #연속 성공 완료 시 체력 추가 획득
                count = 0 #연속 성공 초기화
        
        if health >= max_health:
            health = max_health #최대 체력 초과 불가
        if health <= 0:
            return -1 #체력 0 이하일 때 -1 반환
    return health