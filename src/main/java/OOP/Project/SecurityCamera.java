package OOP.Project;

import java.util.Objects;
import java.util.UUID;

public class SecurityCamera extends Device{

    private String resolution;
    private boolean isRecording;
    private int angleOfView;


    void startRecording(){
        if (DeviceStatus.ON == status && !isRecording) {
            isRecording = true;


        }
    }
    void stopRecording(){
            if (DeviceStatus.OFF == status || isRecording ) {
                isRecording = false;
            }
    }


    @Override
    void turnOn() {
       setStatus(DeviceStatus.ON);
            System.out.println("Включено");

    }

    @Override
    void turnOff() {
       setStatus(DeviceStatus.OFF);
            System.out.println("Off");

    }

    @Override
    String getStatus() {
        return status.getDescription();

    }

    public SecurityCamera(String resolution, boolean isRecording, int angleOfView) {
        super();
        this.resolution = resolution;
        this.isRecording = isRecording;
        this.angleOfView = angleOfView;
        this.setType(DeviceType.CAMERA);
    }

    public String getResolution() {
        return resolution;
    }

    public String setResolution(String resolution) {
        if (Objects.equals(resolution, "MP")){
            System.out.println("1024x720");
        } else if (Objects.equals(resolution, "HD")) {
            System.out.println("3840x2160");
        }
        return this.resolution = resolution;
    }

    public boolean isRecording() {
        return isRecording;
    }

    public void setRecording(boolean recording) {
        isRecording = recording;
    }

    public int getAngleOfView() {
        return angleOfView;
    }

    public void setAngleOfView(int angleOfView) {

        if (angleOfView >= 180 || angleOfView <= 0){
            return;
        }
        this.angleOfView = angleOfView;
    }
}
