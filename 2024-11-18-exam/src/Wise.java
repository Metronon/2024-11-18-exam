public class Wise {
    protected int id;
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
    /*
    public void setId(int id) {
        this.id = id;
    }*/

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setSaying(String saying) {
        this.saying = saying;
    }
}
