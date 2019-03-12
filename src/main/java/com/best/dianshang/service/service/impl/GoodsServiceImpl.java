package com.best.dianshang.service.service.impl;

import com.best.dianshang.common.util.ResultUtil;
import com.best.dianshang.common.vo.GoodsVo;
import com.best.dianshang.common.vo.ResultVo;
import com.best.dianshang.dao.GoodsMapper;
import com.best.dianshang.entity.Goods;
import com.best.dianshang.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create with IDEA
 *
 * @ClassName GoodsServiceImpl
 * @Description TODO
 * @Author TLL
 * @Date: 2019/3/11 22:42
 * @Version 1.0
 */
@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    //首页展示所有商品
    @Override
    public ResultVo queryAllGoods() {
        try {
            List<Goods> list = goodsMapper.selectAll();
            return ResultUtil.exec(true,null,list);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultUtil.exec(false,e.getMessage(),null);
        }
    }
//根据商品Id展示商品详情
    @Override
    public ResultVo queryGoodsById(Integer id) {
        try {
            Goods goods = goodsMapper.selectById(id);
            return ResultUtil.exec(true,null,goods);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultUtil.exec(false,e.getMessage(),null);
        }
    }
//模糊查询
    @Override
    public ResultVo queryGoodsByLike(String msg) {
        msg = "%" + msg + "%";
        try {
            List<GoodsVo> list = goodsMapper.selectByLike(msg);
            return ResultUtil.exec(true,null,list);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultUtil.exec(false,e.getMessage(),null);
        }
    }
}
