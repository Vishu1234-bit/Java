import java.util.*;
import java.util.stream.IntStream;
class Main {
    public static void main(String[] args) {
       int[] arr1 = {1,2,3};
       int[] arr2 = {2,4,6};
       int[] res = IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).toArray();
       System.out.println(Arrays.toString(res));
}
}
