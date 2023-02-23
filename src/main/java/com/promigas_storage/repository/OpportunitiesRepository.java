package com.promigas_storage.repository;

import com.promigas_storage.DTO.ConnectionInfo;
import com.promigas_storage.entity.OpportunitiesEntity;

public interface OpportunitiesRepository {
    public Integer findByOpportunity(String opportunity, ConnectionInfo connectionInfo);

    public Integer insertByOpportunitiy(int idSector, int idCountry, int idcontract, OpportunitiesEntity opportunity, ConnectionInfo connectionInfo);

    public boolean updateOpportunity(int id, int idSector, int idCountry, int idcontract,OpportunitiesEntity opportunitiesEntity, ConnectionInfo connectionInfo);

}
