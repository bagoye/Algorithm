from collections import deque
import sys
input = sys.stdin.readline

queue = deque()

for _ in range(int(input())):
    cmd = input().split()

    if cmd[0] == "push_front":
        queue.appendleft(cmd[1])

    elif cmd[0] == "push_back":
        queue.append(cmd[1])

    elif cmd[0] == "pop_front":
        if queue:
            print(queue[0])    
            queue.popleft()
        else:
            print("-1")

    elif cmd[0] == "pop_back":
        if queue:
            print(queue[len(queue) - 1])    
            queue.pop()
        else:
            print("-1")

    elif cmd[0] == "size":
        print(len(queue))

    elif cmd[0] == "empty":
        if len(queue) == 0: 
            print(1)
        else: 
            print(0)

    elif cmd[0] == "front":
        if len(queue) == 0: 
            print(-1)
        else: 
            print(queue[0])

    elif cmd[0] == "back":
        if len(queue) == 0: 
            print(-1)
        else: 
            print(queue[-1])