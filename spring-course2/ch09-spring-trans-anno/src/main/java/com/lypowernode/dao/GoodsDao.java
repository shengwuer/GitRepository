package com.lypowernode.dao;

import com.lypowernode.domain.Goods;

public interface GoodsDao {
     int updateGoods(Goods goods);
     Goods selectGoods(int id);
}
