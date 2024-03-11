def solution(k, tangerine):
    answer = 0
    type = {}
    
    for i in tangerine:
        if i in type:
            type[i] += 1
        else:
            type[i] = 1
    # {1: 1, 3: 2, 2: 2, 5: 2, 4: 1}
    
    type = sorted(type.items(), key=lambda x:x[1], reverse=True)
    # [(3, 2), (2, 2), (5, 2), (1, 1), (4, 1)]
    
    cnt = 0
    for i in type:
        if cnt + i[1] < k: # 선택된 귤의 개수가 k보다 작은 경우
            cnt += i[1] # 귤을 선택하고 cnt 업데이트
            answer += 1 # 서로 다른 종류의 귤 추가
        elif cnt+i[1] == k: # 선택된 귤의 개수가 k랑 같을 때
            return answer+1 # 서로 다른 종류 귤을 하나 더 추가하고 반환
        else: # 선택된 귤의 수가 k보다 클 때
            return answer+1 # 현재까지 다른종류 귤 반환