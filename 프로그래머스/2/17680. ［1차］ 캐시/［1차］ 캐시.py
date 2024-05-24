def solution(cacheSize, cities):
    answer = 0  # 총 실행 시간을 저장할 변수
    cache = []  # 캐시를 저장할 리스트
    
    for city in cities:
        city = city.lower()  # 도시 이름을 소문자로 변환 (대소문자 구분하지 않기 위해)
        if cacheSize:  # 캐시 크기가 0이 아닌 경우
            if not city in cache:  # 도시가 캐시에 없는 경우 (cache miss)
                if len(cache) == cacheSize:  # 캐시가 꽉 찬 경우
                    cache.pop(0)  # 가장 오래된 항목 제거 (LRU)
                cache.append(city)  # 새로운 도시를 캐시에 추가
                answer += 5  # cache miss 실행 시간 추가
            else:  # 도시가 캐시에 있는 경우 (cache hit)
                cache.pop(cache.index(city))  # 기존 위치에서 제거
                cache.append(city)  # 가장 최근에 사용된 항목으로 갱신
                answer += 1  # cache hit 실행 시간 추가
        else:  # 캐시 크기가 0인 경우 (캐시를 사용하지 않음)
            answer += 5  # 모든 경우가 cache miss
    return answer  # 총 실행 시간 반환
