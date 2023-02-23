package com.promigas_storage.entity.operatingFinancial;

import com.promigas_storage.entity.OpportunitiesEntity;
import lombok.Data;

@Data
public class DistributionEntity {

    private int unique_id;
    private OpportunitiesEntity idOportunity;
    private float volumeDistribution;
    private float distriPeriod;
    private float distributionKms;
    private float distributionUsers;
    private float distributionPenetration;

}
