package Collection.QueueExample;

public class Train {

    int numberTrain;
    String destination;

    public Train(int numberTrain, String destination) {
        this.numberTrain = numberTrain;
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Train{" +
                "numberTrain=" + numberTrain +
                ", destination='" + destination + '\'' +
                '}';
    }
}
