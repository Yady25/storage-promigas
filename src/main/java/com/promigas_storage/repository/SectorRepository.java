package com.promigas_storage.repository;

import com.promigas_storage.DTO.ConnectionInfo;

public interface SectorRepository {
    public Integer findBySector(String nameSector, ConnectionInfo connectionInfo);
    public Integer insertByType(String nameSector, ConnectionInfo connectionInfo);

}
