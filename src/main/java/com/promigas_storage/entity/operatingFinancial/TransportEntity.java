package com.promigas_storage.entity.operatingFinancial;

import com.promigas_storage.entity.OpportunitiesEntity;
import lombok.Data;

@Data
public class TransportEntity {

    private int unique_id;
    private OpportunitiesEntity idoportunity;
    private Float transportCapacityMax;
    private Float TransportCapacityHired;
    private Float TransportVolumen;
    private Float TransportLengthpipeline;

}
