package java101;

public class PracticeProblems {
    static int countOccurrences(int n, int[] arr ) {
        int count = 0;
        for (int i = 0; i <= arr.length - 1; i++ ) {
            if (arr[i] == n) {
                count++;
            }
        }
        return count;
    } 
    static String reversedArray(int[] arr) {
        String str = "{";
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i > 0) {
                str += (arr[i]) + ", "; 
        }   else {
            str += (arr[i]);
            }
        }
    return str += "}";
    }
    static int sumGrid(int[][] arr, int sum) {
        sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int e = 0;
            for (e = 0; e < arr[i].length; e++) {
                sum += arr[i][e];
            }
        }
    return sum;
    }
}
