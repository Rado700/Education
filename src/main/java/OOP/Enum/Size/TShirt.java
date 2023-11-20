package OOP.Enum.Size;

import OOP.Enum.Size.Size;

public class TShirt {
    public Size size;

    public TShirt(Size size) {
        this.size = size;
    }


    public void getDescription(){

        switch (size){
            case XS -> System.out.println("Маленький размер подходит для детей");
            case S -> System.out.println("Этот размер до школьного возраста");
            case M -> System.out.println("Размер школьного возраста");
            case L -> System.out.println("Подходит для старшего класса");
            case Xl -> System.out.println("Размеры для роста от 180см и от 90кг");
            case XXL -> System.out.println("Размеры от 120кг");
            case XXXL -> System.out.println("Размеры от 130кг");
        }
    }
}
