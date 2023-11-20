package OOP.Enum;

import static OOP.Enum.Color.*;

public class TrafficLight {

    private Color colors;


    public Color getColors() {
        return colors;
    }

    public void setColors(Color colors) {
        this.colors = colors;
    }

    public void changeColor(Color color) {

        colors = color;


    }



    public void showSignal() {


        switch (colors) {
            case GREEN -> System.out.println("цвет зеленый");
            case RED -> System.out.println("color is red");
            case BLUE -> System.out.println("color is blue");
        }
    }
}
