import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    static class Student {
        String name;
        int ko;
        int en;
        int math;

        public Student(String name, int ko, int en, int math) {
            this.name = name;
            this.ko = ko;
            this.en = en;
            this.math = math;
        }
    }

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        ArrayList<Student> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int ko = Integer.parseInt(st.nextToken());
            int en = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());

            arr.add(new Student(name, ko, en, math));
        }

        Collections.sort(arr, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.ko == o2.ko) {
                    if (o1.en == o2.en) {
                        if (o1.math == o2.math) {
                            return o1.name.compareTo(o2.name);
                        }
                        return o2.math - o1.math;
                    }
                    return o1.en - o2.en;
                }
                return o2.ko - o1.ko;
            }
        });

        for (Student x : arr) {
            bw.write(x.name + "\n");
        }
        bw.close();
    }
}
