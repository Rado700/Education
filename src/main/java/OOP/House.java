package OOP;

public class House {
    String type ; //Атрибуты
    int floors; //Атрибуты

    public void  buildHouse(String type){
        System.out.println(this.type  + " дом строится по технологий"+ type);
    }

    @Override
    public String toString() {
        return "Дом " + type + " Этажей " + floors;
//        return "House{" +
//                "type='" + type + '\'' +
//                ", floors=" + floors +
//                '}';
    }
}
