public class Artist {
    String name;
    String yearOfBirth;


    public Artist(String name, String yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }


    @Override
    public boolean equals(Object obj){
        if (obj instanceof Artist){
            Artist artist= (Artist) obj;
            return (artist.name.equals(this.name) && artist.yearOfBirth.equals(this.yearOfBirth));
        }else {
            return false;
        }
    }
}
