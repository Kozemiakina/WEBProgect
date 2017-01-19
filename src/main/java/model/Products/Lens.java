package model.Products;

/**
 * Created by alisa on 10.01.2017.
 */
public class Lens {
    private int id;
    private String nameLens;
    private String modelLens;
    private int characteristicLens;
    private String descriptionLens;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameLens() {
        return nameLens;
    }

    public void setNameLens(String nameLens) {
        this.nameLens = nameLens;
    }

    public String getModelLens() {
        return modelLens;
    }

    public void setModelLens(String modelLens) {
        this.modelLens = modelLens;
    }

    public int getCharacteristicLens() {
        return characteristicLens;
    }

    public void setCharacteristicLens(int characteristicLens) {
        this.characteristicLens = characteristicLens;
    }

    public String getDescriptionLens() {
        return descriptionLens;
    }

    public void setDescriptionLens(String descriptionLens) {
        this.descriptionLens = descriptionLens;
    }

    @Override
    public String toString() {
        return "Lens{" +
                "id=" + id +
                ", nameLens='" + nameLens + '\'' +
                ", modelLens='" + modelLens + '\'' +
                ", characteristicLens=" + characteristicLens +
                ", descriptionLens='" + descriptionLens + '\'' +
                '}';
    }
}
