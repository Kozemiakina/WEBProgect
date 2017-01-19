package Controller.Metod.ProductController;

import Controller.DAO.Abstract;
import model.Products.Accessory;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Created by alisa on 14.01.2017.
 */
public class AccessoryController extends Abstract<Accessory> {
    ResourceBundle resourceBundle = ResourceBundle.getBundle("Query.ProductQuery.Accessory");
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
    protected List<Accessory> parseResultSet(ResultSet rs) throws ClassNotFoundException, SQLException {
        ArrayList<Accessory> result = new ArrayList<Accessory>();
        while (rs.next()){
            Accessory accessory = new Accessory();
            accessory.setId(rs.getInt("accessory_id"));
            accessory.setModelAccessory(rs.getString("model_accessory"));
            accessory.setNameAccessory(rs.getString("name_accessory"));
            accessory.setTypeAccessory(rs.getString("type_accessory"));
            accessory.setDescriptionAccessory(rs.getString("description_accessory"));
            result.add(accessory);
        }
        return result;
    }

    @Override
    protected void prepareStatementForInsert(PreparedStatement statement, Accessory object) throws ClassNotFoundException, SQLException {
        statement.setString(1,object.getModelAccessory());
        statement.setString(2,object.getNameAccessory());
        statement.setString(3,object.getTypeAccessory());
        statement.setString(4,object.getDescriptionAccessory());
    }

    @Override
    protected void prepareStatementForEdit(PreparedStatement statement, Accessory object) throws ClassNotFoundException, SQLException {
        statement.setString(1,object.getModelAccessory());
        statement.setString(2,object.getNameAccessory());
        statement.setString(3,object.getTypeAccessory());
        statement.setString(4,object.getDescriptionAccessory());
        statement.setInt(5,object.getId());
    }

    @Override
    public void create(String... object) throws SQLException, ClassNotFoundException {
        String[] masObject = object;
        Accessory accessory= new Accessory();
        accessory.setNameAccessory(masObject[0]);
        accessory.setModelAccessory(masObject[1]);
        accessory.setTypeAccessory(masObject[2]);
        accessory.setDescriptionAccessory(masObject[3]);
        forCreate(accessory);
    }

    @Override
    public void edit(String... object) throws SQLException, ClassNotFoundException {
        String[] masObject = object;
        Accessory accessory= new Accessory();
        accessory.setId(Integer.parseInt(masObject[0]));
        accessory.setNameAccessory(masObject[1]);
        accessory.setModelAccessory(masObject[2]);
        accessory.setTypeAccessory(masObject[3]);
        accessory.setDescriptionAccessory(masObject[4]);
        forEdit(accessory);
    }

}
