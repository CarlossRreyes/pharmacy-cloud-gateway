package pharmacy.cloud.gateway.exception;

import javax.naming.AuthenticationException;

public class JwtTokenMalformedException extends AuthenticationException{
    
    public JwtTokenMalformedException( String msg ){
        super(msg);
    }
}
