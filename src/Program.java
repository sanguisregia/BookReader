import java.util.ArrayList;


public class Program {
    public static void main(String[] args){
        Book LorumIpsum1 = new Book();
        LorumIpsum1.addPage("Lorum Ipsum1, Sample Text1");
        LorumIpsum1.addPage("Lorum Ipsum1, Sample Text2");
        LorumIpsum1.addPage("Lorum Ipsum1, Sample Text3");
        LorumIpsum1.addPage("Lorum Ipsum1, Sample Text4");

        Book LorumIpsum2 = new Book();
        LorumIpsum2.addPage("Lorum Ipsum2, Sample Text1");
        LorumIpsum2.addPage("Lorum Ipsum2, Sample Text2");
        LorumIpsum2.addPage("Lorum Ipsum2, Sample Text3");
        LorumIpsum2.addPage("Lorum Ipsum2, Sample Text4");

        Book LorumIpsum3 = new Book();
        LorumIpsum3.addPage("Lorum Ipsum3, Sample Text1");
        LorumIpsum3.addPage("Lorum Ipsum3, Sample Text2");
        LorumIpsum3.addPage("Lorum Ipsum3, Sample Text3");
        LorumIpsum3.addPage("Lorum Ipsum3, Sample Text4");

        Book LorumIpsum4 = new Book();
        LorumIpsum4.addPage("Lorum Ipsum4, Sample Text1");
        LorumIpsum4.addPage("Lorum Ipsum4, Sample Text2");
        LorumIpsum4.addPage("Lorum Ipsum4, Sample Text3");
        LorumIpsum4.addPage("Lorum Ipsum4, Sample Text4");

        ArrayList<BookReader> BookReaders = new ArrayList<BookReader>();
        BookReaders.add(new BookReader(LorumIpsum1, 1, 0));
        BookReaders.add(new BookReader(LorumIpsum2, 3, 0));
        BookReaders.add(new BookReader(LorumIpsum3, 2, 0));
        BookReaders.add(new BookReader(LorumIpsum4, 4, 0));

        for (BookReader br : BookReaders){
            br.ReadBook();
        }
    }
}
