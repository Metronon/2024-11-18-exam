import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Controller control = new Controller();
        System.out.println("==명언 앱==");

        while (true) {
            System.out.print("명령) ");
            String cmd = input.nextLine().trim();
            if (cmd.equals("종료")) {
                input.close();
                break;
            }
            control.receiveCmd(cmd);
        }
    }
}
