package Task4;

import java.util.Hashtable;
import java.util.Scanner;

public class IndividualHashtableTask {
    public static void main(String[] args) {

        BookEntry[] arrayBookEntry = {
                new BookEntry(1, "Шевченко", "Кобзар", 2007, 1823.99f, 355, "Збірка", "17.03.2022", "31.10.2022", "Городиський Дмитро Сергійович", 2003, "вул.Тростянецька 78 кв.109", "Галина Іванівна", 1973, 17300),
                new BookEntry(2, "Нестайко", "Тореодори з васюківки", 1985, 1199.99f, 478, "Пригоди", "23.01.2022", "03.10.2022", "Іваненко Олексій", 2003, "вул.Тростянецька 42 кв.9", "Олена Василівна", 1978, 12300),
                new BookEntry(3, "Нечуй-Левицький", "Кайдашева Сім'я", 1979, 1999.99f, 499, "Комедія", "24.02.2022", "07.9.2022", "Головач Дмитро", 2003, "вул.Ломоносова 12 кв.99", "Галина Іванівна", 1973, 17300)
};
        Hashtable<Integer, BookEntry> hashtable = new Hashtable<>();

        for(BookEntry bookEntry : arrayBookEntry)
        hashtable.put(bookEntry.getRegNumber(), bookEntry);


        System.out.println("Enter registration number");
        Scanner scanner = new Scanner(System.in);
        System.out.println(hashtable.get(scanner.nextInt()));

    }
}
