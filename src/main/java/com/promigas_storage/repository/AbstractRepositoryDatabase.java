package com.promigas_storage.repository;

import com.promigas_storage.DTO.ConnectionInfo;
import com.promigas_storage.DTO.enums.LogEnum;
import com.promigas_storage.DTO.enums.MessagesEnum;
import com.promigas_storage.DTO.exception.PromigasException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.text.MessageFormat;


public class AbstractRepositoryDatabase {
    protected Connection connection;

    protected void getConnectionSQLServer(ConnectionInfo connectionInfo) {
        System.out.println(LogEnum.MESSAGES_CONEXION.getMessage());
        String connectionString =  MessageFormat.format(connectionInfo.getConnectionPattern(), connectionInfo.getHost(),connectionInfo.getPort(),connectionInfo.getSchema(),connectionInfo.getUser(), connectionInfo.getPwd() );

        try {
            //obteniendo conexion de variable de entorno
//            connectionString = System.getenv("db_connection");
            System.out.println("conection String ::"+connectionString);
            connection = DriverManager.getConnection(connectionString);
            System.out.println("Conexion exitosa");
            //--
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (ParseException e) {
//            throw new RuntimeException(e);
            //--
        }catch (Exception ex){
            throw new PromigasException(MessagesEnum.ERROR_DB_CON.getCodeMessage(), MessagesEnum.ERROR_DB_CON.getMessage(),MessagesEnum.ERROR_DB_CON.getHttpCode());
        }
    }

    protected void closeConnection(){

        try {
            connection.close();
        }catch (Exception ex){
            System.out.println("Error al cerrar conexion:"+ ex.getMessage());
        }
    }
}
