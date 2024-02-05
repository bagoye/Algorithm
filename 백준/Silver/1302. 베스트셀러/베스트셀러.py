import sys
input = sys.stdin.readline

sell = {}

for i in range(int(input())):
    book = input()
    if book in sell:
        sell[book] += 1
    else:
        sell[book] = 1
        
max_value = max(sell.values())

best = sorted([key for key, value in sell.items() if value == max(sell.values())])

print(best[0])
