public class Book {
    public static class Autor {
        public String name;
        public String sex;
        public String email;
        public  Autor(String name, String sex, String email) {
            this.name= name;
            this.sex = sex;
            this.email = email;
        }
    }

    private String title;
    private Autor autor;
    private int year;

    public  Book(String title, Autor autor, int year) {
        this.title = title;
        this.autor = autor;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }
    public Autor getAutor() {
        return autor;
    }
    public int getYear() {
        return year;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public String toString(){
        return "Title: " + title +
                "\nAutor: " + autor.name +
                "\nSex: " + autor.sex +
                "\nE-mail: " + autor.email +
                "\nYear: " + year;
    }

}
