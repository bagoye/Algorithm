n = int(input())

arr = []
arr_x, arr_y = [], []
answer = [-1] * n

for _ in range(n):
    x, y = map(int, input().split())
    arr.append([x, y])
    arr_x.append(x)
    arr_y.append(y)

for x in arr_x:
    for y in arr_y:
        dist = []

        for i, j in arr:
            d = abs(i-x) + abs(j-y)
            dist.append(d)

        dist.sort()

        temp = 0
        for k in range(len(dist)):
            d = dist[k]
            temp += d
            if answer[k] == -1:
                answer[k] = temp
            else:
                answer[k] = min(temp, answer[k])

print(*answer)