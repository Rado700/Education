package OOP.NestedClasses;

public class NestedClasses {
    public static void main(String[] args) {

        Person person = new Person("Dima","555");
        System.out.println(person);


    }

}

    class Person{
    String name;
    Account account ;

    public Person(String name,String parol) {
        this.name = name;
        this.account = new Account(parol);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", account=" + account +
                '}';
    }


    public class Account{
        private String parol;

        public Account(String parol) {
            this.parol = parol;

        }

        @Override
        public String toString() {
            return "Account{" +
                    "parol='" + parol + '\'' +
                    '}';
        }

    }
}
