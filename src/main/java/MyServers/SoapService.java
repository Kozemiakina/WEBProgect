package MyServers;

import Controller.DAO.Commander;
import MyServers.Exception.WSException;
import model.Products.Photo;

import javax.jws.WebService;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by alisa on 15.01.2017.
 */
@WebService(endpointInterface = "MyServers.SoapGo")
public class SoapService implements SoapGo  {
    @Override
    public List<Photo> getPhoto() throws WSException {

            return Commander.doPhotoController().getAll();

    }


}
