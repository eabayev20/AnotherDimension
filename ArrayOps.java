public class ArrayOps{

  public static int sum(int[] arr) {
    int summ = 0;
    if (arr.length == 0) {
      return 0;
    }
    for (int i =0; i != arr.length; i++) {
    summ = summ + arr[i];
    }
  return summ;
  }



}
