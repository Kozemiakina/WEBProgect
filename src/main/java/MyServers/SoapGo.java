package MyServers;

import MyServers.Exception.WSException;
import model.Products.Photo;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by alisa on 15.01.2017.
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface SoapGo {
    @WebMethod
    public List<Photo> getPhoto () throws WSException, SQLException, ClassNotFoundException;
}
