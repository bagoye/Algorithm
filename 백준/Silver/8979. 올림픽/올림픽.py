N, K = map(int, input().split())
lst = [list(map(int, input().split())) for _ in range(N)]   # 국가, 금, 은, 동
score = [[] for _ in range(N + 1)]    # 각 국가의 메달 수를 담을 리스트 생성

for i in range(N):          # 국가번호를 score 리스트의 인덱스로 사용하고 메달 수를 담을거임
    score[lst[i][0]] = lst[i][1:4]

cnt = 0
for i in range(1, N+1):
    if score[i][0] > score[K][0]:   # 다른 국가 금메달 수가 K보다 많으면 1 증가
        cnt += 1
    if score[i][0] == score[K][0] and score[i][1] > score[K][1]:   # 금메달 수 같고 은메달 수 비교
        cnt += 1
    if score[i][0] == score[K][0] and score[i][1] == score[K][1] and score[i][2] > score[K][2]:   # 금, 은 같고 동메달 비교
        cnt += 1

print(cnt + 1)