package org.example.domain.strategy.model.entity;

import lombok.Data;

/**
 * @Description 规则物料实体对象，用于过滤规则的必要参数信息
 * @Author susu
 * @Date 2025/5/10
 */
@Data
public class RuleMatterEntity {
    /** 用户ID */
    private String userId;
    /** 策略ID */
    private Long strategyId;
    /** 抽奖奖品ID 【规则类型为策略，则不需要奖品】 */
    private Integer awardId;
    /** 抽奖规则类型 【rule_random - 随机值 、 rule_lcok - 抽奖几次后解锁、rule_luck_award - 幸运奖(兜底奖品)】 */
    private String ruleModel;

}
