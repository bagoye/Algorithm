import sys
import heapq
input = sys.stdin.readline


n, m = map(int, input().split())

cards = []
card_lst = [int(x) for x in input().split()]

for card in card_lst:
    heapq.heappush(cards, card)

for _ in range(m):
    card1 = heapq.heappop(cards)
    card2 = heapq.heappop(cards)

    heapq.heappush(cards, card1 + card2)
    heapq.heappush(cards, card1 + card2)

print(sum(cards))