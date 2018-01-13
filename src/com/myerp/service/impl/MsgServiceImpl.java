package com.myerp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myerp.dao.WebApiMasterDAO;
import com.myerp.service.MsgService;
import com.myerp.service.vo.MsgServiceVO;

@Service("msgService")
@Transactional
public class MsgServiceImpl implements MsgService {

	private WebApiMasterDAO webApiMasterDAO;
	
	@Override
	public List<MsgServiceVO> findMakaIds() {
		try {
			List<Object[]> objList = webApiMasterDAO.findWebApiMasterAndDetailByWebName(MsgService.MAKA);
			
			for (Object[] objs : objList) {
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Autowired
	public void setWebApiMasterDAO(WebApiMasterDAO webApiMasterDAO) {
		this.webApiMasterDAO = webApiMasterDAO;
	}
}
