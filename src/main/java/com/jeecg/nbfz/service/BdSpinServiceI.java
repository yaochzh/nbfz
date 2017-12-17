package com.jeecg.nbfz.service;
import com.jeecg.nbfz.entity.BdSpinEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface BdSpinServiceI extends CommonService{
	
 	public void delete(BdSpinEntity entity) throws Exception;
 	
 	public Serializable save(BdSpinEntity entity) throws Exception;
 	
 	public void saveOrUpdate(BdSpinEntity entity) throws Exception;
 	
}
