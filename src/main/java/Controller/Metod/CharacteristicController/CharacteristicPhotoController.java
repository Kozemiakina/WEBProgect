package Controller.Metod.CharacteristicController;

import Controller.DAO.Abstract;
import model.Characteristics.CharacteristicByPhoto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Created by alisa on 10.01.2017.
 */
public class CharacteristicPhotoController extends Abstract<CharacteristicByPhoto> {
    ResourceBundle resourceBundle = ResourceBundle.getBundle("Query.CharacteristicQuery.ChForPhoto");
    @Override
    public String getAllQuery() {
        return resourceBundle.getString("select");
    }

    @Override
    public String getSelect() {
        return resourceBundle.getString("select");
    }

    @Override
    public String getCreateQuery() {
        return resourceBundle.getString("create");
    }

    @Override
    public String getDeleteQuery() {
        return resourceBundle.getString("delete");
    }

    @Override
    protected String getEditQuery() {
        return resourceBundle.getString("edit");
    }

    @Override
    protected List<CharacteristicByPhoto> parseResultSet(ResultSet rs) throws ClassNotFoundException, SQLException {
        ArrayList<CharacteristicByPhoto> result = new ArrayList<>();
        while (rs.next()){
            CharacteristicByPhoto characteristicByPhoto= new CharacteristicByPhoto();
            characteristicByPhoto.setId(rs.getInt("characteristic_id"));
            characteristicByPhoto.setPixels(rs.getInt("pixels"));
            characteristicByPhoto.setBodyColor(rs.getString("body_color"));
            characteristicByPhoto.setVideo(rs.getBoolean("video"));
            characteristicByPhoto.setBatteryResources(rs.getInt("battery_resurs"));
            characteristicByPhoto.setTypeOfCamera(rs.getString("type_of_camera"));
            result.add(characteristicByPhoto);
        }
        return result;
    }

    @Override
    protected void prepareStatementForInsert(PreparedStatement statement, CharacteristicByPhoto object) throws ClassNotFoundException, SQLException {
        statement.setInt(1,object.getPixels());
        statement.setString(2,object.getBodyColor());
        statement.setBoolean(3,object.isVideo());
        statement.setString(4,object.getTypeOfCamera());
        statement.setInt(5,object.getBatteryResources());
    }

    @Override
    protected void prepareStatementForEdit(PreparedStatement statement, CharacteristicByPhoto object) throws ClassNotFoundException, SQLException {
        statement.setInt(6,object.getId());
        statement.setInt(1,object.getPixels());
        statement.setString(2,object.getBodyColor());
        statement.setBoolean(3,object.isVideo());
        statement.setString(4,object.getTypeOfCamera());
        statement.setInt(5,object.getBatteryResources());
    }

    @Override
    public void create(String... object) throws SQLException, ClassNotFoundException {
        String[] masObject = object;
        CharacteristicByPhoto characteristicByPhoto = new CharacteristicByPhoto();
        characteristicByPhoto.setPixels(Integer.parseInt(masObject[0]));
        characteristicByPhoto.setBodyColor(masObject[1]);
        characteristicByPhoto.setVideo(Boolean.parseBoolean(masObject[2]));
        characteristicByPhoto.setTypeOfCamera(masObject[3]);
        characteristicByPhoto.setBatteryResources(Integer.parseInt(masObject[4]));
        forEdit(characteristicByPhoto);
    }

    @Override
    public void edit(String... object) throws SQLException, ClassNotFoundException {
        String[] masObject = object;
        CharacteristicByPhoto characteristicByPhoto = new CharacteristicByPhoto();
        characteristicByPhoto.setId(Integer.parseInt(masObject[0]));
        characteristicByPhoto.setPixels(Integer.parseInt(masObject[1]));
        characteristicByPhoto.setBodyColor(masObject[2]);
        characteristicByPhoto.setVideo(Boolean.parseBoolean(masObject[3]));
        characteristicByPhoto.setTypeOfCamera(masObject[4]);
        characteristicByPhoto.setBatteryResources(Integer.parseInt(masObject[5]));
        forEdit(characteristicByPhoto);
    }

}
