package homework04;


public class User {

    private int id;
    private String firstname;
    private String lastname;
    private String password;
    private int age;

    public User(){}

    public User(int id, String firstname, String lastname, String password, int age) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;
        this.age = age;
    }

    public User(User user){
        this.age = user.age;
        this.firstname = user.firstname;
        this.lastname = user.lastname;
        this.password = user.password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
