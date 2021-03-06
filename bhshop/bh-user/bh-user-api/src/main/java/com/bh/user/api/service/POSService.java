package com.bh.user.api.service;


import com.bh.result.BhResult;
import com.bh.user.pojo.MemberShop;
import com.bh.user.pojo.POSParam;
import com.bh.user.pojo.TbPos;
import com.bh.utils.PageBean;

public interface POSService {
	
	BhResult insertPosMsg(POSParam posParam) throws Exception;
	
	//查询pos列表
	//PageBean<MemberShop> selectPosList(POSParam posParam) throws Exception;
	PageBean<TbPos> selectPosList(POSParam posParam) throws Exception;
	
	//更新处理状态
	int updateHandleStatus(POSParam param) throws Exception;
	
	//保证今的记录
	PageBean<MemberShop> promisReco(POSParam param) throws Exception;
	
	//选择memberShop
	MemberShop selectSimpleShop(Integer mId) throws Exception;
	
	//商家免审核上架的列表
	PageBean<MemberShop> depositReco(MemberShop memberShop) throws Exception;
	
	
}
