package com.best.dianshang.dao;

import com.best.dianshang.common.vo.GoodsVo;
import com.best.dianshang.entity.Goods;

import java.util.List;

public interface GoodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Goods record);

    int insertSelective(Goods record);

    //根据id展示商品详情
    Goods selectById(Integer id);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);

    //首页展示所有商品
    List<Goods> selectAll();

    //模糊查询
    List<GoodsVo> selectByLike(String msg);
}