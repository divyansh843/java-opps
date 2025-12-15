class factorial {

    int n;
    factorial(int n){
        this.n = n;
    }

    void mi(int n) {
        n = this.n;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + n + " is: " + fact);
    }

}

public class fact {
    public static void main(String[] args) {
        factorial f = new factorial(5);
        f.mi(5);   
    }
    
}
