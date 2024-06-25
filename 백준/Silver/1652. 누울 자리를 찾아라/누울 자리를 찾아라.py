import sys
input = sys.stdin.readline

n = int(input())
arr = [list(input().rstrip()) for _ in range(n)]
x_cnt, y_cnt = 0, 0

for i in range(n):
    x_temp, y_temp = 0, 0
    for j in range(n):
        if arr[i][j] == ".":
            x_temp += 1
        else:
            if x_temp > 1:
                x_cnt += 1
            x_temp = 0

    for j in range(n):
        if arr[j][i] == ".":
            y_temp += 1
        else:
            if y_temp > 1:
                y_cnt += 1
            y_temp = 0

    if x_temp > 1:
        x_cnt += 1
    if y_temp > 1:
        y_cnt += 1
        
print(x_cnt, y_cnt)