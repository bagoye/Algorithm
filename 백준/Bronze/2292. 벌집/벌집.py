n = int(input())
num = 1 # 벌집의 개수
cnt = 1
while n > num:
    num += 6 * cnt # 벌집은 6의 배수로 늘어남 (1 -> 6 -> 12 -> 18 ...)
    cnt += 1
print(cnt)