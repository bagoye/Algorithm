from collections import deque

def solution(k, dungeons):
    answer = -1
    q = deque()
    q.append((k, []))
    
    while q:
        k, dungeon = q.popleft() # 큐에서 현재 체력이랑 던전 변수에 저장
        for i in range(len(dungeons)): # 모든 던전 반복
            a, b = dungeons[i] # 현재 던전 피로도 갖고옴
            # 현재 상황에서 던전 탐험할 수 있고 해당 던전 방문한 적 없을 때
            if i not in dungeon and k >= a:
                # 피로도 계산하고 현재 방문한 던전 상태를 큐에 추가
                q.append((k - b, dungeon + [i]))
        
            else:
                answer = max(answer, len(dungeon))
                
    return answer