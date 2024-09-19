import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        // 장르별 총 재생 횟수를 저장하는 Map
        HashMap<String, Integer> genrePlayCount = new HashMap<>();
        // 장르별 (플레이 횟수, 고유번호)의 리스트를 저장하는 Map
        HashMap<String, List<int[]>> genreSongs = new HashMap<>();
        
        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int play = plays[i];
            
            // 장르별 총 재생 횟수 저장
            genrePlayCount.put(genre, genrePlayCount.getOrDefault(genre, 0) + play);
            
            // 장르별 곡의 (재생 횟수, 고유번호) 저장
            genreSongs.putIfAbsent(genre, new ArrayList<>());
            genreSongs.get(genre).add(new int[] {play, i});
        }
        
        // 장르별 총 재생 횟수 기준으로 내림차순 정렬
        List<String> genreSort = new ArrayList<>(genrePlayCount.keySet());
        genreSort.sort((a, b) -> genrePlayCount.get(b) - genrePlayCount.get(a));
        
        List<Integer> answer = new ArrayList<>();
        
        // 각 장르별로 곡들을 재생 횟수 내림차순, 고유번호 오름차순으로 정렬 후 상위 2개 추출
        for (String genre : genreSort) {
            List<int[]> songs = genreSongs.get(genre);
            
            // 재생 횟수 내림차순, 고유번호 오름차순 정렬
            songs.sort((a, b) -> {
                if (b[0] == a[0]) {
                    return a[1] - b[1]; // 재생 횟수가 같으면 고유번호 오름차순
                } else {
                    return b[0] - a[0]; // 재생 횟수 내림차순
                }
            });
            
            // 상위 2개 곡 추가
            for (int i = 0; i < Math.min(2, songs.size()); i++) {
                answer.add(songs.get(i)[1]); // 고유번호를 리스트에 추가
            }
        }
        
        // 정답 리스트를 배열로 변환
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
