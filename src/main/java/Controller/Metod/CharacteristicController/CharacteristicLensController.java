package Controller.Metod.CharacteristicController;

import Controller.DAO.Abstract;
import model.Characteristics.CharacteristicByLens;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Created by alisa on 14.01.2017.
 */
public class CharacteristicLensController extends Abstract<CharacteristicByLens> {
    ResourceBundle resourceBundle = ResourceBundle.getBundle("Query.CharacteristicQuery.ChForLens");
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
    protected List<CharacteristicByLens> parseResultSet(ResultSet rs) throws ClassNotFoundException, SQLException {
        ArrayList<CharacteristicByLens> result = new ArrayList<>();
        while (rs.next()){
            CharacteristicByLens characteristicByLens = new CharacteristicByLens();
            characteristicByLens.setId(rs.getInt("characteristic_id"));
            characteristicByLens.setMount(rs.getString("mount"));
            characteristicByLens.setFocalLength(rs.getInt("focal_length"));
            characteristicByLens.setRatio(rs.getInt("ratio"));
            characteristicByLens.setAutoFocus(rs.getBoolean("autofocus"));
            characteristicByLens.setFilter(rs.getInt("filter"));
            result.add(characteristicByLens);
        }
        return result;
    }

    @Override
    protected void prepareStatementForInsert(PreparedStatement statement, CharacteristicByLens object) throws ClassNotFoundException, SQLException {
        statement.setString(1,object.getMount());
        statement.setInt(2,object.getFocalLength());
        statement.setDouble(3,object.getRatio());
        statement.setBoolean(4,object.isAutoFocus());
        statement.setInt(5,object.getFilter());
    }

    @Override
    protected void prepareStatementForEdit(PreparedStatement statement, CharacteristicByLens object) throws ClassNotFoundException, SQLException {
        statement.setString(1,object.getMount());
        statement.setInt(2,object.getFocalLength());
        statement.setDouble(3,object.getRatio());
        statement.setBoolean(4,object.isAutoFocus());
        statement.setInt(5,object.getFilter());
        statement.setInt(6,object.getId());
    }

    @Override
    public void create(String... object) throws SQLException, ClassNotFoundException {
        String[] masObject = object;
        CharacteristicByLens characteristicByLens = new CharacteristicByLens();
        characteristicByLens.setMount(masObject[0]);
        characteristicByLens.setFocalLength(Integer.parseInt(masObject[1]));
        characteristicByLens.setRatio(Double.parseDouble(masObject[2]));
        characteristicByLens.setAutoFocus(Boolean.parseBoolean(masObject[3]));
        characteristicByLens.setFilter(Integer.parseInt(masObject[4]));
        forCreate(characteristicByLens);
    }

    @Override
    public void edit(String... object) throws SQLException, ClassNotFoundException {
        String[] masObject = object;
        CharacteristicByLens characteristicByLens = new CharacteristicByLens();
        characteristicByLens.setId(Integer.parseInt(masObject[0]));
        characteristicByLens.setMount(masObject[1]);
        characteristicByLens.setFocalLength(Integer.parseInt(masObject[2]));
        characteristicByLens.setRatio(Double.parseDouble(masObject[3]));
        characteristicByLens.setAutoFocus(Boolean.parseBoolean(masObject[4]));
        characteristicByLens.setFilter(Integer.parseInt(masObject[5]));
        forEdit(characteristicByLens);
    }
}
