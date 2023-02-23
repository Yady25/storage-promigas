package com.promigas_storage.repository;

import com.promigas_storage.DTO.ConnectionInfo;
import com.promigas_storage.entity.CountryEntity;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CountryRepositoryImp extends AbstractRepositoryDatabase implements CountryRepository{

    private static String QUERY_COUNTRIES = "";

    @Override
    public Integer findByCountry(String country, ConnectionInfo connectionInfo) {
        getConnectionSQLServer(connectionInfo);
        int id= 0;
        try {
            System.out.println("Query: "+QUERY_COUNTRIES);

            System.out.println("country : "+country);
            QUERY_COUNTRIES = "select * from dbo.country where name_country like '%"+country+"%'";
            System.out.println("Query: "+QUERY_COUNTRIES);
            PreparedStatement con = connection.prepareStatement(QUERY_COUNTRIES);
//            con.setString(1,country);

            ResultSet rs = con.executeQuery();

            while (rs.next()){
                if(rs.getString("name_country").toUpperCase().equalsIgnoreCase(country.toUpperCase())){
                    id=rs.getInt("unique_id");
                }
            }
        } catch(Exception ex){
            throw new RuntimeException(ex);
        }finally {
            closeConnection();
        }

        return id;
    }

    @Override
    public boolean insertCountry(CountryEntity countryEntity, ConnectionInfo connectionInfo) {
        return false;
    }

}
