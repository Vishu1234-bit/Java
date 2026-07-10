
import java.util.*;
class Main {
    public static void main(String[] args) {
       List<Integer> list = Arrays.asList(1,2,3,4,2,3);
       Set<Integer> set = new HashSet<Integer>();
       List<Integer> result = new ArrayList<>();
       list.forEach(ele->{
       if(!set.add(ele)){
           result.add(ele);
       }
       });
    result.forEach(ele->System.out.println(ele));
}
}
