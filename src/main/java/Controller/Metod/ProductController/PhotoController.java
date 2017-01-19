package Controller.Metod.ProductController;

import Controller.DAO.Abstract;
import model.Products.Photo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Created by alisa on 14.01.2017.
 */
public class PhotoController extends Abstract<Photo> {
    ResourceBundle resourceBundle = ResourceBundle.getBundle("Query.ProductQuery.Photo");
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
    protected List<Photo> parseResultSet(ResultSet rs) throws ClassNotFoundException, SQLException {
        ArrayList<Photo> result = new ArrayList<Photo>();
        while (rs.next()){
            Photo photo = new Photo();
            photo.setId(rs.getInt("photo_id"));
            photo.setNamePhoto(rs.getString("name_photo"));
            photo.setModelPhoto(rs.getString("model_photo"));
            photo.setCharacteristicPhoto(rs.getInt("characteristics_photo"));
            photo.setDescriptionPhoto(rs.getString("description_photo"));
            result.add(photo);
        }
        return result;
    }

    @Override
    protected void prepareStatementForInsert(PreparedStatement statement, Photo object) throws ClassNotFoundException, SQLException {
        statement.setString(1,object.getNamePhoto());
        statement.setString(2,object.getModelPhoto());
        statement.setInt(3,object.getCharacteristicPhoto());
        statement.setString(4,object.getDescriptionPhoto());
    }

    @Override
    protected void prepareStatementForEdit(PreparedStatement statement, Photo object) throws ClassNotFoundException, SQLException {
        statement.setString(1,object.getNamePhoto());
        statement.setString(2,object.getModelPhoto());
        statement.setInt(3,object.getCharacteristicPhoto());
        statement.setString(4,object.getDescriptionPhoto());
        statement.setInt(5,object.getId());
    }

    @Override
    public void create(String... object) throws SQLException, ClassNotFoundException {
        String[] masObject = object;
        Photo photo= new Photo();
        photo.setNamePhoto(masObject[0]);
        photo.setModelPhoto(masObject[1]);
        photo.setCharacteristicPhoto(Integer.parseInt(masObject[2]));
        photo.setDescriptionPhoto(masObject[3]);
        forCreate(photo);
    }

    @Override
    public void edit(String... object) throws SQLException, ClassNotFoundException {
        String[] masObject = object;
        Photo photo= new Photo();
        photo.setId(Integer.parseInt(masObject[0]));
        photo.setNamePhoto(masObject[1]);
        photo.setModelPhoto(masObject[2]);
        photo.setCharacteristicPhoto(Integer.parseInt(masObject[3]));
        photo.setDescriptionPhoto(masObject[4]);
        forEdit(photo);
    }
}
