package Collection.SetExample;

public class Pupil implements Comparable<Pupil> {
    private String name;
    private Integer point;

    public Pupil(String name, int point) {
        this.name = name;
        this.point = point;
    }

    @Override
    public int compareTo(Pupil o) {
        int result = this.point.compareTo(o.point);

        int radoo = 10;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
         boolean resul = this.name.equals(obj);
         if (resul == this.point.equals(obj)){
             return resul;
         }
         return resul;
    }

    @Override
    public String toString() {
        return "Pupil{" +
                "name='" + name + '\'' +
                ", оценки=" + point +
                '}';
    }
}
