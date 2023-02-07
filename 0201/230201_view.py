# 조망권이 확보된 세대 수 구하기
for tc in range(1, 11):
    n = int(input())
    height = list(map(int, input().split()))

    result = 0
    for i in range(2, n - 2):  # 양 옆 0층인거 2개씩 빼고 반복
        if height[i] > height[i + 1] and height[i] > height[i + 2] and height[i] > height[i - 1] and height[i] > height[
            i - 2]:
            # view = [height[i] - height[i+1], height[i] - height[i+2], height[i] - height[i-1], height[i] - height[i-2]]
            view1 = height[i] - height[i + 1]
            view2 = height[i] - height[i + 2]
            view3 = height[i] - height[i - 1]
            view4 = height[i] - height[i - 2]  # 각각 층수 차이 구하기
            minV = view1  # i랑 차이가 제일 적으면 옆의 네 건물들 중 층수가 제일 높음. 제일 높은 층 ~ i층 사이만 조망권 확보 가능함 => 층수 차이 최소값 구하기
            for j in [view1, view2, view3, view4]:
                if minV > j:
                    minV = j
            result += minV

    print(f'#{tc} {result}')