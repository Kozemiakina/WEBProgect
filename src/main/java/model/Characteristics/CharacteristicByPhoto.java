package model.Characteristics;

/**
 * Created by alisa on 09.01.2017.
 */
public class CharacteristicByPhoto {
    private int id;
    private int pixels;
    private String bodyColor;
    private boolean video;
    private String typeOfCamera;
    private int batteryResources;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPixels() {
        return pixels;
    }

    public void setPixels(int pixels) {
        this.pixels = pixels;
    }

    public String getBodyColor(String body_color) {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

    public boolean isVideo() {
        return video;
    }

    public void setVideo(boolean video) {
        this.video = video;
    }

    public String getTypeOfCamera() {
        return typeOfCamera;
    }

    public void setTypeOfCamera(String typeOfCamera) {
        this.typeOfCamera = typeOfCamera;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public int getBatteryResources() {
        return batteryResources;
    }

    public void setBatteryResources(int batteryResources) {
        this.batteryResources = batteryResources;
    }

    @Override
    public String toString() {
        return "CharacteristicByPhoto{" +
                "id=" + id +
                ", typeOfCamera='" + typeOfCamera + '\'' +
                ", bodyColor='" + bodyColor + '\'' +
                ", pixels=" + pixels +
                ", video=" + video +
                ", batteryResources=" + batteryResources +
                '}';
    }
}
