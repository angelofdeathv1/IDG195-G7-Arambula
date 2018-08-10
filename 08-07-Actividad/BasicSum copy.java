public class BasicSum {
    public static void main(String args[]) {
        int[] arr = {4, 5, 6, 9, 7};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>sum){
                sum=arr[i];
            }
        }
        System.out.println(sum);
    }
}
