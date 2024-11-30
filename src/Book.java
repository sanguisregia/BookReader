import java.util.ArrayList;


public class Book {
    ArrayList<String> pages = new ArrayList<String>();

    String getPage(int index){
        return pages.get(index);
    }

    void addPage(String pageText){
        pages.add(pageText);
    }

    int getPages(){
        return pages.size();
    }
}
