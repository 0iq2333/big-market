package org.example.infrastructure.persistent.dao;


import org.apache.ibatis.annotations.Mapper;
import org.example.infrastructure.persistent.po.StrategyAward;

import java.util.List;

/**
 * 抽奖策略奖品明细配置
 * </p>
 *
 * @author zhangyong
 * @date 2023/10/12
 */
//@Mapper
//public interface IStrategyAwardDao {
//    List<StrategyAward> queryStrategyAwardList();
//    List<StrategyAward> queryStrategyAwardListByStrategyId(Long strategyId);
//
//}
@Mapper
public interface IStrategyAwardDao {

    List<StrategyAward> queryStrategyAwardList();

    List<StrategyAward> queryStrategyAwardListByStrategyId(Long strategyId);

}

