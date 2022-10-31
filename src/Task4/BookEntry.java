package Task4;

public class BookEntry {
    private int regNumber;
    private String author;
    private String title;
    private int year;
    private float price;
    private int countOfPages;
    private String subject;
    private String dateOfIssue;
    private String dateOfReturn;
    private String nameOfReader;
    private int dateOfBirthOfReader;
    private String address;
    private String nameOfLibrarian;
    private int dateOfBirthOfLibrarian;
    private float salary;

    public BookEntry(int regNumber, String author, String title, int year, float price, int countOfPages, String subject, String dateOfIssue, String dateOfReturn, String nameOfReader, int dateOfBirthOfReader, String address, String nameOfLibrarian, int dateOfBirthOfLibrarian, float salary) {
        this.regNumber = regNumber;
        this.author = author;
        this.title = title;
        this.year = year;
        this.price = price;
        this.countOfPages = countOfPages;
        this.subject = subject;
        this.dateOfIssue = dateOfIssue;
        this.dateOfReturn = dateOfReturn;
        this.nameOfReader = nameOfReader;
        this.dateOfBirthOfReader = dateOfBirthOfReader;
        this.address = address;
        this.nameOfLibrarian = nameOfLibrarian;
        this.dateOfBirthOfLibrarian = dateOfBirthOfLibrarian;
        this.salary = salary;
    }

    public int getRegNumber() {
        return regNumber;
    }

    @Override
    public String toString() {
        return "BookEntry{" +
                "regNumber=" + regNumber +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", countOfPages=" + countOfPages +
                ", subject='" + subject + '\'' +
                ", dateOfIssue='" + dateOfIssue + '\'' +
                ", dateOfReturn='" + dateOfReturn + '\'' +
                ", nameOfReader='" + nameOfReader + '\'' +
                ", dateOfBirthOfReader=" + dateOfBirthOfReader +
                ", address='" + address + '\'' +
                ", nameOfLibrarian='" + nameOfLibrarian + '\'' +
                ", dateOfBirthOfLibrarian=" + dateOfBirthOfLibrarian +
                ", salary=" + salary +
                '}';
    }
}
