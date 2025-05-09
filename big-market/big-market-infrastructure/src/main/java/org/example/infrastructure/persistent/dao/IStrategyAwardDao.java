package org.example.infrastructure.persistent.dao;


import org.apache.ibatis.annotations.Mapper;
import org.example.infrastructure.persistent.po.Award;
import org.example.infrastructure.persistent.po.StrategyAward;

import java.util.List;

/**
 * 策略奖品表DAO
 * </p>
 *
 * @author zhangyong
 * @date 2023/10/12
 */
@Mapper
public interface IStrategyAwardDao {
    List<StrategyAward> queryStrateAwardList();
}
