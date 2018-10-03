
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Artist> artists = new ArrayList<>();

        Artist artist1 = new Artist("Madonna","1958");
        Artist artist2 = new Artist("Janson Mraz","1977");
        Artist artist3 = new Artist("Frank Sinatra","1915");

        artists.add(artist1);
        artists.add(artist2);
        artists.add(artist3);

        System.out.println("Give an artist name and a birth year to check if we have that artist in ourlist");
        System.out.println("Name: ");
        String name = sc.nextLine();

        System.out.println("Year of birth: ");
        String yofB =sc.nextLine();
        Artist artist = new Artist(name,yofB);

        if(artists.contains(artist)){
            System.out.println("We have a record of "+ name);
        } else {
            System.out.println("We don't have a record of " + name);
        }

    }
}
