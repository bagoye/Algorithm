import sys
input = sys.stdin.readline

for _ in range(int(input())):
    k = int(input())  # k층 입력
    n = int(input())  # n호 입력
    arr = [i for i in range(1, n + 1)]  # 0층의 i호에 i명이 살고 있으므로, arr 리스트를 1부터 n까지 초기화
    for i in range(k):  # k층까지 반복
        for j in range(1, n):  # 1호부터 n호까지 반복
            arr[j] += arr[j-1]  # 현재 층의 각 호수에 대해 아래층의 1호부터 j호까지의 사람 수를 더해줌
    print(arr[-1])  # 마지막 값은 k층의 n호에 해당하는 사람 수
