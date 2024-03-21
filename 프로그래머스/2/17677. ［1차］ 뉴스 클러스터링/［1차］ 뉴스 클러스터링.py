def making(word):
    result = []
    for i in range(1, len(word)):
        # 현재 문자와 이전 문자가 모두 알파벳이고, 현재 문자열이 두 글자인 경우
        if word[i-1].isalpha() and word[i].isalpha():
            # 두 글자를 대문자로 변환하여 결과 리스트에 추가
            result.append(word[i-1:i+1].upper())
    return result


def solution(str1, str2):
    # str1, str2 를 각 각 making 작업
    pre = making(str1)
    post = making(str2)

    # 교집합 합집합
    cross = set(pre) & set(post)
    all = set(pre) | set(post)

    # 둘 다 공집합이라면 1*65536 return
    if not all: return 65536
    cross_val = all_val = 0

    # 교집합, 합집합을 돌며 각 개수를 취합
    for el in cross:
        cross_val += min(pre.count(el), post.count(el))

    for al in all:
        all_val += max(post.count(al), pre.count(al))

    # 결과값 리턴
    return int(cross_val/all_val*65536)