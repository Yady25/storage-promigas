package com.promigas_storage.entity.FiguresFinancial;

import com.promigas_storage.entity.OpportunitiesEntity;
import lombok.Data;

@Data
public class CapexEntity {

    private int unique_id;
    private OpportunitiesEntity idOpportunity;
    private String year;
    private double capexUsd;
    private double capexCop;
}
