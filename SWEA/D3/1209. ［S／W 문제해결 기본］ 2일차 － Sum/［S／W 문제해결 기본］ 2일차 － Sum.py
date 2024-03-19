for tc in range(1, 11):
    _ = int(input())
    arr = [list(map(int, input().split())) for _ in range(100)]

    row_list = []
    for i in range(100):
        r_total = 0
        for j in range(100):
            r_total += arr[i][j]
        row_list.append(r_total)

    col_list = []
    for j in range(100):
        c_total = 0
        for i in range(100):
            c_total += arr[i][j]
        col_list.append(c_total)

    right = 0
    for i in range(100):
        right += arr[i][i]

    left = 0
    for i in range(100):
        for j in range(99, -1, -1):
            if i + j == 99:
                left += arr[i][j]

    find_max_value = [max(row_list), max(col_list), right, left]
    result = max(find_max_value)
    
    print(f"#{tc}", result)