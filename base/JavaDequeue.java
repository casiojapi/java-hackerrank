    import java.util.*;
    public class test {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque deque = new ArrayDeque<>();
            int n = in.nextInt();
            int m = in.nextInt();
            int max = -1;
            HashSet hs = new HashSet<>();
            
            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
                hs.add(num);
                deque.add(num);
                if (deque.size() == m) {
                    if (hs.size() > max) {
                        max = hs.size();
                    }
                    int first = (int)deque.remove();
                    if (!deque.contains(first)) {
                        hs.remove(first);
                    }
                }
            }
            System.out.println(max);
        }
    }
