for tc in range(1, int(input())+1):
    num = int(input())
    arr = list(map(int, input().split()))
    dic = {}

    for i in arr:
        if i in dic:
            dic[i] += 1
        else:
            dic[i] = 0

    print(f"#{tc}", max(dic, key=dic.get))