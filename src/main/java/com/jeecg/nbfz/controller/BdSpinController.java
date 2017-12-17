package com.jeecg.nbfz.controller;
import com.jeecg.nbfz.entity.BdSpinEntity;
import com.jeecg.nbfz.service.BdSpinServiceI;
import org.apache.commons.collections.CollectionUtils;
import org.apache.log4j.Logger;
import org.jeecgframework.core.beanvalidator.BeanValidators;
import org.jeecgframework.core.common.controller.BaseController;
import org.jeecgframework.core.common.exception.BusinessException;
import org.jeecgframework.core.common.hibernate.qbc.CriteriaQuery;
import org.jeecgframework.core.common.model.json.AjaxJson;
import org.jeecgframework.core.common.model.json.DataGrid;
import org.jeecgframework.core.constant.Globals;
import org.jeecgframework.core.util.ExceptionUtil;
import org.jeecgframework.core.util.MyBeanUtils;
import org.jeecgframework.core.util.ResourceUtil;
import org.jeecgframework.core.util.StringUtil;
import org.jeecgframework.poi.excel.ExcelImportUtil;
import org.jeecgframework.poi.excel.entity.ExportParams;
import org.jeecgframework.poi.excel.entity.ImportParams;
import org.jeecgframework.poi.excel.entity.vo.NormalExcelConstants;
import org.jeecgframework.tag.core.easyui.TagUtil;
import org.jeecgframework.web.system.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.UriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**   
 * @Title: Controller  
 * @Description: bd_spin
 * @author onlineGenerator
 * @date 2017-12-09 15:37:07
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("/bdSpinController")
public class BdSpinController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(BdSpinController.class);

	@Autowired
	private BdSpinServiceI bdSpinService;
	@Autowired
	private SystemService systemService;
	@Autowired
	private Validator validator;


	/**
	 * 多选项卡
	 */
	@RequestMapping(params = "allTabs")
	public ModelAndView tabsDemo(HttpServletRequest request) {
		logger.info("----多选项卡demo转入页面-----");
		return new ModelAndView("com/jeecg/nbfz/aLLbdSpinList");
	}
	/**
	 * bd_spin列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "list")
	public ModelAndView list(HttpServletRequest request) {
			Integer type = Integer.valueOf(request.getParameter("type").toString());
			ModelAndView modelAndView = new ModelAndView("com/jeecg/nbfz/bdSpinList");
			switch (type) {
				case 1:
					modelAndView = new ModelAndView("com/jeecg/nbfz/bdSpinList1");
					break;
				case 2:
					modelAndView = new ModelAndView("com/jeecg/nbfz/bdSpinList2");
					break;
				case 3:
					modelAndView = new ModelAndView("com/jeecg/nbfz/bdSpinList3");
					break;
				case 4:
					modelAndView = new ModelAndView("com/jeecg/nbfz/bdSpinList4");
					break;
				case 5:
					modelAndView = new ModelAndView("com/jeecg/nbfz/bdSpinList5");
					break;
				case 6:
					modelAndView = new ModelAndView("com/jeecg/nbfz/bdSpinList6");
					break;
				case 7:
					modelAndView = new ModelAndView("com/jeecg/nbfz/bdSpinList7");
					break;
				case 8:
					modelAndView = new ModelAndView("com/jeecg/nbfz/bdSpinList8");
					break;
			}
			return modelAndView;
	}

	/**
	 * easyui AJAX请求数据
	 * 
	 * @param request
	 * @param response
	 * @param dataGrid
	 */

	@RequestMapping(params = "datagrid")
	public void datagrid(BdSpinEntity bdSpin,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(BdSpinEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, bdSpin, request.getParameterMap());
		try{
		//自定义追加查询条件
		}catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
		cq.add();
		this.bdSpinService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}
	
	/**
	 * 删除bd_spin
	 * 
	 * @return
	 */
	@RequestMapping(params = "doDel")
	@ResponseBody
	public AjaxJson doDel(BdSpinEntity bdSpin, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		bdSpin = systemService.getEntity(BdSpinEntity.class, bdSpin.getId());
		message = "bd_spin删除成功";
		try{
			bdSpinService.delete(bdSpin);
			systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "bd_spin删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 批量删除bd_spin
	 * 
	 * @return
	 */
	 @RequestMapping(params = "doBatchDel")
	@ResponseBody
	public AjaxJson doBatchDel(String ids,HttpServletRequest request){
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "bd_spin删除成功";
		try{
			for(String id:ids.split(",")){
				BdSpinEntity bdSpin = systemService.getEntity(BdSpinEntity.class, 
				Integer.parseInt(id)
				);
				bdSpinService.delete(bdSpin);
				systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
			}
		}catch(Exception e){
			e.printStackTrace();
			message = "bd_spin删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}


	/**
	 * 添加bd_spin
	 * 
	 * @return
	 */
	@RequestMapping(params = "doAdd")
	@ResponseBody
	public AjaxJson doAdd(BdSpinEntity bdSpin, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "bd_spin添加成功";
		try{
			bdSpinService.save(bdSpin);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "bd_spin添加失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 保存新增/更新的行数据
	 * @param page
	 * @return
	 */
	@RequestMapping(params = "saveRows")
	@ResponseBody
	public AjaxJson saveRows(BdSpinEntity page){
		String message = null;
		List<BdSpinEntity> bdSpinList=page.getBdSpinList();
		AjaxJson j = new AjaxJson();
		if(CollectionUtils.isNotEmpty(bdSpinList)){
			for(BdSpinEntity bdSpin:bdSpinList){
				if (StringUtil.isNotEmpty(bdSpin.getId())) {
					BdSpinEntity t =bdSpinService.get(BdSpinEntity.class, bdSpin.getId());
					try {
						message = "BdSpin例子更新成功";
						MyBeanUtils.copyBeanNotNull2Bean(bdSpin, t);
						bdSpinService.saveOrUpdate(t);
						systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
					} catch (Exception e) {
						e.printStackTrace();
					}
				} else {
					try {
						message = "BdSpin例子添加成功";
						//jeecgDemo.setStatus("0");
						bdSpinService.save(bdSpin);
						systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
				}
			}
		}
		return j;
	}
	
	/**
	 * 更新bd_spin
	 * 
	 * @return
	 */
	@RequestMapping(params = "doUpdate")
	@ResponseBody
	public AjaxJson doUpdate(BdSpinEntity bdSpin, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "bd_spin更新成功";
		BdSpinEntity t = bdSpinService.get(BdSpinEntity.class, bdSpin.getId());
		try {
			MyBeanUtils.copyBeanNotNull2Bean(bdSpin, t);
			bdSpinService.saveOrUpdate(t);
			systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
		} catch (Exception e) {
			e.printStackTrace();
			message = "bd_spin更新失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	

	/**
	 * bd_spin新增页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goAdd")
	public ModelAndView goAdd(BdSpinEntity bdSpin, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(bdSpin.getId())) {
			bdSpin = bdSpinService.getEntity(BdSpinEntity.class, bdSpin.getId());
			req.setAttribute("bdSpinPage", bdSpin);
		}
		return new ModelAndView("com/jeecg/nbfz/bdSpin-add");
	}
	/**
	 * bd_spin编辑页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goUpdate")
	public ModelAndView goUpdate(BdSpinEntity bdSpin, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(bdSpin.getId())) {
			bdSpin = bdSpinService.getEntity(BdSpinEntity.class, bdSpin.getId());
			req.setAttribute("bdSpinPage", bdSpin);
		}
		return new ModelAndView("com/jeecg/nbfz/bdSpin-update");
	}
	
	/**
	 * 导入功能跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "upload")
	public ModelAndView upload(HttpServletRequest req) {
		req.setAttribute("controller_name","bdSpinController");
		return new ModelAndView("common/upload/pub_excel_upload");
	}
	
	/**
	 * 导出excel
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXls")
	public String exportXls(BdSpinEntity bdSpin,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
		CriteriaQuery cq = new CriteriaQuery(BdSpinEntity.class, dataGrid);
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, bdSpin, request.getParameterMap());
		List<BdSpinEntity> bdSpins = this.bdSpinService.getListByCriteriaQuery(cq,false);
		modelMap.put(NormalExcelConstants.FILE_NAME,"bd_spin");
		modelMap.put(NormalExcelConstants.CLASS,BdSpinEntity.class);
		modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("bd_spin列表", "导出人:"+ResourceUtil.getSessionUser().getRealName(),
			"导出信息"));
		modelMap.put(NormalExcelConstants.DATA_LIST,bdSpins);
		return NormalExcelConstants.JEECG_EXCEL_VIEW;
	}
	/**
	 * 导出excel 使模板
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXlsByT")
	public String exportXlsByT(BdSpinEntity bdSpin,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
    	modelMap.put(NormalExcelConstants.FILE_NAME,"bd_spin");
    	modelMap.put(NormalExcelConstants.CLASS,BdSpinEntity.class);
    	modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("bd_spin列表", "导出人:"+ResourceUtil.getSessionUser().getRealName(),
    	"导出信息"));
    	modelMap.put(NormalExcelConstants.DATA_LIST,new ArrayList());
    	return NormalExcelConstants.JEECG_EXCEL_VIEW;
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(params = "importExcel", method = RequestMethod.POST)
	@ResponseBody
	public AjaxJson importExcel(HttpServletRequest request, HttpServletResponse response) {
		AjaxJson j = new AjaxJson();
		
		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		Map<String, MultipartFile> fileMap = multipartRequest.getFileMap();
		for (Map.Entry<String, MultipartFile> entity : fileMap.entrySet()) {
			MultipartFile file = entity.getValue();// 获取上传文件对象
			ImportParams params = new ImportParams();
			params.setTitleRows(2);
			params.setHeadRows(1);
			params.setNeedSave(true);
			try {
				List<BdSpinEntity> listBdSpinEntitys = ExcelImportUtil.importExcel(file.getInputStream(),BdSpinEntity.class,params);
				for (BdSpinEntity bdSpin : listBdSpinEntitys) {
					bdSpinService.save(bdSpin);
				}
				j.setMsg("文件导入成功！");
			} catch (Exception e) {
				j.setMsg("文件导入失败！");
				logger.error(ExceptionUtil.getExceptionMessage(e));
			}finally{
				try {
					file.getInputStream().close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return j;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<BdSpinEntity> list() {
		List<BdSpinEntity> listBdSpins=bdSpinService.getList(BdSpinEntity.class);
		return listBdSpins;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> get(@PathVariable("id") String id) {
		BdSpinEntity task = bdSpinService.get(BdSpinEntity.class, id);
		if (task == null) {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(task, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<?> create(@RequestBody BdSpinEntity bdSpin, UriComponentsBuilder uriBuilder) {
		//调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<BdSpinEntity>> failures = validator.validate(bdSpin);
		if (!failures.isEmpty()) {
			return new ResponseEntity(BeanValidators.extractPropertyAndMessage(failures), HttpStatus.BAD_REQUEST);
		}

		//保存
		try{
			bdSpinService.save(bdSpin);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		//按照Restful风格约定，创建指向新任务的url, 也可以直接返回id或对象.
		String id = bdSpin.getId().toString();
		URI uri = uriBuilder.path("/rest/bdSpinController/" + id).build().toUri();
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(uri);

		return new ResponseEntity(headers, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> update(@RequestBody BdSpinEntity bdSpin) {
		//调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<BdSpinEntity>> failures = validator.validate(bdSpin);
		if (!failures.isEmpty()) {
			return new ResponseEntity(BeanValidators.extractPropertyAndMessage(failures), HttpStatus.BAD_REQUEST);
		}

		//保存
		try{
			bdSpinService.saveOrUpdate(bdSpin);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}

		//按Restful约定，返回204状态码, 无内容. 也可以返回200状态码.
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable("id") String id) {
		bdSpinService.deleteEntityById(BdSpinEntity.class, id);
	}
}
