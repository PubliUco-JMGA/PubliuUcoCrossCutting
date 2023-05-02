package co.edu.uco.publiuco.crosscutting.utils.co.edu.publiuco.crosscutting.exceptions;

public class PubliUcoDataException extends PubliUcoException{
    private static final long serialVersionUID = 342342L;
    private PubliUcoDataException( final String userMessage, final Throwable rootCause,Exceptiontype type) {
        super(type, userMessage, rootCause);
    }

    public static PubliUcoDataException create(final String technicalMessage,final String userMessage, final Throwable rootCause){
        return new PubliUcoDataException(technicalMessage,rootCause,userMessage);
    }
}
