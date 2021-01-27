
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int totalNumbers = 0;
        
        while (true) {

            int num = Integer.valueOf(scanner.nextLine());

            if (num == 0){
                if (totalNumbers > 0) {
                    System.out.println(sum / (double)totalNumbers);
                } else {
                    System.out.println("Cannot calculate the average");
                }
                
                break;
            }
            
            if (num > 0){
                sum += num;
                totalNumbers++;
            }
            
        }

    }
}
