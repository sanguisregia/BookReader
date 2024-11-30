import java.util.Scanner;

public class BookReader {
    Book SelectedBook;
    int PagesToRead;
    int CurrentPage;
    int TargetPage;

    BookReader(Book book, int pagesPerDayTarget, int currentPage){
        SelectedBook = book;
        PagesToRead = pagesPerDayTarget;
        CurrentPage = currentPage;

        TargetPage = CurrentPage + PagesToRead;
    }

    void ReadBook(){
        while(TargetPage > CurrentPage){
            System.out.println(SelectedBook.getPage(CurrentPage));
            System.out.println((CurrentPage + 1) + " / " + SelectedBook.getPages());
            System.out.println((TargetPage - CurrentPage - 1) + " pages left to read!\n");
            CurrentPage++;

            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();
        }

        System.out.println("Good job! You did this book for today\n");

    }
}
