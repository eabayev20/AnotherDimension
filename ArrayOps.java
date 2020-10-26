
public class ArrayOps{

  public static int sum(int[] arr) {
    int summ = 0;
    if (arr.length == 0) {
      return 0;
    }
    else {
    for (int i =0; i != arr.length; i++) {
    summ = summ + arr[i];
    }
    }
    return summ;
  }
  public static int largest (int[] arr) {
    int large = 0;
    for (int i = 0; i != arr.length; i++) {

      if (arr[i] > large) {
        large = arr[i];
      }
    }
    return large;
  }
  public static int[] sumRows(int[][] matrix) {
    int[] a;

    a = new int[matrix.length];
    for(int i = 0; i != matrix.length; i++) {
        int rowsum=0;
      if (matrix[i].length == 0) {
        rowsum = 0;
      }
      else {
      for(int j=0; j!= matrix[i].length; j++) {
        rowsum = rowsum + matrix[i][j];
      }
      a[i] = rowsum;
    }
    }
    return a;
  }
  public static int[] largestInRows(int[][] matrix) {
    int[] b;

    b = new int[matrix.length];
    for(int i = 0; i != matrix.length; i++) {
        int largenum=0;


        for (int j = 0; j != matrix[i].length; j++) {

          if (matrix[i][j] > largenum) {
            largenum = matrix[i][j];
          }
        }
      b[i] = largenum;

    }


    return b;
  }
  public static int sum(int[][] matrix) {
    int total = 0;
    for (int i = 0; i != matrix.length; i++) {
      total = total + sum(matrix[i]);
    }
    return total;
  }
  public static int[] sumCols(int[][] matrix) {
    int[] b;

    b = new int[matrix[0].length];
    for (int j = 0; j != matrix[0].length; j++){
      int colsum = 0;
      for (int i = 0; i!=matrix.length;i++) {
        colsum = matrix[i][j];
        b[j] = b[j]+colsum;




      }

    }
    return b;
  }
  public static boolean isRowMagic(int[][] matrix) {
    int[] c;
    c = new int[matrix.length];
    c = sumRows(matrix);
    int zzz = 0;
    for (int i = 0; i != c.length; i++) {
      if (c[0] != c[i]) {
        zzz = zzz + 1;
      }

    }
    return zzz == 0;
    }



}
