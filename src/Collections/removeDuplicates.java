
import java.util.*;
class Main {
    public static void main(String[] args) {
       List<Integer> list = Arrays.asList(1,2,3,4,2,3);
       Set<Integer> set = new HashSet<Integer>(list);
       System.out.println(set);
}
}
