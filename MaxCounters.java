import java.util.*;

public class MaxCounters {

    public static void main(String [] args) {
        System.out.printf("Hello golden leader solution%n");
        if (args != null && args.length == 1 && args[0].toLowerCase().equals("-usage")) {
            System.out.printf("java GoldenLeader%n");
            return;
        }
        int N = 5;
        int [] A = new int [] {3, 4, 4, 6, 1, 4, 4};
        MaxCounters maxCounters = new MaxCounters();
        int[] sequence = maxCounters.solution(N, A);
        System.out.printf("The sequence of counters is %s%n", Arrays.toString(sequence));
    }

    public int[] solution(int N, int [] A) {
        System.out.printf("Given %d counters%n", N);
        System.out.printf("Given array of operations %s%n", Arrays.toString(A));

        int [] counters = new int [N];
        Arrays.fill(counters, 0);
        int maxCounter = 0;
        int operations = A.length;

        System.out.printf("initial counters %s%n", Arrays.toString(counters));

        // for every operation
        for (int i = 0; i < operations; i++) {

            System.out.printf("for A[%d] = %d%n", i, A[i]);

            // check for operation #1
            // if A[K] = X, such that 1<=X<=N, then the operation K is increase(X)
            // BTW, K is i, X is the index of a counters array position
            if (1 <= A[i] && A[i] <= N) {

                // Note the X values are one-based; arrays are still zero-based indices
                int temp = counters[ A[i] - 1 ];
                temp += 1;
                counters[ A[i] - 1 ] = temp;
                if (maxCounter < temp) {

                    maxCounter = temp;

                }

            }

            // check for operation #2
            // if A[K] = N + 1, then operation K is max counter
            if (A[i] == N + 1) {

                Arrays.fill(counters, maxCounter);

            }

            System.out.printf("current counters %s%n", Arrays.toString(counters));

        }

        return counters;
    }

}
