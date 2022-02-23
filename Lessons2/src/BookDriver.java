package Lessons2.src;

public class BookDriver {
    public static void main(String[] args) {
        Book.Autor a = new Book.Autor();
        a.name = "Maria Orlova";
        a.sex = "man";
        a.email = "m_orlova@mail.ru";

        Book s = new Book("Star", a,2010);
        s.toString();
        s.setYear(1999);
        s.toString();
    }
}
