
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

    private Scanner scan;
    private TodoList list;

    public UserInterface(TodoList list, Scanner scan) {
        this.scan = scan;
        this.list = list;
    }

    public void start() {

        while (true) {

            System.out.print("command: ");
            String command = scan.nextLine();
            
            if(command.equals("stop")){
                break;
            } else if(command.equals("add")){
                System.out.print("To add: ");
                String task = scan.nextLine();
                list.add(task);
            }else if(command.equals("list")){
                list.print();
            }else if(command.equals("remove")){
                System.out.print("Which one is removed? ");
                int numberToRemove = Integer.valueOf(scan.nextLine());
                list.remove(numberToRemove);
            }
            
        }

    }

}
