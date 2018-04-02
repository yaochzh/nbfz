<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker,autocomplete"></t:base>
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
      <t:dgCol title="面料类型" rowspan="2" frozenColumn="true" field="mllx" queryMode="group"   dictionary="mllx" extendParams="editor:'combobox'" width="58"></t:dgCol>
	
	
      <t:dgCol title="面料1" colspan="6" ></t:dgCol>
      <t:dgCol title="面料2" colspan="6" ></t:dgCol>
      <t:dgCol title="里料1" colspan="6" ></t:dgCol>
      <t:dgCol title="里料2" colspan="6" ></t:dgCol>
      <t:dgCol title="螺纹" colspan="6" ></t:dgCol>
	  <t:dgCol title="备注" newColumn="true" rowspan="2" field="spinbai" queryMode="group"   extendParams="editor:'text'" width="50"></t:dgCol>
	
    <t:dgCol title="克重"  field="spinbe" queryMode="group"  formatterjs="fix"   extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="用料M2"  field="spinbf" queryMode="group"  formatterjs="fix3"   extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="损率"  field="spinbg" queryMode="group"  formatterjs="fix100"   extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="KG"  field="spinbh" queryMode="group"  formatterjs="fix3"   extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="单价"  field="spinbi" queryMode="group"  formatterjs="fix1"   extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="金额"  field="spinbj" queryMode="group"  formatterjs="fix2"   extendParams="editor:'text'" width="50"></t:dgCol>
	
	
    <t:dgCol title="克重"  field="spinbk" queryMode="group"  formatterjs="fix"   extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="用料M2"  field="spinbl" queryMode="group"  formatterjs="fix3"   extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="损率"  field="spinbm" queryMode="group"  formatterjs="fix100"  extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="KG"  field="spinbn" queryMode="group"   formatterjs="fix3" extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="单价"  field="spinbo" queryMode="group"  formatterjs="fix1"  extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="金额"  field="spinbp" queryMode="group"  formatterjs="fix2" extendParams="editor:'text'" width="50"></t:dgCol>
	
	
    <t:dgCol title="克重"  field="spinbq" queryMode="group"  formatterjs="fix"  extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="用料M2"  field="spinbr" queryMode="group"  formatterjs="fix3" extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="损率"  field="spinbs" queryMode="group"  formatterjs="fix100"  extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="KG"  field="spinbt" queryMode="group" formatterjs="fix3"  extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="单价"  field="spinbu" queryMode="group"  formatterjs="fix1"  extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="金额"  field="spinbv" queryMode="group"  formatterjs="fix2"  extendParams="editor:'text'" width="50"></t:dgCol>
	
	
    <t:dgCol title="克重"  field="spinbw" queryMode="group"  formatterjs="fix"  extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="用料M2"  field="spinbx" queryMode="group"  formatterjs="fix3"  extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="损率"  field="spinby" queryMode="group" formatterjs="fix100"   extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="KG"  field="spinbz" queryMode="group" formatterjs="fix3"   extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="单价"  field="spinbaa" queryMode="group"  formatterjs="fix1"  extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="金额"  field="spinbab" queryMode="group" formatterjs="fix2"   extendParams="editor:'text'" width="50"></t:dgCol>
	
	
    <t:dgCol title="克重"  field="spinbac" queryMode="group" formatterjs="fix"  extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="用料M2"  field="spinbad" queryMode="group" formatterjs="fix3"  extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="损率"  field="spinbae" queryMode="group" formatterjs="fix100"   extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="KG"  field="spinbaf" queryMode="group" formatterjs="fix3" extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="单价"  field="spinbag" queryMode="group" formatterjs="fix1"   extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="金额"  field="spinbah" queryMode="group" formatterjs="fix2"  extendParams="editor:'text'" width="50"></t:dgCol>
	
	
    <t:dgToolBar operationCode="add" title="录入" icon="icon-add"  funname="addRow"></t:dgToolBar>
    <t:dgToolBar operationCode="edit" title="编辑" icon="icon-edit"  funname="editRow"></t:dgToolBar>
    <t:dgToolBar operationCode="save" title="保存" icon="icon-save" url="bdSpinController.do?saveRows" funname="saveData"></t:dgToolBar>
    <t:dgToolBar operationCode="undo" title="取消编辑" icon="icon-undo" funname="reject"></t:dgToolBar>
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