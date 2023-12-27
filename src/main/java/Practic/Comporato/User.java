package Practic.Comporato;

public class User implements Comparable<User>{

    private String name;
    private Integer age;
    private String email;

    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    @Override
    public int compareTo(User o) {
      //  int result = this.name.compareTo(o.name);

        int result = this.age.compareTo(o.age);
        return result;


    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

}
