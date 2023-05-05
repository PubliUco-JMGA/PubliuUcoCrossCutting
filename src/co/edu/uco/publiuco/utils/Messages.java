package co.edu.uco.publiuco.utils;

public class Messages {
	
	private Messages() {}
	public static final class UtilSqlMessages{
		private UtilSqlMessages() {}
		public static final String CONNECTION_IS_OPEN_USER_MESSAGE = "Se ha presentado un problema tratando de validar si una conexion con la fuente de informacion estaba o no activa";
		public static final String CONNECTION_IS_OPEN_TECHNICAL_MESSAGE = "Se ha presentado un problema tratando de validar si una conexion con la fuente de informacion estaba o no activa";
		public static final String CONNECTION_IS_OPEN_TECHNICAL_NULL_CONNECTION = "No es posible validar si una conexion esta abierta cuando se encuentra nula";
		public static final String CONNECTION_IS_OPEN_TECHNICAL_SQL_EXCEPTION = "Se ha presentado un excepcion de tipo SQLException tratando de validar si la conexion estaba o no abierta. Por favor valida la traza de errores completa de la excepcion presentada...";
		public static final String CONNECTION_IS_OPEN_TECHNICAL_EXCEPTION = "Se ha presentado un excepcion de tipo SQLException tratando de validar si la conexion estaba o no abierta. Por favor valida la traza de errores completa de la excepcion presentada...";
		public static final String OPEN_CONNECTION_USER_MESSAGE = "Se ha presentado un problema al tratar de abrir la conexión a la base de datos";
		public static final String OPEN_CONNECTION_TECHNICAL_MESSAGE = "Se ha presentado un problema al tratar de abrir la conexión a la base de datos";
		public static final String UPDATE_TRANSACTION_USER_MESSAGE = "Se ha presentado un error a la hora de ejectutar";
		public static final String UPDATE_TRANSACTION_TECHNICAL_MESSAGE = "Se ha presentado un error a la hora de ejectutar";
		public static final String BEGIN_TRANSACTION_USER_MESSAGE = "Se ha presentado un error a la hora de ejectutar";
		public static final String BEGIN_TRANSACTION_TECHNICAL_MESSAGE = "Se ha presentado un error a la hora de ejectutar";
		public static final String CONFIRM_TRANSACTION_USER_MESSAGE = "Se ha presentado un error a la hora de ejectutar";
		public static final String CONFIRM_TRANSACTION_TECHNICAL_MESSAGE = "Se ha presentado un error a la hora de ejectutar";
		public static final String CANCEL_TRANSACTION_USER_MESSAGE = "Se ha presentado un error a la hora de ejectutar";
		public static final String CANCEL_TRANSACTION_TECHNICAL_MESSAGE = "Se ha presentado un error a la hora de ejectutar";
	}
	public static final class EstadoFacadeImplMessages{
		private EstadoFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar el estado. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar el nuevo estado, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar el estado. Por favot intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar el nuevo estado, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar el estado. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar el nuevo estado, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar el estado. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar el nuevo estado, por favor valide la traza completa de la excepcion presentada";
	}
}
