package OOP;

public class ClassMyClass {
    public static void main(String[] args) {
        House oneHouse = new House();
        oneHouse.type = "Кирпичный";
        oneHouse.floors = 2;
        oneHouse.buildHouse(" thisHands");
        System.out.println(oneHouse);

        House twoHouse = new House();
        twoHouse.type = "Монолитный";
        twoHouse.floors = 3;
        twoHouse.buildHouse(" 3dPrint");
        System.out.println(twoHouse); // House@4f34534 -> House={type=,floors=}

        Humans oneHuman = new Humans();
        oneHuman.weight = 70;
        oneHuman.old = 30;
        oneHuman.name = "Василий";
        oneHuman.birthDay();
        System.out.println(oneHuman.standOneScales());
    }

}
