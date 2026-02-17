import java.util.*;
public class Cupcake {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                List<Integer> ls = new ArrayList<>();
                for(int i=0; i<n; i++){
                        ls.add(sc.nextInt());
                }
                Collections.sort(ls, Collections.reverseOrder());
                long miles = 0;
                for(int i=0;i<n;i++){
                        miles += ls.get(i)*Math.pow(2,i);
                }
                System.out.println(miles);
        } 
}
