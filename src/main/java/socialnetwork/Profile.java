package socialnetwork;

import repository.FriendList;
import repository.ProfileRep;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;


public class Profile {
    private final Movie movie;
    private String id;
    private String name;
    private Date birthday;
    private int age; //tirar idade de birthday
    private Timeline timeline;
    private FriendList friends = new FriendList();
    private HashSet<Movie> favoriteMovies;

    Profile(String name, Date birthday){
        this.name = name;
        this.birthday = birthday;
        //this.age = ???hoje - birthday???
        this.timeline = new Timeline(this); //ta certo isso?
        this.favoriteMovies = new HashSet<Movie>();
    }

    public void addFriend(String id){
        if (friends.isInRep(id) == true) {
            friends.add(ProfileRep.findById(id));
        }
        friends.add(id);

    }

    public void addMovie(Movie movie){
        favoriteMovies.add(movie);
    }

    public void removeFriend(){

    }

    public void postThings(){
    }

    public void delThings(){

    }


    //getters+setters


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
