package com.promigas_storage.Service;

import com.promigas_storage.DTO.ConnectionInfo;
import com.promigas_storage.DTO.enums.ConstantsEnum;
import com.promigas_storage.entity.FiguresFinancial.CapexEntity;
import com.promigas_storage.entity.SecretAdapter;
import com.promigas_storage.entity.StorageEntity;
import com.promigas_storage.repository.FiguresFinancial.CapexRepository;
import com.promigas_storage.repository.FiguresFinancial.CapexRepositoryImp;
import com.promigas_storage.repository.SecretPort;

import java.util.List;

public class UploadFinancialService {
    private CapexRepository capexRepository = new CapexRepositoryImp();
    public void setDataFinancial(int idOportunity, StorageEntity data){
        SecretPort secretPort = new SecretAdapter();
        ConnectionInfo connectionInfo = secretPort.querySecretConnection(ConstantsEnum.SECRET_SQL_SERVER.getValue());

        setCapex(idOportunity,connectionInfo,data.getCapexEntity());
    }

    public void setCapex(int id, ConnectionInfo connectionInfo, CapexEntity capexEntity){
        List<Integer> ids = capexRepository.findByCapex(id,connectionInfo);
        if(ids.size()>0){
            if(capexRepository.deleteCapex(id,connectionInfo))
                capexRepository.insertCapex(id,capexEntity,connectionInfo);
        }
        else {
            capexRepository.insertCapex(id,capexEntity,connectionInfo);
        }
    }
}
