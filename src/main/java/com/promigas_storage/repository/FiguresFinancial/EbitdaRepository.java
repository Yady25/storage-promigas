package com.promigas_storage.repository.FiguresFinancial;

import com.promigas_storage.DTO.ConnectionInfo;
import com.promigas_storage.entity.FiguresFinancial.CapexEntity;

import java.util.List;

public interface EbitdaRepository {
    public List<Integer> findByEbitda(int idOportunity, ConnectionInfo connectionInfo);
    public boolean insertEbida(int idOpportunity, CapexEntity capexEntity, ConnectionInfo connectionInfo);
    public boolean deleteEbitda(int idOpportunity, ConnectionInfo connectionInfo);
}
