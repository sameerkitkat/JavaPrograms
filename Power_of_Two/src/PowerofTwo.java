import java.util.Scanner;

public class PowerofTwo {

    private boolean powerofTwo(int num){
        if (num<0){
            return false;
        }
        return (num&num-1)==0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Integer : ");
        int num = scanner.nextInt();
        PowerofTwo power = new PowerofTwo();
        System.out.println("Is number is power of two ? "+power.powerofTwo(num));
    }
}
