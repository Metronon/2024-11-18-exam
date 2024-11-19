import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("== 명언 앱 ==");
        int id = 1;
        while (true) {
            System.out.print("명령) ");
            String command = sc.nextLine().trim();
            if (command.equals("종료")) {
                sc.close();
                break;
            } else if (command.equals("등록")) {
                Wise.wise(sc, id);
                id += 1;
            }
        }
    }
}

class Wise {
    public static void wise(Scanner sc, int id) {
        String[] wises = new String[3];
        System.out.print("명언 : ");
        wises[0] = sc.nextLine().trim();

        System.out.print("작가 : ");
        wises[1] = sc.nextLine().trim();

        wises[2] = String.valueOf(id);
        System.out.println(id + "번 명언이 등록되었습니다.");
    }
}