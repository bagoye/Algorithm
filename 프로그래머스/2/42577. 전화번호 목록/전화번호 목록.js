function solution(phone_book) {
    phone_book.sort()
    for (let i = 0; i < phone_book.length - 1; i++){
        let idx = phone_book[i].length
        if (phone_book[i] === phone_book[i+1].substring(0, idx)) {
            return false;
        }
    }
    return true
}