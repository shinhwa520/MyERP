package com.myerp.service;

import java.util.List;

import com.myerp.service.vo.MsgServiceVO;

public interface MsgService {
	
	static final String MAKA = "MAKA";

	public List<MsgServiceVO> findMakaIds();
}
