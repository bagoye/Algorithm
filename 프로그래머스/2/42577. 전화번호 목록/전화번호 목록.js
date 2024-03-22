function solution(phone_book) {
    const nums = {}
    for (const phone of phone_book) {
        nums[phone] = true;
    }
    
    for (let phone of phone_book) {
        for (let i = 1; i < phone.length; i++){
            const prefix = phone.substring(0, i);
            if (nums[prefix]) return false;
        }
    }
    return true;
}