package co.edu.uco.publiuco.crosscutting.utils.co.edu.publiuco.crosscutting.exceptions;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;

public abstract class PubliUcoException extends RuntimeException{
    public static final long serialVersionUID = 1L;
    private Exceptiontype type;
    private String userMessage;

    protected PubliUcoException(Exceptiontype type, String userMessage,Throwable rootCause){
        super(userMessage,rootCause);
        setUserMessage(userMessage);
        setType(type);
    }

    public final String setThecnicalMessage(final String technicalMessage){
        return UtilText.getUtilText().getDefaultIfEmpty(getMessage(),getUserMessage());
    }
    public Exceptiontype getType() {
        return type;
    }

    public void setType(final Exceptiontype type) {
        this.type = UtilObject.getDefault(type, Exceptiontype.GENERAL);
    }

    public String getUserMessage() {
        return userMessage;
    }

    public void setUserMessage(final String userMessage) {
        this.userMessage = UtilText.applyTrim(userMessage);
    }
    public final Throwable getRootCause(){
        return UtilObject.getDefault(getCause(),new Exception());
    }
}
