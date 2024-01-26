import java.util.HashMap;
public class Main {
    public static int findAllSubarraysWithGivenSum(int arr[], int k) {
        int n = arr.length; // size of the given array.
        HashMap<Integer, Integer> mpp = new HashMap();
        int Sum = 0, cnt = 0;

        mpp.put(0, 1); // Setting 0 in the map.
        for (int i = 0; i < n; i++) {
            Sum += arr[i];
            int remove = Sum - k;
            cnt += mpp.getOrDefault(remove, 0);

            mpp.put(Sum, mpp.getOrDefault(Sum, 0) + 1);


        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        int k = 6;
        int cnt = findAllSubarraysWithGivenSum(arr, k);
        System.out.println("The number of subarrays is: " + cnt);
    }
}