arr = [list(map(int, input().split())) for _ in range(5)]
bingo = [list(map(int, input().split())) for _ in range(5)]

def binggo():
    cnt = 0
    for k in range(5):
        for l in range(5):
            for i in range(5):
                for j in range(5):
                    if arr[i][j] == bingo[k][l]:
                        arr[i][j] = 0
                        cnt += 1
                    if cnt >= 12:
                        rlt = 0
                        for r in range(5):
                            if sum(arr[r]) == 0:
                                rlt += 1
                        for y in range(5):
                            count = 0
                            for x in range(5):
                                if arr[x][y] == 0:
                                    count += 1
                            if count == 5:
                                rlt += 1
                        cross1 = []
                        cross2 = []
                        for a in range(5):
                            cross1.append(arr[a][a])
                            cross2.append(arr[a][4-a])
                        if sum(cross1) == 0:
                            rlt += 1
                        if sum(cross2) == 0:
                            rlt += 1

                        if rlt >= 3:
                            return cnt

print(binggo())