package Loops.ConditionOperation;

public class Switch {
    public static void main(String[] args) {
        String weekday = "Sunday";
        switch (weekday)
        {
            case "Monday":
                System.out.println("Выполню задачу 1");
                break;
            case "Thursday":
                System.out.println(2);
                break;
            case "Sunday":
                System.out.println("верно");
                break;
            default:
                System.out.println("Отдыхай");
        }
    }
}
