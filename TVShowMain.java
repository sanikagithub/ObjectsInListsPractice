import java.util.Scanner; 
import java.util.ArrayList;

public class TVShowMain {
    public static void main(String[] args){ 
    Scanner scanner = new Scanner(System.in);
ArrayList<TVShow> TVShows = new ArrayList<>();

while (true) {
    System.out.print("Name of the show: ");
    String episodeName = scanner.nextLine();

    if (episodeName.equals(" ")) 
        break;

    System.out.print("How many episodes?");
    String response = scanner.nextLine();
    int numberOfepisodes = Integer.valueOf(response);
    System.out.print("What is the genre?");
    String genre = scanner.nextLine();

    TVShows.add(new TVShow(episodeName, numberOfepisodes,genre));
}

for (int i = 0; i < TVShows.size(); i++) {
    System.out.println(TVShows.get(i).toString());
}
    scanner.close();
}
}
