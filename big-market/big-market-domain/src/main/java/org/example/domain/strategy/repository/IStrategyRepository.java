package org.example.domain.strategy.repository;

import org.example.domain.strategy.model.entity.StrategyAwardEntity;

import java.util.List;
import java.util.Map;

/**
 * 策略长处接口
 */
//public interface IStrategyRepository {
//
//    List<StrategyAwardEntity> queryStrategyAwardList(Long strategyId);
//
//
//    void storeStrategyAwardSearchRateTable(Long strategyId, Integer rateRange, Map<Integer, Integer> strategyAwardSearchRateTable);
//
//    int getRateRange(Long strategyId);
//
//    Integer getStrategyAwardAssemble(Long strategyId, Integer rateKey);
//}
public interface IStrategyRepository {

    List<StrategyAwardEntity> queryStrategyAwardList(Long strategyId);

    void storeStrategyAwardSearchRateTable(Long strategyId, Integer rateRange, Map<Integer, Integer> strategyAwardSearchRateTable);

    Integer getStrategyAwardAssemble(Long strategyId, Integer rateKey);

    int getRateRange(Long strategyId);

}
