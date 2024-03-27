from collections import deque

def solution(begin, target, words):
    return bfs(words, begin, target)

def bfs(words, begin, target):
    if target not in words:
        return 0
    
    q = deque()
    for word in words:
        if check(begin, word):
            q.append([word, 1])
    
    while q:
        word, cnt = q.popleft()
        if word == target:
            return cnt
        for w in words:
            if check(word, w):
                if w == target:
                    return cnt+1
                q.append([w, cnt+1])
    return 0
        
def check(word1, word2):
    cnt = 0
    for i in range(len(word1)):
        if word1[i] == word2[i]:
            cnt += 1
    if cnt == (len(word1) - 1):
        return True
    else:
        return False