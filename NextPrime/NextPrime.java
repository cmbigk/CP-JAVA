

public class NextPrime {
    public static Integer nextPrime(Integer n) {

     if (n < 0) return 0;
     int temp = n+1;
     while (!isPrime(temp)){
        temp++;
     }
     return temp;
    }

    public static boolean isPrime(int x){
        if ( x <= 1) return false;
        
        for (int i= 2; i<= Math.sqrt(x);i++){
            if (x % i == 0) return false;
        }
        return true;
    }
}