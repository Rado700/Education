package OOP.Enum.Size;

public class Main {
    public static void main(String[] args) {


        TShirt tShirt = new TShirt(Size.Xl);
        TShirt tShirt1 = new TShirt(Size.XXXL);
        tShirt.getDescription();
        tShirt1.getDescription();

        for (Size size: Size.values()){
            System.out.println(size);
        }

    }
}
