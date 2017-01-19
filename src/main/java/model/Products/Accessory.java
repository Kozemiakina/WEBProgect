package model.Products;

/**
 * Created by alisa on 10.01.2017.
 */
public class Accessory {
    private int id;
    private String nameAccessory;
    private String modelAccessory;
    private String typeAccessory;
    private String descriptionAccessory;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameAccessory() {
        return nameAccessory;
    }

    public void setNameAccessory(String nameAccessory) {
        this.nameAccessory = nameAccessory;
    }

    public String getModelAccessory() {
        return modelAccessory;
    }

    public void setModelAccessory(String modelAccessory) {
        this.modelAccessory = modelAccessory;
    }

    public String getTypeAccessory() {
        return typeAccessory;
    }

    public void setTypeAccessory(String typeAccessory) {
        this.typeAccessory = typeAccessory;
    }

    public String getDescriptionAccessory() {
        return descriptionAccessory;
    }

    public void setDescriptionAccessory(String descriptionAccessory) {
        this.descriptionAccessory = descriptionAccessory;
    }

    @Override
    public String toString() {
        return "Accessory{" +
                "id=" + id +
                ", nameAccessory='" + nameAccessory + '\'' +
                ", modelAccessory='" + modelAccessory + '\'' +
                ", typeAccessory='" + typeAccessory + '\'' +
                ", descriptionAccessory='" + descriptionAccessory + '\'' +
                '}';
    }
}
