N, M = map(int, input().split()) # N과 M을 int로 입력받음
num_lst = list(map(int, input().split())) # 카드에 쓰여있는 숫자를 list로 만들어 줌
result = []
for i in range(0, len(num_lst)):
    for j in range(i+1, len(num_lst)):
        for k in range(j+1, len(num_lst)): # 반복문을 중첩으로 사용해서 5 + 6 + 7 -> 5 + 6 + 8 -> ... 모든 경우의 수 구함
            if num_lst[i] + num_lst[j] + num_lst[k] <= M:
                result.append(num_lst[i] + num_lst[j] + num_lst[k])

print(max(result))