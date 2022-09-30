package lk.oulasthi.frist.model;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer autorId;
    private String fristName;
    private String LastName;
    @ManyToMany(mappedBy = "autors")
    private Set<Book> books = new HashSet<>();

    public Autor(String fristName, String lastName) {
        this.fristName = fristName;
        LastName = lastName;

    }


    public Autor() {
    }

    public Integer getAutorId() {
        return autorId;
    }

    public void setAutorId(Integer autorId) {
        this.autorId = autorId;
    }

    public String getFristName() {
        return fristName;
    }

    public void setFristName(String fristName) {
        this.fristName = fristName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Autor autor = (Autor) o;

        return autorId != null ? autorId.equals(autor.autorId) : autor.autorId == null;
    }

    @Override
    public int hashCode() {
        return autorId != null ? autorId.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "autorId=" + autorId +
                ", fristName='" + fristName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", books=" + books +
                '}';
    }
}
