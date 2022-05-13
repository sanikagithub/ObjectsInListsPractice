import java.util.Scanner; 
import java.util.ArrayList;

public class BooksMain {
    public static void main(String[] args){ 
    Scanner scanner = new Scanner(System.in);
ArrayList<Books> Book = new ArrayList<>();

Book.add(new Books("Yugandhar", 978, 2000));
Book.add(new Books("Mrutyunjay", 628, 1974));
Book.add(new Books("Chava", 861, 1980));
System.out.println("What information needs to be printed?");
String response = scanner.nextLine();


for (int i=0; i<Book.size();i++){
    if(response.equalsIgnoreCase("everything")){
        System.out.println(Book.get(i).toString());
    }else if(response.equalsIgnoreCase("name")){
        System.out.println(Book.get(i).getTitle());
    }else{
        if(response.equalsIgnoreCase("pages")){
            System.out.println(Book.get(i).getNumberofpages());
    }else{
    if(response.equalsIgnoreCase("publicationyear")){
        System.out.println(Book.get(i).getPublicationyear());
}
    }
}
}
scanner.close();
    }
}