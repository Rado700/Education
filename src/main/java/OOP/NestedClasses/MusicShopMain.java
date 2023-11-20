package OOP.NestedClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MusicShopMain {
    public static void main(String[] args) {

        MusicShop musicShop = new MusicShop();
        Instrument instrument = new Instrument("gitara",1200,2);
        musicShop.addInstrument(instrument);
        musicShop.sellInstrument("gitara",1);
        musicShop.sellInstrument("gitara",2);
        musicShop.listInstrument();
        musicShop.sellInstrument("piano",1);

    }

}
class MusicShop{
    List<Instrument> instruments = new ArrayList<>();

    public void addInstrument(Instrument instrument){
        instruments.add(instrument);
    }
    public Instrument getInstrument(String name){

        for (int i = 0; i < instruments.size(); i++) {
            if (instruments.get(i).getName().equals(name)){
                return instruments.get(i);
            }
        }
        return null;
    }
    public void listInstrument(){
        for (Instrument instrument : instruments) {
            System.out.println(instrument);
        }

    }
    public void sellInstrument(String name,int quantity){

        Instrument instrument = getInstrument(name);
        if (instrument == null){
            System.out.println("Такого инструмента нету");
            return;
        }
        if (quantity > instrument.getQuantityInStock()){
            System.out.println("Не достаточно в наличий");
            return;
        }
        instrument.sell(quantity);

        }

    }



    class Instrument{

        String name;
        int price;
        int quantityStock;

        public Instrument(String name, int price, int quantityStock) {
            this.name = name;
            this.price = price;
            this.quantityStock = quantityStock;
        }

        public String getName() {
            return name;
        }


        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getQuantityInStock() {
            return quantityStock;
        }

        public void setQuantityStock(int quantityStock) {
            this.quantityStock = quantityStock;
        }
        public void sell(int quantity){
            quantityStock -= quantity;
        }

        @Override
        public String toString() {
            return "Instrument{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    ", quantityStock=" + quantityStock +
                    '}';
        }
    }


