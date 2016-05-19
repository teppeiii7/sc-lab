package tokyo.scratchcrew.sample.exception;

import org.apache.http.HttpStatus;

public class ApiGatewayException extends Exception {

    private static final long serialVersionUID = 1L;

    private HttpStatus httpStatus;
    private String message;

    public ApiGatewayException(Throwable t, HttpStatus httpStatus, String message) {
        super(t);
        this.httpStatus = httpStatus;
        this.message = message;

    }

    @Override
    public String getMessage() {
        return this.httpStatus + ": " + this.message;
    }

}
