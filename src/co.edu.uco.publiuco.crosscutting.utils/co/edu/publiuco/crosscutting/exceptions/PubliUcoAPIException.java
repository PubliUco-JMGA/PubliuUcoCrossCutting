package co.edu.uco.publiuco.crosscutting.utils.co.edu.publiuco.crosscutting.exceptions;

public class PubliUcoAPIException extends PubliUcoException {
    protected PubliUcoAPIException(Exceptiontype type, String userMessage, Throwable rootCause) {
        super(type, userMessage, rootCause);
    }

}
