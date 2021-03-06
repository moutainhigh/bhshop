package com.bh.goods.mapper;

import java.util.List;

import com.bh.goods.pojo.MemberUserAccessLog;

public interface MemberUserAccessLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MemberUserAccessLog record);

    int insertSelective(MemberUserAccessLog record);

    MemberUserAccessLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MemberUserAccessLog record);

    int updateByPrimaryKey(MemberUserAccessLog record);
    
    
    
    List<MemberUserAccessLog> getListBymId(Integer mId);

    //cheng
    List<MemberUserAccessLog> selectHistoryList(MemberUserAccessLog recore);

    List<MemberUserAccessLog> getBymIdAndGoodsId(Integer mId, Integer goodsId);

}