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
  

}
