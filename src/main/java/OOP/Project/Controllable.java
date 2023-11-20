package OOP.Project;

import OOP.Project.Device;

public interface Controllable<T extends Device> {



    void addDevice(T t);



    void removeDevice(T t);



    void deviceControl(T t);



    void onOff(T t);

}
