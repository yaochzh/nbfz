<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker,autocomplete"></t:base>
<style>

    .datagrid-cell{
        margin: 2px;
        padding: 2px;
        overflow: hidden;
        height: 30px;
        line-height: 13px;
        font-size: 12px;
        word-wrap: break-word;
        white-space: nowrap;
    }
</style>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="bdSpinrowList" checkbox="true"  pagination="true" fitColumns="false" height="500"
              title="" actionUrl="bdSpinController.do?datagrid" idField="id"  queryMode="group" sortName="id" sortOrder="desc">
    <t:dgCol title="id"  field="id"  hidden="true" ></t:dgCol>
   
  <t:dgCol title="报价日期" rowspan="2" query= "true" frozenColumn="true" field="spinaa" queryMode="group"   formatter="yyyy-MM-dd" extendParams="editor:'datebox'" width="90"></t:dgCol>
      <t:dgCol title="客户编号" rowspan="2" query= "true" frozenColumn="true" field="spinab"  extendParams="editor:'text'" width="60"></t:dgCol>
      <t:dgCol title="订单序号" rowspan="2" query= "true" frozenColumn="true" field="spinac"    extendParams="editor:'text'" width="60"></t:dgCol>
      <t:dgCol title="款号" rowspan="2" query= "true" frozenColumn="true" field="spinad"  extendParams="editor:'text'" width="50"></t:dgCol>
      <t:dgCol title="款式/名" rowspan="2" frozenColumn="true" field="spinae" queryMode="group"   extendParams="editor:'text'" width="60"></t:dgCol>
      <t:dgCol title="面料</br>类型" rowspan="2" frozenColumn="true" field="mllx" queryMode="group"    dictionary="mllx" extendParams="editor:'combobox'" width="50"></t:dgCol>
      <t:dgCol title="尺寸</br>单位" rowspan="2" frozenColumn="true" field="ccdw" queryMode="group"   dictionary="ccdw" extendParams="editor:'combobox'" width="50"></t:dgCol>
	  
	  
      <t:dgCol title="大身/（衣长*胸围）" colspan="5" ></t:dgCol>
      <t:dgCol title="袖/（袖长*袖肥）" colspan="5" ></t:dgCol>
      <t:dgCol title="帽" colspan="4" ></t:dgCol>
      <t:dgCol title="领" colspan="4" ></t:dgCol>
      <t:dgCol title="门襟/（内贴）" colspan="4" ></t:dgCol>
      <t:dgCol title="口袋" colspan="4" ></t:dgCol>
      <t:dgCol title="其它" colspan="4" ></t:dgCol>
      <t:dgCol title="裤身/（外长*脾围）" colspan="5" ></t:dgCol>
      <t:dgCol title="加误率" rowspan="2" field="spincao"  formatterjs="fix100" queryMode="group"   extendParams="editor:'text'" width="50"></t:dgCol>
      <t:dgCol title="放版缩率%" colspan="3" ></t:dgCol>
     <t:dgCol title="合计M2" rowspan="2" field="spincas" queryMode="group"  formatterjs="fix3" extendParams="editor:'text'" width="50"></t:dgCol>
      <t:dgCol title="备注" newColumn="true" rowspan="2" field="spincat" queryMode="group"   extendParams="editor:'text'" width="50"></t:dgCol>
	  
	  
	  
    <t:dgCol title="衣长"  field="spincf" queryMode="group"  formatterjs="fix1"  extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="减"  field="spincg" queryMode="group"   formatterjs="fix1" extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="胸围"  field="spinch" queryMode="group"   formatterjs="fix1" extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="数量"  field="spinci" queryMode="group"   formatterjs="fix1" extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="M2"  field="spincj" queryMode="group"  formatterjs="fix3"  extendParams="editor:'text'" width="50"></t:dgCol>
	
    <t:dgCol title="袖长"  field="spinck" queryMode="group"  formatterjs="fix1"  extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="减"  field="spincl" queryMode="group"  formatterjs="fix1"  extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="袖肥"  field="spincm" queryMode="group"  formatterjs="fix1"  extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="数量"  field="spincn" queryMode="group"  formatterjs="fix1"  extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="M2"  field="spinco" queryMode="group"  formatterjs="fix3"  extendParams="editor:'text'" width="50"></t:dgCol>
	
    <t:dgCol title="帽长"  field="spincp" queryMode="group"  formatterjs="fix1"  extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="帽宽"  field="spincq" queryMode="group"   formatterjs="fix1" extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="数量"  field="spincr" queryMode="group"  formatterjs="fix1"  extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="M2"  field="spincs" queryMode="group"   formatterjs="fix3" extendParams="editor:'text'" width="50"></t:dgCol>
	
    <t:dgCol title="领宽"  field="spinct" queryMode="group"  formatterjs="fix1"  extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="领高"  field="spincu" queryMode="group"  formatterjs="fix1"  extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="数量"  field="spincv" queryMode="group"  formatterjs="fix1"  extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="M2"  field="spincw" queryMode="group"  formatterjs="fix3"  extendParams="editor:'text'" width="50"></t:dgCol>
	
    <t:dgCol title="襟长"  field="spincx" queryMode="group"  formatterjs="fix1"  extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="襟宽"  field="spincy" queryMode="group"  formatterjs="fix1"  extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="数量"  field="spincz" queryMode="group"  formatterjs="fix1"  extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="M2"  field="spincaa" queryMode="group"  formatterjs="fix3"  extendParams="editor:'text'" width="50"></t:dgCol>
	
    <t:dgCol title="袋长"  field="spincab" queryMode="group"   formatterjs="fix1" extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="袋宽"  field="spincac" queryMode="group"  formatterjs="fix1"  extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="数量"  field="spincad" queryMode="group"  formatterjs="fix1"  extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="M2"  field="spincae" queryMode="group"  formatterjs="fix3"  extendParams="editor:'text'" width="50"></t:dgCol>
	
    <t:dgCol title="长"  field="spincaf" queryMode="group"  formatterjs="fix1"  extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="宽"  field="spincag" queryMode="group"  formatterjs="fix1"  extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="数量"  field="spincah" queryMode="group"   formatterjs="fix1" extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="M2"  field="spincai" queryMode="group"  formatterjs="fix3"  extendParams="editor:'text'" width="50"></t:dgCol>
	
    <t:dgCol title="裤长"  field="spincaj" queryMode="group"  formatterjs="fix1"  extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="减"  field="spincak" queryMode="group"   formatterjs="fix1" extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="脾围"  field="spincal" queryMode="group"   formatterjs="fix1" extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="数量"  field="spincam" queryMode="group"  formatterjs="fix1"  extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="M2"  field="spincan" queryMode="group"  formatterjs="fix3"  extendParams="editor:'text'" width="50"></t:dgCol>
	
    <t:dgCol title="直"  field="spincap" queryMode="group"  formatterjs="fix"  extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="横"  field="spincaq" queryMode="group"  formatterjs="fix"  extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="合"  field="spincar" queryMode="group"  formatterjs="fix"  extendParams="editor:'text'" width="50"></t:dgCol>



      <t:dgToolBar  title="录入" icon="icon-add"  funname="addRow"></t:dgToolBar>
      <t:dgToolBar  title="编辑" icon="icon-edit"  funname="editRow"></t:dgToolBar>
      <t:dgToolBar  title="保存" icon="icon-save" url="bdSpinController.do?saveRows" funname="saveDatas" ></t:dgToolBar>
      <t:dgToolBar  title="取消编辑" icon="icon-undo" funname="reject"></t:dgToolBar>
      <t:dgToolBar title="批量删除"  icon="icon-remove" url="bdSpinController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>
 <script type="text/javascript">
    //添加行
	function addRow(title,addurl,gname){
		$('#'+gname).datagrid('appendRow',{});
		var editIndex = $('#'+gname).datagrid('getRows').length-1;
		$('#'+gname).datagrid('selectRow', editIndex)
				.datagrid('beginEdit', editIndex);
	}
	//保存数据
	function saveData(title,addurl,gname){
		if(!endEdit(gname))
			return false;
		var rows=$('#'+gname).datagrid("getChanges","inserted");
		var uprows=$('#'+gname).datagrid("getChanges","updated");
		rows=rows.concat(uprows);
		if(rows.length<=0){
			tip("没有需要保存的数据！")
			return false;
		}
		var result={};
		for(var i=0;i<rows.length;i++){
			for(var d in rows[i]){
				result["bdSpinList["+i+"]."+d]=rows[i][d];
			}
		}
		$.ajax({
			url:"<%=basePath%>/"+addurl,
			type:"post",
			data:result,
			dataType:"json",
			success:function(data){
				tip(data.msg);
				if(data.success){
		$('#'+gname).datagrid('reload');
				}
			}
		})
	}
	//结束编辑
	function endEdit(gname){
		var  editIndex = $('#'+gname).datagrid('getRows').length-1;
		for(var i=0;i<=editIndex;i++){
			if($('#'+gname).datagrid('validateRow', i))
				$('#'+gname).datagrid('endEdit', i);
			else
				return false;
		}
		return true;
	}
	//编辑行
	function editRow(title,addurl,gname){
		var rows=$('#'+gname).datagrid("getChecked");
		if(rows.length==0){
			tip("请选择条目");
			return false;
		}
		for(var i=0;i<rows.length;i++){
			var index= $('#'+gname).datagrid('getRowIndex', rows[i]);
			$('#'+gname).datagrid('beginEdit', index);
		}
	}
	//取消编辑
	function reject(title,addurl,gname){
		$('#'+gname).datagrid('clearChecked');
		$('#'+gname).datagrid('rejectChanges');
	}
    function fix(x,row,index){
        var f = parseFloat(x);
        if (isNaN(f)) {
            return "";
        }
        var f = Math.round(x);
        var s = f.toString();
        return s;
    }
    function fix1(x,row,index){
        var f = parseFloat(x);
        if (isNaN(f)) {
            return "";
        }
        var f = Math.round(x*10)/10;
        var s = f.toString();
        var rs = s.indexOf('.');
        if (rs < 0) {
            rs = s.length;
            s += '.';
        }
        while (s.length <= rs + 1) {
            s += '0';
        }
        return s;
    }
    function fix2(x,row,index){
        var f = parseFloat(x);
        if (isNaN(f)) {
            return "";
        }
        var f = Math.round(x*100)/100;
        var s = f.toString();
        var rs = s.indexOf('.');
        if (rs < 0) {
            rs = s.length;
            s += '.';
        }
        while (s.length <= rs + 2) {
            s += '0';
        }
        return s;
    }
    function fix3(x,row,index){
        var f = parseFloat(x);
        if (isNaN(f)) {
            return "";
        }
        var f = Math.round(x*1000)/1000;
        var s = f.toString();
        var rs = s.indexOf('.');
        if (rs < 0) {
            rs = s.length;
            s += '.';
        }
        while (s.length <= rs + 3) {
            s += '0';
        }
        return s;
    }

    function fix100(x,row,index) {
        var f = parseFloat(x);
        if (isNaN(f)) {
            return "";
        }
        return f + "%";
    }
 </script>