def solution(genres, plays):
    answer = []
    
    dic1 = {} # {장르: 총 재생 횟수}
    dic2 = {} # {장르: [(플레이 횟수, 고유번호)]}
    
    for i in range(len(genres)):
        dic1[genres[i]] = dic1.get(genres[i], 0) + plays[i]
        dic2[genres[i]] = dic2.get(genres[i], []) + [(plays[i] , i)]
    
    # 재생 횟수 내림차순으로 장르별 정렬
    dic2_sort = sorted(dic1.items(), key=lambda x: x[1], reverse=True)
    
    # 재생 횟수 내림차순, 인덱스 오름차순 정렬
    for (genre, play) in dic2_sort:
        dic2[genre] = sorted(dic2[genre], key=lambda x : (-x[0], x[1]))
        answer += [i for (play, i) in dic2[genre][:2]]
        
    return answer