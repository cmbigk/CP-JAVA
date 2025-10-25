public class IterativeFactorial extends Factorial {
    @Override
    public long calculate(int n) {
        if (n == 0) return 1;

      int result = 1;
        for ( int i = n ; i >= 1; i --){
           result = result*i;
        }
          return result;
    
    }
}