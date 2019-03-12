package com.best.dianshang.controller;

import com.best.dianshang.common.vo.ResultVo;
import com.best.dianshang.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create with IDEA
 *
 * @ClassName GoodsContorller
 * @Description TODO
 * @Author TLL
 * @Date: 2019/3/11 22:45
 * @Version 1.0
 */
@RestController
public class GoodsContorller {

    @Autowired
    private GoodsService goodsService;

    /**
     * 首页展示所有的商品图片
     * @return
     */
    @GetMapping("/findAllGoods.do")
    public ResultVo seleltAllGoods(){
        return goodsService.queryAllGoods();
    }

    /**
     *
     *
     * 首页根据展示商品id来查询商品详情
     * @param id
     * @return
     */
    @GetMapping("/findGoodsById.do")
    public ResultVo selectGoodsById(Integer id){
        return goodsService.queryGoodsById(id);
    }

    /**
     *模糊查询  根据商品的名字，类型和详情模糊展示
     * @param msg
     * @return
     */
    @GetMapping("/findByLike.do")
    public ResultVo selectGoodsByLike(String msg){
        return goodsService.queryGoodsByLike(msg);
    }


}
