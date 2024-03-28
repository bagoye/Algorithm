def solution(word):
    vowel = ['A', 'E', 'I', 'O', 'U']
    answer = 0

    for i in range(len(word)):
        idx = vowel.index(word[i])
        for j in range(5-i):
            answer += idx * (5 ** j)
            
    return answer + len(word)