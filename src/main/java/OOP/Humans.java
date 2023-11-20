package OOP;

public class Humans {
    double height;
    double weight;
    String name;
    int old;

    public void birthDay(){
        old += 1;
        System.out.println("Поздравляю "+ name + " Тебе исполнилось " + old);
    }
    public double standOneScales(){
        return weight;

    }

}
