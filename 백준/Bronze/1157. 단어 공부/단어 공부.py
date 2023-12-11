word = input().upper()
w_lst = list(set(word))
cnt = []

for i in w_lst:
    count = word.count(i)
    cnt.append(count)

if cnt.count(max(cnt)) >= 2:
    print("?")
else:
    print(w_lst[(cnt.index(max(cnt)))])
