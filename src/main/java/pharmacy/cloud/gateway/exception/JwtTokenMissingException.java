package pharmacy.cloud.gateway.exception;

import javax.naming.AuthenticationException;

public class JwtTokenMissingException extends AuthenticationException{

    public JwtTokenMissingException( String msg ){
        super(msg);
    }
    
}
