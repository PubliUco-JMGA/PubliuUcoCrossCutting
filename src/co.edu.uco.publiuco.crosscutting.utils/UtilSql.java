package co.edu.uco.publiuco.crosscutting.utils;

import co.edu.uco.publiuco.crosscutting.utils.co.edu.publiuco.crosscutting.exceptions.PubliUcoDataException;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.CompactNumberFormat;

public final class UtilSql {
    private UtilSql(){
        super();
    }
    public static boolean connectionIsOpen(final Connection connection){
        if(UtilObject.isNull(connection)) {
            var userMessage = Messages.UtilSqlMessages.CONNECTION_IS_OPEN_USER_MESSAGE;
            var technicalMessage = Messages.UtilSqlMessages.CONNECTION_IS_OPEN_TECHNICAL_NULL_CONNECTION;
            throw new PubliUcoCrosscuttingException.create(technicalMessage, userMessage);
        }
        try{
            return !connection.isClosed();
        }catch (final SQLException exception){


            throw PubliUcoCrosscuttingException.create(userMessage, technicalMessage,exception);
        }catch (final Exception exception){

            throw PubliUcoCrosscuttingException.create(userMessage, technicalMessage,exception);
        }

    }
    public static final void closeConnection(final Connection connection){
        try{
            if(!connectionIsOpen(connection)){
                connection.close();
            }
        }catch (PubliUcoCrosscuttingException exception){
            throw exception;
        }

    }
}
