package Lessons2.src;

public class Book {
    public class Autor {
        String name, sex, email;
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
        return "Title " + title +
                "Autor" + autor.name +
                "Year" + year;
    }

}
