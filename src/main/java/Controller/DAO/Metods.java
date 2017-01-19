package Controller.DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by alisa on 10.01.2017.
 */
public interface Metods <T>{

    Connection getConnection() throws ClassNotFoundException, SQLException;
    List<T> getAll () throws ClassNotFoundException, SQLException;
    void delete (int id) throws ClassNotFoundException, SQLException;
    void create (String ... object) throws SQLException, ClassNotFoundException;
    void forCreate(T object) throws SQLException,ClassNotFoundException;
    void edit (String ... object) throws SQLException, ClassNotFoundException;
    void forEdit(T object) throws SQLException,ClassNotFoundException;
    List<T> select (String...object) throws ClassNotFoundException, SQLException;
}
