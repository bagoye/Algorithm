for _ in range(int(input())):
    n = int(input())
    lst = []
    lmax = 0
    name = ''
    for i in range(n):
        s, l = input().split()
        l = int(l)
        if lmax < l:
            lmax = l
            name = s
    print(name)