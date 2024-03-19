for tc in range(1, 11):
    _ = int(input())
    result = 0
    pan = [0 for i in range(100)]  # 세로의 합을 저장할 배열
    right = 0
    left = 0
    for i in range(100):
        line = list(map(int, input().split()))
        result = max(result, sum(line))  # 가로의 합
        right += line[i]  # 아래 오른쪽 대각선의 합을 저장할 cnt
        left += line[99 - i]  # 아래 왼쪽 대각선의 합을 저장할 cnt1
        for j in range(100):
            pan[j] += line[j]  # 세로값 저장

    result = max(result, max(pan), right, left)  # 최댓값
    print(f"#{tc}", result)