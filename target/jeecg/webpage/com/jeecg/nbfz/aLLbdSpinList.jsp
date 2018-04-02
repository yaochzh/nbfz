<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker,autocomplete"></t:base>
<div>
	<t:tabs id="tabsOne" iframe="true" tabPosition="top" fit="false"  heigth="530">
		<t:tab href="bdSpinController.do?list&type=1" icon="icon-cut" title="汇总" id="tab1"></t:tab>
		<t:tab href="bdSpinController.do?list&type=2" icon="icon-cut" title="面里料汇总" id="tab2" ></t:tab>
		<t:tab href="bdSpinController.do?list&type=3" icon="icon-cut" title="面料1用量" id="tab3"></t:tab>
		<t:tab href="bdSpinController.do?list&type=4" icon="icon-cut" title="面料2用量" id="tab4" ></t:tab>
		<t:tab href="bdSpinController.do?list&type=5" icon="icon-cut" title="里料1用量 " id="tab5" ></t:tab>
		<t:tab href="bdSpinController.do?list&type=6" icon="icon-cut" title="里料2用量" id="tab6"></t:tab>
		<t:tab href="bdSpinController.do?list&type=7" icon="icon-cut" title="罗纹用量" id="tab7" ></t:tab>
		<t:tab href="bdSpinController.do?list&type=8" icon="icon-cut" title="辅料汇总" id="tab8" ></t:tab>
	</t:tabs>
</div>

<%--
<t:tabs id="tabsOne" iframe="false" tabPosition="top" fit="false">
	<t:tab href="jeecgListDemoController.do?rowListDemo&&nodeName=1" icon="icon-search" title="选项卡1" id="tab1"></t:tab>
	<t:tab href="jeecgListDemoController.do?rowListDemo&&nodeName=1" icon="icon-save" title="选项卡2" id="tab2"></t:tab>
	<t:tab href="jeecgListDemoController.do?rowListDemo&&nodeName=1" icon="icon-cut" title="选项卡3" id="tab3"></t:tab>
</t:tabs>
<t:tabs id="tabsTwo" iframe="false" tabPosition="top" fit="false">
	<t:tab href="jeecgFormDemoController.do?tabDemo" icon="icon-search" title="dynamic.report.config.detail" id="tab4"></t:tab>
</t:tabs>
<t:tabs id="tabsThree" iframe="false" tabPosition="top" fit="false">
	<t:tab iframe="http://www.baidu.com" icon="icon-search" heigth="600px" title="百度(iframe与非iframe共存)" id="tab5"></t:tab>
	<t:tab href="jeecgFormDemoController.do?tabDemo" icon="icon-cut" title="选项卡" id="tab8"></t:tab>
</t:tabs>
<t:tabs id="tabsFour" iframe="true" heigth="800px" tabPosition="top" fit="false">
	<t:tab href="http://www.guojusoft.com" icon="icon-search" title="北京国炬(全部iframe)" id="tab6"></t:tab>
	<t:tab href="http://www.jeecg.org" icon="icon-search" title="Jeecg论坛" id="tab7"></t:tab>
</t:tabs>--%>
