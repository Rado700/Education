package Collection.QueueExample;

public class TrainManagement {

    public static void main(String[] args) {

        Train train = new Train(1,"Kazan");
        Train train2 = new Train(2,"Moscow");
        Train train3 = new Train(11,"Saint-Petersburg");

        TrainQueue trainQueue = new TrainQueue();
        trainQueue.addTrainToFront(train);
        trainQueue.addTrainToFront(train2);
        System.out.println(trainQueue.size());
        trainQueue.addTrainToBack(train);
        trainQueue.addTrainToBack(train2);
        System.out.println(trainQueue.size());
        trainQueue.removeTrainFromBack();
        trainQueue.removeTrainFromFront();
        trainQueue.addTrainToBack(train3);

        System.out.println(trainQueue.search());
    }
}
