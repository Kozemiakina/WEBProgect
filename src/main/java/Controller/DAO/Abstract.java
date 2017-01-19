package Controller.DAO;

import java.sql.*;
import java.util.List;

/**
 * Created by alisa on 10.01.2017.
 */
public abstract class Abstract <T> implements Metods<T>{

    private String user = "postgres";//User login from DB
    private String password = "1234";//User password from DB
    private String url = "jdbc:postgresql://localhost:5432/PhotoShop";// URL DB
    /**
     * Connection with BD
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    @Override
    public Connection getConnection() throws ClassNotFoundException, SQLException{
        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection(url, user, password);
        return  connection;
    }

    public abstract String getAllQuery();//abstract method to query to retrieve all records from a table
    public abstract String getSelect();//abstract method to query to select records from a table
    public abstract String getCreateQuery();//abstract method for the request for the creation of records in a table
    public abstract String getDeleteQuery();//abstract method for the request for the delete of records from a table
    protected abstract String getEditQuery();//abstract method for requesting update records in table


    protected abstract List<T> parseResultSet(ResultSet rs) throws ClassNotFoundException,SQLException;//abstract method for return resultSet for get all records
    protected abstract void prepareStatementForInsert(PreparedStatement statement, T object) throws ClassNotFoundException,SQLException;//abstract method for create records
    protected abstract void prepareStatementForEdit(PreparedStatement statement, T object) throws ClassNotFoundException,SQLException;//abstract update for create records

    /**
     * Method get all records from table
     * @return all records
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    @Override
    public List<T> getAll() throws ClassNotFoundException,SQLException {
        List<T> list;
        System.out.println("list");
        String sql = getAllQuery();
        PreparedStatement preparedStatement = getConnection().prepareStatement(sql);//set SQL-request
        System.out.println("Connection");
        ResultSet resultSet = preparedStatement.executeQuery();
        list = parseResultSet(resultSet);
        return list;
    }
    /**
     * Select records from table
     * @param object
     * @return records
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    @Override
    public List<T> select(String...object) throws ClassNotFoundException,SQLException {
        List<T> list;
        String sql = getSelect();
        PreparedStatement preparedStatement = getConnection().prepareStatement(sql);
        preparedStatement.setInt(1, Integer.parseInt(object[0]));
        preparedStatement.setString(2,object[1]);
        //set SQL-request
        ResultSet resultSet = preparedStatement.executeQuery();
        list = parseResultSet(resultSet);
        return list;
    }
    /**
     * Create records in table
     * @param object
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    @Override
    public void forCreate (T object) throws ClassNotFoundException,SQLException {
        // Добавляем запись
        String sql = getCreateQuery();
        PreparedStatement statement = getConnection().prepareStatement(sql);
        prepareStatementForInsert(statement, object);
        statement.execute();
    }
    /**
     * Edit records in table
     * @param object
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    @Override
    public void forEdit (T object) throws ClassNotFoundException,SQLException {
        // Добавляем записьstatement.executeUpdate();
        String sql = getEditQuery();
        try (PreparedStatement statement = getConnection().prepareStatement(sql)) {
            prepareStatementForEdit(statement, object);
            statement.executeUpdate();
            System.out.println("обновил объект");
        }
    }
    /**
     * Delete records from table
     * @param id
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    @Override
    public void delete(int id) throws ClassNotFoundException,SQLException  {
        String sql = getDeleteQuery();
        PreparedStatement preparedStatement = getConnection().prepareStatement(sql);//set SQL-request
        preparedStatement.setInt(1, id);//set parameter for SQL request
        preparedStatement.executeUpdate();//execute SQL request
    }



}
