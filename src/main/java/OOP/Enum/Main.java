package OOP.Enum;

import OOP.Enum.EbookFormat.EbookFormat;
import OOP.Enum.Game.Game;
import OOP.Enum.Game.GamePlatform;

public class Main {
    public static void main(String[] args) {
        Day current = Day.MONDAY;
        System.out.println(current);

        Book book = new Book("WarofPeace",BookType.HISTORY);
        switch (book.getBookType()){
            case FANTASY -> System.out.println("FantasyBook");
            case HISTORY -> System.out.println("HistoryBook");
            case SCIENCE -> System.out.println("ScienceBook");
        }


        TrafficLight trafficLight = new TrafficLight();
        trafficLight.changeColor(Color.RED);
        trafficLight.showSignal();
        System.out.println(Color.GREEN.ordinal());



        System.out.println(DeepColors.RED);
        System.out.println(DeepColors.GREEN);

        Operation op = Operation.MULTIPLY;
        System.out.println(op.action(1,2));
        Operation operation = Operation.SUBTRACT;
        System.out.println(operation.action(1,3));





    }
}
