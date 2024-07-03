package vascopanigi.u5_w3_d3.Composite;

import java.util.ArrayList;
import java.util.List;

public class Section implements BookComponent{
    private String title;
    private List<BookComponent> bookComponents=new ArrayList<>();

    public Section(String title) {
        this.title = title;
    }

    public void addComponentToList(BookComponent component){
        bookComponents.add(component);
    }

    @Override
    public void print() {
        System.out.println("Sezione: " + title);
        for (BookComponent component : bookComponents) {
            // implementazione un po' bolsa...
            component.print();
        }
    }
    
    @Override
    public int getNumOfPages() {
        int total = 0;
        for (BookComponent component : bookComponents) {
            total += component.getNumOfPages();
        }
        return total;
    }
}
