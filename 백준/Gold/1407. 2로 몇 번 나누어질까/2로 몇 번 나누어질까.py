import sys
input = sys.stdin.readline
 
a, b = map(int, input().split())

a -= 1

temp_a = a
for i in range(1, 99):
    temp_a += (a//(2**i))*((2**i)-(2**(i-1)))


temp_b = b
for i in range(1, 99):
    temp_b += (b//(2**i))*((2**i)-(2**(i-1)))

print(temp_b - temp_a)