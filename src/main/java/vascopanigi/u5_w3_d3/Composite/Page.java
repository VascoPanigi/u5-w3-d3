package vascopanigi.u5_w3_d3.Composite;

public class Page implements BookComponent{
    private int pageNum;

    public Page(int pageNum) {
        this.pageNum = pageNum;
    }

    @Override
    public void print(){
        System.out.println("Page number: " + pageNum);
    }

    @Override
    public int getNumOfPages(){
        return 1;
    }
}
