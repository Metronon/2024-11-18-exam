import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Controller control = new Controller();
        System.out.println("==명언 앱==");

        do {
            System.out.print("명령) ");
            String cmd = input.nextLine().trim();
            control.receiveCmd(cmd);
            if (cmd.equals("종료")) {
                input.close();
                break;
            } else if (cmd.equals("등록")) {
                control.addWise();
            } else if (cmd.equals("목록")) {
                control.lookWise();
            }
        } while (true);
    }
}
