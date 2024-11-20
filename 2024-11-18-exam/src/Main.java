import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        List<Wise> wises = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("== 명언 앱 ==");
        int id = 1; // id 라는 변수를 선언해 명언목록의 순서 설정
        while (true) {
            System.out.print("명령) ");
            String command = sc.nextLine().trim();
            if (command.equals("종료")) {
                sc.close();
                break;
            } else if (command.equals("등록")) {
                Wise.addWise(sc, id, wises);
                id += 1;
            } else if (command.equals("목록")) {
                System.out.println("번호 / 작가 / 명언");
                System.out.println("----------------------");
                Collections.reverse(wises);
                for (Wise wise : wises) {
                    System.out.println(wise.getId() + " / " + wise.getAuthor() + " / " + wise.getSaying());
                }
            }
        }
    }
}

class Wise {
    private int id;
    private String author;
    private String saying;

    public Wise(int id, String author, String saying) {
        this.id = id;
        this.author = author;
        this.saying = saying;
    }

    public static void addWise(Scanner sc, int id, List<Wise> wises) {
        System.out.print("명언 : ");
        String saying = sc.nextLine().trim();

        System.out.print("작가 : ");
        String author = sc.nextLine().trim();

        wises.add(new Wise(id, author, saying));
        System.out.println(id + "번 명언이 등록되었습니다.");
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getSaying() {
        return saying;
    }
}
