import java.util.*;

public class Solution {
    static int answer = 0;
    static Set<Integer> set = new HashSet<>();

    public int solution(String numbers) {
        // 주어진 문자열의 숫자들로 만들 수 있는 모든 순열을 생성
        for (int i = 1; i <= numbers.length(); i++) {
            // permutation 메서드를 호출하여 길이 i의 순열 생성
            permutation(numbers.split(""), 0, numbers.length(), i);
        }

        // 최종적으로 발견된 소수의 개수 반환
        return answer;
    }

    // 주어진 배열로부터 r개의 순열을 생성하는 메서드
    public void permutation(String[] arr, int depth, int n, int r) {
        // r개의 숫자로 구성된 순열이 완성된 경우
        if (depth == r) {
            // 순열로부터 숫자를 생성
            String temp = "";
            for (int i = 0; i < r; i++) {
                temp += arr[i]; // 숫자 문자열을 이어붙임
            }
            
            // 해당 숫자가 소수인지 확인
            int num = Integer.parseInt(temp);
            if (isPrime(num)) {
                set.add(num);  // 소수라면 Set에 추가 (중복 제거)
                answer = set.size();  // Set 크기를 통해 중복되지 않은 소수 개수 저장
            }
            return;
        }

        // 순열을 만들기 위한 교환 및 재귀 호출
        for (int i = depth; i < n; i++) {
            swap(arr, depth, i);  // 현재 위치와 교환
            permutation(arr, depth + 1, n, r);  // 재귀적으로 다음 depth 처리
            swap(arr, depth, i);  // 원래 상태로 되돌림 (백트래킹)
        }
    }

    // 배열의 두 요소를 교환하는 메서드
    public void swap(String[] arr, int depth, int i) {
        String temp = arr[i];
        arr[i] = arr[depth];
        arr[depth] = temp;
    }

    // 주어진 숫자가 소수인지 여부를 판별하는 메서드
    public boolean isPrime(int num) {
        // 이미 확인된 숫자인 경우 소수가 아니라고 판단
        if (set.contains(num)) return false;

        // 숫자가 2보다 작은 경우 소수가 아님
        if (num < 2) return false;

        // 2부터 해당 숫자의 제곱근까지 나눠서 소수 여부 확인
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;  // 나눠지면 소수가 아님
        }

        // 위 조건들을 통과하면 소수임
        return true;
    }
}
