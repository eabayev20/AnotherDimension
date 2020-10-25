import java.util.Arrays;
public class Tester{

  public static void main (String[] args) {
    int[] E = {1,2,3,4,5};
    System.out.println(ArrayOps.sum(E));
    System.out.println(ArrayOps.largest(E));
    int[] D = {};
    System.out.println(ArrayOps.sum(D));
    int[] C = {1};
    System.out.println(ArrayOps.sum(C));
    System.out.println(ArrayOps.largest(C));
    int[][] FF = {{1,2,3},{2,3,4},{3,4,5}};
      System.out.println(Arrays.toString(ArrayOps.sumRows(FF)).replace("], ","],\n"));
  }
}
