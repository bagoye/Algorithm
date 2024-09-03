import sys
input = sys.stdin.readline

a, b = map(str, input().rstrip().split())
board = [["."] * len(a) for _ in range(len(b))]

for i in range(len(a)):
    if a[i] in b:
        col = i
        row = b.index(a[i])
        break

for i in range(len(a)):
    board[row][i] = a[i]

for i in range(len(b)):
    board[i][col] = b[i]

for i in board:
    print("".join(i))
