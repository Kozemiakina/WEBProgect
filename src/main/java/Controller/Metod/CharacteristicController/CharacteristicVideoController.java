package Controller.Metod.CharacteristicController;

import Controller.DAO.Abstract;
import model.Characteristics.CharacteristicByVideo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Created by alisa on 14.01.2017.
 */
public class CharacteristicVideoController extends Abstract<CharacteristicByVideo>{
    ResourceBundle resourceBundle = ResourceBundle.getBundle("Query.CharacteristicQuery.ChForVideo");
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
    protected List<CharacteristicByVideo> parseResultSet(ResultSet rs) throws ClassNotFoundException, SQLException {
        ArrayList<CharacteristicByVideo> result = new ArrayList<>();
        while (rs.next()){
            CharacteristicByVideo characteristicByVideo = new CharacteristicByVideo();
            characteristicByVideo.setId(rs.getInt("characteristic_id"));
            characteristicByVideo.setScreenSize(rs.getInt("screen_size"));
            characteristicByVideo.setMatrixSize(rs.getInt("matrix_size"));
            characteristicByVideo.setBodyColor(rs.getString("body_color"));
            characteristicByVideo.setBatteryResources(rs.getInt("battery_resources"));
            characteristicByVideo.setZoom(rs.getInt("zoom"));
            characteristicByVideo.setMatrixPoint(rs.getInt("matrix_point"));
            result.add(characteristicByVideo);
        }
        return result;
    }

    @Override
    protected void prepareStatementForInsert(PreparedStatement statement, CharacteristicByVideo object) throws ClassNotFoundException, SQLException {
        statement.setDouble(1,object.getScreenSize());
        statement.setDouble(2,object.getMatrixSize());
        statement.setString(3,object.getBodyColor());
        statement.setInt(4,object.getBatteryResources());
        statement.setInt(5,object.getZoom());
        statement.setDouble(6,object.getMatrixPoint());
    }

    @Override
    protected void prepareStatementForEdit(PreparedStatement statement, CharacteristicByVideo object) throws ClassNotFoundException, SQLException {
        statement.setDouble(1,object.getScreenSize());
        statement.setDouble(2,object.getMatrixSize());
        statement.setString(3,object.getBodyColor());
        statement.setInt(4,object.getBatteryResources());
        statement.setInt(5,object.getZoom());
        statement.setDouble(6,object.getMatrixPoint());
        statement.setInt(7,object.getId());
    }

    @Override
    public void create(String... object) throws SQLException, ClassNotFoundException {
        String[] masObject = object;
        CharacteristicByVideo characteristicByVideo = new CharacteristicByVideo();
        characteristicByVideo.setScreenSize(Double.parseDouble(masObject[0]));
        characteristicByVideo.setMatrixSize(Double.parseDouble(masObject[1]));
        characteristicByVideo.setBodyColor(masObject[2]);
        characteristicByVideo.setBatteryResources(Integer.parseInt(masObject[3]));
        characteristicByVideo.setZoom(Integer.parseInt(masObject[4]));
        characteristicByVideo.setMatrixPoint(Double.parseDouble(masObject[5]));
        forCreate(characteristicByVideo);
    }

    @Override
    public void edit(String... object) throws SQLException, ClassNotFoundException {
        String[] masObject = object;
        CharacteristicByVideo characteristicByVideo = new CharacteristicByVideo();
        characteristicByVideo.setId(Integer.parseInt(masObject[0]));
        characteristicByVideo.setScreenSize(Double.parseDouble(masObject[1]));
        characteristicByVideo.setMatrixSize(Double.parseDouble(masObject[2]));
        characteristicByVideo.setBodyColor(masObject[3]);
        characteristicByVideo.setBatteryResources(Integer.parseInt(masObject[4]));
        characteristicByVideo.setZoom(Integer.parseInt(masObject[5]));
        characteristicByVideo.setMatrixPoint(Double.parseDouble(masObject[6]));
        forEdit(characteristicByVideo);
    }
}
