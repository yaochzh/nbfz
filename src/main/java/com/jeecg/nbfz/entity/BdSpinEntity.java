package com.jeecg.nbfz.entity;

import org.jeecgframework.poi.excel.annotation.Excel;

import javax.persistence.*;
import java.util.List;

/**
 * @Title: Entity
 * @Description: bd_spin
 * @author onlineGenerator
 * @date 2017-12-25 19:45:43
 * @version V1.0
 *
 */
@Entity
@Table(name = "bd_spin", schema = "")
@SuppressWarnings("serial")
public class BdSpinEntity implements java.io.Serializable {
	/**id*/
	private java.lang.Integer id;
	/**创建人名称*/
	@Excel(name="创建人名称",width=15)
	private java.lang.String createName;
	/**创建人登录名称*/
	@Excel(name="创建人登录名称",width=15)
	private java.lang.String createBy;
	/**创建日期*/
	@Excel(name="创建日期",width=15,format = "yyyy-MM-dd")
	private java.util.Date createDate;
	/**更新人名称*/
	@Excel(name="更新人名称",width=15)
	private java.lang.String updateName;
	/**更新人登录名称*/
	@Excel(name="更新人登录名称",width=15)
	private java.lang.String updateBy;
	/**更新日期*/
	@Excel(name="更新日期",width=15,format = "yyyy-MM-dd")
	private java.util.Date updateDate;
	/**所属部门*/
	@Excel(name="所属部门",width=15)
	private java.lang.String sysOrgCode;
	/**所属公司*/
	@Excel(name="所属公司",width=15)
	private java.lang.String sysCompanyCode;
	/**流程状态*/
	@Excel(name="流程状态",width=15)
	private java.lang.String bpmStatus;
	/**mllx*/
	@Excel(name="mllx",width=15)
	private java.lang.String mllx;
	/**ccdw*/
	@Excel(name="ccdw",width=15)
	private java.lang.String ccdw;
	/**报价日期*/
	@Excel(name="报价日期",width=15,format = "yyyy-MM-dd")
	private java.util.Date spinaa;
	/**客户编号*/
	@Excel(name="客户编号",width=15)
	private java.lang.String spinab;
	/**订单序号*/
	@Excel(name="订单序号",width=15)
	private java.lang.String spinac;
	/**款号*/
	@Excel(name="款号",width=15)
	private java.lang.String spinad;
	/**款式名*/
	@Excel(name="款式名",width=15)
	private java.lang.String spinae;
	/**订单件数*/
	@Excel(name="订单件数",width=15)
	private java.lang.String spinaf;
	/**A1*/
	@Excel(name="A1",width=15)
	private java.lang.Double spinag;
	/**A2*/
	@Excel(name="A2",width=15)
	private java.lang.Double spinah;
	/**B1*/
	@Excel(name="B1",width=15)
	private java.lang.Double spinai;
	/**B2*/
	@Excel(name="B2",width=15)
	private java.lang.Double spinaj;
	/**C*/
	@Excel(name="C",width=15)
	private java.lang.Double spinak;
	/**其他*/
	@Excel(name="其他",width=15)
	private java.lang.Double spinal;
	/**辅料*/
	@Excel(name="辅料",width=15)
	private java.lang.Double spinam;
	/**包装*/
	@Excel(name="包装",width=15)
	private java.lang.Double spinan;
	/**印花*/
	@Excel(name="印花",width=15)
	private java.lang.Double spinao;
	/**绣花*/
	@Excel(name="绣花",width=15)
	private java.lang.Double spinap;
	/**其他*/
	@Excel(name="其他",width=15)
	private java.lang.Double spinaq;
	/**成本合计*/
	@Excel(name="成本合计",width=15)
	private java.lang.Double spinar;
	/**本区域工价*/
	@Excel(name="本区域工价",width=15)
	private java.lang.Double spinas;
	/**区域系数*/
	@Excel(name="区域系数",width=15)
	private java.lang.Double spinat;
	/**工厂系数*/
	@Excel(name="工厂系数",width=15)
	private java.lang.Double spinau;
	/**系数工价*/
	@Excel(name="系数工价",width=15)
	private java.lang.Double spinav;
	/**利税*/
	@Excel(name="利税",width=15)
	private java.lang.Double spinaw;
	/**总价*/
	@Excel(name="总价",width=15)
	private java.lang.Double spinax;
	/**总差价*/
	@Excel(name="总差价",width=15)
	private java.lang.Double spinay;
	/**税后差价*/
	@Excel(name="税后差价",width=15)
	private java.lang.Double spinaz;
	/**税后毛利*/
	@Excel(name="税后毛利",width=15)
	private java.lang.Double spinaaa;
	/**利息*/
	@Excel(name="利息",width=15)
	private java.lang.Double spinaab;
	/**税后利率*/
	@Excel(name="税后利率",width=15)
	private java.lang.Double spinaac;
	/**工厂系数*/
	@Excel(name="工厂系数",width=15)
	private java.lang.Double spinaad;
	/**系数工价*/
	@Excel(name="系数工价",width=15)
	private java.lang.Double spinaae;
	/**利税*/
	@Excel(name="利税",width=15)
	private java.lang.Double spinaaf;
	/**总价*/
	@Excel(name="总价",width=15)
	private java.lang.Double spinaag;
	/**总差价*/
	@Excel(name="总差价",width=15)
	private java.lang.Double spinaah;
	/**税后差价*/
	@Excel(name="税后差价",width=15)
	private java.lang.Double spinaai;
	/**税后毛利*/
	@Excel(name="税后毛利",width=15)
	private java.lang.Double spinaaj;
	/**利息*/
	@Excel(name="利息",width=15)
	private java.lang.Double spinaak;
	/**税后利率*/
	@Excel(name="税后利率",width=15)
	private java.lang.Double spinaal;
	/**基本工价*/
	@Excel(name="基本工价",width=15)
	private java.lang.Double spinaam;
	/**工厂系数*/
	@Excel(name="工厂系数",width=15)
	private java.lang.Double spinaan;
	/**系数工价*/
	@Excel(name="系数工价",width=15)
	private java.lang.Double spinaao;
	/**利税*/
	@Excel(name="利税",width=15)
	private java.lang.Double spinaap;
	/**总价*/
	@Excel(name="总价",width=15)
	private java.lang.Double spinaaq;
	/**总差价*/
	@Excel(name="总差价",width=15)
	private java.lang.Double spinaar;
	/**税后差价*/
	@Excel(name="税后差价",width=15)
	private java.lang.Double spinaas;
	/**税后毛利*/
	@Excel(name="税后毛利",width=15)
	private java.lang.Double spinaat;
	/**利息*/
	@Excel(name="利息",width=15)
	private java.lang.Double spinaau;
	/**税后利率*/
	@Excel(name="税后利率",width=15)
	private java.lang.Double spinaav;
	/**折汇率*/
	@Excel(name="折汇率",width=15)
	private java.lang.Double spinaaw;
	/**11*/
	@Excel(name="11",width=15)
	private java.lang.Double spinaax;
	/**12*/
	@Excel(name="12",width=15)
	private java.lang.Double spinaay;
	/**13*/
	@Excel(name="13",width=15)
	private java.lang.Double spinaaz;
	/**日期*/
	@Excel(name="日期",width=15,format = "yyyy-MM-dd")
	private java.util.Date spinaba;
	/**11*/
	@Excel(name="11",width=15)
	private java.lang.Double spinabb;
	/**修正*/
	@Excel(name="修正",width=15)
	private java.lang.Double spinabc;
	/**备注*/
	@Excel(name="备注",width=15)
	private java.lang.Double spinabd;
	/**克重*/
	@Excel(name="克重",width=15)
	private java.lang.Double spinbe;
	/**用料M2*/
	@Excel(name="用料M2",width=15)
	private java.lang.Double spinbf;
	/**损率*/
	@Excel(name="损率",width=15)
	private java.lang.Double spinbg;
	/**KG*/
	@Excel(name="KG",width=15)
	private java.lang.Double spinbh;
	/**单价*/
	@Excel(name="单价",width=15)
	private java.lang.Double spinbi;
	/**金额*/
	@Excel(name="金额",width=15)
	private java.lang.Double spinbj;
	/**克重*/
	@Excel(name="克重",width=15)
	private java.lang.Double spinbk;
	/**用料M2*/
	@Excel(name="用料M2",width=15)
	private java.lang.Double spinbl;
	/**损率*/
	@Excel(name="损率",width=15)
	private java.lang.Double spinbm;
	/**KG*/
	@Excel(name="KG",width=15)
	private java.lang.Double spinbn;
	/**单价*/
	@Excel(name="单价",width=15)
	private java.lang.Double spinbo;
	/**金额*/
	@Excel(name="金额",width=15)
	private java.lang.Double spinbp;
	/**克重*/
	@Excel(name="克重",width=15)
	private java.lang.Double spinbq;
	/**用料M2*/
	@Excel(name="用料M2",width=15)
	private java.lang.Double spinbr;
	/**损率*/
	@Excel(name="损率",width=15)
	private java.lang.Double spinbs;
	/**KG*/
	@Excel(name="KG",width=15)
	private java.lang.Double spinbt;
	/**单价*/
	@Excel(name="单价",width=15)
	private java.lang.Double spinbu;
	/**金额*/
	@Excel(name="金额",width=15)
	private java.lang.Double spinbv;
	/**克重*/
	@Excel(name="克重",width=15)
	private java.lang.Double spinbw;
	/**用料M2*/
	@Excel(name="用料M2",width=15)
	private java.lang.Double spinbx;
	/**损率*/
	@Excel(name="损率",width=15)
	private java.lang.Double spinby;
	/**KG*/
	@Excel(name="KG",width=15)
	private java.lang.Double spinbz;
	/**单价*/
	@Excel(name="单价",width=15)
	private java.lang.Double spinbaa;
	/**金额*/
	@Excel(name="金额",width=15)
	private java.lang.Double spinbab;
	/**克重*/
	@Excel(name="克重",width=15)
	private java.lang.Double spinbac;
	/**用料M2*/
	@Excel(name="用料M2",width=15)
	private java.lang.Double spinbad;
	/**损率*/
	@Excel(name="损率",width=15)
	private java.lang.Double spinbae;
	/**KG*/
	@Excel(name="KG",width=15)
	private java.lang.Double spinbaf;
	/**单价*/
	@Excel(name="单价",width=15)
	private java.lang.Double spinbag;
	/**金额*/
	@Excel(name="金额",width=15)
	private java.lang.Double spinbah;
	/**备注*/
	@Excel(name="备注",width=15)
	private java.lang.String spinbai;
	/**尺码选*/
	@Excel(name="尺码选",width=15)
	private java.lang.Double spince;
	/**衣长*/
	@Excel(name="衣长",width=15)
	private java.lang.Double spincf;
	/**减*/
	@Excel(name="减",width=15)
	private java.lang.Double spincg;
	/**胸围*/
	@Excel(name="胸围",width=15)
	private java.lang.Double spinch;
	/**数量*/
	@Excel(name="数量",width=15)
	private java.lang.Double spinci;
	/**M2*/
	@Excel(name="M2",width=15)
	private java.lang.Double spincj;
	/**袖长*/
	@Excel(name="袖长",width=15)
	private java.lang.Double spinck;
	/**减*/
	@Excel(name="减",width=15)
	private java.lang.Double spincl;
	/**袖肥*/
	@Excel(name="袖肥",width=15)
	private java.lang.Double spincm;
	/**数量*/
	@Excel(name="数量",width=15)
	private java.lang.Double spincn;
	/**M2*/
	@Excel(name="M2",width=15)
	private java.lang.Double spinco;
	/**帽长*/
	@Excel(name="帽长",width=15)
	private java.lang.Double spincp;
	/**帽宽*/
	@Excel(name="帽宽",width=15)
	private java.lang.Double spincq;
	/**数量*/
	@Excel(name="数量",width=15)
	private java.lang.Double spincr;
	/**M2*/
	@Excel(name="M2",width=15)
	private java.lang.Double spincs;
	/**领宽*/
	@Excel(name="领宽",width=15)
	private java.lang.Double spinct;
	/**领高*/
	@Excel(name="领高",width=15)
	private java.lang.Double spincu;
	/**数量*/
	@Excel(name="数量",width=15)
	private java.lang.Double spincv;
	/**M2*/
	@Excel(name="M2",width=15)
	private java.lang.Double spincw;
	/**襟长*/
	@Excel(name="襟长",width=15)
	private java.lang.Double spincx;
	/**襟宽*/
	@Excel(name="襟宽",width=15)
	private java.lang.Double spincy;
	/**数量*/
	@Excel(name="数量",width=15)
	private java.lang.Double spincz;
	/**M2*/
	@Excel(name="M2",width=15)
	private java.lang.Double spincaa;
	/**袋长*/
	@Excel(name="袋长",width=15)
	private java.lang.Double spincab;
	/**袋宽*/
	@Excel(name="袋宽",width=15)
	private java.lang.Double spincac;
	/**数量*/
	@Excel(name="数量",width=15)
	private java.lang.Double spincad;
	/**M2*/
	@Excel(name="M2",width=15)
	private java.lang.Double spincae;
	/**长*/
	@Excel(name="长",width=15)
	private java.lang.Double spincaf;
	/**宽*/
	@Excel(name="宽",width=15)
	private java.lang.Double spincag;
	/**数量*/
	@Excel(name="数量",width=15)
	private java.lang.Double spincah;
	/**M2*/
	@Excel(name="M2",width=15)
	private java.lang.Double spincai;
	/**裤长*/
	@Excel(name="裤长",width=15)
	private java.lang.Double spincaj;
	/**减*/
	@Excel(name="减",width=15)
	private java.lang.Double spincak;
	/**脾围*/
	@Excel(name="脾围",width=15)
	private java.lang.Double spincal;
	/**数量*/
	@Excel(name="数量",width=15)
	private java.lang.Double spincam;
	/**M2*/
	@Excel(name="M2",width=15)
	private java.lang.Double spincan;
	/**加误率*/
	@Excel(name="加误率",width=15)
	private java.lang.Double spincao;
	/**直*/
	@Excel(name="直",width=15)
	private java.lang.Double spincap;
	/**横*/
	@Excel(name="横",width=15)
	private java.lang.Double spincaq;
	/**合*/
	@Excel(name="合",width=15)
	private java.lang.Double spincar;
	/**合计M2*/
	@Excel(name="合计M2",width=15)
	private java.lang.Double spincas;
	/**备注*/
	@Excel(name="备注",width=15)
	private java.lang.String spincat;
	/**衣长*/
	@Excel(name="衣长",width=15)
	private java.lang.Double spindf;
	/**减*/
	@Excel(name="减",width=15)
	private java.lang.Double spindg;
	/**胸围*/
	@Excel(name="胸围",width=15)
	private java.lang.Double spindh;
	/**数量*/
	@Excel(name="数量",width=15)
	private java.lang.Double spindi;
	/**M2*/
	@Excel(name="M2",width=15)
	private java.lang.Double spindj;
	/**袖长*/
	@Excel(name="袖长",width=15)
	private java.lang.Double spindk;
	/**减*/
	@Excel(name="减",width=15)
	private java.lang.Double spindl;
	/**袖肥*/
	@Excel(name="袖肥",width=15)
	private java.lang.Double spindm;
	/**数量*/
	@Excel(name="数量",width=15)
	private java.lang.Double spindn;
	/**M2*/
	@Excel(name="M2",width=15)
	private java.lang.Double spindo;
	/**帽长*/
	@Excel(name="帽长",width=15)
	private java.lang.Double spindp;
	/**帽宽*/
	@Excel(name="帽宽",width=15)
	private java.lang.Double spindq;
	/**数量*/
	@Excel(name="数量",width=15)
	private java.lang.Double spindr;
	/**M2*/
	@Excel(name="M2",width=15)
	private java.lang.Double spinds;
	/**领宽*/
	@Excel(name="领宽",width=15)
	private java.lang.Double spindt;
	/**领高*/
	@Excel(name="领高",width=15)
	private java.lang.Double spindu;
	/**数量*/
	@Excel(name="数量",width=15)
	private java.lang.Double spindv;
	/**M2*/
	@Excel(name="M2",width=15)
	private java.lang.Double spindw;
	/**加误率*/
	@Excel(name="加误率",width=15)
	private java.lang.Double spindx;
	/**直*/
	@Excel(name="直",width=15)
	private java.lang.Double spindy;
	/**横*/
	@Excel(name="横",width=15)
	private java.lang.Double spindz;
	/**合计*/
	@Excel(name="合计",width=15)
	private java.lang.Double spindaa;
	/**合计M2*/
	@Excel(name="合计M2",width=15)
	private java.lang.Double spindab;
	/**备注*/
	@Excel(name="备注",width=15)
	private java.lang.String spindac;
	/**衣长*/
	@Excel(name="衣长",width=15)
	private java.lang.Double spinef;
	/**减*/
	@Excel(name="减",width=15)
	private java.lang.Double spineg;
	/**胸围*/
	@Excel(name="胸围",width=15)
	private java.lang.Double spineh;
	/**数量*/
	@Excel(name="数量",width=15)
	private java.lang.Double spinei;
	/**M2*/
	@Excel(name="M2",width=15)
	private java.lang.Double spinej;
	/**袖长*/
	@Excel(name="袖长",width=15)
	private java.lang.Double spinek;
	/**减*/
	@Excel(name="减",width=15)
	private java.lang.Double spinel;
	/**袖肥*/
	@Excel(name="袖肥",width=15)
	private java.lang.Double spinem;
	/**数量*/
	@Excel(name="数量",width=15)
	private java.lang.Double spinen;
	/**M2*/
	@Excel(name="M2",width=15)
	private java.lang.Double spineo;
	/**帽长*/
	@Excel(name="帽长",width=15)
	private java.lang.Double spinep;
	/**帽宽*/
	@Excel(name="帽宽",width=15)
	private java.lang.Double spineq;
	/**数量*/
	@Excel(name="数量",width=15)
	private java.lang.Double spiner;
	/**M2*/
	@Excel(name="M2",width=15)
	private java.lang.Double spines;
	/**领宽*/
	@Excel(name="领宽",width=15)
	private java.lang.Double spinet;
	/**领高*/
	@Excel(name="领高",width=15)
	private java.lang.Double spineu;
	/**数量*/
	@Excel(name="数量",width=15)
	private java.lang.Double spinev;
	/**M2*/
	@Excel(name="M2",width=15)
	private java.lang.Double spinew;
	/**襟长*/
	@Excel(name="襟长",width=15)
	private java.lang.Double spinex;
	/**襟宽*/
	@Excel(name="襟宽",width=15)
	private java.lang.Double spiney;
	/**数量*/
	@Excel(name="数量",width=15)
	private java.lang.Double spinez;
	/**M2*/
	@Excel(name="M2",width=15)
	private java.lang.Double spineaa;
	/**袋长*/
	@Excel(name="袋长",width=15)
	private java.lang.Double spineab;
	/**袋宽*/
	@Excel(name="袋宽",width=15)
	private java.lang.Double spineac;
	/**数量*/
	@Excel(name="数量",width=15)
	private java.lang.Double spinead;
	/**M2*/
	@Excel(name="M2",width=15)
	private java.lang.Double spineae;
	/**长*/
	@Excel(name="长",width=15)
	private java.lang.Double spineaf;
	/**宽*/
	@Excel(name="宽",width=15)
	private java.lang.Double spineag;
	/**数量*/
	@Excel(name="数量",width=15)
	private java.lang.Double spineah;
	/**M2*/
	@Excel(name="M2",width=15)
	private java.lang.Double spineai;
	/**裤长*/
	@Excel(name="裤长",width=15)
	private java.lang.Double spineaj;
	/**减*/
	@Excel(name="减",width=15)
	private java.lang.Double spineak;
	/**脾围*/
	@Excel(name="脾围",width=15)
	private java.lang.Double spineal;
	/**数量*/
	@Excel(name="数量",width=15)
	private java.lang.Double spineam;
	/**M2*/
	@Excel(name="M2",width=15)
	private java.lang.Double spinean;
	/**加误率*/
	@Excel(name="加误率",width=15)
	private java.lang.Double spineao;
	/**直*/
	@Excel(name="直",width=15)
	private java.lang.Double spineap;
	/**横*/
	@Excel(name="横",width=15)
	private java.lang.Double spineaq;
	/**合计*/
	@Excel(name="合计",width=15)
	private java.lang.Double spinear;
	/**合计M2*/
	@Excel(name="合计M2",width=15)
	private java.lang.Double spineas;
	/**备注*/
	@Excel(name="备注",width=15)
	private java.lang.String spineat;
	/**衣长*/
	@Excel(name="衣长",width=15)
	private java.lang.Double spinff;
	/**减*/
	@Excel(name="减",width=15)
	private java.lang.Double spinfg;
	/**胸围*/
	@Excel(name="胸围",width=15)
	private java.lang.Double spinfh;
	/**数量*/
	@Excel(name="数量",width=15)
	private java.lang.Double spinfi;
	/**M2*/
	@Excel(name="M2",width=15)
	private java.lang.Double spinfj;
	/**袖长*/
	@Excel(name="袖长",width=15)
	private java.lang.Double spinfk;
	/**减*/
	@Excel(name="减",width=15)
	private java.lang.Double spinfl;
	/**袖肥*/
	@Excel(name="袖肥",width=15)
	private java.lang.Double spinfm;
	/**数量*/
	@Excel(name="数量",width=15)
	private java.lang.Double spinfn;
	/**M2*/
	@Excel(name="M2",width=15)
	private java.lang.Double spinfo;
	/**帽长*/
	@Excel(name="帽长",width=15)
	private java.lang.Double spinfp;
	/**帽宽*/
	@Excel(name="帽宽",width=15)
	private java.lang.Double spinfq;
	/**数量*/
	@Excel(name="数量",width=15)
	private java.lang.Double spinfr;
	/**M2*/
	@Excel(name="M2",width=15)
	private java.lang.Double spinfs;
	/**领宽*/
	@Excel(name="领宽",width=15)
	private java.lang.Double spinft;
	/**领高*/
	@Excel(name="领高",width=15)
	private java.lang.Double spinfu;
	/**数量*/
	@Excel(name="数量",width=15)
	private java.lang.Double spinfv;
	/**M2*/
	@Excel(name="M2",width=15)
	private java.lang.Double spinfw;
	/**加误率*/
	@Excel(name="加误率",width=15)
	private java.lang.Double spinfx;
	/**直*/
	@Excel(name="直",width=15)
	private java.lang.Double spinfy;
	/**横*/
	@Excel(name="横",width=15)
	private java.lang.Double spinfz;
	/**合计*/
	@Excel(name="合计",width=15)
	private java.lang.Double spinfaa;
	/**合计M2*/
	@Excel(name="合计M2",width=15)
	private java.lang.Double spinfab;
	/**备注*/
	@Excel(name="备注",width=15)
	private java.lang.String spinfac;
	/**领宽*/
	@Excel(name="领宽",width=15)
	private java.lang.Double spingf;
	/**领高*/
	@Excel(name="领高",width=15)
	private java.lang.Double spingg;
	/**数量*/
	@Excel(name="数量",width=15)
	private java.lang.Double spingh;
	/**M2*/
	@Excel(name="M2",width=15)
	private java.lang.Double spingi;
	/**12宽*/
	@Excel(name="12宽",width=15)
	private java.lang.Double spingj;
	/**高*/
	@Excel(name="高",width=15)
	private java.lang.Double spingk;
	/**数量*/
	@Excel(name="数量",width=15)
	private java.lang.Double spingl;
	/**M2*/
	@Excel(name="M2",width=15)
	private java.lang.Double spingm;
	/**12宽*/
	@Excel(name="12宽",width=15)
	private java.lang.Double spingn;
	/**高*/
	@Excel(name="高",width=15)
	private java.lang.Double spingo;
	/**数量*/
	@Excel(name="数量",width=15)
	private java.lang.Double spingp;
	/**M2*/
	@Excel(name="M2",width=15)
	private java.lang.Double spingq;
	/**加误率*/
	@Excel(name="加误率",width=15)
	private java.lang.Double spingr;
	/**直*/
	@Excel(name="直",width=15)
	private java.lang.Double spings;
	/**横*/
	@Excel(name="横",width=15)
	private java.lang.Double spingt;
	/**合计*/
	@Excel(name="合计",width=15)
	private java.lang.Double spingu;
	/**合计M2*/
	@Excel(name="合计M2",width=15)
	private java.lang.Double spingv;
	/**备注*/
	@Excel(name="备注",width=15)
	private java.lang.String spingw;
	/**订单数件*/
	@Excel(name="订单数件",width=15)
	private java.lang.Double spinhe;
	/**三标*/
	@Excel(name="三标",width=15)
	private java.lang.Double spinhf;
	/**装饰*/
	@Excel(name="装饰",width=15)
	private java.lang.Double spinhg;
	/**缝线*/
	@Excel(name="缝线",width=15)
	private java.lang.Double spinhh;
	/**绳带*/
	@Excel(name="绳带",width=15)
	private java.lang.Double spinhi;
	/**贴条*/
	@Excel(name="贴条",width=15)
	private java.lang.Double spinhj;
	/**金属*/
	@Excel(name="金属",width=15)
	private java.lang.Double spinhk;
	/**树脂*/
	@Excel(name="树脂",width=15)
	private java.lang.Double spinhl;
	/**尼龙*/
	@Excel(name="尼龙",width=15)
	private java.lang.Double spinhm;
	/**平*/
	@Excel(name="平",width=15)
	private java.lang.Double spinhn;
	/**圆*/
	@Excel(name="圆",width=15)
	private java.lang.Double spinho;
	/**金属*/
	@Excel(name="金属",width=15)
	private java.lang.Double spinhp;
	/**树脂*/
	@Excel(name="树脂",width=15)
	private java.lang.Double spinhq;
	/**控制*/
	@Excel(name="控制",width=15)
	private java.lang.Double spinhr;
	/**气眼*/
	@Excel(name="气眼",width=15)
	private java.lang.Double spinhs;
	/**粘衬*/
	@Excel(name="粘衬",width=15)
	private java.lang.Double spinht;
	/**其它*/
	@Excel(name="其它",width=15)
	private java.lang.Double spinhu;
	/**辅料合计*/
	@Excel(name="辅料合计",width=15)
	private java.lang.Double spinhv;
	/**吊牌*/
	@Excel(name="吊牌",width=15)
	private java.lang.Double spinhw;
	/**贴纸*/
	@Excel(name="贴纸",width=15)
	private java.lang.Double spinhx;
	/**拷贝纸*/
	@Excel(name="拷贝纸",width=15)
	private java.lang.Double spinhy;
	/**防伪标*/
	@Excel(name="防伪标",width=15)
	private java.lang.Double spinhz;
	/**衣架*/
	@Excel(name="衣架",width=15)
	private java.lang.Double spinhaa;
	/**胶袋*/
	@Excel(name="胶袋",width=15)
	private java.lang.Double spinhab;
	/**纸箱*/
	@Excel(name="纸箱",width=15)
	private java.lang.Double spinhac;
	/**其它*/
	@Excel(name="其它",width=15)
	private java.lang.Double spinhad;
	/**包装合计*/
	@Excel(name="包装合计",width=15)
	private java.lang.Double spinhae;
	/**备注*/
	@Excel(name="备注",width=15)
	private java.lang.String spinhaf;

	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name ="ID",nullable=false,length=19)
	public java.lang.Integer getId(){
		return this.id;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  id
	 */
	public void setId(java.lang.Integer id){
		this.id = id;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  创建人名称
	 */

	@Column(name ="CREATE_NAME",nullable=true,length=50)
	public java.lang.String getCreateName(){
		return this.createName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  创建人名称
	 */
	public void setCreateName(java.lang.String createName){
		this.createName = createName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  创建人登录名称
	 */

	@Column(name ="CREATE_BY",nullable=true,length=50)
	public java.lang.String getCreateBy(){
		return this.createBy;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  创建人登录名称
	 */
	public void setCreateBy(java.lang.String createBy){
		this.createBy = createBy;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  创建日期
	 */

	@Column(name ="CREATE_DATE",nullable=true)
	public java.util.Date getCreateDate(){
		return this.createDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  创建日期
	 */
	public void setCreateDate(java.util.Date createDate){
		this.createDate = createDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  更新人名称
	 */

	@Column(name ="UPDATE_NAME",nullable=true,length=50)
	public java.lang.String getUpdateName(){
		return this.updateName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  更新人名称
	 */
	public void setUpdateName(java.lang.String updateName){
		this.updateName = updateName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  更新人登录名称
	 */

	@Column(name ="UPDATE_BY",nullable=true,length=50)
	public java.lang.String getUpdateBy(){
		return this.updateBy;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  更新人登录名称
	 */
	public void setUpdateBy(java.lang.String updateBy){
		this.updateBy = updateBy;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  更新日期
	 */

	@Column(name ="UPDATE_DATE",nullable=true)
	public java.util.Date getUpdateDate(){
		return this.updateDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  更新日期
	 */
	public void setUpdateDate(java.util.Date updateDate){
		this.updateDate = updateDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  所属部门
	 */

	@Column(name ="SYS_ORG_CODE",nullable=true,length=50)
	public java.lang.String getSysOrgCode(){
		return this.sysOrgCode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  所属部门
	 */
	public void setSysOrgCode(java.lang.String sysOrgCode){
		this.sysOrgCode = sysOrgCode;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  所属公司
	 */

	@Column(name ="SYS_COMPANY_CODE",nullable=true,length=50)
	public java.lang.String getSysCompanyCode(){
		return this.sysCompanyCode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  所属公司
	 */
	public void setSysCompanyCode(java.lang.String sysCompanyCode){
		this.sysCompanyCode = sysCompanyCode;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  流程状态
	 */

	@Column(name ="BPM_STATUS",nullable=true,length=15)
	public java.lang.String getBpmStatus(){
		return this.bpmStatus;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  流程状态
	 */
	public void setBpmStatus(java.lang.String bpmStatus){
		this.bpmStatus = bpmStatus;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  mllx
	 */

	@Column(name ="MLLX",nullable=true,length=15)
	public java.lang.String getMllx(){
		return this.mllx;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  mllx
	 */
	public void setMllx(java.lang.String mllx){
		this.mllx = mllx;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  ccdw
	 */

	@Column(name ="CCDW",nullable=true,length=15)
	public java.lang.String getCcdw(){
		return this.ccdw;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  ccdw
	 */
	public void setCcdw(java.lang.String ccdw){
		this.ccdw = ccdw;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  报价日期
	 */

	@Column(name ="SPINAA",nullable=false)
	public java.util.Date getSpinaa(){
		return this.spinaa;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  报价日期
	 */
	public void setSpinaa(java.util.Date spinaa){
		this.spinaa = spinaa;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  客户编号
	 */

	@Column(name ="SPINAB",nullable=false,length=15)
	public java.lang.String getSpinab(){
		return this.spinab;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  客户编号
	 */
	public void setSpinab(java.lang.String spinab){
		this.spinab = spinab;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  订单序号
	 */

	@Column(name ="SPINAC",nullable=false,length=15)
	public java.lang.String getSpinac(){
		return this.spinac;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  订单序号
	 */
	public void setSpinac(java.lang.String spinac){
		this.spinac = spinac;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  款号
	 */

	@Column(name ="SPINAD",nullable=true,length=15)
	public java.lang.String getSpinad(){
		return this.spinad;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  款号
	 */
	public void setSpinad(java.lang.String spinad){
		this.spinad = spinad;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  款式名
	 */

	@Column(name ="SPINAE",nullable=true,length=15)
	public java.lang.String getSpinae(){
		return this.spinae;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  款式名
	 */
	public void setSpinae(java.lang.String spinae){
		this.spinae = spinae;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  订单件数
	 */

	@Column(name ="SPINAF",nullable=true,length=15)
	public java.lang.String getSpinaf(){
		return this.spinaf;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  订单件数
	 */
	public void setSpinaf(java.lang.String spinaf){
		this.spinaf = spinaf;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  A1
	 */

	@Column(name ="SPINAG",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinag(){
		return this.spinag;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  A1
	 */
	public void setSpinag(java.lang.Double spinag){
		this.spinag = spinag;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  A2
	 */

	@Column(name ="SPINAH",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinah(){
		return this.spinah;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  A2
	 */
	public void setSpinah(java.lang.Double spinah){
		this.spinah = spinah;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  B1
	 */

	@Column(name ="SPINAI",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinai(){
		return this.spinai;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  B1
	 */
	public void setSpinai(java.lang.Double spinai){
		this.spinai = spinai;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  B2
	 */

	@Column(name ="SPINAJ",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinaj(){
		return this.spinaj;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  B2
	 */
	public void setSpinaj(java.lang.Double spinaj){
		this.spinaj = spinaj;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  C
	 */

	@Column(name ="SPINAK",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinak(){
		return this.spinak;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  C
	 */
	public void setSpinak(java.lang.Double spinak){
		this.spinak = spinak;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  其他
	 */

	@Column(name ="SPINAL",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinal(){
		return this.spinal;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  其他
	 */
	public void setSpinal(java.lang.Double spinal){
		this.spinal = spinal;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  辅料
	 */

	@Column(name ="SPINAM",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinam(){
		return this.spinam;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  辅料
	 */
	public void setSpinam(java.lang.Double spinam){
		this.spinam = spinam;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  包装
	 */

	@Column(name ="SPINAN",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinan(){
		return this.spinan;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  包装
	 */
	public void setSpinan(java.lang.Double spinan){
		this.spinan = spinan;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  印花
	 */

	@Column(name ="SPINAO",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinao(){
		return this.spinao;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  印花
	 */
	public void setSpinao(java.lang.Double spinao){
		this.spinao = spinao;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  绣花
	 */

	@Column(name ="SPINAP",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinap(){
		return this.spinap;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  绣花
	 */
	public void setSpinap(java.lang.Double spinap){
		this.spinap = spinap;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  其他
	 */

	@Column(name ="SPINAQ",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinaq(){
		return this.spinaq;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  其他
	 */
	public void setSpinaq(java.lang.Double spinaq){
		this.spinaq = spinaq;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  成本合计
	 */

	@Column(name ="SPINAR",scale=2,nullable=true,length=15)
	public java.lang.Double getSpinar(){
		return this.spinar;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  成本合计
	 */
	public void setSpinar(java.lang.Double spinar){
		this.spinar = spinar;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  本区域工价
	 */

	@Column(name ="SPINAS",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinas(){
		return this.spinas;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  本区域工价
	 */
	public void setSpinas(java.lang.Double spinas){
		this.spinas = spinas;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  区域系数
	 */

	@Column(name ="SPINAT",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinat(){
		return this.spinat;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  区域系数
	 */
	public void setSpinat(java.lang.Double spinat){
		this.spinat = spinat;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  工厂系数
	 */

	@Column(name ="SPINAU",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinau(){
		return this.spinau;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  工厂系数
	 */
	public void setSpinau(java.lang.Double spinau){
		this.spinau = spinau;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  系数工价
	 */

	@Column(name ="SPINAV",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinav(){
		return this.spinav;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  系数工价
	 */
	public void setSpinav(java.lang.Double spinav){
		this.spinav = spinav;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  利税
	 */

	@Column(name ="SPINAW",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinaw(){
		return this.spinaw;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  利税
	 */
	public void setSpinaw(java.lang.Double spinaw){
		this.spinaw = spinaw;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  总价
	 */

	@Column(name ="SPINAX",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinax(){
		return this.spinax;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  总价
	 */
	public void setSpinax(java.lang.Double spinax){
		this.spinax = spinax;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  总差价
	 */

	@Column(name ="SPINAY",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinay(){
		return this.spinay;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  总差价
	 */
	public void setSpinay(java.lang.Double spinay){
		this.spinay = spinay;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  税后差价
	 */

	@Column(name ="SPINAZ",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinaz(){
		return this.spinaz;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  税后差价
	 */
	public void setSpinaz(java.lang.Double spinaz){
		this.spinaz = spinaz;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  税后毛利
	 */

	@Column(name ="SPINAAA",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinaaa(){
		return this.spinaaa;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  税后毛利
	 */
	public void setSpinaaa(java.lang.Double spinaaa){
		this.spinaaa = spinaaa;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  利息
	 */

	@Column(name ="SPINAAB",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinaab(){
		return this.spinaab;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  利息
	 */
	public void setSpinaab(java.lang.Double spinaab){
		this.spinaab = spinaab;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  税后利率
	 */

	@Column(name ="SPINAAC",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinaac(){
		return this.spinaac;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  税后利率
	 */
	public void setSpinaac(java.lang.Double spinaac){
		this.spinaac = spinaac;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  工厂系数
	 */

	@Column(name ="SPINAAD",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinaad(){
		return this.spinaad;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  工厂系数
	 */
	public void setSpinaad(java.lang.Double spinaad){
		this.spinaad = spinaad;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  系数工价
	 */

	@Column(name ="SPINAAE",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinaae(){
		return this.spinaae;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  系数工价
	 */
	public void setSpinaae(java.lang.Double spinaae){
		this.spinaae = spinaae;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  利税
	 */

	@Column(name ="SPINAAF",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinaaf(){
		return this.spinaaf;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  利税
	 */
	public void setSpinaaf(java.lang.Double spinaaf){
		this.spinaaf = spinaaf;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  总价
	 */

	@Column(name ="SPINAAG",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinaag(){
		return this.spinaag;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  总价
	 */
	public void setSpinaag(java.lang.Double spinaag){
		this.spinaag = spinaag;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  总差价
	 */

	@Column(name ="SPINAAH",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinaah(){
		return this.spinaah;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  总差价
	 */
	public void setSpinaah(java.lang.Double spinaah){
		this.spinaah = spinaah;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  税后差价
	 */

	@Column(name ="SPINAAI",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinaai(){
		return this.spinaai;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  税后差价
	 */
	public void setSpinaai(java.lang.Double spinaai){
		this.spinaai = spinaai;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  税后毛利
	 */

	@Column(name ="SPINAAJ",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinaaj(){
		return this.spinaaj;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  税后毛利
	 */
	public void setSpinaaj(java.lang.Double spinaaj){
		this.spinaaj = spinaaj;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  利息
	 */

	@Column(name ="SPINAAK",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinaak(){
		return this.spinaak;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  利息
	 */
	public void setSpinaak(java.lang.Double spinaak){
		this.spinaak = spinaak;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  税后利率
	 */

	@Column(name ="SPINAAL",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinaal(){
		return this.spinaal;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  税后利率
	 */
	public void setSpinaal(java.lang.Double spinaal){
		this.spinaal = spinaal;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  基本工价
	 */

	@Column(name ="SPINAAM",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinaam(){
		return this.spinaam;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  基本工价
	 */
	public void setSpinaam(java.lang.Double spinaam){
		this.spinaam = spinaam;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  工厂系数
	 */

	@Column(name ="SPINAAN",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinaan(){
		return this.spinaan;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  工厂系数
	 */
	public void setSpinaan(java.lang.Double spinaan){
		this.spinaan = spinaan;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  系数工价
	 */

	@Column(name ="SPINAAO",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinaao(){
		return this.spinaao;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  系数工价
	 */
	public void setSpinaao(java.lang.Double spinaao){
		this.spinaao = spinaao;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  利税
	 */

	@Column(name ="SPINAAP",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinaap(){
		return this.spinaap;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  利税
	 */
	public void setSpinaap(java.lang.Double spinaap){
		this.spinaap = spinaap;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  总价
	 */

	@Column(name ="SPINAAQ",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinaaq(){
		return this.spinaaq;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  总价
	 */
	public void setSpinaaq(java.lang.Double spinaaq){
		this.spinaaq = spinaaq;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  总差价
	 */

	@Column(name ="SPINAAR",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinaar(){
		return this.spinaar;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  总差价
	 */
	public void setSpinaar(java.lang.Double spinaar){
		this.spinaar = spinaar;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  税后差价
	 */

	@Column(name ="SPINAAS",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinaas(){
		return this.spinaas;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  税后差价
	 */
	public void setSpinaas(java.lang.Double spinaas){
		this.spinaas = spinaas;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  税后毛利
	 */

	@Column(name ="SPINAAT",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinaat(){
		return this.spinaat;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  税后毛利
	 */
	public void setSpinaat(java.lang.Double spinaat){
		this.spinaat = spinaat;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  利息
	 */

	@Column(name ="SPINAAU",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinaau(){
		return this.spinaau;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  利息
	 */
	public void setSpinaau(java.lang.Double spinaau){
		this.spinaau = spinaau;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  税后利率
	 */

	@Column(name ="SPINAAV",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinaav(){
		return this.spinaav;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  税后利率
	 */
	public void setSpinaav(java.lang.Double spinaav){
		this.spinaav = spinaav;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  折汇率
	 */

	@Column(name ="SPINAAW",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinaaw(){
		return this.spinaaw;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  折汇率
	 */
	public void setSpinaaw(java.lang.Double spinaaw){
		this.spinaaw = spinaaw;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  11
	 */

	@Column(name ="SPINAAX",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinaax(){
		return this.spinaax;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  11
	 */
	public void setSpinaax(java.lang.Double spinaax){
		this.spinaax = spinaax;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  12
	 */

	@Column(name ="SPINAAY",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinaay(){
		return this.spinaay;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  12
	 */
	public void setSpinaay(java.lang.Double spinaay){
		this.spinaay = spinaay;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  13
	 */

	@Column(name ="SPINAAZ",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinaaz(){
		return this.spinaaz;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  13
	 */
	public void setSpinaaz(java.lang.Double spinaaz){
		this.spinaaz = spinaaz;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  日期
	 */

	@Column(name ="SPINABA",nullable=true)
	public java.util.Date getSpinaba(){
		return this.spinaba;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  日期
	 */
	public void setSpinaba(java.util.Date spinaba){
		this.spinaba = spinaba;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  11
	 */

	@Column(name ="SPINABB",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinabb(){
		return this.spinabb;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  11
	 */
	public void setSpinabb(java.lang.Double spinabb){
		this.spinabb = spinabb;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  修正
	 */

	@Column(name ="SPINABC",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinabc(){
		return this.spinabc;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  修正
	 */
	public void setSpinabc(java.lang.Double spinabc){
		this.spinabc = spinabc;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  备注
	 */

	@Column(name ="SPINABD",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinabd(){
		return this.spinabd;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  备注
	 */
	public void setSpinabd(java.lang.Double spinabd){
		this.spinabd = spinabd;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  克重
	 */

	@Column(name ="SPINBE",nullable=true,length=15)
	public java.lang.Double getSpinbe(){
		return this.spinbe;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  克重
	 */
	public void setSpinbe(java.lang.Double spinbe){
		this.spinbe = spinbe;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  用料M2
	 */

	@Column(name ="SPINBF",nullable=true,scale=3,length=15)
	public java.lang.Double getSpinbf(){
		return this.spinbf;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  用料M2
	 */
	public void setSpinbf(java.lang.Double spinbf){
		this.spinbf = spinbf;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  损率
	 */

	@Column(name ="SPINBG",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinbg(){
		return this.spinbg;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  损率
	 */
	public void setSpinbg(java.lang.Double spinbg){
		this.spinbg = spinbg;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  KG
	 */

	@Column(name ="SPINBH",nullable=true,scale=3,length=15)
	public java.lang.Double getSpinbh(){
		return this.spinbh;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  KG
	 */
	public void setSpinbh(java.lang.Double spinbh){
		this.spinbh = spinbh;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  单价
	 */

	@Column(name ="SPINBI",nullable=true,scale=1,length=15)
	public java.lang.Double getSpinbi(){
		return this.spinbi;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  单价
	 */
	public void setSpinbi(java.lang.Double spinbi){
		this.spinbi = spinbi;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  金额
	 */

	@Column(name ="SPINBJ",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinbj(){
		return this.spinbj;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  金额
	 */
	public void setSpinbj(java.lang.Double spinbj){
		this.spinbj = spinbj;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  克重
	 */

	@Column(name ="SPINBK",nullable=true,length=15)
	public java.lang.Double getSpinbk(){
		return this.spinbk;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  克重
	 */
	public void setSpinbk(java.lang.Double spinbk){
		this.spinbk = spinbk;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  用料M2
	 */

	@Column(name ="SPINBL",nullable=true,scale=3,length=15)
	public java.lang.Double getSpinbl(){
		return this.spinbl;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  用料M2
	 */
	public void setSpinbl(java.lang.Double spinbl){
		this.spinbl = spinbl;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  损率
	 */

	@Column(name ="SPINBM",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinbm(){
		return this.spinbm;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  损率
	 */
	public void setSpinbm(java.lang.Double spinbm){
		this.spinbm = spinbm;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  KG
	 */

	@Column(name ="SPINBN",nullable=true,scale=3,length=15)
	public java.lang.Double getSpinbn(){
		return this.spinbn;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  KG
	 */
	public void setSpinbn(java.lang.Double spinbn){
		this.spinbn = spinbn;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  单价
	 */

	@Column(name ="SPINBO",nullable=true,scale=1,length=15)
	public java.lang.Double getSpinbo(){
		return this.spinbo;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  单价
	 */
	public void setSpinbo(java.lang.Double spinbo){
		this.spinbo = spinbo;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  金额
	 */

	@Column(name ="SPINBP",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinbp(){
		return this.spinbp;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  金额
	 */
	public void setSpinbp(java.lang.Double spinbp){
		this.spinbp = spinbp;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  克重
	 */

	@Column(name ="SPINBQ",nullable=true,length=15)
	public java.lang.Double getSpinbq(){
		return this.spinbq;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  克重
	 */
	public void setSpinbq(java.lang.Double spinbq){
		this.spinbq = spinbq;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  用料M2
	 */

	@Column(name ="SPINBR",nullable=true,scale=3,length=15)
	public java.lang.Double getSpinbr(){
		return this.spinbr;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  用料M2
	 */
	public void setSpinbr(java.lang.Double spinbr){
		this.spinbr = spinbr;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  损率
	 */

	@Column(name ="SPINBS",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinbs(){
		return this.spinbs;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  损率
	 */
	public void setSpinbs(java.lang.Double spinbs){
		this.spinbs = spinbs;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  KG
	 */

	@Column(name ="SPINBT",nullable=true,scale=3,length=15)
	public java.lang.Double getSpinbt(){
		return this.spinbt;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  KG
	 */
	public void setSpinbt(java.lang.Double spinbt){
		this.spinbt = spinbt;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  单价
	 */

	@Column(name ="SPINBU",nullable=true,scale=1,length=15)
	public java.lang.Double getSpinbu(){
		return this.spinbu;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  单价
	 */
	public void setSpinbu(java.lang.Double spinbu){
		this.spinbu = spinbu;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  金额
	 */

	@Column(name ="SPINBV",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinbv(){
		return this.spinbv;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  金额
	 */
	public void setSpinbv(java.lang.Double spinbv){
		this.spinbv = spinbv;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  克重
	 */

	@Column(name ="SPINBW",nullable=true,length=15)
	public java.lang.Double getSpinbw(){
		return this.spinbw;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  克重
	 */
	public void setSpinbw(java.lang.Double spinbw){
		this.spinbw = spinbw;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  用料M2
	 */

	@Column(name ="SPINBX",nullable=true,scale=3,length=15)
	public java.lang.Double getSpinbx(){
		return this.spinbx;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  用料M2
	 */
	public void setSpinbx(java.lang.Double spinbx){
		this.spinbx = spinbx;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  损率
	 */

	@Column(name ="SPINBY",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinby(){
		return this.spinby;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  损率
	 */
	public void setSpinby(java.lang.Double spinby){
		this.spinby = spinby;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  KG
	 */

	@Column(name ="SPINBZ",nullable=true,scale=3,length=15)
	public java.lang.Double getSpinbz(){
		return this.spinbz;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  KG
	 */
	public void setSpinbz(java.lang.Double spinbz){
		this.spinbz = spinbz;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  单价
	 */

	@Column(name ="SPINBAA",nullable=true,scale=1,length=15)
	public java.lang.Double getSpinbaa(){
		return this.spinbaa;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  单价
	 */
	public void setSpinbaa(java.lang.Double spinbaa){
		this.spinbaa = spinbaa;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  金额
	 */

	@Column(name ="SPINBAB",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinbab(){
		return this.spinbab;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  金额
	 */
	public void setSpinbab(java.lang.Double spinbab){
		this.spinbab = spinbab;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  克重
	 */

	@Column(name ="SPINBAC",nullable=true,length=15)
	public java.lang.Double getSpinbac(){
		return this.spinbac;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  克重
	 */
	public void setSpinbac(java.lang.Double spinbac){
		this.spinbac = spinbac;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  用料M2
	 */

	@Column(name ="SPINBAD",nullable=true,scale=3,length=15)
	public java.lang.Double getSpinbad(){
		return this.spinbad;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  用料M2
	 */
	public void setSpinbad(java.lang.Double spinbad){
		this.spinbad = spinbad;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  损率
	 */

	@Column(name ="SPINBAE",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinbae(){
		return this.spinbae;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  损率
	 */
	public void setSpinbae(java.lang.Double spinbae){
		this.spinbae = spinbae;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  KG
	 */

	@Column(name ="SPINBAF",nullable=true,scale=3,length=15)
	public java.lang.Double getSpinbaf(){
		return this.spinbaf;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  KG
	 */
	public void setSpinbaf(java.lang.Double spinbaf){
		this.spinbaf = spinbaf;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  单价
	 */

	@Column(name ="SPINBAG",nullable=true,scale=1,length=15)
	public java.lang.Double getSpinbag(){
		return this.spinbag;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  单价
	 */
	public void setSpinbag(java.lang.Double spinbag){
		this.spinbag = spinbag;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  金额
	 */

	@Column(name ="SPINBAH",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinbah(){
		return this.spinbah;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  金额
	 */
	public void setSpinbah(java.lang.Double spinbah){
		this.spinbah = spinbah;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  备注
	 */

	@Column(name ="SPINBAI",nullable=true,length=50)
	public java.lang.String getSpinbai(){
		return this.spinbai;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  备注
	 */
	public void setSpinbai(java.lang.String spinbai){
		this.spinbai = spinbai;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  尺码选
	 */

	@Column(name ="SPINCE",nullable=true,scale=2,length=15)
	public java.lang.Double getSpince(){
		return this.spince;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  尺码选
	 */
	public void setSpince(java.lang.Double spince){
		this.spince = spince;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  衣长
	 */

	@Column(name ="SPINCF",nullable=true,length=15)
	public java.lang.Double getSpincf(){
		return this.spincf;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  衣长
	 */
	public void setSpincf(java.lang.Double spincf){
		this.spincf = spincf;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  减
	 */

	@Column(name ="SPINCG",nullable=true,length=15)
	public java.lang.Double getSpincg(){
		return this.spincg;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  减
	 */
	public void setSpincg(java.lang.Double spincg){
		this.spincg = spincg;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  胸围
	 */

	@Column(name ="SPINCH",nullable=true,length=15)
	public java.lang.Double getSpinch(){
		return this.spinch;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  胸围
	 */
	public void setSpinch(java.lang.Double spinch){
		this.spinch = spinch;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  数量
	 */

	@Column(name ="SPINCI",nullable=true,length=15)
	public java.lang.Double getSpinci(){
		return this.spinci;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  数量
	 */
	public void setSpinci(java.lang.Double spinci){
		this.spinci = spinci;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  M2
	 */

	@Column(name ="SPINCJ",nullable=true,scale=3,length=15)
	public java.lang.Double getSpincj(){
		return this.spincj;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  M2
	 */
	public void setSpincj(java.lang.Double spincj){
		this.spincj = spincj;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  袖长
	 */

	@Column(name ="SPINCK",nullable=true,length=15)
	public java.lang.Double getSpinck(){
		return this.spinck;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  袖长
	 */
	public void setSpinck(java.lang.Double spinck){
		this.spinck = spinck;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  减
	 */

	@Column(name ="SPINCL",nullable=true,length=15)
	public java.lang.Double getSpincl(){
		return this.spincl;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  减
	 */
	public void setSpincl(java.lang.Double spincl){
		this.spincl = spincl;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  袖肥
	 */

	@Column(name ="SPINCM",nullable=true,length=15)
	public java.lang.Double getSpincm(){
		return this.spincm;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  袖肥
	 */
	public void setSpincm(java.lang.Double spincm){
		this.spincm = spincm;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  数量
	 */

	@Column(name ="SPINCN",nullable=true,length=15)
	public java.lang.Double getSpincn(){
		return this.spincn;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  数量
	 */
	public void setSpincn(java.lang.Double spincn){
		this.spincn = spincn;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  M2
	 */

	@Column(name ="SPINCO",nullable=true,scale=3,length=15)
	public java.lang.Double getSpinco(){
		return this.spinco;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  M2
	 */
	public void setSpinco(java.lang.Double spinco){
		this.spinco = spinco;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  帽长
	 */

	@Column(name ="SPINCP",nullable=true,length=15)
	public java.lang.Double getSpincp(){
		return this.spincp;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  帽长
	 */
	public void setSpincp(java.lang.Double spincp){
		this.spincp = spincp;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  帽宽
	 */

	@Column(name ="SPINCQ",nullable=true,length=15)
	public java.lang.Double getSpincq(){
		return this.spincq;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  帽宽
	 */
	public void setSpincq(java.lang.Double spincq){
		this.spincq = spincq;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  数量
	 */

	@Column(name ="SPINCR",nullable=true,length=15)
	public java.lang.Double getSpincr(){
		return this.spincr;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  数量
	 */
	public void setSpincr(java.lang.Double spincr){
		this.spincr = spincr;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  M2
	 */

	@Column(name ="SPINCS",nullable=true,scale=3,length=15)
	public java.lang.Double getSpincs(){
		return this.spincs;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  M2
	 */
	public void setSpincs(java.lang.Double spincs){
		this.spincs = spincs;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  领宽
	 */

	@Column(name ="SPINCT",nullable=true,length=15)
	public java.lang.Double getSpinct(){
		return this.spinct;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  领宽
	 */
	public void setSpinct(java.lang.Double spinct){
		this.spinct = spinct;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  领高
	 */

	@Column(name ="SPINCU",nullable=true,length=15)
	public java.lang.Double getSpincu(){
		return this.spincu;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  领高
	 */
	public void setSpincu(java.lang.Double spincu){
		this.spincu = spincu;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  数量
	 */

	@Column(name ="SPINCV",nullable=true,length=15)
	public java.lang.Double getSpincv(){
		return this.spincv;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  数量
	 */
	public void setSpincv(java.lang.Double spincv){
		this.spincv = spincv;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  M2
	 */

	@Column(name ="SPINCW",nullable=true,scale=3,length=15)
	public java.lang.Double getSpincw(){
		return this.spincw;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  M2
	 */
	public void setSpincw(java.lang.Double spincw){
		this.spincw = spincw;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  襟长
	 */

	@Column(name ="SPINCX",nullable=true,length=15)
	public java.lang.Double getSpincx(){
		return this.spincx;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  襟长
	 */
	public void setSpincx(java.lang.Double spincx){
		this.spincx = spincx;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  襟宽
	 */

	@Column(name ="SPINCY",nullable=true,length=15)
	public java.lang.Double getSpincy(){
		return this.spincy;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  襟宽
	 */
	public void setSpincy(java.lang.Double spincy){
		this.spincy = spincy;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  数量
	 */

	@Column(name ="SPINCZ",nullable=true,length=15)
	public java.lang.Double getSpincz(){
		return this.spincz;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  数量
	 */
	public void setSpincz(java.lang.Double spincz){
		this.spincz = spincz;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  M2
	 */

	@Column(name ="SPINCAA",nullable=true,scale=3,length=15)
	public java.lang.Double getSpincaa(){
		return this.spincaa;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  M2
	 */
	public void setSpincaa(java.lang.Double spincaa){
		this.spincaa = spincaa;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  袋长
	 */

	@Column(name ="SPINCAB",nullable=true,length=15)
	public java.lang.Double getSpincab(){
		return this.spincab;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  袋长
	 */
	public void setSpincab(java.lang.Double spincab){
		this.spincab = spincab;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  袋宽
	 */

	@Column(name ="SPINCAC",nullable=true,length=15)
	public java.lang.Double getSpincac(){
		return this.spincac;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  袋宽
	 */
	public void setSpincac(java.lang.Double spincac){
		this.spincac = spincac;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  数量
	 */

	@Column(name ="SPINCAD",nullable=true,length=15)
	public java.lang.Double getSpincad(){
		return this.spincad;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  数量
	 */
	public void setSpincad(java.lang.Double spincad){
		this.spincad = spincad;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  M2
	 */

	@Column(name ="SPINCAE",nullable=true,scale=3,length=15)
	public java.lang.Double getSpincae(){
		return this.spincae;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  M2
	 */
	public void setSpincae(java.lang.Double spincae){
		this.spincae = spincae;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  长
	 */

	@Column(name ="SPINCAF",nullable=true,length=15)
	public java.lang.Double getSpincaf(){
		return this.spincaf;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  长
	 */
	public void setSpincaf(java.lang.Double spincaf){
		this.spincaf = spincaf;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  宽
	 */

	@Column(name ="SPINCAG",nullable=true,length=15)
	public java.lang.Double getSpincag(){
		return this.spincag;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  宽
	 */
	public void setSpincag(java.lang.Double spincag){
		this.spincag = spincag;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  数量
	 */

	@Column(name ="SPINCAH",nullable=true,length=15)
	public java.lang.Double getSpincah(){
		return this.spincah;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  数量
	 */
	public void setSpincah(java.lang.Double spincah){
		this.spincah = spincah;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  M2
	 */

	@Column(name ="SPINCAI",nullable=true,scale=3,length=15)
	public java.lang.Double getSpincai(){
		return this.spincai;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  M2
	 */
	public void setSpincai(java.lang.Double spincai){
		this.spincai = spincai;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  裤长
	 */

	@Column(name ="SPINCAJ",nullable=true,length=15)
	public java.lang.Double getSpincaj(){
		return this.spincaj;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  裤长
	 */
	public void setSpincaj(java.lang.Double spincaj){
		this.spincaj = spincaj;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  减
	 */

	@Column(name ="SPINCAK",nullable=true,length=15)
	public java.lang.Double getSpincak(){
		return this.spincak;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  减
	 */
	public void setSpincak(java.lang.Double spincak){
		this.spincak = spincak;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  脾围
	 */

	@Column(name ="SPINCAL",nullable=true,length=15)
	public java.lang.Double getSpincal(){
		return this.spincal;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  脾围
	 */
	public void setSpincal(java.lang.Double spincal){
		this.spincal = spincal;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  数量
	 */

	@Column(name ="SPINCAM",nullable=true,length=15)
	public java.lang.Double getSpincam(){
		return this.spincam;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  数量
	 */
	public void setSpincam(java.lang.Double spincam){
		this.spincam = spincam;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  M2
	 */

	@Column(name ="SPINCAN",nullable=true,scale=3,length=15)
	public java.lang.Double getSpincan(){
		return this.spincan;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  M2
	 */
	public void setSpincan(java.lang.Double spincan){
		this.spincan = spincan;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  加误率
	 */

	@Column(name ="SPINCAO",nullable=true,scale=2,length=15)
	public java.lang.Double getSpincao(){
		return this.spincao;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  加误率
	 */
	public void setSpincao(java.lang.Double spincao){
		this.spincao = spincao;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  直
	 */

	@Column(name ="SPINCAP",nullable=true,length=15)
	public java.lang.Double getSpincap(){
		return this.spincap;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  直
	 */
	public void setSpincap(java.lang.Double spincap){
		this.spincap = spincap;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  横
	 */

	@Column(name ="SPINCAQ",nullable=true,length=15)
	public java.lang.Double getSpincaq(){
		return this.spincaq;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  横
	 */
	public void setSpincaq(java.lang.Double spincaq){
		this.spincaq = spincaq;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  合
	 */

	@Column(name ="SPINCAR",nullable=true,length=15)
	public java.lang.Double getSpincar(){
		return this.spincar;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  合
	 */
	public void setSpincar(java.lang.Double spincar){
		this.spincar = spincar;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  合计M2
	 */

	@Column(name ="SPINCAS",nullable=true,scale=3,length=15)
	public java.lang.Double getSpincas(){
		return this.spincas;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  合计M2
	 */
	public void setSpincas(java.lang.Double spincas){
		this.spincas = spincas;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  备注
	 */

	@Column(name ="SPINCAT",nullable=true,length=50)
	public java.lang.String getSpincat(){
		return this.spincat;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  备注
	 */
	public void setSpincat(java.lang.String spincat){
		this.spincat = spincat;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  衣长
	 */

	@Column(name ="SPINDF",nullable=true,length=15)
	public java.lang.Double getSpindf(){
		return this.spindf;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  衣长
	 */
	public void setSpindf(java.lang.Double spindf){
		this.spindf = spindf;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  减
	 */

	@Column(name ="SPINDG",nullable=true,length=15)
	public java.lang.Double getSpindg(){
		return this.spindg;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  减
	 */
	public void setSpindg(java.lang.Double spindg){
		this.spindg = spindg;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  胸围
	 */

	@Column(name ="SPINDH",nullable=true,length=15)
	public java.lang.Double getSpindh(){
		return this.spindh;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  胸围
	 */
	public void setSpindh(java.lang.Double spindh){
		this.spindh = spindh;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  数量
	 */

	@Column(name ="SPINDI",nullable=true,length=15)
	public java.lang.Double getSpindi(){
		return this.spindi;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  数量
	 */
	public void setSpindi(java.lang.Double spindi){
		this.spindi = spindi;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  M2
	 */

	@Column(name ="SPINDJ",nullable=true,scale=3,length=15)
	public java.lang.Double getSpindj(){
		return this.spindj;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  M2
	 */
	public void setSpindj(java.lang.Double spindj){
		this.spindj = spindj;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  袖长
	 */

	@Column(name ="SPINDK",nullable=true,length=15)
	public java.lang.Double getSpindk(){
		return this.spindk;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  袖长
	 */
	public void setSpindk(java.lang.Double spindk){
		this.spindk = spindk;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  减
	 */

	@Column(name ="SPINDL",nullable=true,length=15)
	public java.lang.Double getSpindl(){
		return this.spindl;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  减
	 */
	public void setSpindl(java.lang.Double spindl){
		this.spindl = spindl;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  袖肥
	 */

	@Column(name ="SPINDM",nullable=true,length=15)
	public java.lang.Double getSpindm(){
		return this.spindm;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  袖肥
	 */
	public void setSpindm(java.lang.Double spindm){
		this.spindm = spindm;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  数量
	 */

	@Column(name ="SPINDN",nullable=true,length=15)
	public java.lang.Double getSpindn(){
		return this.spindn;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  数量
	 */
	public void setSpindn(java.lang.Double spindn){
		this.spindn = spindn;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  M2
	 */

	@Column(name ="SPINDO",nullable=true,scale=3,length=15)
	public java.lang.Double getSpindo(){
		return this.spindo;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  M2
	 */
	public void setSpindo(java.lang.Double spindo){
		this.spindo = spindo;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  帽长
	 */

	@Column(name ="SPINDP",nullable=true,length=15)
	public java.lang.Double getSpindp(){
		return this.spindp;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  帽长
	 */
	public void setSpindp(java.lang.Double spindp){
		this.spindp = spindp;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  帽宽
	 */

	@Column(name ="SPINDQ",nullable=true,length=15)
	public java.lang.Double getSpindq(){
		return this.spindq;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  帽宽
	 */
	public void setSpindq(java.lang.Double spindq){
		this.spindq = spindq;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  数量
	 */

	@Column(name ="SPINDR",nullable=true,length=15)
	public java.lang.Double getSpindr(){
		return this.spindr;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  数量
	 */
	public void setSpindr(java.lang.Double spindr){
		this.spindr = spindr;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  M2
	 */

	@Column(name ="SPINDS",nullable=true,scale=3,length=15)
	public java.lang.Double getSpinds(){
		return this.spinds;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  M2
	 */
	public void setSpinds(java.lang.Double spinds){
		this.spinds = spinds;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  领宽
	 */

	@Column(name ="SPINDT",nullable=true,length=15)
	public java.lang.Double getSpindt(){
		return this.spindt;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  领宽
	 */
	public void setSpindt(java.lang.Double spindt){
		this.spindt = spindt;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  领高
	 */

	@Column(name ="SPINDU",nullable=true,length=15)
	public java.lang.Double getSpindu(){
		return this.spindu;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  领高
	 */
	public void setSpindu(java.lang.Double spindu){
		this.spindu = spindu;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  数量
	 */

	@Column(name ="SPINDV",nullable=true,length=15)
	public java.lang.Double getSpindv(){
		return this.spindv;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  数量
	 */
	public void setSpindv(java.lang.Double spindv){
		this.spindv = spindv;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  M2
	 */

	@Column(name ="SPINDW",nullable=true,scale=3,length=15)
	public java.lang.Double getSpindw(){
		return this.spindw;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  M2
	 */
	public void setSpindw(java.lang.Double spindw){
		this.spindw = spindw;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  加误率
	 */

	@Column(name ="SPINDX",nullable=true,scale=2,length=15)
	public java.lang.Double getSpindx(){
		return this.spindx;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  加误率
	 */
	public void setSpindx(java.lang.Double spindx){
		this.spindx = spindx;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  直
	 */

	@Column(name ="SPINDY",nullable=true,length=15)
	public java.lang.Double getSpindy(){
		return this.spindy;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  直
	 */
	public void setSpindy(java.lang.Double spindy){
		this.spindy = spindy;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  横
	 */

	@Column(name ="SPINDZ",nullable=true,length=15)
	public java.lang.Double getSpindz(){
		return this.spindz;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  横
	 */
	public void setSpindz(java.lang.Double spindz){
		this.spindz = spindz;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  合计
	 */

	@Column(name ="SPINDAA",nullable=true,length=15)
	public java.lang.Double getSpindaa(){
		return this.spindaa;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  合计
	 */
	public void setSpindaa(java.lang.Double spindaa){
		this.spindaa = spindaa;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  合计M2
	 */

	@Column(name ="SPINDAB",nullable=true,scale=3,length=15)
	public java.lang.Double getSpindab(){
		return this.spindab;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  合计M2
	 */
	public void setSpindab(java.lang.Double spindab){
		this.spindab = spindab;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  备注
	 */

	@Column(name ="SPINDAC",nullable=true,length=50)
	public java.lang.String getSpindac(){
		return this.spindac;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  备注
	 */
	public void setSpindac(java.lang.String spindac){
		this.spindac = spindac;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  衣长
	 */

	@Column(name ="SPINEF",nullable=true,length=15)
	public java.lang.Double getSpinef(){
		return this.spinef;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  衣长
	 */
	public void setSpinef(java.lang.Double spinef){
		this.spinef = spinef;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  减
	 */

	@Column(name ="SPINEG",nullable=true,length=15)
	public java.lang.Double getSpineg(){
		return this.spineg;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  减
	 */
	public void setSpineg(java.lang.Double spineg){
		this.spineg = spineg;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  胸围
	 */

	@Column(name ="SPINEH",nullable=true,length=15)
	public java.lang.Double getSpineh(){
		return this.spineh;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  胸围
	 */
	public void setSpineh(java.lang.Double spineh){
		this.spineh = spineh;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  数量
	 */

	@Column(name ="SPINEI",nullable=true,length=15)
	public java.lang.Double getSpinei(){
		return this.spinei;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  数量
	 */
	public void setSpinei(java.lang.Double spinei){
		this.spinei = spinei;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  M2
	 */

	@Column(name ="SPINEJ",nullable=true,scale=3,length=15)
	public java.lang.Double getSpinej(){
		return this.spinej;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  M2
	 */
	public void setSpinej(java.lang.Double spinej){
		this.spinej = spinej;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  袖长
	 */

	@Column(name ="SPINEK",nullable=true,length=15)
	public java.lang.Double getSpinek(){
		return this.spinek;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  袖长
	 */
	public void setSpinek(java.lang.Double spinek){
		this.spinek = spinek;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  减
	 */

	@Column(name ="SPINEL",nullable=true,length=15)
	public java.lang.Double getSpinel(){
		return this.spinel;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  减
	 */
	public void setSpinel(java.lang.Double spinel){
		this.spinel = spinel;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  袖肥
	 */

	@Column(name ="SPINEM",nullable=true,length=15)
	public java.lang.Double getSpinem(){
		return this.spinem;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  袖肥
	 */
	public void setSpinem(java.lang.Double spinem){
		this.spinem = spinem;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  数量
	 */

	@Column(name ="SPINEN",nullable=true,length=15)
	public java.lang.Double getSpinen(){
		return this.spinen;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  数量
	 */
	public void setSpinen(java.lang.Double spinen){
		this.spinen = spinen;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  M2
	 */

	@Column(name ="SPINEO",nullable=true,scale=3,length=15)
	public java.lang.Double getSpineo(){
		return this.spineo;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  M2
	 */
	public void setSpineo(java.lang.Double spineo){
		this.spineo = spineo;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  帽长
	 */

	@Column(name ="SPINEP",nullable=true,length=15)
	public java.lang.Double getSpinep(){
		return this.spinep;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  帽长
	 */
	public void setSpinep(java.lang.Double spinep){
		this.spinep = spinep;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  帽宽
	 */

	@Column(name ="SPINEQ",nullable=true,length=15)
	public java.lang.Double getSpineq(){
		return this.spineq;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  帽宽
	 */
	public void setSpineq(java.lang.Double spineq){
		this.spineq = spineq;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  数量
	 */

	@Column(name ="SPINER",nullable=true,length=15)
	public java.lang.Double getSpiner(){
		return this.spiner;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  数量
	 */
	public void setSpiner(java.lang.Double spiner){
		this.spiner = spiner;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  M2
	 */

	@Column(name ="SPINES",nullable=true,scale=3,length=15)
	public java.lang.Double getSpines(){
		return this.spines;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  M2
	 */
	public void setSpines(java.lang.Double spines){
		this.spines = spines;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  领宽
	 */

	@Column(name ="SPINET",nullable=true,length=15)
	public java.lang.Double getSpinet(){
		return this.spinet;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  领宽
	 */
	public void setSpinet(java.lang.Double spinet){
		this.spinet = spinet;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  领高
	 */

	@Column(name ="SPINEU",nullable=true,length=15)
	public java.lang.Double getSpineu(){
		return this.spineu;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  领高
	 */
	public void setSpineu(java.lang.Double spineu){
		this.spineu = spineu;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  数量
	 */

	@Column(name ="SPINEV",nullable=true,length=15)
	public java.lang.Double getSpinev(){
		return this.spinev;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  数量
	 */
	public void setSpinev(java.lang.Double spinev){
		this.spinev = spinev;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  M2
	 */

	@Column(name ="SPINEW",nullable=true,scale=3,length=15)
	public java.lang.Double getSpinew(){
		return this.spinew;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  M2
	 */
	public void setSpinew(java.lang.Double spinew){
		this.spinew = spinew;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  襟长
	 */

	@Column(name ="SPINEX",nullable=true,length=15)
	public java.lang.Double getSpinex(){
		return this.spinex;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  襟长
	 */
	public void setSpinex(java.lang.Double spinex){
		this.spinex = spinex;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  襟宽
	 */

	@Column(name ="SPINEY",nullable=true,length=15)
	public java.lang.Double getSpiney(){
		return this.spiney;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  襟宽
	 */
	public void setSpiney(java.lang.Double spiney){
		this.spiney = spiney;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  数量
	 */

	@Column(name ="SPINEZ",nullable=true,length=15)
	public java.lang.Double getSpinez(){
		return this.spinez;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  数量
	 */
	public void setSpinez(java.lang.Double spinez){
		this.spinez = spinez;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  M2
	 */

	@Column(name ="SPINEAA",nullable=true,scale=3,length=15)
	public java.lang.Double getSpineaa(){
		return this.spineaa;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  M2
	 */
	public void setSpineaa(java.lang.Double spineaa){
		this.spineaa = spineaa;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  袋长
	 */

	@Column(name ="SPINEAB",nullable=true,length=15)
	public java.lang.Double getSpineab(){
		return this.spineab;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  袋长
	 */
	public void setSpineab(java.lang.Double spineab){
		this.spineab = spineab;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  袋宽
	 */

	@Column(name ="SPINEAC",nullable=true,length=15)
	public java.lang.Double getSpineac(){
		return this.spineac;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  袋宽
	 */
	public void setSpineac(java.lang.Double spineac){
		this.spineac = spineac;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  数量
	 */

	@Column(name ="SPINEAD",nullable=true,length=15)
	public java.lang.Double getSpinead(){
		return this.spinead;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  数量
	 */
	public void setSpinead(java.lang.Double spinead){
		this.spinead = spinead;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  M2
	 */

	@Column(name ="SPINEAE",nullable=true,scale=3,length=15)
	public java.lang.Double getSpineae(){
		return this.spineae;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  M2
	 */
	public void setSpineae(java.lang.Double spineae){
		this.spineae = spineae;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  长
	 */

	@Column(name ="SPINEAF",nullable=true,length=15)
	public java.lang.Double getSpineaf(){
		return this.spineaf;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  长
	 */
	public void setSpineaf(java.lang.Double spineaf){
		this.spineaf = spineaf;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  宽
	 */

	@Column(name ="SPINEAG",nullable=true,length=15)
	public java.lang.Double getSpineag(){
		return this.spineag;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  宽
	 */
	public void setSpineag(java.lang.Double spineag){
		this.spineag = spineag;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  数量
	 */

	@Column(name ="SPINEAH",nullable=true,length=15)
	public java.lang.Double getSpineah(){
		return this.spineah;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  数量
	 */
	public void setSpineah(java.lang.Double spineah){
		this.spineah = spineah;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  M2
	 */

	@Column(name ="SPINEAI",nullable=true,scale=3,length=15)
	public java.lang.Double getSpineai(){
		return this.spineai;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  M2
	 */
	public void setSpineai(java.lang.Double spineai){
		this.spineai = spineai;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  裤长
	 */

	@Column(name ="SPINEAJ",nullable=true,length=15)
	public java.lang.Double getSpineaj(){
		return this.spineaj;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  裤长
	 */
	public void setSpineaj(java.lang.Double spineaj){
		this.spineaj = spineaj;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  减
	 */

	@Column(name ="SPINEAK",nullable=true,length=15)
	public java.lang.Double getSpineak(){
		return this.spineak;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  减
	 */
	public void setSpineak(java.lang.Double spineak){
		this.spineak = spineak;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  脾围
	 */

	@Column(name ="SPINEAL",nullable=true,length=15)
	public java.lang.Double getSpineal(){
		return this.spineal;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  脾围
	 */
	public void setSpineal(java.lang.Double spineal){
		this.spineal = spineal;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  数量
	 */

	@Column(name ="SPINEAM",nullable=true,length=15)
	public java.lang.Double getSpineam(){
		return this.spineam;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  数量
	 */
	public void setSpineam(java.lang.Double spineam){
		this.spineam = spineam;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  M2
	 */

	@Column(name ="SPINEAN",nullable=true,scale=3,length=15)
	public java.lang.Double getSpinean(){
		return this.spinean;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  M2
	 */
	public void setSpinean(java.lang.Double spinean){
		this.spinean = spinean;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  加误率
	 */

	@Column(name ="SPINEAO",nullable=true,scale=2,length=15)
	public java.lang.Double getSpineao(){
		return this.spineao;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  加误率
	 */
	public void setSpineao(java.lang.Double spineao){
		this.spineao = spineao;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  直
	 */

	@Column(name ="SPINEAP",nullable=true,length=15)
	public java.lang.Double getSpineap(){
		return this.spineap;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  直
	 */
	public void setSpineap(java.lang.Double spineap){
		this.spineap = spineap;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  横
	 */

	@Column(name ="SPINEAQ",nullable=true,length=15)
	public java.lang.Double getSpineaq(){
		return this.spineaq;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  横
	 */
	public void setSpineaq(java.lang.Double spineaq){
		this.spineaq = spineaq;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  合计
	 */

	@Column(name ="SPINEAR",nullable=true,length=15)
	public java.lang.Double getSpinear(){
		return this.spinear;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  合计
	 */
	public void setSpinear(java.lang.Double spinear){
		this.spinear = spinear;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  合计M2
	 */

	@Column(name ="SPINEAS",nullable=true,scale=3,length=15)
	public java.lang.Double getSpineas(){
		return this.spineas;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  合计M2
	 */
	public void setSpineas(java.lang.Double spineas){
		this.spineas = spineas;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  备注
	 */

	@Column(name ="SPINEAT",nullable=true,length=50)
	public java.lang.String getSpineat(){
		return this.spineat;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  备注
	 */
	public void setSpineat(java.lang.String spineat){
		this.spineat = spineat;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  衣长
	 */

	@Column(name ="SPINFF",nullable=true,length=15)
	public java.lang.Double getSpinff(){
		return this.spinff;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  衣长
	 */
	public void setSpinff(java.lang.Double spinff){
		this.spinff = spinff;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  减
	 */

	@Column(name ="SPINFG",nullable=true,length=15)
	public java.lang.Double getSpinfg(){
		return this.spinfg;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  减
	 */
	public void setSpinfg(java.lang.Double spinfg){
		this.spinfg = spinfg;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  胸围
	 */

	@Column(name ="SPINFH",nullable=true,length=15)
	public java.lang.Double getSpinfh(){
		return this.spinfh;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  胸围
	 */
	public void setSpinfh(java.lang.Double spinfh){
		this.spinfh = spinfh;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  数量
	 */

	@Column(name ="SPINFI",nullable=true,length=15)
	public java.lang.Double getSpinfi(){
		return this.spinfi;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  数量
	 */
	public void setSpinfi(java.lang.Double spinfi){
		this.spinfi = spinfi;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  M2
	 */

	@Column(name ="SPINFJ",nullable=true,scale=3,length=15)
	public java.lang.Double getSpinfj(){
		return this.spinfj;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  M2
	 */
	public void setSpinfj(java.lang.Double spinfj){
		this.spinfj = spinfj;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  袖长
	 */

	@Column(name ="SPINFK",nullable=true,length=15)
	public java.lang.Double getSpinfk(){
		return this.spinfk;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  袖长
	 */
	public void setSpinfk(java.lang.Double spinfk){
		this.spinfk = spinfk;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  减
	 */

	@Column(name ="SPINFL",nullable=true,length=15)
	public java.lang.Double getSpinfl(){
		return this.spinfl;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  减
	 */
	public void setSpinfl(java.lang.Double spinfl){
		this.spinfl = spinfl;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  袖肥
	 */

	@Column(name ="SPINFM",nullable=true,length=15)
	public java.lang.Double getSpinfm(){
		return this.spinfm;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  袖肥
	 */
	public void setSpinfm(java.lang.Double spinfm){
		this.spinfm = spinfm;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  数量
	 */

	@Column(name ="SPINFN",nullable=true,length=15)
	public java.lang.Double getSpinfn(){
		return this.spinfn;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  数量
	 */
	public void setSpinfn(java.lang.Double spinfn){
		this.spinfn = spinfn;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  M2
	 */

	@Column(name ="SPINFO",nullable=true,scale=3,length=15)
	public java.lang.Double getSpinfo(){
		return this.spinfo;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  M2
	 */
	public void setSpinfo(java.lang.Double spinfo){
		this.spinfo = spinfo;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  帽长
	 */

	@Column(name ="SPINFP",nullable=true,length=15)
	public java.lang.Double getSpinfp(){
		return this.spinfp;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  帽长
	 */
	public void setSpinfp(java.lang.Double spinfp){
		this.spinfp = spinfp;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  帽宽
	 */

	@Column(name ="SPINFQ",nullable=true,length=15)
	public java.lang.Double getSpinfq(){
		return this.spinfq;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  帽宽
	 */
	public void setSpinfq(java.lang.Double spinfq){
		this.spinfq = spinfq;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  数量
	 */

	@Column(name ="SPINFR",nullable=true,length=15)
	public java.lang.Double getSpinfr(){
		return this.spinfr;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  数量
	 */
	public void setSpinfr(java.lang.Double spinfr){
		this.spinfr = spinfr;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  M2
	 */

	@Column(name ="SPINFS",nullable=true,scale=3,length=15)
	public java.lang.Double getSpinfs(){
		return this.spinfs;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  M2
	 */
	public void setSpinfs(java.lang.Double spinfs){
		this.spinfs = spinfs;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  领宽
	 */

	@Column(name ="SPINFT",nullable=true,length=15)
	public java.lang.Double getSpinft(){
		return this.spinft;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  领宽
	 */
	public void setSpinft(java.lang.Double spinft){
		this.spinft = spinft;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  领高
	 */

	@Column(name ="SPINFU",nullable=true,length=15)
	public java.lang.Double getSpinfu(){
		return this.spinfu;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  领高
	 */
	public void setSpinfu(java.lang.Double spinfu){
		this.spinfu = spinfu;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  数量
	 */

	@Column(name ="SPINFV",nullable=true,length=15)
	public java.lang.Double getSpinfv(){
		return this.spinfv;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  数量
	 */
	public void setSpinfv(java.lang.Double spinfv){
		this.spinfv = spinfv;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  M2
	 */

	@Column(name ="SPINFW",nullable=true,scale=3,length=15)
	public java.lang.Double getSpinfw(){
		return this.spinfw;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  M2
	 */
	public void setSpinfw(java.lang.Double spinfw){
		this.spinfw = spinfw;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  加误率
	 */

	@Column(name ="SPINFX",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinfx(){
		return this.spinfx;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  加误率
	 */
	public void setSpinfx(java.lang.Double spinfx){
		this.spinfx = spinfx;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  直
	 */

	@Column(name ="SPINFY",nullable=true,length=15)
	public java.lang.Double getSpinfy(){
		return this.spinfy;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  直
	 */
	public void setSpinfy(java.lang.Double spinfy){
		this.spinfy = spinfy;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  横
	 */

	@Column(name ="SPINFZ",nullable=true,length=15)
	public java.lang.Double getSpinfz(){
		return this.spinfz;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  横
	 */
	public void setSpinfz(java.lang.Double spinfz){
		this.spinfz = spinfz;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  合计
	 */

	@Column(name ="SPINFAA",nullable=true,length=15)
	public java.lang.Double getSpinfaa(){
		return this.spinfaa;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  合计
	 */
	public void setSpinfaa(java.lang.Double spinfaa){
		this.spinfaa = spinfaa;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  合计M2
	 */

	@Column(name ="SPINFAB",nullable=true,scale=3,length=15)
	public java.lang.Double getSpinfab(){
		return this.spinfab;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  合计M2
	 */
	public void setSpinfab(java.lang.Double spinfab){
		this.spinfab = spinfab;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  备注
	 */

	@Column(name ="SPINFAC",nullable=true,length=50)
	public java.lang.String getSpinfac(){
		return this.spinfac;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  备注
	 */
	public void setSpinfac(java.lang.String spinfac){
		this.spinfac = spinfac;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  领宽
	 */

	@Column(name ="SPINGF",nullable=true,length=15)
	public java.lang.Double getSpingf(){
		return this.spingf;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  领宽
	 */
	public void setSpingf(java.lang.Double spingf){
		this.spingf = spingf;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  领高
	 */

	@Column(name ="SPINGG",nullable=true,length=15)
	public java.lang.Double getSpingg(){
		return this.spingg;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  领高
	 */
	public void setSpingg(java.lang.Double spingg){
		this.spingg = spingg;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  数量
	 */

	@Column(name ="SPINGH",nullable=true,length=15)
	public java.lang.Double getSpingh(){
		return this.spingh;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  数量
	 */
	public void setSpingh(java.lang.Double spingh){
		this.spingh = spingh;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  M2
	 */

	@Column(name ="SPINGI",nullable=true,scale=3,length=15)
	public java.lang.Double getSpingi(){
		return this.spingi;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  M2
	 */
	public void setSpingi(java.lang.Double spingi){
		this.spingi = spingi;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  12宽
	 */

	@Column(name ="SPINGJ",nullable=true,length=15)
	public java.lang.Double getSpingj(){
		return this.spingj;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  12宽
	 */
	public void setSpingj(java.lang.Double spingj){
		this.spingj = spingj;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  高
	 */

	@Column(name ="SPINGK",nullable=true,length=15)
	public java.lang.Double getSpingk(){
		return this.spingk;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  高
	 */
	public void setSpingk(java.lang.Double spingk){
		this.spingk = spingk;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  数量
	 */

	@Column(name ="SPINGL",nullable=true,length=15)
	public java.lang.Double getSpingl(){
		return this.spingl;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  数量
	 */
	public void setSpingl(java.lang.Double spingl){
		this.spingl = spingl;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  M2
	 */

	@Column(name ="SPINGM",nullable=true,scale=3,length=15)
	public java.lang.Double getSpingm(){
		return this.spingm;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  M2
	 */
	public void setSpingm(java.lang.Double spingm){
		this.spingm = spingm;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  12宽
	 */

	@Column(name ="SPINGN",nullable=true,length=15)
	public java.lang.Double getSpingn(){
		return this.spingn;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  12宽
	 */
	public void setSpingn(java.lang.Double spingn){
		this.spingn = spingn;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  高
	 */

	@Column(name ="SPINGO",nullable=true,length=15)
	public java.lang.Double getSpingo(){
		return this.spingo;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  高
	 */
	public void setSpingo(java.lang.Double spingo){
		this.spingo = spingo;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  数量
	 */

	@Column(name ="SPINGP",nullable=true,length=15)
	public java.lang.Double getSpingp(){
		return this.spingp;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  数量
	 */
	public void setSpingp(java.lang.Double spingp){
		this.spingp = spingp;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  M2
	 */

	@Column(name ="SPINGQ",nullable=true,scale=3,length=15)
	public java.lang.Double getSpingq(){
		return this.spingq;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  M2
	 */
	public void setSpingq(java.lang.Double spingq){
		this.spingq = spingq;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  加误率
	 */

	@Column(name ="SPINGR",nullable=true,scale=2,length=15)
	public java.lang.Double getSpingr(){
		return this.spingr;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  加误率
	 */
	public void setSpingr(java.lang.Double spingr){
		this.spingr = spingr;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  直
	 */

	@Column(name ="SPINGS",nullable=true,length=15)
	public java.lang.Double getSpings(){
		return this.spings;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  直
	 */
	public void setSpings(java.lang.Double spings){
		this.spings = spings;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  横
	 */

	@Column(name ="SPINGT",nullable=true,length=15)
	public java.lang.Double getSpingt(){
		return this.spingt;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  横
	 */
	public void setSpingt(java.lang.Double spingt){
		this.spingt = spingt;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  合计
	 */

	@Column(name ="SPINGU",nullable=true,length=15)
	public java.lang.Double getSpingu(){
		return this.spingu;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  合计
	 */
	public void setSpingu(java.lang.Double spingu){
		this.spingu = spingu;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  合计M2
	 */

	@Column(name ="SPINGV",nullable=true,scale=3,length=15)
	public java.lang.Double getSpingv(){
		return this.spingv;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  合计M2
	 */
	public void setSpingv(java.lang.Double spingv){
		this.spingv = spingv;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  备注
	 */

	@Column(name ="SPINGW",nullable=true,length=50)
	public java.lang.String getSpingw(){
		return this.spingw;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  备注
	 */
	public void setSpingw(java.lang.String spingw){
		this.spingw = spingw;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  订单数件
	 */

	@Column(name ="SPINHE",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinhe(){
		return this.spinhe;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  订单数件
	 */
	public void setSpinhe(java.lang.Double spinhe){
		this.spinhe = spinhe;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  三标
	 */

	@Column(name ="SPINHF",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinhf(){
		return this.spinhf;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  三标
	 */
	public void setSpinhf(java.lang.Double spinhf){
		this.spinhf = spinhf;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  装饰
	 */

	@Column(name ="SPINHG",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinhg(){
		return this.spinhg;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  装饰
	 */
	public void setSpinhg(java.lang.Double spinhg){
		this.spinhg = spinhg;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  缝线
	 */

	@Column(name ="SPINHH",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinhh(){
		return this.spinhh;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  缝线
	 */
	public void setSpinhh(java.lang.Double spinhh){
		this.spinhh = spinhh;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  绳带
	 */

	@Column(name ="SPINHI",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinhi(){
		return this.spinhi;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  绳带
	 */
	public void setSpinhi(java.lang.Double spinhi){
		this.spinhi = spinhi;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  贴条
	 */

	@Column(name ="SPINHJ",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinhj(){
		return this.spinhj;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  贴条
	 */
	public void setSpinhj(java.lang.Double spinhj){
		this.spinhj = spinhj;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  金属
	 */

	@Column(name ="SPINHK",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinhk(){
		return this.spinhk;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  金属
	 */
	public void setSpinhk(java.lang.Double spinhk){
		this.spinhk = spinhk;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  树脂
	 */

	@Column(name ="SPINHL",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinhl(){
		return this.spinhl;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  树脂
	 */
	public void setSpinhl(java.lang.Double spinhl){
		this.spinhl = spinhl;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  尼龙
	 */

	@Column(name ="SPINHM",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinhm(){
		return this.spinhm;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  尼龙
	 */
	public void setSpinhm(java.lang.Double spinhm){
		this.spinhm = spinhm;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  平
	 */

	@Column(name ="SPINHN",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinhn(){
		return this.spinhn;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  平
	 */
	public void setSpinhn(java.lang.Double spinhn){
		this.spinhn = spinhn;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  圆
	 */

	@Column(name ="SPINHO",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinho(){
		return this.spinho;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  圆
	 */
	public void setSpinho(java.lang.Double spinho){
		this.spinho = spinho;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  金属
	 */

	@Column(name ="SPINHP",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinhp(){
		return this.spinhp;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  金属
	 */
	public void setSpinhp(java.lang.Double spinhp){
		this.spinhp = spinhp;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  树脂
	 */

	@Column(name ="SPINHQ",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinhq(){
		return this.spinhq;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  树脂
	 */
	public void setSpinhq(java.lang.Double spinhq){
		this.spinhq = spinhq;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  控制
	 */

	@Column(name ="SPINHR",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinhr(){
		return this.spinhr;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  控制
	 */
	public void setSpinhr(java.lang.Double spinhr){
		this.spinhr = spinhr;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  气眼
	 */

	@Column(name ="SPINHS",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinhs(){
		return this.spinhs;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  气眼
	 */
	public void setSpinhs(java.lang.Double spinhs){
		this.spinhs = spinhs;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  粘衬
	 */

	@Column(name ="SPINHT",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinht(){
		return this.spinht;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  粘衬
	 */
	public void setSpinht(java.lang.Double spinht){
		this.spinht = spinht;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  其它
	 */

	@Column(name ="SPINHU",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinhu(){
		return this.spinhu;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  其它
	 */
	public void setSpinhu(java.lang.Double spinhu){
		this.spinhu = spinhu;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  辅料合计
	 */

	@Column(name ="SPINHV",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinhv(){
		return this.spinhv;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  辅料合计
	 */
	public void setSpinhv(java.lang.Double spinhv){
		this.spinhv = spinhv;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  吊牌
	 */

	@Column(name ="SPINHW",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinhw(){
		return this.spinhw;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  吊牌
	 */
	public void setSpinhw(java.lang.Double spinhw){
		this.spinhw = spinhw;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  贴纸
	 */

	@Column(name ="SPINHX",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinhx(){
		return this.spinhx;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  贴纸
	 */
	public void setSpinhx(java.lang.Double spinhx){
		this.spinhx = spinhx;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  拷贝纸
	 */

	@Column(name ="SPINHY",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinhy(){
		return this.spinhy;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  拷贝纸
	 */
	public void setSpinhy(java.lang.Double spinhy){
		this.spinhy = spinhy;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  防伪标
	 */

	@Column(name ="SPINHZ",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinhz(){
		return this.spinhz;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  防伪标
	 */
	public void setSpinhz(java.lang.Double spinhz){
		this.spinhz = spinhz;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  衣架
	 */

	@Column(name ="SPINHAA",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinhaa(){
		return this.spinhaa;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  衣架
	 */
	public void setSpinhaa(java.lang.Double spinhaa){
		this.spinhaa = spinhaa;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  胶袋
	 */

	@Column(name ="SPINHAB",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinhab(){
		return this.spinhab;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  胶袋
	 */
	public void setSpinhab(java.lang.Double spinhab){
		this.spinhab = spinhab;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  纸箱
	 */

	@Column(name ="SPINHAC",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinhac(){
		return this.spinhac;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  纸箱
	 */
	public void setSpinhac(java.lang.Double spinhac){
		this.spinhac = spinhac;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  其它
	 */

	@Column(name ="SPINHAD",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinhad(){
		return this.spinhad;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  其它
	 */
	public void setSpinhad(java.lang.Double spinhad){
		this.spinhad = spinhad;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  包装合计
	 */

	@Column(name ="SPINHAE",nullable=true,scale=2,length=15)
	public java.lang.Double getSpinhae(){
		return this.spinhae;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  包装合计
	 */
	public void setSpinhae(java.lang.Double spinhae){
		this.spinhae = spinhae;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  备注
	 */

	@Column(name ="SPINHAF",nullable=true,length=50)
	public java.lang.String getSpinhaf(){
		return this.spinhaf;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  备注
	 */
	public void setSpinhaf(java.lang.String spinhaf){
		this.spinhaf = spinhaf;
	}


	private List<BdSpinEntity> bdSpinList ;

	@Transient
	public List<BdSpinEntity> getBdSpinList() {
		return bdSpinList;
	}

	public void setBdSpinList(List<BdSpinEntity> bdSpinList) {
		this.bdSpinList = bdSpinList;
	}
}
