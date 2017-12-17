<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker,autocomplete"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="bdSpinrowList" checkbox="true"  pagination="true" fitColumns="true" 
  title="bd_spin" actionUrl="bdSpinController.do?datagrid" idField="id"  queryMode="group">
    <t:dgCol title="id"  field="id"  hidden="true" ></t:dgCol>
    <t:dgCol title="创建人名称"  field="createName" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="创建人登录名称"  field="createBy" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="创建日期"  field="createDate" queryMode="group"   formatter="yyyy-MM-dd" extendParams="editor:'datebox'" width="100"></t:dgCol>
    <t:dgCol title="更新人名称"  field="updateName" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="更新人登录名称"  field="updateBy" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="更新日期"  field="updateDate" queryMode="group"   formatter="yyyy-MM-dd" extendParams="editor:'datebox'" width="100"></t:dgCol>
    <t:dgCol title="所属部门"  field="sysOrgCode" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="所属公司"  field="sysCompanyCode" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="流程状态"  field="bpmStatus" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="报价日期"  field="spinaa" queryMode="group"   formatter="yyyy-MM-dd" extendParams="editor:'datebox'" width="100"></t:dgCol>
    <t:dgCol title="客户编号"  field="spinab" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="订单序号"  field="spinac" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="款号"  field="spinad" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="款式名"  field="spinae" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="订单件数"  field="spinaf" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="A1"  field="spinag" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="A2"  field="spinah" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="B1"  field="spinai" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="B2"  field="spinaj" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="C"  field="spinak" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="其他"  field="spinal" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="辅料"  field="spinam" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="包装"  field="spinan" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="印花"  field="spinao" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="绣花"  field="spinap" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="其他"  field="spinaq" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="成本合计"  field="spinar" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="本区域工价"  field="spinas" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="区域系数"  field="spinat" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="工厂系数"  field="spinau" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="系数工价"  field="spinav" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="利税"  field="spinaw" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="总价"  field="spinax" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="总差价"  field="spinay" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="税后差价"  field="spinaz" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="税后毛利"  field="spinaaa" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="利息"  field="spinaab" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="税后利率"  field="spinaac" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="工厂系数"  field="spinaad" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="系数工价"  field="spinaae" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="利税"  field="spinaaf" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="总价"  field="spinaag" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="总差价"  field="spinaah" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="税后差价"  field="spinaai" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="税后毛利"  field="spinaaj" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="利息"  field="spinaak" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="税后利率"  field="spinaal" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="基本工价"  field="spinaam" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="工厂系数"  field="spinaan" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="系数工价"  field="spinaao" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="利税"  field="spinaap" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="总价"  field="spinaaq" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="总差价"  field="spinaar" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="税后差价"  field="spinaas" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="税后毛利"  field="spinaat" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="利息"  field="spinaau" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="税后利率"  field="spinaav" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="折汇率"  field="spinaaw" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="11"  field="spinaax" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="12"  field="spinaay" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="13"  field="spinaaz" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="日期"  field="spinaba" queryMode="group"   formatter="yyyy-MM-dd" extendParams="editor:'datebox'" width="100"></t:dgCol>
    <t:dgCol title="11"  field="spinabb" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="修正"  field="spinabc" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="备注"  field="spinabd" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="克重"  field="spinbe" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="用料M2"  field="spinbf" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="损率"  field="spinbg" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="KG"  field="spinbh" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="单价"  field="spinbi" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="金额"  field="spinbj" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="克重"  field="spinbk" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="用料M2"  field="spinbl" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="损率"  field="spinbm" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="KG"  field="spinbn" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="单价"  field="spinbo" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="金额"  field="spinbp" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="克重"  field="spinbq" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="用料M2"  field="spinbr" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="损率"  field="spinbs" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="KG"  field="spinbt" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="单价"  field="spinbu" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="金额"  field="spinbv" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="克重"  field="spinbw" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="用料M2"  field="spinbx" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="损率"  field="spinby" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="KG"  field="spinbz" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="单价"  field="spinbaa" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="金额"  field="spinbab" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="克重"  field="spinbac" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="用料M2"  field="spinbad" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="损率"  field="spinbae" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="KG"  field="spinbaf" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="单价"  field="spinbag" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="金额"  field="spinbah" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="备注"  field="spinbai" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="尺码选"  field="spince" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="衣长"  field="spincf" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="减"  field="spincg" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="胸围"  field="spinch" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="数量"  field="spinci" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="M2"  field="spincj" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="袖长"  field="spinck" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="减"  field="spincl" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="袖肥"  field="spincm" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="数量"  field="spincn" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="M2"  field="spinco" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="帽长"  field="spincp" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="帽宽"  field="spincq" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="数量"  field="spincr" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="M2"  field="spincs" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="领宽"  field="spinct" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="领高"  field="spincu" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="数量"  field="spincv" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="M2"  field="spincw" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="襟长"  field="spincx" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="襟宽"  field="spincy" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="数量"  field="spincz" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="M2"  field="spincaa" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="袋长"  field="spincab" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="袋宽"  field="spincac" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="数量"  field="spincad" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="M2"  field="spincae" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="长"  field="spincaf" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="宽"  field="spincag" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="数量"  field="spincah" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="M2"  field="spincai" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="裤长"  field="spincaj" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="减"  field="spincak" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="脾围"  field="spincal" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="数量"  field="spincam" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="M2"  field="spincan" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="加误率"  field="spincao" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="直"  field="spincap" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="横"  field="spincaq" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="合"  field="spincar" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="合计M2"  field="spincas" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="备注"  field="spincat" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="衣长"  field="spindf" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="减"  field="spindg" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="胸围"  field="spindh" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="数量"  field="spindi" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="M2"  field="spindj" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="袖长"  field="spindk" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="减"  field="spindl" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="袖肥"  field="spindm" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="数量"  field="spindn" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="M2"  field="spindo" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="帽长"  field="spindp" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="帽宽"  field="spindq" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="数量"  field="spindr" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="M2"  field="spinds" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="领宽"  field="spindt" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="领高"  field="spindu" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="数量"  field="spindv" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="M2"  field="spindw" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="加误率"  field="spindx" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="直"  field="spindy" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="横"  field="spindz" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="合计"  field="spindaa" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="合计M2"  field="spindab" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="备注"  field="spindac" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="衣长"  field="spinef" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="减"  field="spineg" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="胸围"  field="spineh" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="数量"  field="spinei" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="M2"  field="spinej" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="袖长"  field="spinek" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="减"  field="spinel" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="袖肥"  field="spinem" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="数量"  field="spinen" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="M2"  field="spineo" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="帽长"  field="spinep" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="帽宽"  field="spineq" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="数量"  field="spiner" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="M2"  field="spines" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="领宽"  field="spinet" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="领高"  field="spineu" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="数量"  field="spinev" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="M2"  field="spinew" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="襟长"  field="spinex" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="襟宽"  field="spiney" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="数量"  field="spinez" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="M2"  field="spineaa" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="袋长"  field="spineab" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="袋宽"  field="spineac" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="数量"  field="spinead" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="M2"  field="spineae" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="长"  field="spineaf" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="宽"  field="spineag" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="数量"  field="spineah" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="M2"  field="spineai" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="裤长"  field="spineaj" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="减"  field="spineak" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="脾围"  field="spineal" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="数量"  field="spineam" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="M2"  field="spinean" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="加误率"  field="spineao" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="直"  field="spineap" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="横"  field="spineaq" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="合计"  field="spinear" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="合计M2"  field="spineas" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="备注"  field="spineat" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="衣长"  field="spinff" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="减"  field="spinfg" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="胸围"  field="spinfh" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="数量"  field="spinfi" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="M2"  field="spinfj" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="袖长"  field="spinfk" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="减"  field="spinfl" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="袖肥"  field="spinfm" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="数量"  field="spinfn" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="M2"  field="spinfo" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="帽长"  field="spinfp" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="帽宽"  field="spinfq" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="数量"  field="spinfr" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="M2"  field="spinfs" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="领宽"  field="spinft" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="领高"  field="spinfu" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="数量"  field="spinfv" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="M2"  field="spinfw" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="加误率"  field="spinfx" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="直"  field="spinfy" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="横"  field="spinfz" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="合计"  field="spinfaa" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="合计M2"  field="spinfab" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="备注"  field="spinfac" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="领宽"  field="spingf" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="领高"  field="spingg" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="数量"  field="spingh" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="M2"  field="spingi" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="12宽"  field="spingj" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="高"  field="spingk" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="数量"  field="spingl" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="M2"  field="spingm" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="12宽"  field="spingn" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="高"  field="spingo" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="数量"  field="spingp" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="M2"  field="spingq" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="加误率"  field="spingr" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="直"  field="spings" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="横"  field="spingt" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="合计"  field="spingu" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="合计M2"  field="spingv" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="备注"  field="spingw" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="订单数件"  field="spinhe" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="三标"  field="spinhf" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="装饰"  field="spinhg" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="缝线"  field="spinhh" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="绳带"  field="spinhi" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="贴条"  field="spinhj" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="金属"  field="spinhk" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="树脂"  field="spinhl" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="尼龙"  field="spinhm" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="平"  field="spinhn" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="圆"  field="spinho" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="金属"  field="spinhp" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="树脂"  field="spinhq" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="控制"  field="spinhr" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="气眼"  field="spinhs" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="粘衬"  field="spinht" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="其它"  field="spinhu" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="辅料合计"  field="spinhv" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="吊牌"  field="spinhw" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="贴纸"  field="spinhx" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="拷贝纸"  field="spinhy" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="防伪标"  field="spinhz" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="衣架"  field="spinhaa" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="胶袋"  field="spinhab" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="纸箱"  field="spinhac" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="其它"  field="spinhad" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="包装合计"  field="spinhae" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="备注"  field="spinhaf" queryMode="group"   extendParams="editor:'text'" width="100"></t:dgCol>
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
					reloadTable();
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
 </script>