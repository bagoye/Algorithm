t = int(input())
for tc in range(1, t+1):
    p, a, b = map(int, input().split())

    s, e = 1, p
    a_cnt = b_cnt = 0
    while s <= e:
        mid = (s + e) // 2          # 중간위치 선택
        if mid == a:
            a_cnt += 1
            break
        elif mid > a:         # 왼족에 있는지 확인
            e = mid
            a_cnt += 1
        else:                        # 오른쪽
            s = mid
            a_cnt += 1

    s, e = 1, p
    while s <= e:
        mid = (s + e) // 2           # 중간위치 선택
        if mid == b:
            b_cnt += 1
            break
        elif mid > b:           # 왼족에 있는지 확인
            e = mid
            b_cnt += 1
        else:                          # 오른쪽
            s = mid
            b_cnt += 1

    if a_cnt > b_cnt:
        print(f'#{tc} B')
    elif a_cnt < b_cnt:
        print(f'#{tc} A')
    else:
        print(f'#{tc} 0')