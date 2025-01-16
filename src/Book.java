public class Book {
    public String name;
    public int pages;
    private int currentPage;


    public Book(String name, int pages) {
        this.name = name;
        this.pages = pages;
        this.currentPage = 0;

    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void TurnPages() {
        currentPage++;
    }


}
