import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Controller {
    List<Wise> wiseList = new ArrayList<Wise>();
    Scanner input = new Scanner(System.in);
    private int id = 1;

    public void receiveCmd(String cmd) {
        if (cmd.equals("등록")) { addWise(); }
        else if (cmd.equals("목록")) { lookWise(); }
        else if (cmd.startsWith("삭제")) { removeWise(cmd); }
    }

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
    public void removeWise(String cmd) {
        String[] parts = cmd.split("=");
        int idToRemove = Integer.parseInt(parts[1]);
        boolean ifRemoved = false;

        for (Wise wise : wiseList) {
            if (wise.getId() == idToRemove) {
                wiseList.remove(wise);
                ifRemoved = true;
                System.out.printf("%d번 명언이 삭제되었습니다.\n", idToRemove);
                break;
            }
        }
        if (!ifRemoved) {
            System.out.printf("%d번 명언은 존재하지 않습니다.\n", idToRemove);
        }
    }
}
