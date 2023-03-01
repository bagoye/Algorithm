N = int(input())
lst = []
for i in range(1, N+1):
    n_lst = [N]
    n_lst.append(i)
    idx = 1
    while True:
        next_num = n_lst[idx-1] - n_lst[idx]
        if next_num < 0:
            break
        else:
            n_lst.append(next_num)
            idx += 1

    if len(lst) < len(n_lst):
        lst = n_lst

print(len(lst))
for i in lst:
    print(i, end=' ')
