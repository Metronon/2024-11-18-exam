import java.util.Scanner;

public class App {
    Controller control = new Controller();
    Scanner input = new Scanner(System.in);

    public void run() {
        System.out.println("==명언 앱==");
        while (true) {
            System.out.print("명령) ");
            String cmd = input.nextLine().trim();
            if (cmd.equals("종료")) {
                input.close();
                break;
            } else if (cmd.equals("등록")) {
                control.addWise();
            } else if (cmd.equals("목록")) {
                control.lookWise();
            } else if (cmd.startsWith("삭제?")) {
                control.removeWise(cmd);
            } else if (cmd.startsWith("수정?")) {
                control.modifyWise(cmd);
            }
        }
    }
}
