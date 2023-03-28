def check(card):
    for i in range(10):
        if card[i] >= 3: return True
        if card[i] and card[i+1] and card[i+2]: return True
    else:
        return False

for tc in range(1, int(input())+1):

    arr = list(map(int, input().split()))
    p1 = [0] * 12
    p2 = [0] * 12
    ans = 0
    for i in range(6):
        idx1, idx2 = arr[2 * i], arr[2 * i + 1]
        p1[idx1] += 1
        p2[idx2] += 1

        if i < 2: continue

        if check(p1):
            ans = 1
            break
        if check(p2):
            ans = 2
            break

    print(f'#{tc}', ans)