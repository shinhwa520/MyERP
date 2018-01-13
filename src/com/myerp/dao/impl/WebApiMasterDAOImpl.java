package com.myerp.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.myerp.dao.WebApiMasterDAO;

@Repository
@Transactional
public class WebApiMasterDAOImpl extends BaseDaoHibernate implements WebApiMasterDAO {

	@Override
	public List<Object[]> findWebApiMasterAndDetailByWebName(String webName) {
		StringBuffer sb = new StringBuffer();
		sb.append(" select wam, wad from WebApiMaster wam, WebApiDetail wad ")
		  .append(" where 1=1 ")
		  .append(" and wam.apiMasterId = wad.apiMasterId ")
		  .append(" and wam.webName = ? ");
		
		List<Object[]> returnList = (List<Object[]>)getHibernateTemplate().find(sb.toString(), new String[] {webName});
		return returnList;
	}

}
