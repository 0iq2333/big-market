package org.example.domain.strategy.service.rule;

import org.example.domain.strategy.model.entity.RuleActionEntity;
import org.example.domain.strategy.model.entity.RuleMatterEntity;

/**
 * @Description 抽奖规则过滤接口
 * @Author susu
 * @Date 2025/5/10
 */
public interface ILogicFilter<T extends RuleActionEntity.RaffleEntity> {

    RuleActionEntity<T> filter(RuleMatterEntity ruleMatterEntity);
}
