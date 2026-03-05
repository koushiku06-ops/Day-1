public class Sumevenposition {

    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50, 70};
        int n = arr.length;

        // Step 1: Reverse the array
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }

        // Step 2: Find sum of elements at even positions
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {   // even index
                sum += arr[i];
            }
        }

        System.out.println("Sum = " + sum);
    }
}
    

