public class Wise {
    private int id;
    private String author;
    private String saying;

    public Wise(int id, String author, String saying) {
        this.id = id;
        this.author = author;
        this.saying = saying;
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
