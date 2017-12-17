<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>bd_spin</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
		<t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="bdSpinController.do?doUpdate" >
					<input id="id" name="id" type="hidden" value="${bdSpinPage.id }"/>
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
					<tr>
						<td align="right">
							<label class="Validform_label">
								创建人名称:
							</label>
						</td>
						<td class="value">
						     	 <input id="createName" name="createName" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.createName}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">创建人名称</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								创建人登录名称:
							</label>
						</td>
						<td class="value">
						     	 <input id="createBy" name="createBy" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.createBy}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">创建人登录名称</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								创建日期:
							</label>
						</td>
						<td class="value">
									  <input id="createDate" name="createDate" type="text" style="width: 150px"  class="Wdate" onClick="WdatePicker()"  ignore="ignore" value='<fmt:formatDate value='${bdSpinPage.createDate}' type="date" pattern="yyyy-MM-dd"/>'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">创建日期</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								更新人名称:
							</label>
						</td>
						<td class="value">
						     	 <input id="updateName" name="updateName" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.updateName}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">更新人名称</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								更新人登录名称:
							</label>
						</td>
						<td class="value">
						     	 <input id="updateBy" name="updateBy" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.updateBy}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">更新人登录名称</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								更新日期:
							</label>
						</td>
						<td class="value">
									  <input id="updateDate" name="updateDate" type="text" style="width: 150px"  class="Wdate" onClick="WdatePicker()"  ignore="ignore" value='<fmt:formatDate value='${bdSpinPage.updateDate}' type="date" pattern="yyyy-MM-dd"/>'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">更新日期</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								所属部门:
							</label>
						</td>
						<td class="value">
						     	 <input id="sysOrgCode" name="sysOrgCode" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.sysOrgCode}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">所属部门</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								所属公司:
							</label>
						</td>
						<td class="value">
						     	 <input id="sysCompanyCode" name="sysCompanyCode" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.sysCompanyCode}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">所属公司</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								流程状态:
							</label>
						</td>
						<td class="value">
						     	 <input id="bpmStatus" name="bpmStatus" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.bpmStatus}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">流程状态</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								报价日期:
							</label>
						</td>
						<td class="value">
									  <input id="spinaa" name="spinaa" type="text" style="width: 150px"  class="Wdate" onClick="WdatePicker()"  datatype="*"  ignore="checked" value='<fmt:formatDate value='${bdSpinPage.spinaa}' type="date" pattern="yyyy-MM-dd"/>'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">报价日期</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								客户编号:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinab" name="spinab" type="text" style="width: 150px" class="inputxt"  datatype="*"  ignore="checked"  value='${bdSpinPage.spinab}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">客户编号</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								订单序号:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinac" name="spinac" type="text" style="width: 150px" class="inputxt"  datatype="*"  ignore="checked"  value='${bdSpinPage.spinac}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">订单序号</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								款号:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinad" name="spinad" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinad}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">款号</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								款式名:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinae" name="spinae" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinae}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">款式名</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								订单件数:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinaf" name="spinaf" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinaf}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">订单件数</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								A1:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinag" name="spinag" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinag}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">A1</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								A2:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinah" name="spinah" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinah}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">A2</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								B1:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinai" name="spinai" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinai}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">B1</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								B2:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinaj" name="spinaj" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinaj}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">B2</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								C:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinak" name="spinak" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinak}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">C</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								其他:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinal" name="spinal" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinal}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">其他</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								辅料:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinam" name="spinam" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinam}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">辅料</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								包装:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinan" name="spinan" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinan}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">包装</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								印花:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinao" name="spinao" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinao}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">印花</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								绣花:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinap" name="spinap" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinap}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">绣花</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								其他:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinaq" name="spinaq" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinaq}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">其他</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								成本合计:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinar" name="spinar" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinar}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">成本合计</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								本区域工价:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinas" name="spinas" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinas}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">本区域工价</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								区域系数:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinat" name="spinat" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinat}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">区域系数</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								工厂系数:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinau" name="spinau" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinau}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">工厂系数</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								系数工价:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinav" name="spinav" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinav}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">系数工价</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								利税:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinaw" name="spinaw" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinaw}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">利税</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								总价:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinax" name="spinax" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinax}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">总价</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								总差价:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinay" name="spinay" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinay}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">总差价</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								税后差价:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinaz" name="spinaz" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinaz}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">税后差价</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								税后毛利:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinaaa" name="spinaaa" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinaaa}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">税后毛利</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								利息:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinaab" name="spinaab" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinaab}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">利息</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								税后利率:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinaac" name="spinaac" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinaac}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">税后利率</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								工厂系数:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinaad" name="spinaad" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinaad}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">工厂系数</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								系数工价:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinaae" name="spinaae" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinaae}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">系数工价</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								利税:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinaaf" name="spinaaf" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinaaf}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">利税</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								总价:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinaag" name="spinaag" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinaag}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">总价</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								总差价:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinaah" name="spinaah" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinaah}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">总差价</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								税后差价:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinaai" name="spinaai" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinaai}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">税后差价</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								税后毛利:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinaaj" name="spinaaj" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinaaj}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">税后毛利</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								利息:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinaak" name="spinaak" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinaak}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">利息</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								税后利率:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinaal" name="spinaal" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinaal}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">税后利率</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								基本工价:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinaam" name="spinaam" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinaam}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">基本工价</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								工厂系数:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinaan" name="spinaan" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinaan}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">工厂系数</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								系数工价:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinaao" name="spinaao" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinaao}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">系数工价</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								利税:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinaap" name="spinaap" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinaap}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">利税</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								总价:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinaaq" name="spinaaq" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinaaq}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">总价</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								总差价:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinaar" name="spinaar" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinaar}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">总差价</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								税后差价:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinaas" name="spinaas" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinaas}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">税后差价</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								税后毛利:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinaat" name="spinaat" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinaat}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">税后毛利</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								利息:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinaau" name="spinaau" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinaau}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">利息</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								税后利率:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinaav" name="spinaav" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinaav}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">税后利率</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								折汇率:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinaaw" name="spinaaw" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinaaw}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">折汇率</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								11:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinaax" name="spinaax" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinaax}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">11</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								12:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinaay" name="spinaay" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinaay}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">12</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								13:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinaaz" name="spinaaz" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinaaz}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">13</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								日期:
							</label>
						</td>
						<td class="value">
									  <input id="spinaba" name="spinaba" type="text" style="width: 150px"  class="Wdate" onClick="WdatePicker()"  ignore="ignore" value='<fmt:formatDate value='${bdSpinPage.spinaba}' type="date" pattern="yyyy-MM-dd"/>'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">日期</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								11:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinabb" name="spinabb" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinabb}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">11</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								修正:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinabc" name="spinabc" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinabc}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">修正</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								备注:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinabd" name="spinabd" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinabd}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">备注</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								克重:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinbe" name="spinbe" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinbe}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">克重</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								用料M2:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinbf" name="spinbf" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinbf}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">用料M2</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								损率:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinbg" name="spinbg" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinbg}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">损率</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								KG:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinbh" name="spinbh" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinbh}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">KG</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								单价:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinbi" name="spinbi" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinbi}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">单价</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								金额:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinbj" name="spinbj" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinbj}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">金额</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								克重:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinbk" name="spinbk" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinbk}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">克重</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								用料M2:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinbl" name="spinbl" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinbl}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">用料M2</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								损率:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinbm" name="spinbm" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinbm}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">损率</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								KG:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinbn" name="spinbn" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinbn}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">KG</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								单价:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinbo" name="spinbo" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinbo}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">单价</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								金额:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinbp" name="spinbp" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinbp}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">金额</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								克重:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinbq" name="spinbq" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinbq}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">克重</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								用料M2:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinbr" name="spinbr" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinbr}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">用料M2</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								损率:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinbs" name="spinbs" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinbs}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">损率</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								KG:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinbt" name="spinbt" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinbt}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">KG</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								单价:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinbu" name="spinbu" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinbu}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">单价</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								金额:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinbv" name="spinbv" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinbv}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">金额</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								克重:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinbw" name="spinbw" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinbw}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">克重</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								用料M2:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinbx" name="spinbx" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinbx}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">用料M2</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								损率:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinby" name="spinby" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinby}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">损率</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								KG:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinbz" name="spinbz" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinbz}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">KG</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								单价:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinbaa" name="spinbaa" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinbaa}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">单价</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								金额:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinbab" name="spinbab" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinbab}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">金额</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								克重:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinbac" name="spinbac" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinbac}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">克重</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								用料M2:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinbad" name="spinbad" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinbad}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">用料M2</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								损率:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinbae" name="spinbae" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinbae}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">损率</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								KG:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinbaf" name="spinbaf" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinbaf}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">KG</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								单价:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinbag" name="spinbag" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinbag}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">单价</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								金额:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinbah" name="spinbah" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinbah}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">金额</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								备注:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinbai" name="spinbai" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinbai}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">备注</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								尺码选:
							</label>
						</td>
						<td class="value">
						     	 <input id="spince" name="spince" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spince}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">尺码选</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								衣长:
							</label>
						</td>
						<td class="value">
						     	 <input id="spincf" name="spincf" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spincf}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">衣长</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								减:
							</label>
						</td>
						<td class="value">
						     	 <input id="spincg" name="spincg" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spincg}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">减</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								胸围:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinch" name="spinch" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinch}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">胸围</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								数量:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinci" name="spinci" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinci}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">数量</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								M2:
							</label>
						</td>
						<td class="value">
						     	 <input id="spincj" name="spincj" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spincj}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">M2</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								袖长:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinck" name="spinck" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinck}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">袖长</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								减:
							</label>
						</td>
						<td class="value">
						     	 <input id="spincl" name="spincl" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spincl}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">减</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								袖肥:
							</label>
						</td>
						<td class="value">
						     	 <input id="spincm" name="spincm" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spincm}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">袖肥</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								数量:
							</label>
						</td>
						<td class="value">
						     	 <input id="spincn" name="spincn" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spincn}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">数量</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								M2:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinco" name="spinco" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinco}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">M2</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								帽长:
							</label>
						</td>
						<td class="value">
						     	 <input id="spincp" name="spincp" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spincp}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">帽长</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								帽宽:
							</label>
						</td>
						<td class="value">
						     	 <input id="spincq" name="spincq" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spincq}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">帽宽</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								数量:
							</label>
						</td>
						<td class="value">
						     	 <input id="spincr" name="spincr" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spincr}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">数量</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								M2:
							</label>
						</td>
						<td class="value">
						     	 <input id="spincs" name="spincs" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spincs}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">M2</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								领宽:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinct" name="spinct" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinct}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">领宽</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								领高:
							</label>
						</td>
						<td class="value">
						     	 <input id="spincu" name="spincu" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spincu}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">领高</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								数量:
							</label>
						</td>
						<td class="value">
						     	 <input id="spincv" name="spincv" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spincv}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">数量</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								M2:
							</label>
						</td>
						<td class="value">
						     	 <input id="spincw" name="spincw" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spincw}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">M2</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								襟长:
							</label>
						</td>
						<td class="value">
						     	 <input id="spincx" name="spincx" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spincx}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">襟长</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								襟宽:
							</label>
						</td>
						<td class="value">
						     	 <input id="spincy" name="spincy" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spincy}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">襟宽</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								数量:
							</label>
						</td>
						<td class="value">
						     	 <input id="spincz" name="spincz" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spincz}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">数量</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								M2:
							</label>
						</td>
						<td class="value">
						     	 <input id="spincaa" name="spincaa" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spincaa}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">M2</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								袋长:
							</label>
						</td>
						<td class="value">
						     	 <input id="spincab" name="spincab" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spincab}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">袋长</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								袋宽:
							</label>
						</td>
						<td class="value">
						     	 <input id="spincac" name="spincac" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spincac}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">袋宽</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								数量:
							</label>
						</td>
						<td class="value">
						     	 <input id="spincad" name="spincad" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spincad}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">数量</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								M2:
							</label>
						</td>
						<td class="value">
						     	 <input id="spincae" name="spincae" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spincae}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">M2</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								长:
							</label>
						</td>
						<td class="value">
						     	 <input id="spincaf" name="spincaf" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spincaf}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">长</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								宽:
							</label>
						</td>
						<td class="value">
						     	 <input id="spincag" name="spincag" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spincag}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">宽</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								数量:
							</label>
						</td>
						<td class="value">
						     	 <input id="spincah" name="spincah" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spincah}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">数量</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								M2:
							</label>
						</td>
						<td class="value">
						     	 <input id="spincai" name="spincai" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spincai}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">M2</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								裤长:
							</label>
						</td>
						<td class="value">
						     	 <input id="spincaj" name="spincaj" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spincaj}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">裤长</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								减:
							</label>
						</td>
						<td class="value">
						     	 <input id="spincak" name="spincak" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spincak}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">减</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								脾围:
							</label>
						</td>
						<td class="value">
						     	 <input id="spincal" name="spincal" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spincal}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">脾围</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								数量:
							</label>
						</td>
						<td class="value">
						     	 <input id="spincam" name="spincam" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spincam}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">数量</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								M2:
							</label>
						</td>
						<td class="value">
						     	 <input id="spincan" name="spincan" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spincan}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">M2</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								加误率:
							</label>
						</td>
						<td class="value">
						     	 <input id="spincao" name="spincao" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spincao}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">加误率</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								直:
							</label>
						</td>
						<td class="value">
						     	 <input id="spincap" name="spincap" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spincap}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">直</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								横:
							</label>
						</td>
						<td class="value">
						     	 <input id="spincaq" name="spincaq" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spincaq}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">横</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								合:
							</label>
						</td>
						<td class="value">
						     	 <input id="spincar" name="spincar" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spincar}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">合</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								合计M2:
							</label>
						</td>
						<td class="value">
						     	 <input id="spincas" name="spincas" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spincas}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">合计M2</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								备注:
							</label>
						</td>
						<td class="value">
						     	 <input id="spincat" name="spincat" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spincat}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">备注</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								衣长:
							</label>
						</td>
						<td class="value">
						     	 <input id="spindf" name="spindf" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spindf}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">衣长</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								减:
							</label>
						</td>
						<td class="value">
						     	 <input id="spindg" name="spindg" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spindg}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">减</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								胸围:
							</label>
						</td>
						<td class="value">
						     	 <input id="spindh" name="spindh" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spindh}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">胸围</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								数量:
							</label>
						</td>
						<td class="value">
						     	 <input id="spindi" name="spindi" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spindi}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">数量</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								M2:
							</label>
						</td>
						<td class="value">
						     	 <input id="spindj" name="spindj" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spindj}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">M2</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								袖长:
							</label>
						</td>
						<td class="value">
						     	 <input id="spindk" name="spindk" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spindk}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">袖长</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								减:
							</label>
						</td>
						<td class="value">
						     	 <input id="spindl" name="spindl" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spindl}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">减</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								袖肥:
							</label>
						</td>
						<td class="value">
						     	 <input id="spindm" name="spindm" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spindm}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">袖肥</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								数量:
							</label>
						</td>
						<td class="value">
						     	 <input id="spindn" name="spindn" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spindn}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">数量</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								M2:
							</label>
						</td>
						<td class="value">
						     	 <input id="spindo" name="spindo" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spindo}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">M2</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								帽长:
							</label>
						</td>
						<td class="value">
						     	 <input id="spindp" name="spindp" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spindp}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">帽长</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								帽宽:
							</label>
						</td>
						<td class="value">
						     	 <input id="spindq" name="spindq" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spindq}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">帽宽</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								数量:
							</label>
						</td>
						<td class="value">
						     	 <input id="spindr" name="spindr" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spindr}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">数量</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								M2:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinds" name="spinds" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinds}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">M2</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								领宽:
							</label>
						</td>
						<td class="value">
						     	 <input id="spindt" name="spindt" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spindt}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">领宽</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								领高:
							</label>
						</td>
						<td class="value">
						     	 <input id="spindu" name="spindu" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spindu}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">领高</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								数量:
							</label>
						</td>
						<td class="value">
						     	 <input id="spindv" name="spindv" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spindv}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">数量</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								M2:
							</label>
						</td>
						<td class="value">
						     	 <input id="spindw" name="spindw" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spindw}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">M2</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								加误率:
							</label>
						</td>
						<td class="value">
						     	 <input id="spindx" name="spindx" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spindx}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">加误率</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								直:
							</label>
						</td>
						<td class="value">
						     	 <input id="spindy" name="spindy" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spindy}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">直</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								横:
							</label>
						</td>
						<td class="value">
						     	 <input id="spindz" name="spindz" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spindz}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">横</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								合计:
							</label>
						</td>
						<td class="value">
						     	 <input id="spindaa" name="spindaa" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spindaa}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">合计</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								合计M2:
							</label>
						</td>
						<td class="value">
						     	 <input id="spindab" name="spindab" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spindab}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">合计M2</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								备注:
							</label>
						</td>
						<td class="value">
						     	 <input id="spindac" name="spindac" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spindac}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">备注</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								衣长:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinef" name="spinef" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinef}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">衣长</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								减:
							</label>
						</td>
						<td class="value">
						     	 <input id="spineg" name="spineg" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spineg}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">减</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								胸围:
							</label>
						</td>
						<td class="value">
						     	 <input id="spineh" name="spineh" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spineh}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">胸围</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								数量:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinei" name="spinei" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinei}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">数量</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								M2:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinej" name="spinej" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinej}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">M2</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								袖长:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinek" name="spinek" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinek}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">袖长</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								减:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinel" name="spinel" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinel}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">减</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								袖肥:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinem" name="spinem" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinem}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">袖肥</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								数量:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinen" name="spinen" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinen}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">数量</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								M2:
							</label>
						</td>
						<td class="value">
						     	 <input id="spineo" name="spineo" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spineo}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">M2</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								帽长:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinep" name="spinep" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinep}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">帽长</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								帽宽:
							</label>
						</td>
						<td class="value">
						     	 <input id="spineq" name="spineq" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spineq}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">帽宽</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								数量:
							</label>
						</td>
						<td class="value">
						     	 <input id="spiner" name="spiner" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spiner}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">数量</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								M2:
							</label>
						</td>
						<td class="value">
						     	 <input id="spines" name="spines" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spines}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">M2</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								领宽:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinet" name="spinet" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinet}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">领宽</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								领高:
							</label>
						</td>
						<td class="value">
						     	 <input id="spineu" name="spineu" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spineu}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">领高</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								数量:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinev" name="spinev" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinev}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">数量</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								M2:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinew" name="spinew" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinew}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">M2</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								襟长:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinex" name="spinex" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinex}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">襟长</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								襟宽:
							</label>
						</td>
						<td class="value">
						     	 <input id="spiney" name="spiney" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spiney}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">襟宽</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								数量:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinez" name="spinez" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinez}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">数量</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								M2:
							</label>
						</td>
						<td class="value">
						     	 <input id="spineaa" name="spineaa" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spineaa}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">M2</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								袋长:
							</label>
						</td>
						<td class="value">
						     	 <input id="spineab" name="spineab" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spineab}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">袋长</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								袋宽:
							</label>
						</td>
						<td class="value">
						     	 <input id="spineac" name="spineac" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spineac}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">袋宽</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								数量:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinead" name="spinead" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinead}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">数量</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								M2:
							</label>
						</td>
						<td class="value">
						     	 <input id="spineae" name="spineae" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spineae}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">M2</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								长:
							</label>
						</td>
						<td class="value">
						     	 <input id="spineaf" name="spineaf" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spineaf}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">长</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								宽:
							</label>
						</td>
						<td class="value">
						     	 <input id="spineag" name="spineag" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spineag}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">宽</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								数量:
							</label>
						</td>
						<td class="value">
						     	 <input id="spineah" name="spineah" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spineah}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">数量</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								M2:
							</label>
						</td>
						<td class="value">
						     	 <input id="spineai" name="spineai" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spineai}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">M2</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								裤长:
							</label>
						</td>
						<td class="value">
						     	 <input id="spineaj" name="spineaj" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spineaj}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">裤长</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								减:
							</label>
						</td>
						<td class="value">
						     	 <input id="spineak" name="spineak" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spineak}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">减</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								脾围:
							</label>
						</td>
						<td class="value">
						     	 <input id="spineal" name="spineal" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spineal}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">脾围</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								数量:
							</label>
						</td>
						<td class="value">
						     	 <input id="spineam" name="spineam" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spineam}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">数量</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								M2:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinean" name="spinean" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinean}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">M2</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								加误率:
							</label>
						</td>
						<td class="value">
						     	 <input id="spineao" name="spineao" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spineao}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">加误率</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								直:
							</label>
						</td>
						<td class="value">
						     	 <input id="spineap" name="spineap" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spineap}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">直</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								横:
							</label>
						</td>
						<td class="value">
						     	 <input id="spineaq" name="spineaq" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spineaq}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">横</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								合计:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinear" name="spinear" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinear}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">合计</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								合计M2:
							</label>
						</td>
						<td class="value">
						     	 <input id="spineas" name="spineas" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spineas}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">合计M2</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								备注:
							</label>
						</td>
						<td class="value">
						     	 <input id="spineat" name="spineat" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spineat}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">备注</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								衣长:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinff" name="spinff" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinff}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">衣长</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								减:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinfg" name="spinfg" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinfg}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">减</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								胸围:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinfh" name="spinfh" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinfh}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">胸围</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								数量:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinfi" name="spinfi" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinfi}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">数量</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								M2:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinfj" name="spinfj" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinfj}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">M2</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								袖长:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinfk" name="spinfk" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinfk}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">袖长</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								减:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinfl" name="spinfl" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinfl}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">减</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								袖肥:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinfm" name="spinfm" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinfm}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">袖肥</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								数量:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinfn" name="spinfn" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinfn}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">数量</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								M2:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinfo" name="spinfo" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinfo}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">M2</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								帽长:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinfp" name="spinfp" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinfp}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">帽长</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								帽宽:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinfq" name="spinfq" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinfq}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">帽宽</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								数量:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinfr" name="spinfr" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinfr}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">数量</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								M2:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinfs" name="spinfs" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinfs}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">M2</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								领宽:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinft" name="spinft" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinft}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">领宽</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								领高:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinfu" name="spinfu" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinfu}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">领高</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								数量:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinfv" name="spinfv" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinfv}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">数量</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								M2:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinfw" name="spinfw" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinfw}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">M2</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								加误率:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinfx" name="spinfx" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinfx}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">加误率</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								直:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinfy" name="spinfy" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinfy}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">直</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								横:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinfz" name="spinfz" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinfz}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">横</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								合计:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinfaa" name="spinfaa" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinfaa}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">合计</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								合计M2:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinfab" name="spinfab" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinfab}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">合计M2</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								备注:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinfac" name="spinfac" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinfac}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">备注</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								领宽:
							</label>
						</td>
						<td class="value">
						     	 <input id="spingf" name="spingf" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spingf}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">领宽</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								领高:
							</label>
						</td>
						<td class="value">
						     	 <input id="spingg" name="spingg" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spingg}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">领高</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								数量:
							</label>
						</td>
						<td class="value">
						     	 <input id="spingh" name="spingh" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spingh}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">数量</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								M2:
							</label>
						</td>
						<td class="value">
						     	 <input id="spingi" name="spingi" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spingi}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">M2</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								12宽:
							</label>
						</td>
						<td class="value">
						     	 <input id="spingj" name="spingj" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spingj}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">12宽</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								高:
							</label>
						</td>
						<td class="value">
						     	 <input id="spingk" name="spingk" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spingk}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">高</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								数量:
							</label>
						</td>
						<td class="value">
						     	 <input id="spingl" name="spingl" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spingl}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">数量</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								M2:
							</label>
						</td>
						<td class="value">
						     	 <input id="spingm" name="spingm" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spingm}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">M2</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								12宽:
							</label>
						</td>
						<td class="value">
						     	 <input id="spingn" name="spingn" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spingn}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">12宽</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								高:
							</label>
						</td>
						<td class="value">
						     	 <input id="spingo" name="spingo" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spingo}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">高</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								数量:
							</label>
						</td>
						<td class="value">
						     	 <input id="spingp" name="spingp" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spingp}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">数量</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								M2:
							</label>
						</td>
						<td class="value">
						     	 <input id="spingq" name="spingq" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spingq}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">M2</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								加误率:
							</label>
						</td>
						<td class="value">
						     	 <input id="spingr" name="spingr" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spingr}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">加误率</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								直:
							</label>
						</td>
						<td class="value">
						     	 <input id="spings" name="spings" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spings}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">直</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								横:
							</label>
						</td>
						<td class="value">
						     	 <input id="spingt" name="spingt" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spingt}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">横</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								合计:
							</label>
						</td>
						<td class="value">
						     	 <input id="spingu" name="spingu" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spingu}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">合计</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								合计M2:
							</label>
						</td>
						<td class="value">
						     	 <input id="spingv" name="spingv" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spingv}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">合计M2</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								备注:
							</label>
						</td>
						<td class="value">
						     	 <input id="spingw" name="spingw" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spingw}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">备注</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								订单数件:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinhe" name="spinhe" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinhe}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">订单数件</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								三标:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinhf" name="spinhf" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinhf}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">三标</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								装饰:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinhg" name="spinhg" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinhg}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">装饰</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								缝线:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinhh" name="spinhh" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinhh}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">缝线</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								绳带:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinhi" name="spinhi" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinhi}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">绳带</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								贴条:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinhj" name="spinhj" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinhj}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">贴条</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								金属:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinhk" name="spinhk" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinhk}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">金属</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								树脂:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinhl" name="spinhl" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinhl}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">树脂</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								尼龙:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinhm" name="spinhm" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinhm}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">尼龙</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								平:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinhn" name="spinhn" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinhn}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">平</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								圆:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinho" name="spinho" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinho}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">圆</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								金属:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinhp" name="spinhp" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinhp}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">金属</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								树脂:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinhq" name="spinhq" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinhq}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">树脂</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								控制:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinhr" name="spinhr" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinhr}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">控制</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								气眼:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinhs" name="spinhs" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinhs}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">气眼</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								粘衬:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinht" name="spinht" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinht}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">粘衬</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								其它:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinhu" name="spinhu" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinhu}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">其它</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								辅料合计:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinhv" name="spinhv" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinhv}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">辅料合计</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								吊牌:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinhw" name="spinhw" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinhw}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">吊牌</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								贴纸:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinhx" name="spinhx" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinhx}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">贴纸</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								拷贝纸:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinhy" name="spinhy" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinhy}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">拷贝纸</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								防伪标:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinhz" name="spinhz" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinhz}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">防伪标</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								衣架:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinhaa" name="spinhaa" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinhaa}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">衣架</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								胶袋:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinhab" name="spinhab" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinhab}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">胶袋</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								纸箱:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinhac" name="spinhac" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinhac}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">纸箱</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								其它:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinhad" name="spinhad" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinhad}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">其它</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								包装合计:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinhae" name="spinhae" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinhae}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">包装合计</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								备注:
							</label>
						</td>
						<td class="value">
						     	 <input id="spinhaf" name="spinhaf" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${bdSpinPage.spinhaf}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">备注</label>
						</td>
				<td align="right">
					<label class="Validform_label">
					</label>
				</td>
				<td class="value">
				</td>
					</tr>
				
			</table>
		</t:formvalid>
 </body>
  <script src = "webpage/com/jeecg/nbfz/bdSpin.js"></script>		
