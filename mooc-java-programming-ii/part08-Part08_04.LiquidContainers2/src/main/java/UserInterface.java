
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author timja
 */
public class UserInterface {

    //  private Container container;
    private Scanner scan;

    public UserInterface(Scanner scan) {
        this.scan = scan;
    }

    public void start() {
        
        Container first = new Container();
        Container second = new Container();

        while (true) {

            // print amount in containers
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            //            getting values as comand and number
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                first.add(amount);
            } else if (command.equals("move")) {
                if (amount > first.contains()) {
                    second.add(first.contains());
                } else {
                    second.add(amount);
                }
                first.remove(amount);
            } else if (command.equals("remove")) {
                second.remove(amount);
            }
        }

    }

}
