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
            int total = 0;
        for (BookComponent component : bookComponents) {
            // TODO.1 fixare implementazione un po' bolsa -------- DONE!
//            component.print();
            if(component instanceof Page){
                total += 1;
            }else{
                component.print();
            }
        }
            System.out.println("Total pages in this section: " + total);
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
