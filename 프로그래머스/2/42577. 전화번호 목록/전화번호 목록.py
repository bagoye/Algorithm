def solution(phone_book):
    phone_book.sort()
    for i in range(len(phone_book) - 1):
        idx = len(phone_book[i])
        if phone_book[i] in phone_book[i+1][:idx]:
            return False
    return True