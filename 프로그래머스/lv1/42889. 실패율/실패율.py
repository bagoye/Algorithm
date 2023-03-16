def solution(N, lst):
    p = {}
    l = len(lst)
    lst.sort()
    sl = 0
    
    for i in range(1, N + 1):
        c = stage = 0
        for j in range(sl,l+sl):
            if i < lst[j]:break
            if i == lst[j]:
                stage = i
                c,sl = c+1,sl+1
                
        if c:p[stage]=c/l
        else:p[i]=0
        l -= c
        
    return sorted(p, key=lambda x:-p[x])