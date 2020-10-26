import java.util.Arrays;
public class Tester{

  public static void main (String[] args) {
    int[] E = {1,2,3,5,4};
    System.out.println(ArrayOps.sum(E));
    System.out.println(ArrayOps.largest(E));
    int[] D = {};
    System.out.println(ArrayOps.sum(D));
    int[] C = {1};
    System.out.println(ArrayOps.sum(C));
    System.out.println(ArrayOps.largest(C));
    int[][] FF = {{1,2,3},{2,4,3},{3,4,5}};
      System.out.println(Arrays.toString(ArrayOps.sumRows(FF)).replace("], ","],\n"));
      int[][] GG = {{},{2,3,4},{3,4,5}};
        System.out.println(Arrays.toString(ArrayOps.sumRows(GG)).replace("], ","],\n"));
        System.out.println(Arrays.toString(ArrayOps.largestInRows(FF)).replace("], ","],\n"));
        System.out.println(ArrayOps.sum(FF));
        System.out.println(Arrays.toString(ArrayOps.sumCols(FF)).replace("], ","],\n"));
        System.out.println(ArrayOps.isRowMagic(FF));
        int[][] HH = {{1,2,3},{1,3,2},{2,3,1}};
        System.out.println(ArrayOps.isRowMagic(HH));
        
  }
}
