import java.util.Scanner;
import java.util.ArrayList;

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
                Wise.addWise(sc, id);
                id += 1;
            } else if (command.equals("목록")) {
                System.out.println("번호 / 작가 / 명언");
                System.out.println("----------------------");
                for(int i = 1; i < id; i++) {
                    System.out.print(Wise.getWise(-i));
                    System.out.print(" / ");
                    System.out.print(Wise.getWise(-i));
                    System.out.print(" / ");
                    System.out.println(Wise.getWise(-i));
                }
            }
        }
    }
}

class Wise {
    private static ArrayList<String> wises = new ArrayList<>();

    public static void addWise(Scanner sc, int id) {
        System.out.print("명언 : ");
        wises.add(sc.nextLine().trim());

        System.out.print("작가 : ");
        wises.add(sc.nextLine().trim());

        wises.add(String.valueOf(id));
        System.out.println(id + "번 명언이 등록되었습니다.");
    }
    public static String[] getWise(int i) {
        return wises[i];
    }
}