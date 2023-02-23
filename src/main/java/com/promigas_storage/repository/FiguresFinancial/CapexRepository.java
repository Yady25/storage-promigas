package com.promigas_storage.repository.FiguresFinancial;

import com.promigas_storage.DTO.ConnectionInfo;
import com.promigas_storage.entity.FiguresFinancial.CapexEntity;

import java.util.List;

public interface CapexRepository {
    public List<Integer> findByCapex(int idOportunity, ConnectionInfo connectionInfo);
    public boolean insertCapex(int idOpportunity, CapexEntity capexEntity, ConnectionInfo connectionInfo);
    public boolean deleteCapex(int idOpportunity, ConnectionInfo connectionInfo);

}
