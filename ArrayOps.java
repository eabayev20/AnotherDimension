
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
      large = arr[i];
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

}
