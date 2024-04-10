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

        return counters;
    }

}
