import sys
input = sys.stdin.readline

n = int(input())
arr = [list(map(int, input().split())) for _ in range(n)]
blue, white = 0, 0

def slice(x, y, n):
    global blue, white
    color = arr[x][y]
    for i in range(x, x+n):
        for j in range(y, y+n):
            if color != arr[i][j]:
                slice(x, y, n//2)
                slice(x, y+n//2, n//2)
                slice(x+n//2, y, n//2)
                slice(x+n//2, y+n//2, n//2)
                return
    if color == 0:
        white += 1
    else:
        blue += 1

slice(0, 0, n)
print(white)
print(blue)