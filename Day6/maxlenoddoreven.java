public class maxlenoddoreven {
    public static void main(String[] args) {
         int arr[] = {10, 12, 14, 7, 8};
         int max = 1, count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] % 2 != arr[i - 1] % 2)
            count++;
            else
                count = 1;
            if (count > max)
                max = count;
        }
        System.out.println(max);
    }
}
    

