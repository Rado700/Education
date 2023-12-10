package OOP.References.Example;

public class Main {
    public static void main(String[] args) {
        Person bob = new Person("bob",21);

        System.out.println("bob"+bob);

        Person bob2 = bob.clone();

        bob2.setName("tom");
        System.out.println("bob2"+bob2);
        System.out.println("bob"+bob);

        UserProfile user = new UserProfile("German",22,1);
        UserProfile userProfile = user.clone();
        userProfile.setUsername("Cot");
        System.out.println(user);
        System.out.println(userProfile);

        int a = 2;
        int b = a;
        b = 5;
        System.out.println(a);
        System.out.println(b);
    }
}
