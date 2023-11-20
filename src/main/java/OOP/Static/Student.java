package OOP.Static;

public class Student {
    private int id;
    private String name;
    private double score;

    private static double totalScore;
    private static int numberStudent;

    static {
        totalScore = 0;
        numberStudent = 0;
    }


    public static double getAverage(){
       return totalScore/numberStudent;
    }
    public static int StudentCount(){
      return  numberStudent;
    }

    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
        numberStudent++;
        totalScore += score;
    }
}
