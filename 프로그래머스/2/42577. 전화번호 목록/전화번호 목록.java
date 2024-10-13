import java.util.HashSet;

class Solution {
    public boolean solution(String[] phone_book) {
        HashSet<String> phoneSet = new HashSet<>();
        
        for (String phone : phone_book) {
            phoneSet.add(phone);
        }

        for (String phone : phone_book) {
            for (int i = 1; i < phone.length(); i++) {
                if (phoneSet.contains(phone.substring(0, i))) {
                    return false;
                }
            }
        }
        
        return true;
    }
}
