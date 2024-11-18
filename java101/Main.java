package java101;

public class Main {
    public static void main(String[] args) {

        int[] arr1 = {0, 2, 3, 4, 5, 5, 6, 7, 2, 1, 0};
        System.out.println(PracticeProblems.countOccurrences(5, arr1));

        int[] arr2 = {5, 4, 3, 2, 1};
        System.out.println(PracticeProblems.reversedArray(arr2));

        double[][] arr3 = {
            {1.2, 0.2, 0.1},
            {3.2, 302.1},
            {22.33}
        };
        System.out.println(PracticeProblems.sumGrid(arr3));


        System.out.println(PracticeProblems.fib(30));
    }
}
