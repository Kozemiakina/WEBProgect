package MyServers.Exception;

import javax.xml.ws.WebFault;

/**
 * Created by alisa on 18.01.2017.
 */
@WebFault(name="WSException",faultBean = "MyServers.Exception.WSException")
public class WSException extends Exception {

    public WSException() {
    }

    public WSException(String message) {
        super(message);
    }

    public WSException(String message, Throwable cause) {
        super(message, cause);
    }

    public WSException(Throwable cause) {
        super(cause);
    }

    public WSException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}