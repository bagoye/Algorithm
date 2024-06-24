import sys
input = sys.stdin.readline

m, n = map(int, input().split())
dx, dy = [0, -1, 0, 1], [1, 0, -1, 0],

pos = [0, 0]
direction = 0
done = 0

for i in range(n):
    com, n = input().split()

    if com == "MOVE":
        pos[0] += dy[direction] * int(n)
        pos[1] += dx[direction] * int(n)

    else:
        if n == "0":
            if direction - 1 != -1:
                direction -= 1
            else:
                direction = 3
        else:
            if direction + 1 != 4:
                direction += 1
            else:
                direction = 0

    if not (0 <= pos[0] <= m and 0 <= pos[1] <= m):
        done = 1
        break

if done == 1:
    print(-1)
else:
    print(*pos)