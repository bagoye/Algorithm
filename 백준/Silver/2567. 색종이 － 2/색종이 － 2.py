N = int(input())
arr = [[0]*102 for _ in range(102)]
dr = [-1, 0, 1, 0]
dc = [0, 1, 0, -1]
for _ in range(N):
    R, C = map(int, input().split())
    for r in range(R, R+10):
        for c in range(C, C+10):
            arr[r][c] = 1
rlt = 0
for r in range(102):
    for c in range(102):
        if arr[r][c] == 1:
            cnt = 0
            for i in range(4):
                nr, nc = r+dr[i], c+dc[i]
                if arr[nr][nc] == 0:
                    cnt += 1
            if cnt == 1:
                rlt += 1
            elif cnt == 2:
                rlt += 2
print(rlt)