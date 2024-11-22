import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Controller {
    List<Wise> wiseList = new ArrayList<Wise>();
    Scanner input = new Scanner(System.in);
    private int id = 1;

    public void receiveCmd(String cmd) {}

    public void addWise() {
        System.out.print("명언 : ");
        String saying = input.nextLine().trim();

        System.out.print("작가 : ");
        String author = input.nextLine().trim();


        Wise newWise = new Wise(id, author, saying);
        wiseList.add(newWise);

        System.out.printf("%d번 명언이 등록되었습니다.\n", id);

        id += 1;
    }

    public void lookWise() {
        System.out.println("번호 / 작가 / 명언");
        System.out.println("----------------------");
        Collections.reverse(wiseList);
        for (Wise wise : wiseList) {
            System.out.println(wise.getId() + " / " + wise.getAuthor() + " / " + wise.getSaying());
        }
        Collections.reverse(wiseList);
    }
}
