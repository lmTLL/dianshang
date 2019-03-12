package com.best.dianshang.service;

import com.best.dianshang.common.vo.ResultVo;

/**
 * Create with IDEA
 *
 * @ClassName GoodsService
 * @Description TODO
 * @Author TLL
 * @Date: 2019/3/11 22:41
 * @Version 1.0
 */
public interface GoodsService {

    ResultVo queryAllGoods();
    ResultVo queryGoodsById(Integer id);
    ResultVo queryGoodsByLike(String msg);

}
