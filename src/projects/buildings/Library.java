package projects.buildings;

public class Library extends Building {
    private int booksCount = 0;

    public int getBooksCount() {
        return booksCount;
    }

    public void setBooksCount(int booksCount) {
        this.booksCount = booksCount;
    }

    @Override
    public String toString() {
        return "This is a Library";
    }
    public void beQuiet(){
        System.out.println("beQuiet");
    }
}
