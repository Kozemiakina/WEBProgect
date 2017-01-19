package Controller.Metod.ProductController;

import Controller.DAO.Abstract;
import model.Products.Video;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Created by alisa on 14.01.2017.
 */
public class VideoController extends Abstract<Video> {
    ResourceBundle resourceBundle = ResourceBundle.getBundle("Query.ProductQuery.Video");
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
    protected List<Video> parseResultSet(ResultSet rs) throws ClassNotFoundException, SQLException {
        ArrayList<Video> result = new ArrayList<>();
        while (rs.next()){
            Video video = new Video();
            video.setId(rs.getInt("video_id"));
            video.setNameVideo(rs.getString("name_video"));
            video.setModelVideo(rs.getString("model_video"));
            video.setCharacteristicVideo(rs.getInt("characteristic_video"));
            video.setDescriptionVideo(rs.getString("description_video"));
        }
        return result;
    }

    @Override
    protected void prepareStatementForInsert(PreparedStatement statement, Video object) throws ClassNotFoundException, SQLException {
        statement.setString(1,object.getNameVideo());
        statement.setString(2,object.getModelVideo());
        statement.setInt(3,object.getCharacteristicVideo());
        statement.setString(4,object.getDescriptionVideo());
    }

    @Override
    protected void prepareStatementForEdit(PreparedStatement statement, Video object) throws ClassNotFoundException, SQLException {
        statement.setString(1,object.getNameVideo());
        statement.setString(2,object.getModelVideo());
        statement.setInt(3,object.getCharacteristicVideo());
        statement.setString(4,object.getDescriptionVideo());
        statement.setInt(5,object.getId());
    }

    @Override
    public void create(String... object) throws SQLException, ClassNotFoundException {
        String[] masObject = object;
        Video video= new Video();
        video.setNameVideo(masObject[0]);
        video.setModelVideo(masObject[1]);
        video.setCharacteristicVideo(Integer.parseInt(masObject[2]));
        video.setDescriptionVideo(masObject[3]);
        forCreate(video);
    }

    @Override
    public void edit(String... object) throws SQLException, ClassNotFoundException {
        String[] masObject = object;
        Video video= new Video();
        video.setId(Integer.parseInt(masObject[0]));
        video.setNameVideo(masObject[1]);
        video.setModelVideo(masObject[2]);
        video.setCharacteristicVideo(Integer.parseInt(masObject[3]));
        video.setDescriptionVideo(masObject[4]);
        forEdit(video);
    }

}
