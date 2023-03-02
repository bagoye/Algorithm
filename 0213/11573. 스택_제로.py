t = int(input())
for tc in range(1, t+1):
    N = int(input())
    nums = list(map(int, input().split()))

    stack = []
    for i in range(N):
        if nums[i] != 0:
            stack.append(nums[i])
        else:
            stack.pop()

    print(f'#{tc}', sum(stack))