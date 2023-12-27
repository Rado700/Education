package Collection.SetExample;

public class Pupil implements Comparable<Pupil>{
    private String name;
    private Integer point;

    public Pupil(String name, int point) {
        this.name = name;
        this.point = point;
    }

    @Override
    public int compareTo(Pupil o) {

        int result = this.point.compareTo(o.point);
        return result;
    }

    @Override
    public String toString() {
        return "Pupil{" +
                "name='" + name + '\'' +
                ", age=" + point +
                '}';
    }
}
