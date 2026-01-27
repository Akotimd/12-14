public class Book {
    private String title;
    private Author author;
    private int year;

    public Book(String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;

    }
    public String getAuthor() {
        return this.author.getFullName();
    }
    public String getTitle() {
        return this.title;
    }
    public int getYear() {return this.year;}
    public void setYear(int year) {this.year = year;}
}
