package OOP.Project;

import java.util.ArrayList;
import java.util.List;

public class Home <E extends Device> implements Connectable {


    static List<Device>adds = new ArrayList<>();




    @Override
    public boolean connect(Device device) {

        if (device.status == DeviceStatus.ON) {

            device.connect();
        }
        return true;

    }

    @Override
    public boolean disconnect(Device device) {
        if (device.status == DeviceStatus.ON) {
            device.disconnect();
        }
        return false;
    }









    public static void allHistory(){
        for (Device d:adds) {
            System.out.println(d);



        }
    }
}
