package org.example.domain.strategy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.example.types.common.Constants;

/**
 * @Description 策略实体
 * @Author susu
 * @Date 2025/5/10
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StrategyEntity {

    /* 策略ID */
    private Long strategyId;
    /* 抽奖策略描述 */
    private String strategyDesc;
    /*抽奖规则：rule_blacklist,rule_weight*/
    private String ruleModels;

    public String[] ruleModels() {
        if (StringUtils.isBlank(ruleModels)) {
            return null;
        }
        return ruleModels.split(Constants.SPLIT);
    }

    // 获取权重的策略
    public String getRuleWeight() {
        String[] ruleModels = this.ruleModels();

        for (String ruleModel : ruleModels) {
            if ("rule_weight".equals(ruleModel)) {
                return ruleModel;
            }
        }
        return null;
    }
}
