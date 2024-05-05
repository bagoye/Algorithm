n = int(input())

li = list(map(int,str(n)))
    
li.sort(reverse=True) # 내림차순
 
for i in li:
    print(i,end='')