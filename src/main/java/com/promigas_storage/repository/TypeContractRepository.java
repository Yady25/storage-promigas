package com.promigas_storage.repository;

import com.promigas_storage.DTO.ConnectionInfo;

public interface TypeContractRepository {
    public Integer findByContract(String nameContract, ConnectionInfo connectionInfo);
    public Integer insertByContract(String nameContract, ConnectionInfo connectionInfo);


}
