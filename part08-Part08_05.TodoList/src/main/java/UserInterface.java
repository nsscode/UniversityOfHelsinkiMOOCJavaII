import java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }

    public void start() {

        while (true) {

            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("add")) {
                System.out.print("To add: ");
                String task = scanner.nextLine();
                this.add(task);
            }

            if (command.equals("list")) {
                this.list();
            }

            if (command.equals("remove")) {
                System.out.print("Which one is removed? ");
                int number = Integer.valueOf(scanner.nextLine());
                this.completed(number);
            }
        }
    }

    public void execute(String command) {
        
    }

    public void add(String task) {
        list.add(task);
    }

    public void list() {
        list.print();
    }

    public void completed(int number) {
        list.remove(number);
    }

}
