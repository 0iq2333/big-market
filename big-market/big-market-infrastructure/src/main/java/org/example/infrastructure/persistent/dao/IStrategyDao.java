package org.example.infrastructure.persistent.dao;


import org.apache.ibatis.annotations.Mapper;
import org.example.domain.strategy.model.entity.StrategyEntity;
import org.example.infrastructure.persistent.po.Strategy;

import java.util.List;

/**
 * 策略表DAO
 */
@Mapper
public interface IStrategyDao {
    List<Strategy> queryStrategyList();

//    Strategy queryStrategyEntityByStrategyId(Long strategyId);

    Strategy queryStrategyByStrategyId(Long strategyId);
}
