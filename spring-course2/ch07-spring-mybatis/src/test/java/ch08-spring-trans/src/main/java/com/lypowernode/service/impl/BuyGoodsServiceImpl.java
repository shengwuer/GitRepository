package com.lypowernode.service.impl;

import com.lypowernode.Exception.NotenoughException;
import com.lypowernode.dao.GoodsDao;
import com.lypowernode.dao.SaleDao;
import com.lypowernode.domain.Goods;
import com.lypowernode.domain.Sale;
import com.lypowernode.service.BuyGoodsService;


public class BuyGoodsServiceImpl implements BuyGoodsService {
    private GoodsDao goodsDao;
    private SaleDao saleDao;

    public void setGoodsDao(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }

    public void setSaleDao(SaleDao saleDao) {
        this.saleDao = saleDao;
    }

    @Override
    public void buy(int goodsId, int nums) {
        Sale sale = new Sale();
        sale.setGid(goodsId);
        sale.setNums(nums);
        saleDao.insertSale(sale);
       // 查询商品
        Goods goods = goodsDao.selectGoods(goodsId);
            if (goods==null){
                throw new NullPointerException("编号是 : "+goodsId+" , 商品库存不存在!");
            }else if (goods.getAmount()<nums){
                throw  new NotenoughException("编号是 : "+goodsId+" , 商品库存不足!!");
            }

        Goods buyGoods = new Goods();
        buyGoods.setId(goodsId);
        buyGoods.setAmount(nums);
        goodsDao.updateGoods(buyGoods);
    }
}
