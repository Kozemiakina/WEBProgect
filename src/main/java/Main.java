import Controller.DAO.Commander;

import java.sql.SQLException;

/**
 * Created by alisa on 15.01.2017.
 */
public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //Commander.doPhotoController().create("dfdf","dfdfd","2","dfdfdf");
        System.out.println(Commander.doPhotoController().getAll());
    }
}
