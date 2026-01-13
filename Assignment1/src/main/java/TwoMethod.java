import java.util.ArrayList;
import java.util.List;

public class TwoMethod {


    /**
     * The fibRecursive method returns the nth number of the Fibonacci sequence to a given input
     * @param n is the given input for the number at that position of the Fibonacci sequence
     * @return returns exact number at position N
     */
    public static int fibRecursive(int n) {
        List<Integer> fibonacciSeq = new ArrayList<>();
        fibonacciSeq.add(0);
        fibonacciSeq.add(1);

        for(int i = 2; i <= n; i++){
            fibonacciSeq.add(
                    fibonacciSeq.get(i - 1) + fibonacciSeq.get(i - 2)
            );
        }

        return fibonacciSeq.get(n);
    }
    public static void main(String[] args){
        System.out.println("");
        System.out.println("The nth term of the Fibonacci sequence is " + fibRecursive(10));
    }


}
