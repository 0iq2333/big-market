package org.example.domain.strategy.model.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 策略条件实体
 * 1. 用户ID
 * 2. 策略ID
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StrategyConditionEntity {
    /** 用户ID */
    private String userId;
    /** 策略ID */
    private Integer strategyId;

}
