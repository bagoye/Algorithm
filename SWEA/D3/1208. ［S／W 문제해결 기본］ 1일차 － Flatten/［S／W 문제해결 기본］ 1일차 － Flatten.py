for tc in range(1, 11):
    n = int(input())
    arr = list(map(int, input().split()))
    for j in range(n):
        maxVal, minVal = max(arr), min(arr)
        maxIdx, minIdx = arr.index(maxVal), arr.index(minVal)
        arr[minIdx] += 1
        arr[maxIdx] -= 1
    answer = max(arr) - min(arr)
    print(f"#{tc}", answer)