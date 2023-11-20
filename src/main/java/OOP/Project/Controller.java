package OOP.Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller<T extends Device> extends Home<T> implements Controllable<T> {


    private final DeviceType deviceType;

    public Controller(DeviceType deviceType) {
        this.deviceType = deviceType;
    }

    @Override
    public void addDevice(T t) {
        Home.adds.add(t);
        System.out.println(t.getType() + " Обьект добавлен");
    }

    @Override
    public void removeDevice(T t) {
        Home.adds.remove(t);
        System.out.println("Обьект удален");
    }

    @Override
    public void deviceControl(T t) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите функционал для управления :");


        if (t.getType() == DeviceType.CAMERA) {
            System.out.println("1. Поменять угол обзора" + "\n" + "2. Вкл/выкл запись" + "\n" + "3. Разрешения ");
            int menuData = scanner.nextInt();
            if (menuData == 1) {
                System.out.println("Введи угол обзора?");
                int angle = scanner.nextInt();
                ((SecurityCamera) t).setAngleOfView(angle);

            } else if (menuData == 2) {
                System.out.println("Введи вкл или выкл");
                String onOff = scanner.next();
                if (onOff.equals("On")) {
                    t.turnOn();

                } else if (onOff.equals("Off")) {
                    t.turnOff();
                }
            } else if (menuData == 3) {
                System.out.println("Выбери разрешения :");
                String resolution = scanner.next();
                String am = ((SecurityCamera) t).setResolution("AM");
                String hp = ((SecurityCamera) t).setResolution("HP");
                if (resolution.equals(hp)) {
                    ((SecurityCamera) t).setResolution("HP");

                } else if (resolution.equals(am)) {
                    ((SecurityCamera) t).setResolution("AM");
                }

            } else {
                System.out.println("Ошибка");
            }


        }
        if (t.getType() == DeviceType.THERMOSTAT) {
            System.out.println("Введите режим : \n" + "1.Установить температуру \n" + "2.Утановить минимальную температуру \n" +
                    "3.Установаить максимальную температуру \n" + "4.Установить среднюю температуру");
            int menuData = scanner.nextInt();

            if (menuData == 1) {
                System.out.println("Введите температуру :");
                int figure = scanner.nextInt();
                ((Thermostat) t).setTemperature(figure);

            } else if (menuData == 2) {
                System.out.println("Введите минимальную температуру");
                int figure = scanner.nextInt();
                ((Thermostat) t).setMaxTemperature(figure);

            } else if (menuData == 3) {
                System.out.println("Введите максимальную температуру");
                int figure = scanner.nextInt();
                ((Thermostat) t).setMaxTemperature(figure);

            } else if (menuData == 4) {
                System.out.println("Средняя температура +24");
                int figure = 24;
                ((Thermostat) t).setTargetTemperature(figure);
            }
        }

        if (t.getType() == DeviceType.LIGHT) {
            System.out.println("Введите номер :" + "1. Яркость света \n" + "2. Выбор цвета");
            int number = scanner.nextInt();
            if (number == 1) {
                System.out.println("Введите яркость от 1 до 10 :");
                int n = scanner.nextInt();
                ((Light) t).setBrightness(n);

            }
            if (number == 2) {
                System.out.println("Введите цвет :");
                String color = scanner.next();
                ((Light) t).setColor(color);
            }
        }

    }


    public void history() {

        for (Device t : adds) {
            if (t.getType() == deviceType) {
                System.out.println(t);
            }

        }
    }


    @Override
    public void onOff(Device device) {
        if (device.getType() == DeviceType.CAMERA) {

            if (DeviceStatus.ON == device.status) {
                device.turnOff();


            } else if (DeviceStatus.OFF == device.status) {
                device.turnOn();

            }
        }

        if (device.getType() == DeviceType.THERMOSTAT) {

            if (DeviceStatus.ON == device.status) {
                device.turnOff();
            } else if (DeviceStatus.OFF == device.status) {
                device.turnOn();

            }
        }
        if (device.getType() == DeviceType.LIGHT) {

            if (DeviceStatus.ON == device.status) {
                device.turnOff();
            } else if (DeviceStatus.OFF == device.status) {
                device.turnOn();

            }
        }

    }
}
