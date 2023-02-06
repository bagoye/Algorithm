def solution(chicken):
    answer = 0
    while 10 <= chicken:
        ser = chicken // 10     # 서비스 치킨은 시켜먹은 치킨 수를 10으로 나눈 몫
        cou = chicken % 10      # 서비스 치킨을 시키고 남은 쿠폰 수
        answer += ser
        chicken = ser + cou
    return answer