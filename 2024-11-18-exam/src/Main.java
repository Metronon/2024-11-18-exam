import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("== 명언 앱 ==");
        System.out.print("명령) ");
        while (true) {
            String command = sc.next().trim();
            if (command.equals("종료")) {
                sc.close();
                break;
            }
            System.out.print("명령) ");
        }
    }
}