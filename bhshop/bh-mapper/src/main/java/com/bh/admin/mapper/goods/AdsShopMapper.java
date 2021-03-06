package com.bh.admin.mapper.goods;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bh.admin.pojo.goods.AdsShop;


public interface AdsShopMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AdsShop record);

    int insertSelective(AdsShop record);

    AdsShop selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AdsShop record);

    int updateByPrimaryKeyWithBLOBs(AdsShop record);

    int updateByPrimaryKey(AdsShop record);
    
    
    
    List<AdsShop> pageList(@Param("name")String name, @Param("isPc") String isPc, @Param("shopId")Integer shopId);
    
    //cheng
    List<AdsShop> selectAdsShopByParams(AdsShop adsShop);
}