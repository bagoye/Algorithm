for tc in range(1, 11):
    n = int(input())
    heights = list(map(int, input().split()))

    for i in range(n):
        max_block = 0 
        min_block = 100
        max_idx = 0
        min_idx = 100
        for j in range(len(heights)):
            if max_block <= heights[j]:
                max_idx = j
                max_block = heights[j]
            if min_block >= heights[j]:
                min_idx = j
                min_block = heights[j]
        heights[max_idx] -= 1
        heights[min_idx] += 1

    flat_max = 0
    flat_min = 100
    max_idx = 0
    min_idx = 100
    for k in range(len(heights)):
        if flat_max <= heights[k]:
            max_idx = k
            flat_max = heights[k]
        if flat_min >= heights[k]:
            min_idx = k
            flat_min = heights[k]

    print(f'#{tc} {flat_max - flat_min}')