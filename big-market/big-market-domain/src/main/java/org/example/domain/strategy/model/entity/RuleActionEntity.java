package org.example.domain.strategy.model.entity;

import lombok.*;
import org.example.domain.strategy.model.valobj.RuleLogicCheckTypeVO;

/**
 * @Description 规则动作实体类
 * @Author susu
 * @Date 2025/5/10
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RuleActionEntity<T extends RuleActionEntity.RaffleEntity> {

    private String code = RuleLogicCheckTypeVO.ALLOW.getCode();
    private String info = RuleLogicCheckTypeVO.ALLOW.getInfo();

    /**  过滤的是哪个规则 */
    private String ruleModel;

    /** 返回的是哪个值*/
    private T data;

    static public class RaffleEntity {


    }

    /** 抽奖前动作 */
    @EqualsAndHashCode(callSuper = true)
    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    static public class RaffleBeforeEntity extends RaffleEntity {
        /** 策略ID */
        private Long strategyId;
        /** 权重值key: 抽奖时可以选择权重抽奖 */
        private String ruleWeightValueKey;
        /** 奖品ID */
        private Integer awardId;
    }

    /** 抽奖中动作 */
    static public class RaffleCenterEntity extends RaffleEntity {

    }

    /** 抽奖后动作 */
    static public class RaffleAfterEntity extends RaffleEntity {

    }
}
