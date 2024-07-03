package vascopanigi.u5_w3_d3.Composite;

import lombok.AccessLevel;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
public class Book {
    @Setter(AccessLevel.NONE)
    private List<BookComponent> bookComponents = new ArrayList<>();
    @Setter(AccessLevel.NONE)
    private List<String> authorsList = new ArrayList<>();
    private double price;

    public void addBookComponentToList(BookComponent component){
        bookComponents.add(component);
    }
    public void addAuthorToList(String author){
        authorsList.add(author);
    }


    public void print() {
        System.out.println("Book:");
        for (String author : authorsList) {
            System.out.println("Author: " + author);
        }
        for (BookComponent component : bookComponents) {
            component.print();
        }
        System.out.println("Price: " + price);
    }

    public int getNumberOfPages() {
        int total = 0;
        for (BookComponent component : bookComponents) {
            total += component.getNumOfPages();
        }
        return total;
    }
}
