package model.Products;

/**
 * Created by alisa on 10.01.2017.
 */
public class Video {
    private int id;
    private String nameVideo;
    private String modelVideo;
    private int characteristicVideo;
    private String descriptionVideo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameVideo() {
        return nameVideo;
    }

    public void setNameVideo(String nameVideo) {
        this.nameVideo = nameVideo;
    }

    public String getModelVideo() {
        return modelVideo;
    }

    public void setModelVideo(String modelVideo) {
        this.modelVideo = modelVideo;
    }

    public int getCharacteristicVideo() {
        return characteristicVideo;
    }

    public void setCharacteristicVideo(int characteristicVideo) {
        this.characteristicVideo = characteristicVideo;
    }

    public String getDescriptionVideo() {
        return descriptionVideo;
    }

    public void setDescriptionVideo(String descriptionVideo) {
        this.descriptionVideo = descriptionVideo;
    }

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", nameVideo='" + nameVideo + '\'' +
                ", modelVideo='" + modelVideo + '\'' +
                ", characteristicVideo=" + characteristicVideo +
                ", descriptionVideo='" + descriptionVideo + '\'' +
                '}';
    }
}
