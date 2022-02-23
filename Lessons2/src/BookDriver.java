public class BookDriver {
    public static void main(String[] args) {
        Book.Autor autor = new Book.Autor();
        autor.name = "Maria Orlova";
        autor.sex = "Woman";
        autor.email = "m_orlova@mail.ru";

        Book s = new Book("Star", autor,2010);
        System.out.println(s.toString());
        s.setYear(1999);
        System.out.println(s.toString());
    }
}
