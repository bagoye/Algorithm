t = int(input())
for tc in range(1, t+1):
    n = int(input())
    nums = list(map(int, input().split()))

    for i in range(n - 1):  # N-2 + 1
        idx = i # i가 범위의 시작

        if i % 2 == 0:
            for j in range(i + 1, n):
                if nums[idx] < nums[j]:
                    idx = j
            nums[i], nums[idx] = nums[idx], nums[i]

        else:
            for j in range(i + 1, n):
                if nums[idx] > nums[j]:
                    idx = j
            nums[i], nums[idx] = nums[idx], nums[i]

    lst = []
    for i in range(10):
        lst.append(nums[i])

    print(f'#{tc}', *lst)