n = int(input())
seq = 666
cnt = 0

while True:
    if '666' in str(seq):
        cnt += 1
    if cnt == n:
        print(seq)
        break
    seq += 1  