package model.Products;

/**
 * Created by alisa on 09.01.2017.
 */
public class Photo {
    private int id;
    private String namePhoto;
    private String modelPhoto;
    private int characteristicPhoto;
    private String descriptionPhoto;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamePhoto() {
        return namePhoto;
    }

    public void setNamePhoto(String namePhoto) {
        this.namePhoto = namePhoto;
    }

    public String getModelPhoto() {
        return modelPhoto;
    }

    public void setModelPhoto(String modelPhoto) {
        this.modelPhoto = modelPhoto;
    }

    public int getCharacteristicPhoto() {
        return characteristicPhoto;
    }

    public void setCharacteristicPhoto(int characteristicPhoto) {
        this.characteristicPhoto = characteristicPhoto;
    }

    public String getDescriptionPhoto() {
        return descriptionPhoto;
    }

    public void setDescriptionPhoto(String descriptionPhoto) {
        this.descriptionPhoto = descriptionPhoto;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "id=" + id +
                ", namePhoto='" + namePhoto + '\'' +
                ", modelPhoto='" + modelPhoto + '\'' +
                ", characteristicPhoto=" + characteristicPhoto +
                ", descriptionPhoto='" + descriptionPhoto + '\'' +
                '}';
    }
}
