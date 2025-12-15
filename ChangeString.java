import java.util.Scanner;

public class ChangeString {

    String arr[];
    ChangeString(String arr[]){
        this.arr = arr;
    }

    public static void main(String[] args) {
        String arr[] = new String[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 strings:");
        for(int i = 0; i < 5; i++){
            arr[i] = sc.nextLine();
        }

        
    }
}
