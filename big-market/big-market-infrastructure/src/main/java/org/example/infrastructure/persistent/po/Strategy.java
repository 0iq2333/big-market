package org.example.infrastructure.persistent.po;


import lombok.Data;

/**
 * 抽奖策略
 */
@Data
public class Strategy {
    /* 主键ID */
    private Long id;
    /* 策略ID */
    private Long strategy_id;
    /* 抽奖策略描述 */
    private String strategy_desc;
    /* 规则模型，rule配置的模型同步到此表，便于使用 */
    private String rule_models;
    /* 创建时间 */
    private Data create_time;
    /* 更新时间 */
    private Data update_time;
}
