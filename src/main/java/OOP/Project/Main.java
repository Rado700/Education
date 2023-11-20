package OOP.Project;

public class Main {
    public static void main(String[] args) {

       Controller<Thermostat> thermostatController = new Controller<>(DeviceType.THERMOSTAT);
       Controller<Light>lightController = new Controller<>(DeviceType.LIGHT);
       Controller<SecurityCamera>cameraController = new Controller<>(DeviceType.CAMERA);


       Thermostat thermostat = new Thermostat(24,10,35);
       Thermostat thermostat2 = new Thermostat(27,23,7,35);


       SecurityCamera camera = new SecurityCamera("HP",true,120);


       Light light = new Light(5,"blue");
       Light light2 = new Light(7,"red");


       /// DEVICE ADD


       thermostatController.addDevice(thermostat);
       thermostatController.addDevice(thermostat2);

       lightController.addDevice(light);
       lightController.addDevice(light2);

       cameraController.addDevice(camera);



       ///DEVICE CONSTRUCTION
       thermostatController.onOff(thermostat);
 //      thermostatController.deviceControl(thermostat);
 //      lightController.deviceControl(light);












       cameraController.history();
//      thermostatController.history();
//       lightController.history(DeviceType.LIGHT);
 //      System.out.println(thermostat.getStatus());

         Home.allHistory();
    }
}
