package com.promigas_storage.repository;

import com.promigas_storage.DTO.ConnectionInfo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SectorRepositoryImp extends AbstractRepositoryDatabase implements SectorRepository{

    private static String QUERY = "";
    private static String INSERT = "insert into dbo.sector(type_sector) values(?)";

    @Override
    public Integer findBySector(String nameSector, ConnectionInfo connectionInfo) {
        getConnectionSQLServer(connectionInfo);
        int id= 0;

        try {
            id= getID(nameSector);
        } catch(Exception ex){
            throw new RuntimeException(ex);
        }finally {
            closeConnection();
        }
        return id;
    }

    @Override
    public Integer insertByType(String nameSector, ConnectionInfo connectionInfo) {
        getConnectionSQLServer(connectionInfo);
        int id= 0;
        try {
            PreparedStatement con = connection.prepareStatement(INSERT);
            con.setString(1,nameSector);
            int affectedRows =con.executeUpdate();
            if(affectedRows!=0)
                id= getID(nameSector);
        }catch (Exception e){
            throw new RuntimeException(e);
        }finally {
            closeConnection();
        }
        return id;
    }

    public int getID(String nameSector) throws SQLException {
        int id= 0;

        QUERY = "select * from dbo.sector where type_sector like '%"+nameSector+"%'";
        PreparedStatement con = connection.prepareStatement(QUERY);
        ResultSet rs = con.executeQuery();

        while (rs.next()){
            if(rs.getString("type_sector").toUpperCase().equalsIgnoreCase(nameSector.toUpperCase())){
                id=rs.getInt("unique_id");
            }
        }
        return id;
    }
}
