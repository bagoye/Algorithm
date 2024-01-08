def solution(priorities, location):
    answer = 0
    seq = 0
    while priorities:
        # 첫번째 요소가 우선순위보다 낮으면 리스트 끝에 추가
        if priorities[0] < max(priorities):
            if location == seq: # 위치가 그 그 순서가 맞다면
                location = len(priorities)
                seq = 0
            priorities.append(priorities.pop(0))
        else:
            priorities.pop(0)
            answer += 1
            if seq == location:
                return answer
        seq += 1