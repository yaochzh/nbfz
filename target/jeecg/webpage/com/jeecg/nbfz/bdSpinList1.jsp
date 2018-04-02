<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker,autocomplete"></t:base>
<div class="easyui-layout" fit="true">
    <div region="center" style="padding:0px;border:0px">
        <t:datagrid name="bdSpinrowList" checkbox="true"  pagination="true" fitColumns="false"  nowrap="false"
                    title="" actionUrl="bdSpinController.do?datagrid" idField="id"  queryMode="group" sortName="id" sortOrder="desc">
            <t:dgCol title="id"  field="id"  hidden="true" ></t:dgCol>

            <t:dgCol title="报价日期" rowspan="2" query= "true" frozenColumn="true" field="spinaa" queryMode="group"   formatter="yyyy-MM-dd" extendParams="editor:'datebox'" width="90"></t:dgCol>
            <t:dgCol title="客户编号" rowspan="2" query= "true" frozenColumn="true" field="spinab"  extendParams="editor:'text'" width="60"></t:dgCol>
            <t:dgCol title="订单序号" rowspan="2" query= "true" frozenColumn="true" field="spinac"    extendParams="editor:'text'" width="60"></t:dgCol>
            <t:dgCol title="款号" rowspan="2" query= "true" frozenColumn="true" field="spinad"  extendParams="editor:'text'" width="50"></t:dgCol>
            <t:dgCol title="款式/名" rowspan="2" frozenColumn="true" field="spinae" queryMode="group"   extendParams="editor:'text'" width="60"></t:dgCol>
            <t:dgCol title="订单件数" rowspan="2" newColumn="true" frozenColumn="true" field="spinaf" queryMode="group"   extendParams="editor:'text'" width="60"></t:dgCol>




            <t:dgCol title="面料" colspan="2" ></t:dgCol>
            <t:dgCol title="里料" colspan="2"></t:dgCol>
            <t:dgCol title="罗纹" colspan="1" ></t:dgCol>
            <t:dgCol title="其他" rowspan="2" field="spinal" queryMode="group"   extendParams="editor:'text'" width="50"></t:dgCol>
            <t:dgCol title="附加" colspan="5" ></t:dgCol>
            <t:dgCol title="基本" colspan="2"></t:dgCol>
            <t:dgCol title="外省域-1" colspan="10"></t:dgCol>
            <t:dgCol title="本区域-2" colspan="9"></t:dgCol>
            <t:dgCol title="本区域-3" colspan="10"></t:dgCol>
            <t:dgCol title="FOB/USD" colspan="4"></t:dgCol>
            <t:dgCol title="客户确认" colspan="3"></t:dgCol>
            <t:dgCol title="备注" rowspan="2" newColumn="true" field="spinabd" queryMode="group"   extendParams="editor:'text'" width="50"></t:dgCol>


            <t:dgCol title="A1"  field="spinag" queryMode="group" formatterjs="fix2"  extendParams="editor:'text'" width="50"></t:dgCol>
            <t:dgCol title="A2"  field="spinah" queryMode="group"  formatterjs="fix2"  extendParams="editor:'text'" width="50"></t:dgCol>
            <t:dgCol title="B1"  field="spinai" queryMode="group" formatterjs="fix2"   extendParams="editor:'text'" width="50"></t:dgCol>
            <t:dgCol title="B2"  field="spinaj" queryMode="group" formatterjs="fix2"   extendParams="editor:'text'" width="50"></t:dgCol>
            <t:dgCol title="C"  field="spinak" queryMode="group"  formatterjs="fix2"  extendParams="editor:'text'" width="50"></t:dgCol>




            <t:dgCol title="辅料"  field="spinam" queryMode="group" formatterjs="fix2"   extendParams="editor:'text'" width="50"></t:dgCol>
            <t:dgCol title="包装"  field="spinan" queryMode="group" formatterjs="fix2"   extendParams="editor:'text'" width="50"></t:dgCol>
            <t:dgCol title="印花"  field="spinao" queryMode="group" formatterjs="fix2"   extendParams="editor:'text'" width="50"></t:dgCol>
            <t:dgCol title="绣花"  field="spinap" queryMode="group" formatterjs="fix2"   extendParams="editor:'text'" width="50"></t:dgCol>
            <t:dgCol title="其他"  field="spinaq" queryMode="group" formatterjs="fix2"   extendParams="editor:'text'" width="50"></t:dgCol>


            <t:dgCol title="成本合计"  field="spinar" queryMode="group"  formatterjs="fix2"  extendParams="editor:'text'" width="58"></t:dgCol>
            <t:dgCol title="本区域工价"  field="spinas" queryMode="group" formatterjs="fix1"   extendParams="editor:'text'" width="58"></t:dgCol>


            <t:dgCol title="区域系数"  field="spinat" queryMode="group"  formatterjs="fix100"     extendParams="editor:'text'" width="58"></t:dgCol>
            <t:dgCol title="工厂系数"  field="spinau" queryMode="group"   formatterjs="fix1"  extendParams="editor:'text'" width="58"></t:dgCol>
            <t:dgCol title="系数工价"  field="spinav" queryMode="group"  formatterjs="fix2"  extendParams="editor:'text'" width="58"></t:dgCol>
            <t:dgCol title="利税"  field="spinaw" queryMode="group" formatterjs="fix100"  extendParams="editor:'text'" width="50"></t:dgCol>
            <t:dgCol title="总价"  field="spinax" queryMode="group"  formatterjs="fix2"  extendParams="editor:'text'" width="50"></t:dgCol>
            <t:dgCol title="总差价"  field="spinay" queryMode="group"  formatterjs="fix2"  extendParams="editor:'text'" width="60"></t:dgCol>
            <t:dgCol title="税后差价"  field="spinaz" queryMode="group"  formatterjs="fix2"  extendParams="editor:'text'" width="58"></t:dgCol>
            <t:dgCol title="税后毛利"  field="spinaaa" queryMode="group"  formatterjs="fix2"  extendParams="editor:'text'" width="58"></t:dgCol>
            <t:dgCol title="利息"  field="spinaab" queryMode="group" formatterjs="fix100"  extendParams="editor:'text'" width="50"></t:dgCol>
            <t:dgCol title="税后利率"  field="spinaac" queryMode="group" formatterjs="fix100"  extendParams="editor:'text'" width="58"></t:dgCol>


            <t:dgCol title="工厂系数"  field="spinaad" queryMode="group"  formatterjs="fix1"  extendParams="editor:'text'" width="58"></t:dgCol>
            <t:dgCol title="系数工价"  field="spinaae" queryMode="group" formatterjs="fix2"   extendParams="editor:'text'" width="58"></t:dgCol>
            <t:dgCol title="利税"  field="spinaaf" queryMode="group" formatterjs="fix100"  extendParams="editor:'text'" width="50"></t:dgCol>
            <t:dgCol title="总价"  field="spinaag" queryMode="group" formatterjs="fix2"   extendParams="editor:'text'" width="50"></t:dgCol>
            <t:dgCol title="总差价"  field="spinaah" queryMode="group" formatterjs="fix2"   extendParams="editor:'text'" width="60"></t:dgCol>
            <t:dgCol title="税后差价"  field="spinaai" queryMode="group"  formatterjs="fix2"  extendParams="editor:'text'" width="58"></t:dgCol>
            <t:dgCol title="税后毛利"  field="spinaaj" queryMode="group" formatterjs="fix2"   extendParams="editor:'text'" width="58"></t:dgCol>
            <t:dgCol title="利息"  field="spinaak" queryMode="group"  formatterjs="fix100" extendParams="editor:'text'" width="50"></t:dgCol>
            <t:dgCol title="税后利率"  field="spinaal" queryMode="group"   extendParams="editor:'text'" width="58"></t:dgCol>


            <t:dgCol title="基本工价"  field="spinaam" queryMode="group" formatterjs="fix2" 	  extendParams="editor:'text'" width="58"></t:dgCol>
            <t:dgCol title="工厂系数"  field="spinaan" queryMode="group" formatterjs="fix1"   extendParams="editor:'text'" width="58"></t:dgCol>
            <t:dgCol title="系数工价"  field="spinaao" queryMode="group" formatterjs="fix1"   extendParams="editor:'text'" width="58"></t:dgCol>
            <t:dgCol title="利税"  field="spinaap" queryMode="group" formatterjs="fix100"  extendParams="editor:'text'" width="50"></t:dgCol>
            <t:dgCol title="总价"  field="spinaaq" queryMode="group" formatterjs="fix2"   extendParams="editor:'text'" width="50"></t:dgCol>
            <t:dgCol title="总差价"  field="spinaar" queryMode="group" formatterjs="fix2"   extendParams="editor:'text'" width="60"></t:dgCol>
            <t:dgCol title="税后差价"  field="spinaas" queryMode="group"  formatterjs="fix2"  extendParams="editor:'text'" width="58"></t:dgCol>
            <t:dgCol title="税后毛利"  field="spinaat" queryMode="group" formatterjs="fix2"   extendParams="editor:'text'" width="58"></t:dgCol>
            <t:dgCol title="利息"  field="spinaau" queryMode="group" formatterjs="fix100"  extendParams="editor:'text'" width="50"></t:dgCol>
            <t:dgCol title="税后利率"  field="spinaav" queryMode="group" formatterjs="fix100"  extendParams="editor:'text'" width="58"></t:dgCol>


            <t:dgCol title="折汇率"  field="spinaaw" queryMode="group" formatterjs="fix1"   extendParams="editor:'text'" width="60"></t:dgCol>
            <t:dgCol title="1"  field="spinaax" queryMode="group"  formatterjs="fix2"  extendParams="editor:'text'" width="50"></t:dgCol>
            <t:dgCol title="2"  field="spinaay" queryMode="group"  formatterjs="fix2"  extendParams="editor:'text'" width="50"></t:dgCol>
            <t:dgCol title="A"  field="spinaaz" queryMode="group"  formatterjs="fix2"  extendParams="editor:'text'" extend="{style:'width:34'}" width="50"></t:dgCol>

            <t:dgCol title="日期"  field="spinaba" queryMode="group"   formatter="yyyy-MM-dd" extendParams="editor:'datebox'" width="90"></t:dgCol>
            <t:dgCol title="1"  field="spinabb" queryMode="group"   extendParams="editor:'text'" width="50"></t:dgCol>
            <t:dgCol title="修正"  field="spinabc" queryMode="group"   extendParams="editor:'text'" width="50"></t:dgCol>



            <t:dgToolBar operationCode="add" title="录入" icon="icon-add"  funname="addRow"></t:dgToolBar>
            <t:dgToolBar operationCode="edit" title="编辑" icon="icon-edit"  funname="editRow"></t:dgToolBar>
            <t:dgToolBar operationCode="save" title="保存" icon="icon-save" url="bdSpinController.do?saveRows" funname="saveDatas" ></t:dgToolBar>
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
    function saveDatas(title,addurl,gname){
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