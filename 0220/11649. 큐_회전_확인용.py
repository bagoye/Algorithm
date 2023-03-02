def enQueue(item):      # 데이터 받기 = rear
    global rear
    rear = (rear + 1) % N
    Q[rear] = item
    return

def deQueue():          # 데이터 삭제 = front
    global front
    front = (front + 1) % N
    return Q[front]

for tc in range(1, int(input())+1):
    N, M = map(int, input().split())
    arr = list(map(int, input().split()))
    Q = [0] * (N + 1)
    rear = front = 0

    for i in arr:
        enQueue(i)

    for i in range(M):
        enQueue(deQueue())

    print(f'#{tc} {deQueue()}')