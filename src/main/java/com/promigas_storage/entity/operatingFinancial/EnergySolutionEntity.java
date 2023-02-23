package com.promigas_storage.entity.operatingFinancial;

import com.promigas_storage.entity.OpportunitiesEntity;
import lombok.Data;

@Data
public class EnergySolutionEntity {

    private int unique_id;
    private OpportunitiesEntity idOpportunity;
    private String solEnergyPowerUnit;
    private float solEnergyPowerFigure;
    private float solGenerUnit;
    private String solGenerFigure;
    private String solDegradation;
    private float solEnergyHourSun;
}
