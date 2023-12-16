package Collection.QueueExample;

import java.util.ArrayDeque;
import java.util.Deque;

public class TrainQueue {

    Deque<Train> QueueTrain = new ArrayDeque<>();

    public void addTrainToFront(Train train) {   //добавляет поезд в начала очереди
        QueueTrain.addFirst(train);
    }

    public void addTrainToBack(Train train) {     //добавляет поезд в конец очереди
        QueueTrain.addLast(train);
    }

    public Train removeTrainFromFront() {          //удаляет поезд из начала очереди и возвращает его
        return QueueTrain.pollFirst();

    }

    public Train removeTrainFromBack() {         //удаляет поезд из конца очереди и возвращает его.
        if (QueueTrain.isEmpty()){
            System.out.println("удалить нельзя");
        }
        return QueueTrain.pollLast();
    }

    public boolean isEmpty() {                  //проверяет, пуста ли очередь.
       return QueueTrain.isEmpty();
    }

    public Integer size() {                      //возвращает количество поездов в очереди
        return QueueTrain.size();
    }

    public Train search(){
        for (Train train:QueueTrain) {
            System.out.println(train);

        }

        return null;
    }
}