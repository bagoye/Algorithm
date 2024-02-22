import sys
input = sys.stdin.readline

def fib(n):
    zeros=[1,0,1]
    ones=[0,1,1]
    if n >= 3:
        for i in range(2,n):
            zeros.append(zeros[i-1] + zeros[i])
            ones.append(ones[i-1] + ones[i])
    print(f"{zeros[n]} {ones[n]}")
 
for _ in range(int(input())):
    n = int(input())
    fib(n)