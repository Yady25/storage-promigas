package com.promigas_storage.entity.FiguresFinancial;

import com.promigas_storage.entity.OpportunitiesEntity;
import lombok.Data;

@Data
public class TirEquityEntity {

    private int unique_id;
    private OpportunitiesEntity idOpportunity;
    private String year;
    private double tirEqFig;
    private String tirEqUnit;
    private String tirEqCapital;
    private String tirEqCost;
    private String tirEqAmortizacion;
}
