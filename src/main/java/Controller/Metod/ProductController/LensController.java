package Controller.Metod.ProductController;

import Controller.DAO.Abstract;
import model.Products.Lens;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Created by alisa on 14.01.2017.
 */
public class LensController extends Abstract<Lens>{
    ResourceBundle resourceBundle = ResourceBundle.getBundle("Query.ProductQuery.Lens");

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
    protected List<Lens> parseResultSet(ResultSet rs) throws ClassNotFoundException, SQLException {
        ArrayList<Lens> result = new ArrayList<>();
        while (rs.next()){
            Lens lens = new Lens();
            lens.setId(rs.getInt("lens_id"));
            lens.setNameLens(rs.getString("name_lens"));
            lens.setModelLens(rs.getString("model_lens"));
            lens.setCharacteristicLens(rs.getInt("characteristic_lens"));
            lens.setDescriptionLens(rs.getString("description_lens"));
            result.add(lens);
        }
        return result;
    }

    @Override
    protected void prepareStatementForInsert(PreparedStatement statement, Lens object) throws ClassNotFoundException, SQLException {
        statement.setString(1,object.getNameLens());
        statement.setString(2,object.getModelLens());
        statement.setInt(3,object.getCharacteristicLens());
        statement.setString(4,object.getDescriptionLens());
    }

    @Override
    protected void prepareStatementForEdit(PreparedStatement statement, Lens object) throws ClassNotFoundException, SQLException {
        statement.setString(1,object.getNameLens());
        statement.setString(2,object.getModelLens());
        statement.setInt(3,object.getCharacteristicLens());
        statement.setString(4,object.getDescriptionLens());
        statement.setInt(5,object.getId());
    }

    @Override
    public void create(String... object) throws SQLException, ClassNotFoundException {
        String[] masObject = object;
        Lens lens= new Lens();
        lens.setNameLens(masObject[0]);
        lens.setModelLens(masObject[1]);
        lens.setCharacteristicLens(Integer.parseInt(masObject[2]));
        lens.setDescriptionLens(masObject[3]);
        forCreate(lens);
    }

    @Override
    public void edit(String... object) throws SQLException, ClassNotFoundException {
        String[] masObject = object;
        Lens lens= new Lens();
        lens.setId(Integer.parseInt(masObject[0]));
        lens.setNameLens(masObject[1]);
        lens.setModelLens(masObject[2]);
        lens.setCharacteristicLens(Integer.parseInt(masObject[3]));
        lens.setDescriptionLens(masObject[4]);
        forEdit(lens);
    }
    public Lens forEditAndCreate(String... object){
        String[] masObject = object;
        Lens lens= new Lens();
        lens.setId(Integer.parseInt(masObject[0]));
        lens.setNameLens(masObject[1]);
        lens.setModelLens(masObject[2]);
        lens.setCharacteristicLens(Integer.parseInt(masObject[3]));
        lens.setDescriptionLens(masObject[4]);
        return lens;
    }
}
