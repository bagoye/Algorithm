n = int(input())

arr = [list(map(str, input().split())) for _ in range(n)]

answer = 0

for a in range(1, 10):
    for b in range(1, 10):
        for c in range(1, 10):

            if a == b or b == c or c == a:
                continue

            cnt = 0
            for i in arr:
                number = list(i[0])
                strike = int(i[1])
                ball = int(i[2])

                ball_cnt = 0
                strike_cnt = 0

                if int(number[0]) == a:
                    strike_cnt += 1
                if int(number[1]) == b:
                    strike_cnt += 1
                if int(number[2]) == c:
                    strike_cnt += 1

                if int(number[1]) == a or int(number[2]) == a:
                    ball_cnt += 1
                if int(number[0]) == b or int(number[2]) == b:
                    ball_cnt += 1
                if int(number[0]) == c or int(number[1]) == c:
                    ball_cnt += 1

                if strike != strike_cnt:
                    break
                if ball != ball_cnt:
                    break
                cnt += 1

            if cnt == n:
                answer += 1

print(answer)