package com.jeecg.nbfz.entity;

import org.jeecgframework.poi.excel.annotation.Excel;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**   
 * @Title: Entity
 * @Description: bd_spin
 * @author onlineGenerator
 * @date 2017-12-09 15:37:07
 * @version V1.0   
 *
 */
@Entity
@Table(name = "bd_spin", schema = "")
@SuppressWarnings("serial")
public class BdSpinEntity implements java.io.Serializable {
	/**id*/
	private Integer id;
	/**创建人名称*/
	@Excel(name="创建人名称",width=15)
	private String createName;
	/**创建人登录名称*/
	@Excel(name="创建人登录名称",width=15)
	private String createBy;
	/**创建日期*/
	@Excel(name="创建日期",width=15,format = "yyyy-MM-dd")
	private Date createDate;
	/**更新人名称*/
	@Excel(name="更新人名称",width=15)
	private String updateName;
	/**更新人登录名称*/
	@Excel(name="更新人登录名称",width=15)
	private String updateBy;
	/**更新日期*/
	@Excel(name="更新日期",width=15,format = "yyyy-MM-dd")
	private Date updateDate;
	/**所属部门*/
	@Excel(name="所属部门",width=15)
	private String sysOrgCode;
	/**所属公司*/
	@Excel(name="所属公司",width=15)
	private String sysCompanyCode;
	/**流程状态*/
	@Excel(name="流程状态",width=15)
	private String bpmStatus;
	/**报价日期*/
	@Excel(name="报价日期",width=15,format = "yyyy-MM-dd")
	private Date spinaa;
	/**客户编号*/
	@Excel(name="客户编号",width=15)
	private String spinab;
	/**订单序号*/
	@Excel(name="订单序号",width=15)
	private String spinac;
	/**款号*/
	@Excel(name="款号",width=15)
	private String spinad;
	/**款式名*/
	@Excel(name="款式名",width=15)
	private String spinae;
	/**面料类型*/
	private String mllx;
	/**尺寸单位*/
	private String ccdw;
	/**订单件数*/
	@Excel(name="订单件数",width=15)
	private String spinaf;
	/**A1*/
	@Excel(name="A1",width=15)
	private String spinag;
	/**A2*/
	@Excel(name="A2",width=15)
	private String spinah;
	/**B1*/
	@Excel(name="B1",width=15)
	private String spinai;
	/**B2*/
	@Excel(name="B2",width=15)
	private String spinaj;
	/**C*/
	@Excel(name="C",width=15)
	private String spinak;
	/**其他*/
	@Excel(name="其他",width=15)
	private String spinal;
	/**辅料*/
	@Excel(name="辅料",width=15)
	private String spinam;
	/**包装*/
	@Excel(name="包装",width=15)
	private String spinan;
	/**印花*/
	@Excel(name="印花",width=15)
	private String spinao;
	/**绣花*/
	@Excel(name="绣花",width=15)
	private String spinap;
	/**其他*/
	@Excel(name="其他",width=15)
	private String spinaq;
	/**成本合计*/
	@Excel(name="成本合计",width=15)
	private String spinar;
	/**本区域工价*/
	@Excel(name="本区域工价",width=15)
	private String spinas;
	/**区域系数*/
	@Excel(name="区域系数",width=15)
	private String spinat;
	/**工厂系数*/
	@Excel(name="工厂系数",width=15)
	private String spinau;
	/**系数工价*/
	@Excel(name="系数工价",width=15)
	private String spinav;
	/**利税*/
	@Excel(name="利税",width=15)
	private String spinaw;
	/**总价*/
	@Excel(name="总价",width=15)
	private String spinax;
	/**总差价*/
	@Excel(name="总差价",width=15)
	private String spinay;
	/**税后差价*/
	@Excel(name="税后差价",width=15)
	private String spinaz;
	/**税后毛利*/
	@Excel(name="税后毛利",width=15)
	private String spinaaa;
	/**利息*/
	@Excel(name="利息",width=15)
	private String spinaab;
	/**税后利率*/
	@Excel(name="税后利率",width=15)
	private String spinaac;
	/**工厂系数*/
	@Excel(name="工厂系数",width=15)
	private String spinaad;
	/**系数工价*/
	@Excel(name="系数工价",width=15)
	private String spinaae;
	/**利税*/
	@Excel(name="利税",width=15)
	private String spinaaf;
	/**总价*/
	@Excel(name="总价",width=15)
	private String spinaag;
	/**总差价*/
	@Excel(name="总差价",width=15)
	private String spinaah;
	/**税后差价*/
	@Excel(name="税后差价",width=15)
	private String spinaai;
	/**税后毛利*/
	@Excel(name="税后毛利",width=15)
	private String spinaaj;
	/**利息*/
	@Excel(name="利息",width=15)
	private String spinaak;
	/**税后利率*/
	@Excel(name="税后利率",width=15)
	private String spinaal;
	/**基本工价*/
	@Excel(name="基本工价",width=15)
	private String spinaam;
	/**工厂系数*/
	@Excel(name="工厂系数",width=15)
	private String spinaan;
	/**系数工价*/
	@Excel(name="系数工价",width=15)
	private String spinaao;
	/**利税*/
	@Excel(name="利税",width=15)
	private String spinaap;
	/**总价*/
	@Excel(name="总价",width=15)
	private String spinaaq;
	/**总差价*/
	@Excel(name="总差价",width=15)
	private String spinaar;
	/**税后差价*/
	@Excel(name="税后差价",width=15)
	private String spinaas;
	/**税后毛利*/
	@Excel(name="税后毛利",width=15)
	private String spinaat;
	/**利息*/
	@Excel(name="利息",width=15)
	private String spinaau;
	/**税后利率*/
	@Excel(name="税后利率",width=15)
	private String spinaav;
	/**折汇率*/
	@Excel(name="折汇率",width=15)
	private String spinaaw;
	/**11*/
	@Excel(name="11",width=15)
	private String spinaax;
	/**12*/
	@Excel(name="12",width=15)
	private String spinaay;
	/**13*/
	@Excel(name="13",width=15)
	private String spinaaz;
	/**日期*/
	@Excel(name="日期",width=15,format = "yyyy-MM-dd")
	private Date spinaba;
	/**11*/
	@Excel(name="11",width=15)
	private String spinabb;
	/**修正*/
	@Excel(name="修正",width=15)
	private String spinabc;
	/**备注*/
	@Excel(name="备注",width=15)
	private String spinabd;
	/**克重*/
	@Excel(name="克重",width=15)
	private String spinbe;
	/**用料M2*/
	@Excel(name="用料M2",width=15)
	private String spinbf;
	/**损率*/
	@Excel(name="损率",width=15)
	private String spinbg;
	/**KG*/
	@Excel(name="KG",width=15)
	private String spinbh;
	/**单价*/
	@Excel(name="单价",width=15)
	private String spinbi;
	/**金额*/
	@Excel(name="金额",width=15)
	private String spinbj;
	/**克重*/
	@Excel(name="克重",width=15)
	private String spinbk;
	/**用料M2*/
	@Excel(name="用料M2",width=15)
	private String spinbl;
	/**损率*/
	@Excel(name="损率",width=15)
	private String spinbm;
	/**KG*/
	@Excel(name="KG",width=15)
	private String spinbn;
	/**单价*/
	@Excel(name="单价",width=15)
	private String spinbo;
	/**金额*/
	@Excel(name="金额",width=15)
	private String spinbp;
	/**克重*/
	@Excel(name="克重",width=15)
	private String spinbq;
	/**用料M2*/
	@Excel(name="用料M2",width=15)
	private String spinbr;
	/**损率*/
	@Excel(name="损率",width=15)
	private String spinbs;
	/**KG*/
	@Excel(name="KG",width=15)
	private String spinbt;
	/**单价*/
	@Excel(name="单价",width=15)
	private String spinbu;
	/**金额*/
	@Excel(name="金额",width=15)
	private String spinbv;
	/**克重*/
	@Excel(name="克重",width=15)
	private String spinbw;
	/**用料M2*/
	@Excel(name="用料M2",width=15)
	private String spinbx;
	/**损率*/
	@Excel(name="损率",width=15)
	private String spinby;
	/**KG*/
	@Excel(name="KG",width=15)
	private String spinbz;
	/**单价*/
	@Excel(name="单价",width=15)
	private String spinbaa;
	/**金额*/
	@Excel(name="金额",width=15)
	private String spinbab;
	/**克重*/
	@Excel(name="克重",width=15)
	private String spinbac;
	/**用料M2*/
	@Excel(name="用料M2",width=15)
	private String spinbad;
	/**损率*/
	@Excel(name="损率",width=15)
	private String spinbae;
	/**KG*/
	@Excel(name="KG",width=15)
	private String spinbaf;
	/**单价*/
	@Excel(name="单价",width=15)
	private String spinbag;
	/**金额*/
	@Excel(name="金额",width=15)
	private String spinbah;
	/**备注*/
	@Excel(name="备注",width=15)
	private String spinbai;
	/**尺码选*/
	@Excel(name="尺码选",width=15)
	private String spince;
	/**衣长*/
	@Excel(name="衣长",width=15)
	private String spincf;
	/**减*/
	@Excel(name="减",width=15)
	private String spincg;
	/**胸围*/
	@Excel(name="胸围",width=15)
	private String spinch;
	/**数量*/
	@Excel(name="数量",width=15)
	private String spinci;
	/**M2*/
	@Excel(name="M2",width=15)
	private String spincj;
	/**袖长*/
	@Excel(name="袖长",width=15)
	private String spinck;
	/**减*/
	@Excel(name="减",width=15)
	private String spincl;
	/**袖肥*/
	@Excel(name="袖肥",width=15)
	private String spincm;
	/**数量*/
	@Excel(name="数量",width=15)
	private String spincn;
	/**M2*/
	@Excel(name="M2",width=15)
	private String spinco;
	/**帽长*/
	@Excel(name="帽长",width=15)
	private String spincp;
	/**帽宽*/
	@Excel(name="帽宽",width=15)
	private String spincq;
	/**数量*/
	@Excel(name="数量",width=15)
	private String spincr;
	/**M2*/
	@Excel(name="M2",width=15)
	private String spincs;
	/**领宽*/
	@Excel(name="领宽",width=15)
	private String spinct;
	/**领高*/
	@Excel(name="领高",width=15)
	private String spincu;
	/**数量*/
	@Excel(name="数量",width=15)
	private String spincv;
	/**M2*/
	@Excel(name="M2",width=15)
	private String spincw;
	/**襟长*/
	@Excel(name="襟长",width=15)
	private String spincx;
	/**襟宽*/
	@Excel(name="襟宽",width=15)
	private String spincy;
	/**数量*/
	@Excel(name="数量",width=15)
	private String spincz;
	/**M2*/
	@Excel(name="M2",width=15)
	private String spincaa;
	/**袋长*/
	@Excel(name="袋长",width=15)
	private String spincab;
	/**袋宽*/
	@Excel(name="袋宽",width=15)
	private String spincac;
	/**数量*/
	@Excel(name="数量",width=15)
	private String spincad;
	/**M2*/
	@Excel(name="M2",width=15)
	private String spincae;
	/**长*/
	@Excel(name="长",width=15)
	private String spincaf;
	/**宽*/
	@Excel(name="宽",width=15)
	private String spincag;
	/**数量*/
	@Excel(name="数量",width=15)
	private String spincah;
	/**M2*/
	@Excel(name="M2",width=15)
	private String spincai;
	/**裤长*/
	@Excel(name="裤长",width=15)
	private String spincaj;
	/**减*/
	@Excel(name="减",width=15)
	private String spincak;
	/**脾围*/
	@Excel(name="脾围",width=15)
	private String spincal;
	/**数量*/
	@Excel(name="数量",width=15)
	private String spincam;
	/**M2*/
	@Excel(name="M2",width=15)
	private String spincan;
	/**加误率*/
	@Excel(name="加误率",width=15)
	private String spincao;
	/**直*/
	@Excel(name="直",width=15)
	private String spincap;
	/**横*/
	@Excel(name="横",width=15)
	private String spincaq;
	/**合*/
	@Excel(name="合",width=15)
	private String spincar;
	/**合计M2*/
	@Excel(name="合计M2",width=15)
	private String spincas;
	/**备注*/
	@Excel(name="备注",width=15)
	private String spincat;
	/**衣长*/
	@Excel(name="衣长",width=15)
	private String spindf;
	/**减*/
	@Excel(name="减",width=15)
	private String spindg;
	/**胸围*/
	@Excel(name="胸围",width=15)
	private String spindh;
	/**数量*/
	@Excel(name="数量",width=15)
	private String spindi;
	/**M2*/
	@Excel(name="M2",width=15)
	private String spindj;
	/**袖长*/
	@Excel(name="袖长",width=15)
	private String spindk;
	/**减*/
	@Excel(name="减",width=15)
	private String spindl;
	/**袖肥*/
	@Excel(name="袖肥",width=15)
	private String spindm;
	/**数量*/
	@Excel(name="数量",width=15)
	private String spindn;
	/**M2*/
	@Excel(name="M2",width=15)
	private String spindo;
	/**帽长*/
	@Excel(name="帽长",width=15)
	private String spindp;
	/**帽宽*/
	@Excel(name="帽宽",width=15)
	private String spindq;
	/**数量*/
	@Excel(name="数量",width=15)
	private String spindr;
	/**M2*/
	@Excel(name="M2",width=15)
	private String spinds;
	/**领宽*/
	@Excel(name="领宽",width=15)
	private String spindt;
	/**领高*/
	@Excel(name="领高",width=15)
	private String spindu;
	/**数量*/
	@Excel(name="数量",width=15)
	private String spindv;
	/**M2*/
	@Excel(name="M2",width=15)
	private String spindw;
	/**加误率*/
	@Excel(name="加误率",width=15)
	private String spindx;
	/**直*/
	@Excel(name="直",width=15)
	private String spindy;
	/**横*/
	@Excel(name="横",width=15)
	private String spindz;
	/**合计*/
	@Excel(name="合计",width=15)
	private String spindaa;
	/**合计M2*/
	@Excel(name="合计M2",width=15)
	private String spindab;
	/**备注*/
	@Excel(name="备注",width=15)
	private String spindac;
	/**衣长*/
	@Excel(name="衣长",width=15)
	private String spinef;
	/**减*/
	@Excel(name="减",width=15)
	private String spineg;
	/**胸围*/
	@Excel(name="胸围",width=15)
	private String spineh;
	/**数量*/
	@Excel(name="数量",width=15)
	private String spinei;
	/**M2*/
	@Excel(name="M2",width=15)
	private String spinej;
	/**袖长*/
	@Excel(name="袖长",width=15)
	private String spinek;
	/**减*/
	@Excel(name="减",width=15)
	private String spinel;
	/**袖肥*/
	@Excel(name="袖肥",width=15)
	private String spinem;
	/**数量*/
	@Excel(name="数量",width=15)
	private String spinen;
	/**M2*/
	@Excel(name="M2",width=15)
	private String spineo;
	/**帽长*/
	@Excel(name="帽长",width=15)
	private String spinep;
	/**帽宽*/
	@Excel(name="帽宽",width=15)
	private String spineq;
	/**数量*/
	@Excel(name="数量",width=15)
	private String spiner;
	/**M2*/
	@Excel(name="M2",width=15)
	private String spines;
	/**领宽*/
	@Excel(name="领宽",width=15)
	private String spinet;
	/**领高*/
	@Excel(name="领高",width=15)
	private String spineu;
	/**数量*/
	@Excel(name="数量",width=15)
	private String spinev;
	/**M2*/
	@Excel(name="M2",width=15)
	private String spinew;
	/**襟长*/
	@Excel(name="襟长",width=15)
	private String spinex;
	/**襟宽*/
	@Excel(name="襟宽",width=15)
	private String spiney;
	/**数量*/
	@Excel(name="数量",width=15)
	private String spinez;
	/**M2*/
	@Excel(name="M2",width=15)
	private String spineaa;
	/**袋长*/
	@Excel(name="袋长",width=15)
	private String spineab;
	/**袋宽*/
	@Excel(name="袋宽",width=15)
	private String spineac;
	/**数量*/
	@Excel(name="数量",width=15)
	private String spinead;
	/**M2*/
	@Excel(name="M2",width=15)
	private String spineae;
	/**长*/
	@Excel(name="长",width=15)
	private String spineaf;
	/**宽*/
	@Excel(name="宽",width=15)
	private String spineag;
	/**数量*/
	@Excel(name="数量",width=15)
	private String spineah;
	/**M2*/
	@Excel(name="M2",width=15)
	private String spineai;
	/**裤长*/
	@Excel(name="裤长",width=15)
	private String spineaj;
	/**减*/
	@Excel(name="减",width=15)
	private String spineak;
	/**脾围*/
	@Excel(name="脾围",width=15)
	private String spineal;
	/**数量*/
	@Excel(name="数量",width=15)
	private String spineam;
	/**M2*/
	@Excel(name="M2",width=15)
	private String spinean;
	/**加误率*/
	@Excel(name="加误率",width=15)
	private String spineao;
	/**直*/
	@Excel(name="直",width=15)
	private String spineap;
	/**横*/
	@Excel(name="横",width=15)
	private String spineaq;
	/**合计*/
	@Excel(name="合计",width=15)
	private String spinear;
	/**合计M2*/
	@Excel(name="合计M2",width=15)
	private String spineas;
	/**备注*/
	@Excel(name="备注",width=15)
	private String spineat;
	/**衣长*/
	@Excel(name="衣长",width=15)
	private String spinff;
	/**减*/
	@Excel(name="减",width=15)
	private String spinfg;
	/**胸围*/
	@Excel(name="胸围",width=15)
	private String spinfh;
	/**数量*/
	@Excel(name="数量",width=15)
	private String spinfi;
	/**M2*/
	@Excel(name="M2",width=15)
	private String spinfj;
	/**袖长*/
	@Excel(name="袖长",width=15)
	private String spinfk;
	/**减*/
	@Excel(name="减",width=15)
	private String spinfl;
	/**袖肥*/
	@Excel(name="袖肥",width=15)
	private String spinfm;
	/**数量*/
	@Excel(name="数量",width=15)
	private String spinfn;
	/**M2*/
	@Excel(name="M2",width=15)
	private String spinfo;
	/**帽长*/
	@Excel(name="帽长",width=15)
	private String spinfp;
	/**帽宽*/
	@Excel(name="帽宽",width=15)
	private String spinfq;
	/**数量*/
	@Excel(name="数量",width=15)
	private String spinfr;
	/**M2*/
	@Excel(name="M2",width=15)
	private String spinfs;
	/**领宽*/
	@Excel(name="领宽",width=15)
	private String spinft;
	/**领高*/
	@Excel(name="领高",width=15)
	private String spinfu;
	/**数量*/
	@Excel(name="数量",width=15)
	private String spinfv;
	/**M2*/
	@Excel(name="M2",width=15)
	private String spinfw;
	/**加误率*/
	@Excel(name="加误率",width=15)
	private String spinfx;
	/**直*/
	@Excel(name="直",width=15)
	private String spinfy;
	/**横*/
	@Excel(name="横",width=15)
	private String spinfz;
	/**合计*/
	@Excel(name="合计",width=15)
	private String spinfaa;
	/**合计M2*/
	@Excel(name="合计M2",width=15)
	private String spinfab;
	/**备注*/
	@Excel(name="备注",width=15)
	private String spinfac;
	/**领宽*/
	@Excel(name="领宽",width=15)
	private String spingf;
	/**领高*/
	@Excel(name="领高",width=15)
	private String spingg;
	/**数量*/
	@Excel(name="数量",width=15)
	private String spingh;
	/**M2*/
	@Excel(name="M2",width=15)
	private String spingi;
	/**12宽*/
	@Excel(name="12宽",width=15)
	private String spingj;
	/**高*/
	@Excel(name="高",width=15)
	private String spingk;
	/**数量*/
	@Excel(name="数量",width=15)
	private String spingl;
	/**M2*/
	@Excel(name="M2",width=15)
	private String spingm;
	/**12宽*/
	@Excel(name="12宽",width=15)
	private String spingn;
	/**高*/
	@Excel(name="高",width=15)
	private String spingo;
	/**数量*/
	@Excel(name="数量",width=15)
	private String spingp;
	/**M2*/
	@Excel(name="M2",width=15)
	private String spingq;
	/**加误率*/
	@Excel(name="加误率",width=15)
	private String spingr;
	/**直*/
	@Excel(name="直",width=15)
	private String spings;
	/**横*/
	@Excel(name="横",width=15)
	private String spingt;
	/**合计*/
	@Excel(name="合计",width=15)
	private String spingu;
	/**合计M2*/
	@Excel(name="合计M2",width=15)
	private String spingv;
	/**备注*/
	@Excel(name="备注",width=15)
	private String spingw;
	/**订单数件*/
	@Excel(name="订单数件",width=15)
	private String spinhe;
	/**三标*/
	@Excel(name="三标",width=15)
	private String spinhf;
	/**装饰*/
	@Excel(name="装饰",width=15)
	private String spinhg;
	/**缝线*/
	@Excel(name="缝线",width=15)
	private String spinhh;
	/**绳带*/
	@Excel(name="绳带",width=15)
	private String spinhi;
	/**贴条*/
	@Excel(name="贴条",width=15)
	private String spinhj;
	/**金属*/
	@Excel(name="金属",width=15)
	private String spinhk;
	/**树脂*/
	@Excel(name="树脂",width=15)
	private String spinhl;
	/**尼龙*/
	@Excel(name="尼龙",width=15)
	private String spinhm;
	/**平*/
	@Excel(name="平",width=15)
	private String spinhn;
	/**圆*/
	@Excel(name="圆",width=15)
	private String spinho;
	/**金属*/
	@Excel(name="金属",width=15)
	private String spinhp;
	/**树脂*/
	@Excel(name="树脂",width=15)
	private String spinhq;
	/**控制*/
	@Excel(name="控制",width=15)
	private String spinhr;
	/**气眼*/
	@Excel(name="气眼",width=15)
	private String spinhs;
	/**粘衬*/
	@Excel(name="粘衬",width=15)
	private String spinht;
	/**其它*/
	@Excel(name="其它",width=15)
	private String spinhu;
	/**辅料合计*/
	@Excel(name="辅料合计",width=15)
	private String spinhv;
	/**吊牌*/
	@Excel(name="吊牌",width=15)
	private String spinhw;
	/**贴纸*/
	@Excel(name="贴纸",width=15)
	private String spinhx;
	/**拷贝纸*/
	@Excel(name="拷贝纸",width=15)
	private String spinhy;
	/**防伪标*/
	@Excel(name="防伪标",width=15)
	private String spinhz;
	/**衣架*/
	@Excel(name="衣架",width=15)
	private String spinhaa;
	/**胶袋*/
	@Excel(name="胶袋",width=15)
	private String spinhab;
	/**纸箱*/
	@Excel(name="纸箱",width=15)
	private String spinhac;
	/**其它*/
	@Excel(name="其它",width=15)
	private String spinhad;
	/**包装合计*/
	@Excel(name="包装合计",width=15)
	private String spinhae;
	/**备注*/
	@Excel(name="备注",width=15)
	private String spinhaf;
	
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name ="ID",nullable=false,length=19)
	public Integer getId(){
		return this.id;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  id
	 */
	public void setId(Integer id){
		this.id = id;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  创建人名称
	 */

	@Column(name ="CREATE_NAME",nullable=true,length=50)
	public String getCreateName(){
		return this.createName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  创建人名称
	 */
	public void setCreateName(String createName){
		this.createName = createName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  创建人登录名称
	 */

	@Column(name ="CREATE_BY",nullable=true,length=50)
	public String getCreateBy(){
		return this.createBy;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  创建人登录名称
	 */
	public void setCreateBy(String createBy){
		this.createBy = createBy;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  创建日期
	 */

	@Column(name ="CREATE_DATE",nullable=true)
	public Date getCreateDate(){
		return this.createDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  创建日期
	 */
	public void setCreateDate(Date createDate){
		this.createDate = createDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  更新人名称
	 */

	@Column(name ="UPDATE_NAME",nullable=true,length=50)
	public String getUpdateName(){
		return this.updateName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  更新人名称
	 */
	public void setUpdateName(String updateName){
		this.updateName = updateName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  更新人登录名称
	 */

	@Column(name ="UPDATE_BY",nullable=true,length=50)
	public String getUpdateBy(){
		return this.updateBy;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  更新人登录名称
	 */
	public void setUpdateBy(String updateBy){
		this.updateBy = updateBy;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  更新日期
	 */

	@Column(name ="UPDATE_DATE",nullable=true)
	public Date getUpdateDate(){
		return this.updateDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  更新日期
	 */
	public void setUpdateDate(Date updateDate){
		this.updateDate = updateDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  所属部门
	 */

	@Column(name ="SYS_ORG_CODE",nullable=true,length=50)
	public String getSysOrgCode(){
		return this.sysOrgCode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  所属部门
	 */
	public void setSysOrgCode(String sysOrgCode){
		this.sysOrgCode = sysOrgCode;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  所属公司
	 */

	@Column(name ="SYS_COMPANY_CODE",nullable=true,length=50)
	public String getSysCompanyCode(){
		return this.sysCompanyCode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  所属公司
	 */
	public void setSysCompanyCode(String sysCompanyCode){
		this.sysCompanyCode = sysCompanyCode;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  流程状态
	 */

	@Column(name ="BPM_STATUS",nullable=true,length=15)
	public String getBpmStatus(){
		return this.bpmStatus;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  流程状态
	 */
	public void setBpmStatus(String bpmStatus){
		this.bpmStatus = bpmStatus;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  报价日期
	 */

	@Column(name ="SPINAA",nullable=false)
	public Date getSpinaa(){
		return this.spinaa;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  报价日期
	 */
	public void setSpinaa(Date spinaa){
		this.spinaa = spinaa;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  客户编号
	 */

	@Column(name ="SPINAB",nullable=false,length=15)
	public String getSpinab(){
		return this.spinab;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  客户编号
	 */
	public void setSpinab(String spinab){
		this.spinab = spinab;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  订单序号
	 */

	@Column(name ="SPINAC",nullable=false,length=15)
	public String getSpinac(){
		return this.spinac;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  订单序号
	 */
	public void setSpinac(String spinac){
		this.spinac = spinac;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  款号
	 */

	@Column(name ="SPINAD",nullable=true,length=15)
	public String getSpinad(){
		return this.spinad;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  款号
	 */
	public void setSpinad(String spinad){
		this.spinad = spinad;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  款式名
	 */

	@Column(name ="SPINAE",nullable=true,length=15)
	public String getSpinae(){
		return this.spinae;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  款式名
	 */
	public void setSpinae(String spinae){
		this.spinae = spinae;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  订单件数
	 */

	@Column(name ="SPINAF",nullable=true,length=15)
	public String getSpinaf(){
		return this.spinaf;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  订单件数
	 */
	public void setSpinaf(String spinaf){
		this.spinaf = spinaf;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  A1
	 */

	@Column(name ="SPINAG",nullable=true,length=15)
	public String getSpinag(){
		return this.spinag;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  A1
	 */
	public void setSpinag(String spinag){
		this.spinag = spinag;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  A2
	 */

	@Column(name ="SPINAH",nullable=true,length=15)
	public String getSpinah(){
		return this.spinah;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  A2
	 */
	public void setSpinah(String spinah){
		this.spinah = spinah;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  B1
	 */

	@Column(name ="SPINAI",nullable=true,length=15)
	public String getSpinai(){
		return this.spinai;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  B1
	 */
	public void setSpinai(String spinai){
		this.spinai = spinai;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  B2
	 */

	@Column(name ="SPINAJ",nullable=true,length=15)
	public String getSpinaj(){
		return this.spinaj;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  B2
	 */
	public void setSpinaj(String spinaj){
		this.spinaj = spinaj;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  C
	 */

	@Column(name ="SPINAK",nullable=true,length=15)
	public String getSpinak(){
		return this.spinak;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  C
	 */
	public void setSpinak(String spinak){
		this.spinak = spinak;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  其他
	 */

	@Column(name ="SPINAL",nullable=true,length=15)
	public String getSpinal(){
		return this.spinal;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  其他
	 */
	public void setSpinal(String spinal){
		this.spinal = spinal;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  辅料
	 */

	@Column(name ="SPINAM",nullable=true,length=15)
	public String getSpinam(){
		return this.spinam;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  辅料
	 */
	public void setSpinam(String spinam){
		this.spinam = spinam;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  包装
	 */

	@Column(name ="SPINAN",nullable=true,length=15)
	public String getSpinan(){
		return this.spinan;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  包装
	 */
	public void setSpinan(String spinan){
		this.spinan = spinan;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  印花
	 */

	@Column(name ="SPINAO",nullable=true,length=15)
	public String getSpinao(){
		return this.spinao;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  印花
	 */
	public void setSpinao(String spinao){
		this.spinao = spinao;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  绣花
	 */

	@Column(name ="SPINAP",nullable=true,length=15)
	public String getSpinap(){
		return this.spinap;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  绣花
	 */
	public void setSpinap(String spinap){
		this.spinap = spinap;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  其他
	 */

	@Column(name ="SPINAQ",nullable=true,length=15)
	public String getSpinaq(){
		return this.spinaq;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  其他
	 */
	public void setSpinaq(String spinaq){
		this.spinaq = spinaq;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  成本合计
	 */

	@Column(name ="SPINAR",nullable=true,length=15)
	public String getSpinar(){
		return this.spinar;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  成本合计
	 */
	public void setSpinar(String spinar){
		this.spinar = spinar;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  本区域工价
	 */

	@Column(name ="SPINAS",nullable=true,length=15)
	public String getSpinas(){
		return this.spinas;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  本区域工价
	 */
	public void setSpinas(String spinas){
		this.spinas = spinas;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  区域系数
	 */

	@Column(name ="SPINAT",nullable=true,length=15)
	public String getSpinat(){
		return this.spinat;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  区域系数
	 */
	public void setSpinat(String spinat){
		this.spinat = spinat;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  工厂系数
	 */

	@Column(name ="SPINAU",nullable=true,length=15)
	public String getSpinau(){
		return this.spinau;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  工厂系数
	 */
	public void setSpinau(String spinau){
		this.spinau = spinau;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  系数工价
	 */

	@Column(name ="SPINAV",nullable=true,length=15)
	public String getSpinav(){
		return this.spinav;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  系数工价
	 */
	public void setSpinav(String spinav){
		this.spinav = spinav;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  利税
	 */

	@Column(name ="SPINAW",nullable=true,length=15)
	public String getSpinaw(){
		return this.spinaw;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  利税
	 */
	public void setSpinaw(String spinaw){
		this.spinaw = spinaw;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  总价
	 */

	@Column(name ="SPINAX",nullable=true,length=15)
	public String getSpinax(){
		return this.spinax;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  总价
	 */
	public void setSpinax(String spinax){
		this.spinax = spinax;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  总差价
	 */

	@Column(name ="SPINAY",nullable=true,length=15)
	public String getSpinay(){
		return this.spinay;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  总差价
	 */
	public void setSpinay(String spinay){
		this.spinay = spinay;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  税后差价
	 */

	@Column(name ="SPINAZ",nullable=true,length=15)
	public String getSpinaz(){
		return this.spinaz;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  税后差价
	 */
	public void setSpinaz(String spinaz){
		this.spinaz = spinaz;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  税后毛利
	 */

	@Column(name ="SPINAAA",nullable=true,length=15)
	public String getSpinaaa(){
		return this.spinaaa;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  税后毛利
	 */
	public void setSpinaaa(String spinaaa){
		this.spinaaa = spinaaa;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  利息
	 */

	@Column(name ="SPINAAB",nullable=true,length=15)
	public String getSpinaab(){
		return this.spinaab;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  利息
	 */
	public void setSpinaab(String spinaab){
		this.spinaab = spinaab;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  税后利率
	 */

	@Column(name ="SPINAAC",nullable=true,length=15)
	public String getSpinaac(){
		return this.spinaac;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  税后利率
	 */
	public void setSpinaac(String spinaac){
		this.spinaac = spinaac;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  工厂系数
	 */

	@Column(name ="SPINAAD",nullable=true,length=15)
	public String getSpinaad(){
		return this.spinaad;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  工厂系数
	 */
	public void setSpinaad(String spinaad){
		this.spinaad = spinaad;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  系数工价
	 */

	@Column(name ="SPINAAE",nullable=true,length=15)
	public String getSpinaae(){
		return this.spinaae;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  系数工价
	 */
	public void setSpinaae(String spinaae){
		this.spinaae = spinaae;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  利税
	 */

	@Column(name ="SPINAAF",nullable=true,length=15)
	public String getSpinaaf(){
		return this.spinaaf;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  利税
	 */
	public void setSpinaaf(String spinaaf){
		this.spinaaf = spinaaf;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  总价
	 */

	@Column(name ="SPINAAG",nullable=true,length=15)
	public String getSpinaag(){
		return this.spinaag;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  总价
	 */
	public void setSpinaag(String spinaag){
		this.spinaag = spinaag;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  总差价
	 */

	@Column(name ="SPINAAH",nullable=true,length=15)
	public String getSpinaah(){
		return this.spinaah;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  总差价
	 */
	public void setSpinaah(String spinaah){
		this.spinaah = spinaah;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  税后差价
	 */

	@Column(name ="SPINAAI",nullable=true,length=15)
	public String getSpinaai(){
		return this.spinaai;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  税后差价
	 */
	public void setSpinaai(String spinaai){
		this.spinaai = spinaai;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  税后毛利
	 */

	@Column(name ="SPINAAJ",nullable=true,length=15)
	public String getSpinaaj(){
		return this.spinaaj;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  税后毛利
	 */
	public void setSpinaaj(String spinaaj){
		this.spinaaj = spinaaj;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  利息
	 */

	@Column(name ="SPINAAK",nullable=true,length=15)
	public String getSpinaak(){
		return this.spinaak;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  利息
	 */
	public void setSpinaak(String spinaak){
		this.spinaak = spinaak;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  税后利率
	 */

	@Column(name ="SPINAAL",nullable=true,length=15)
	public String getSpinaal(){
		return this.spinaal;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  税后利率
	 */
	public void setSpinaal(String spinaal){
		this.spinaal = spinaal;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  基本工价
	 */

	@Column(name ="SPINAAM",nullable=true,length=15)
	public String getSpinaam(){
		return this.spinaam;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  基本工价
	 */
	public void setSpinaam(String spinaam){
		this.spinaam = spinaam;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  工厂系数
	 */

	@Column(name ="SPINAAN",nullable=true,length=15)
	public String getSpinaan(){
		return this.spinaan;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  工厂系数
	 */
	public void setSpinaan(String spinaan){
		this.spinaan = spinaan;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  系数工价
	 */

	@Column(name ="SPINAAO",nullable=true,length=15)
	public String getSpinaao(){
		return this.spinaao;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  系数工价
	 */
	public void setSpinaao(String spinaao){
		this.spinaao = spinaao;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  利税
	 */

	@Column(name ="SPINAAP",nullable=true,length=15)
	public String getSpinaap(){
		return this.spinaap;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  利税
	 */
	public void setSpinaap(String spinaap){
		this.spinaap = spinaap;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  总价
	 */

	@Column(name ="SPINAAQ",nullable=true,length=15)
	public String getSpinaaq(){
		return this.spinaaq;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  总价
	 */
	public void setSpinaaq(String spinaaq){
		this.spinaaq = spinaaq;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  总差价
	 */

	@Column(name ="SPINAAR",nullable=true,length=15)
	public String getSpinaar(){
		return this.spinaar;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  总差价
	 */
	public void setSpinaar(String spinaar){
		this.spinaar = spinaar;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  税后差价
	 */

	@Column(name ="SPINAAS",nullable=true,length=15)
	public String getSpinaas(){
		return this.spinaas;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  税后差价
	 */
	public void setSpinaas(String spinaas){
		this.spinaas = spinaas;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  税后毛利
	 */

	@Column(name ="SPINAAT",nullable=true,length=15)
	public String getSpinaat(){
		return this.spinaat;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  税后毛利
	 */
	public void setSpinaat(String spinaat){
		this.spinaat = spinaat;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  利息
	 */

	@Column(name ="SPINAAU",nullable=true,length=15)
	public String getSpinaau(){
		return this.spinaau;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  利息
	 */
	public void setSpinaau(String spinaau){
		this.spinaau = spinaau;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  税后利率
	 */

	@Column(name ="SPINAAV",nullable=true,length=15)
	public String getSpinaav(){
		return this.spinaav;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  税后利率
	 */
	public void setSpinaav(String spinaav){
		this.spinaav = spinaav;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  折汇率
	 */

	@Column(name ="SPINAAW",nullable=true,length=15)
	public String getSpinaaw(){
		return this.spinaaw;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  折汇率
	 */
	public void setSpinaaw(String spinaaw){
		this.spinaaw = spinaaw;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  11
	 */

	@Column(name ="SPINAAX",nullable=true,length=15)
	public String getSpinaax(){
		return this.spinaax;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  11
	 */
	public void setSpinaax(String spinaax){
		this.spinaax = spinaax;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  12
	 */

	@Column(name ="SPINAAY",nullable=true,length=15)
	public String getSpinaay(){
		return this.spinaay;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  12
	 */
	public void setSpinaay(String spinaay){
		this.spinaay = spinaay;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  13
	 */

	@Column(name ="SPINAAZ",nullable=true,length=15)
	public String getSpinaaz(){
		return this.spinaaz;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  13
	 */
	public void setSpinaaz(String spinaaz){
		this.spinaaz = spinaaz;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  日期
	 */

	@Column(name ="SPINABA",nullable=true)
	public Date getSpinaba(){
		return this.spinaba;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  日期
	 */
	public void setSpinaba(Date spinaba){
		this.spinaba = spinaba;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  11
	 */

	@Column(name ="SPINABB",nullable=true,length=15)
	public String getSpinabb(){
		return this.spinabb;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  11
	 */
	public void setSpinabb(String spinabb){
		this.spinabb = spinabb;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  修正
	 */

	@Column(name ="SPINABC",nullable=true,length=15)
	public String getSpinabc(){
		return this.spinabc;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  修正
	 */
	public void setSpinabc(String spinabc){
		this.spinabc = spinabc;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  备注
	 */

	@Column(name ="SPINABD",nullable=true,length=15)
	public String getSpinabd(){
		return this.spinabd;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  备注
	 */
	public void setSpinabd(String spinabd){
		this.spinabd = spinabd;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  克重
	 */

	@Column(name ="SPINBE",nullable=true,length=15)
	public String getSpinbe(){
		return this.spinbe;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  克重
	 */
	public void setSpinbe(String spinbe){
		this.spinbe = spinbe;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  用料M2
	 */

	@Column(name ="SPINBF",nullable=true,length=15)
	public String getSpinbf(){
		return this.spinbf;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  用料M2
	 */
	public void setSpinbf(String spinbf){
		this.spinbf = spinbf;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  损率
	 */

	@Column(name ="SPINBG",nullable=true,length=15)
	public String getSpinbg(){
		return this.spinbg;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  损率
	 */
	public void setSpinbg(String spinbg){
		this.spinbg = spinbg;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  KG
	 */

	@Column(name ="SPINBH",nullable=true,length=15)
	public String getSpinbh(){
		return this.spinbh;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  KG
	 */
	public void setSpinbh(String spinbh){
		this.spinbh = spinbh;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  单价
	 */

	@Column(name ="SPINBI",nullable=true,length=15)
	public String getSpinbi(){
		return this.spinbi;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  单价
	 */
	public void setSpinbi(String spinbi){
		this.spinbi = spinbi;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  金额
	 */

	@Column(name ="SPINBJ",nullable=true,length=15)
	public String getSpinbj(){
		return this.spinbj;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  金额
	 */
	public void setSpinbj(String spinbj){
		this.spinbj = spinbj;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  克重
	 */

	@Column(name ="SPINBK",nullable=true,length=15)
	public String getSpinbk(){
		return this.spinbk;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  克重
	 */
	public void setSpinbk(String spinbk){
		this.spinbk = spinbk;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  用料M2
	 */

	@Column(name ="SPINBL",nullable=true,length=15)
	public String getSpinbl(){
		return this.spinbl;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  用料M2
	 */
	public void setSpinbl(String spinbl){
		this.spinbl = spinbl;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  损率
	 */

	@Column(name ="SPINBM",nullable=true,length=15)
	public String getSpinbm(){
		return this.spinbm;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  损率
	 */
	public void setSpinbm(String spinbm){
		this.spinbm = spinbm;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  KG
	 */

	@Column(name ="SPINBN",nullable=true,length=15)
	public String getSpinbn(){
		return this.spinbn;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  KG
	 */
	public void setSpinbn(String spinbn){
		this.spinbn = spinbn;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  单价
	 */

	@Column(name ="SPINBO",nullable=true,length=15)
	public String getSpinbo(){
		return this.spinbo;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  单价
	 */
	public void setSpinbo(String spinbo){
		this.spinbo = spinbo;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  金额
	 */

	@Column(name ="SPINBP",nullable=true,length=15)
	public String getSpinbp(){
		return this.spinbp;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  金额
	 */
	public void setSpinbp(String spinbp){
		this.spinbp = spinbp;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  克重
	 */

	@Column(name ="SPINBQ",nullable=true,length=15)
	public String getSpinbq(){
		return this.spinbq;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  克重
	 */
	public void setSpinbq(String spinbq){
		this.spinbq = spinbq;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  用料M2
	 */

	@Column(name ="SPINBR",nullable=true,length=15)
	public String getSpinbr(){
		return this.spinbr;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  用料M2
	 */
	public void setSpinbr(String spinbr){
		this.spinbr = spinbr;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  损率
	 */

	@Column(name ="SPINBS",nullable=true,length=15)
	public String getSpinbs(){
		return this.spinbs;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  损率
	 */
	public void setSpinbs(String spinbs){
		this.spinbs = spinbs;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  KG
	 */

	@Column(name ="SPINBT",nullable=true,length=15)
	public String getSpinbt(){
		return this.spinbt;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  KG
	 */
	public void setSpinbt(String spinbt){
		this.spinbt = spinbt;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  单价
	 */

	@Column(name ="SPINBU",nullable=true,length=15)
	public String getSpinbu(){
		return this.spinbu;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  单价
	 */
	public void setSpinbu(String spinbu){
		this.spinbu = spinbu;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  金额
	 */

	@Column(name ="SPINBV",nullable=true,length=15)
	public String getSpinbv(){
		return this.spinbv;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  金额
	 */
	public void setSpinbv(String spinbv){
		this.spinbv = spinbv;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  克重
	 */

	@Column(name ="SPINBW",nullable=true,length=15)
	public String getSpinbw(){
		return this.spinbw;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  克重
	 */
	public void setSpinbw(String spinbw){
		this.spinbw = spinbw;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  用料M2
	 */

	@Column(name ="SPINBX",nullable=true,length=15)
	public String getSpinbx(){
		return this.spinbx;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  用料M2
	 */
	public void setSpinbx(String spinbx){
		this.spinbx = spinbx;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  损率
	 */

	@Column(name ="SPINBY",nullable=true,length=15)
	public String getSpinby(){
		return this.spinby;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  损率
	 */
	public void setSpinby(String spinby){
		this.spinby = spinby;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  KG
	 */

	@Column(name ="SPINBZ",nullable=true,length=15)
	public String getSpinbz(){
		return this.spinbz;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  KG
	 */
	public void setSpinbz(String spinbz){
		this.spinbz = spinbz;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  单价
	 */

	@Column(name ="SPINBAA",nullable=true,length=15)
	public String getSpinbaa(){
		return this.spinbaa;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  单价
	 */
	public void setSpinbaa(String spinbaa){
		this.spinbaa = spinbaa;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  金额
	 */

	@Column(name ="SPINBAB",nullable=true,length=15)
	public String getSpinbab(){
		return this.spinbab;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  金额
	 */
	public void setSpinbab(String spinbab){
		this.spinbab = spinbab;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  克重
	 */

	@Column(name ="SPINBAC",nullable=true,length=15)
	public String getSpinbac(){
		return this.spinbac;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  克重
	 */
	public void setSpinbac(String spinbac){
		this.spinbac = spinbac;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  用料M2
	 */

	@Column(name ="SPINBAD",nullable=true,length=15)
	public String getSpinbad(){
		return this.spinbad;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  用料M2
	 */
	public void setSpinbad(String spinbad){
		this.spinbad = spinbad;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  损率
	 */

	@Column(name ="SPINBAE",nullable=true,length=15)
	public String getSpinbae(){
		return this.spinbae;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  损率
	 */
	public void setSpinbae(String spinbae){
		this.spinbae = spinbae;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  KG
	 */

	@Column(name ="SPINBAF",nullable=true,length=15)
	public String getSpinbaf(){
		return this.spinbaf;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  KG
	 */
	public void setSpinbaf(String spinbaf){
		this.spinbaf = spinbaf;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  单价
	 */

	@Column(name ="SPINBAG",nullable=true,length=15)
	public String getSpinbag(){
		return this.spinbag;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  单价
	 */
	public void setSpinbag(String spinbag){
		this.spinbag = spinbag;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  金额
	 */

	@Column(name ="SPINBAH",nullable=true,length=15)
	public String getSpinbah(){
		return this.spinbah;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  金额
	 */
	public void setSpinbah(String spinbah){
		this.spinbah = spinbah;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  备注
	 */

	@Column(name ="SPINBAI",nullable=true,length=50)
	public String getSpinbai(){
		return this.spinbai;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  备注
	 */
	public void setSpinbai(String spinbai){
		this.spinbai = spinbai;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  尺码选
	 */

	@Column(name ="SPINCE",nullable=true,length=15)
	public String getSpince(){
		return this.spince;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  尺码选
	 */
	public void setSpince(String spince){
		this.spince = spince;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  衣长
	 */

	@Column(name ="SPINCF",nullable=true,length=15)
	public String getSpincf(){
		return this.spincf;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  衣长
	 */
	public void setSpincf(String spincf){
		this.spincf = spincf;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  减
	 */

	@Column(name ="SPINCG",nullable=true,length=15)
	public String getSpincg(){
		return this.spincg;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  减
	 */
	public void setSpincg(String spincg){
		this.spincg = spincg;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  胸围
	 */

	@Column(name ="SPINCH",nullable=true,length=15)
	public String getSpinch(){
		return this.spinch;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  胸围
	 */
	public void setSpinch(String spinch){
		this.spinch = spinch;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  数量
	 */

	@Column(name ="SPINCI",nullable=true,length=15)
	public String getSpinci(){
		return this.spinci;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  数量
	 */
	public void setSpinci(String spinci){
		this.spinci = spinci;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  M2
	 */

	@Column(name ="SPINCJ",nullable=true,length=15)
	public String getSpincj(){
		return this.spincj;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  M2
	 */
	public void setSpincj(String spincj){
		this.spincj = spincj;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  袖长
	 */

	@Column(name ="SPINCK",nullable=true,length=15)
	public String getSpinck(){
		return this.spinck;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  袖长
	 */
	public void setSpinck(String spinck){
		this.spinck = spinck;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  减
	 */

	@Column(name ="SPINCL",nullable=true,length=15)
	public String getSpincl(){
		return this.spincl;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  减
	 */
	public void setSpincl(String spincl){
		this.spincl = spincl;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  袖肥
	 */

	@Column(name ="SPINCM",nullable=true,length=15)
	public String getSpincm(){
		return this.spincm;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  袖肥
	 */
	public void setSpincm(String spincm){
		this.spincm = spincm;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  数量
	 */

	@Column(name ="SPINCN",nullable=true,length=15)
	public String getSpincn(){
		return this.spincn;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  数量
	 */
	public void setSpincn(String spincn){
		this.spincn = spincn;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  M2
	 */

	@Column(name ="SPINCO",nullable=true,length=15)
	public String getSpinco(){
		return this.spinco;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  M2
	 */
	public void setSpinco(String spinco){
		this.spinco = spinco;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  帽长
	 */

	@Column(name ="SPINCP",nullable=true,length=15)
	public String getSpincp(){
		return this.spincp;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  帽长
	 */
	public void setSpincp(String spincp){
		this.spincp = spincp;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  帽宽
	 */

	@Column(name ="SPINCQ",nullable=true,length=15)
	public String getSpincq(){
		return this.spincq;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  帽宽
	 */
	public void setSpincq(String spincq){
		this.spincq = spincq;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  数量
	 */

	@Column(name ="SPINCR",nullable=true,length=15)
	public String getSpincr(){
		return this.spincr;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  数量
	 */
	public void setSpincr(String spincr){
		this.spincr = spincr;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  M2
	 */

	@Column(name ="SPINCS",nullable=true,length=15)
	public String getSpincs(){
		return this.spincs;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  M2
	 */
	public void setSpincs(String spincs){
		this.spincs = spincs;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  领宽
	 */

	@Column(name ="SPINCT",nullable=true,length=15)
	public String getSpinct(){
		return this.spinct;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  领宽
	 */
	public void setSpinct(String spinct){
		this.spinct = spinct;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  领高
	 */

	@Column(name ="SPINCU",nullable=true,length=15)
	public String getSpincu(){
		return this.spincu;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  领高
	 */
	public void setSpincu(String spincu){
		this.spincu = spincu;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  数量
	 */

	@Column(name ="SPINCV",nullable=true,length=15)
	public String getSpincv(){
		return this.spincv;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  数量
	 */
	public void setSpincv(String spincv){
		this.spincv = spincv;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  M2
	 */

	@Column(name ="SPINCW",nullable=true,length=15)
	public String getSpincw(){
		return this.spincw;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  M2
	 */
	public void setSpincw(String spincw){
		this.spincw = spincw;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  襟长
	 */

	@Column(name ="SPINCX",nullable=true,length=15)
	public String getSpincx(){
		return this.spincx;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  襟长
	 */
	public void setSpincx(String spincx){
		this.spincx = spincx;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  襟宽
	 */

	@Column(name ="SPINCY",nullable=true,length=15)
	public String getSpincy(){
		return this.spincy;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  襟宽
	 */
	public void setSpincy(String spincy){
		this.spincy = spincy;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  数量
	 */

	@Column(name ="SPINCZ",nullable=true,length=15)
	public String getSpincz(){
		return this.spincz;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  数量
	 */
	public void setSpincz(String spincz){
		this.spincz = spincz;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  M2
	 */

	@Column(name ="SPINCAA",nullable=true,length=15)
	public String getSpincaa(){
		return this.spincaa;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  M2
	 */
	public void setSpincaa(String spincaa){
		this.spincaa = spincaa;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  袋长
	 */

	@Column(name ="SPINCAB",nullable=true,length=15)
	public String getSpincab(){
		return this.spincab;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  袋长
	 */
	public void setSpincab(String spincab){
		this.spincab = spincab;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  袋宽
	 */

	@Column(name ="SPINCAC",nullable=true,length=15)
	public String getSpincac(){
		return this.spincac;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  袋宽
	 */
	public void setSpincac(String spincac){
		this.spincac = spincac;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  数量
	 */

	@Column(name ="SPINCAD",nullable=true,length=15)
	public String getSpincad(){
		return this.spincad;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  数量
	 */
	public void setSpincad(String spincad){
		this.spincad = spincad;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  M2
	 */

	@Column(name ="SPINCAE",nullable=true,length=15)
	public String getSpincae(){
		return this.spincae;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  M2
	 */
	public void setSpincae(String spincae){
		this.spincae = spincae;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  长
	 */

	@Column(name ="SPINCAF",nullable=true,length=15)
	public String getSpincaf(){
		return this.spincaf;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  长
	 */
	public void setSpincaf(String spincaf){
		this.spincaf = spincaf;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  宽
	 */

	@Column(name ="SPINCAG",nullable=true,length=15)
	public String getSpincag(){
		return this.spincag;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  宽
	 */
	public void setSpincag(String spincag){
		this.spincag = spincag;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  数量
	 */

	@Column(name ="SPINCAH",nullable=true,length=15)
	public String getSpincah(){
		return this.spincah;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  数量
	 */
	public void setSpincah(String spincah){
		this.spincah = spincah;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  M2
	 */

	@Column(name ="SPINCAI",nullable=true,length=15)
	public String getSpincai(){
		return this.spincai;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  M2
	 */
	public void setSpincai(String spincai){
		this.spincai = spincai;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  裤长
	 */

	@Column(name ="SPINCAJ",nullable=true,length=15)
	public String getSpincaj(){
		return this.spincaj;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  裤长
	 */
	public void setSpincaj(String spincaj){
		this.spincaj = spincaj;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  减
	 */

	@Column(name ="SPINCAK",nullable=true,length=15)
	public String getSpincak(){
		return this.spincak;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  减
	 */
	public void setSpincak(String spincak){
		this.spincak = spincak;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  脾围
	 */

	@Column(name ="SPINCAL",nullable=true,length=15)
	public String getSpincal(){
		return this.spincal;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  脾围
	 */
	public void setSpincal(String spincal){
		this.spincal = spincal;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  数量
	 */

	@Column(name ="SPINCAM",nullable=true,length=15)
	public String getSpincam(){
		return this.spincam;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  数量
	 */
	public void setSpincam(String spincam){
		this.spincam = spincam;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  M2
	 */

	@Column(name ="SPINCAN",nullable=true,length=15)
	public String getSpincan(){
		return this.spincan;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  M2
	 */
	public void setSpincan(String spincan){
		this.spincan = spincan;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  加误率
	 */

	@Column(name ="SPINCAO",nullable=true,length=15)
	public String getSpincao(){
		return this.spincao;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  加误率
	 */
	public void setSpincao(String spincao){
		this.spincao = spincao;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  直
	 */

	@Column(name ="SPINCAP",nullable=true,length=15)
	public String getSpincap(){
		return this.spincap;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  直
	 */
	public void setSpincap(String spincap){
		this.spincap = spincap;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  横
	 */

	@Column(name ="SPINCAQ",nullable=true,length=15)
	public String getSpincaq(){
		return this.spincaq;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  横
	 */
	public void setSpincaq(String spincaq){
		this.spincaq = spincaq;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  合
	 */

	@Column(name ="SPINCAR",nullable=true,length=15)
	public String getSpincar(){
		return this.spincar;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  合
	 */
	public void setSpincar(String spincar){
		this.spincar = spincar;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  合计M2
	 */

	@Column(name ="SPINCAS",nullable=true,length=15)
	public String getSpincas(){
		return this.spincas;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  合计M2
	 */
	public void setSpincas(String spincas){
		this.spincas = spincas;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  备注
	 */

	@Column(name ="SPINCAT",nullable=true,length=50)
	public String getSpincat(){
		return this.spincat;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  备注
	 */
	public void setSpincat(String spincat){
		this.spincat = spincat;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  衣长
	 */

	@Column(name ="SPINDF",nullable=true,length=15)
	public String getSpindf(){
		return this.spindf;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  衣长
	 */
	public void setSpindf(String spindf){
		this.spindf = spindf;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  减
	 */

	@Column(name ="SPINDG",nullable=true,length=15)
	public String getSpindg(){
		return this.spindg;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  减
	 */
	public void setSpindg(String spindg){
		this.spindg = spindg;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  胸围
	 */

	@Column(name ="SPINDH",nullable=true,length=15)
	public String getSpindh(){
		return this.spindh;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  胸围
	 */
	public void setSpindh(String spindh){
		this.spindh = spindh;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  数量
	 */

	@Column(name ="SPINDI",nullable=true,length=15)
	public String getSpindi(){
		return this.spindi;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  数量
	 */
	public void setSpindi(String spindi){
		this.spindi = spindi;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  M2
	 */

	@Column(name ="SPINDJ",nullable=true,length=15)
	public String getSpindj(){
		return this.spindj;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  M2
	 */
	public void setSpindj(String spindj){
		this.spindj = spindj;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  袖长
	 */

	@Column(name ="SPINDK",nullable=true,length=15)
	public String getSpindk(){
		return this.spindk;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  袖长
	 */
	public void setSpindk(String spindk){
		this.spindk = spindk;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  减
	 */

	@Column(name ="SPINDL",nullable=true,length=15)
	public String getSpindl(){
		return this.spindl;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  减
	 */
	public void setSpindl(String spindl){
		this.spindl = spindl;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  袖肥
	 */

	@Column(name ="SPINDM",nullable=true,length=15)
	public String getSpindm(){
		return this.spindm;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  袖肥
	 */
	public void setSpindm(String spindm){
		this.spindm = spindm;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  数量
	 */

	@Column(name ="SPINDN",nullable=true,length=15)
	public String getSpindn(){
		return this.spindn;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  数量
	 */
	public void setSpindn(String spindn){
		this.spindn = spindn;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  M2
	 */

	@Column(name ="SPINDO",nullable=true,length=15)
	public String getSpindo(){
		return this.spindo;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  M2
	 */
	public void setSpindo(String spindo){
		this.spindo = spindo;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  帽长
	 */

	@Column(name ="SPINDP",nullable=true,length=15)
	public String getSpindp(){
		return this.spindp;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  帽长
	 */
	public void setSpindp(String spindp){
		this.spindp = spindp;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  帽宽
	 */

	@Column(name ="SPINDQ",nullable=true,length=15)
	public String getSpindq(){
		return this.spindq;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  帽宽
	 */
	public void setSpindq(String spindq){
		this.spindq = spindq;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  数量
	 */

	@Column(name ="SPINDR",nullable=true,length=15)
	public String getSpindr(){
		return this.spindr;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  数量
	 */
	public void setSpindr(String spindr){
		this.spindr = spindr;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  M2
	 */

	@Column(name ="SPINDS",nullable=true,length=15)
	public String getSpinds(){
		return this.spinds;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  M2
	 */
	public void setSpinds(String spinds){
		this.spinds = spinds;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  领宽
	 */

	@Column(name ="SPINDT",nullable=true,length=15)
	public String getSpindt(){
		return this.spindt;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  领宽
	 */
	public void setSpindt(String spindt){
		this.spindt = spindt;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  领高
	 */

	@Column(name ="SPINDU",nullable=true,length=15)
	public String getSpindu(){
		return this.spindu;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  领高
	 */
	public void setSpindu(String spindu){
		this.spindu = spindu;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  数量
	 */

	@Column(name ="SPINDV",nullable=true,length=15)
	public String getSpindv(){
		return this.spindv;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  数量
	 */
	public void setSpindv(String spindv){
		this.spindv = spindv;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  M2
	 */

	@Column(name ="SPINDW",nullable=true,length=15)
	public String getSpindw(){
		return this.spindw;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  M2
	 */
	public void setSpindw(String spindw){
		this.spindw = spindw;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  加误率
	 */

	@Column(name ="SPINDX",nullable=true,length=15)
	public String getSpindx(){
		return this.spindx;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  加误率
	 */
	public void setSpindx(String spindx){
		this.spindx = spindx;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  直
	 */

	@Column(name ="SPINDY",nullable=true,length=15)
	public String getSpindy(){
		return this.spindy;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  直
	 */
	public void setSpindy(String spindy){
		this.spindy = spindy;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  横
	 */

	@Column(name ="SPINDZ",nullable=true,length=15)
	public String getSpindz(){
		return this.spindz;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  横
	 */
	public void setSpindz(String spindz){
		this.spindz = spindz;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  合计
	 */

	@Column(name ="SPINDAA",nullable=true,length=15)
	public String getSpindaa(){
		return this.spindaa;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  合计
	 */
	public void setSpindaa(String spindaa){
		this.spindaa = spindaa;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  合计M2
	 */

	@Column(name ="SPINDAB",nullable=true,length=15)
	public String getSpindab(){
		return this.spindab;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  合计M2
	 */
	public void setSpindab(String spindab){
		this.spindab = spindab;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  备注
	 */

	@Column(name ="SPINDAC",nullable=true,length=50)
	public String getSpindac(){
		return this.spindac;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  备注
	 */
	public void setSpindac(String spindac){
		this.spindac = spindac;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  衣长
	 */

	@Column(name ="SPINEF",nullable=true,length=15)
	public String getSpinef(){
		return this.spinef;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  衣长
	 */
	public void setSpinef(String spinef){
		this.spinef = spinef;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  减
	 */

	@Column(name ="SPINEG",nullable=true,length=15)
	public String getSpineg(){
		return this.spineg;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  减
	 */
	public void setSpineg(String spineg){
		this.spineg = spineg;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  胸围
	 */

	@Column(name ="SPINEH",nullable=true,length=15)
	public String getSpineh(){
		return this.spineh;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  胸围
	 */
	public void setSpineh(String spineh){
		this.spineh = spineh;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  数量
	 */

	@Column(name ="SPINEI",nullable=true,length=15)
	public String getSpinei(){
		return this.spinei;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  数量
	 */
	public void setSpinei(String spinei){
		this.spinei = spinei;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  M2
	 */

	@Column(name ="SPINEJ",nullable=true,length=15)
	public String getSpinej(){
		return this.spinej;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  M2
	 */
	public void setSpinej(String spinej){
		this.spinej = spinej;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  袖长
	 */

	@Column(name ="SPINEK",nullable=true,length=15)
	public String getSpinek(){
		return this.spinek;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  袖长
	 */
	public void setSpinek(String spinek){
		this.spinek = spinek;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  减
	 */

	@Column(name ="SPINEL",nullable=true,length=15)
	public String getSpinel(){
		return this.spinel;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  减
	 */
	public void setSpinel(String spinel){
		this.spinel = spinel;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  袖肥
	 */

	@Column(name ="SPINEM",nullable=true,length=15)
	public String getSpinem(){
		return this.spinem;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  袖肥
	 */
	public void setSpinem(String spinem){
		this.spinem = spinem;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  数量
	 */

	@Column(name ="SPINEN",nullable=true,length=15)
	public String getSpinen(){
		return this.spinen;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  数量
	 */
	public void setSpinen(String spinen){
		this.spinen = spinen;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  M2
	 */

	@Column(name ="SPINEO",nullable=true,length=15)
	public String getSpineo(){
		return this.spineo;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  M2
	 */
	public void setSpineo(String spineo){
		this.spineo = spineo;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  帽长
	 */

	@Column(name ="SPINEP",nullable=true,length=15)
	public String getSpinep(){
		return this.spinep;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  帽长
	 */
	public void setSpinep(String spinep){
		this.spinep = spinep;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  帽宽
	 */

	@Column(name ="SPINEQ",nullable=true,length=15)
	public String getSpineq(){
		return this.spineq;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  帽宽
	 */
	public void setSpineq(String spineq){
		this.spineq = spineq;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  数量
	 */

	@Column(name ="SPINER",nullable=true,length=15)
	public String getSpiner(){
		return this.spiner;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  数量
	 */
	public void setSpiner(String spiner){
		this.spiner = spiner;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  M2
	 */

	@Column(name ="SPINES",nullable=true,length=15)
	public String getSpines(){
		return this.spines;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  M2
	 */
	public void setSpines(String spines){
		this.spines = spines;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  领宽
	 */

	@Column(name ="SPINET",nullable=true,length=15)
	public String getSpinet(){
		return this.spinet;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  领宽
	 */
	public void setSpinet(String spinet){
		this.spinet = spinet;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  领高
	 */

	@Column(name ="SPINEU",nullable=true,length=15)
	public String getSpineu(){
		return this.spineu;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  领高
	 */
	public void setSpineu(String spineu){
		this.spineu = spineu;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  数量
	 */

	@Column(name ="SPINEV",nullable=true,length=15)
	public String getSpinev(){
		return this.spinev;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  数量
	 */
	public void setSpinev(String spinev){
		this.spinev = spinev;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  M2
	 */

	@Column(name ="SPINEW",nullable=true,length=15)
	public String getSpinew(){
		return this.spinew;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  M2
	 */
	public void setSpinew(String spinew){
		this.spinew = spinew;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  襟长
	 */

	@Column(name ="SPINEX",nullable=true,length=15)
	public String getSpinex(){
		return this.spinex;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  襟长
	 */
	public void setSpinex(String spinex){
		this.spinex = spinex;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  襟宽
	 */

	@Column(name ="SPINEY",nullable=true,length=15)
	public String getSpiney(){
		return this.spiney;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  襟宽
	 */
	public void setSpiney(String spiney){
		this.spiney = spiney;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  数量
	 */

	@Column(name ="SPINEZ",nullable=true,length=15)
	public String getSpinez(){
		return this.spinez;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  数量
	 */
	public void setSpinez(String spinez){
		this.spinez = spinez;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  M2
	 */

	@Column(name ="SPINEAA",nullable=true,length=15)
	public String getSpineaa(){
		return this.spineaa;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  M2
	 */
	public void setSpineaa(String spineaa){
		this.spineaa = spineaa;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  袋长
	 */

	@Column(name ="SPINEAB",nullable=true,length=15)
	public String getSpineab(){
		return this.spineab;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  袋长
	 */
	public void setSpineab(String spineab){
		this.spineab = spineab;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  袋宽
	 */

	@Column(name ="SPINEAC",nullable=true,length=15)
	public String getSpineac(){
		return this.spineac;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  袋宽
	 */
	public void setSpineac(String spineac){
		this.spineac = spineac;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  数量
	 */

	@Column(name ="SPINEAD",nullable=true,length=15)
	public String getSpinead(){
		return this.spinead;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  数量
	 */
	public void setSpinead(String spinead){
		this.spinead = spinead;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  M2
	 */

	@Column(name ="SPINEAE",nullable=true,length=15)
	public String getSpineae(){
		return this.spineae;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  M2
	 */
	public void setSpineae(String spineae){
		this.spineae = spineae;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  长
	 */

	@Column(name ="SPINEAF",nullable=true,length=15)
	public String getSpineaf(){
		return this.spineaf;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  长
	 */
	public void setSpineaf(String spineaf){
		this.spineaf = spineaf;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  宽
	 */

	@Column(name ="SPINEAG",nullable=true,length=15)
	public String getSpineag(){
		return this.spineag;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  宽
	 */
	public void setSpineag(String spineag){
		this.spineag = spineag;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  数量
	 */

	@Column(name ="SPINEAH",nullable=true,length=15)
	public String getSpineah(){
		return this.spineah;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  数量
	 */
	public void setSpineah(String spineah){
		this.spineah = spineah;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  M2
	 */

	@Column(name ="SPINEAI",nullable=true,length=15)
	public String getSpineai(){
		return this.spineai;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  M2
	 */
	public void setSpineai(String spineai){
		this.spineai = spineai;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  裤长
	 */

	@Column(name ="SPINEAJ",nullable=true,length=15)
	public String getSpineaj(){
		return this.spineaj;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  裤长
	 */
	public void setSpineaj(String spineaj){
		this.spineaj = spineaj;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  减
	 */

	@Column(name ="SPINEAK",nullable=true,length=15)
	public String getSpineak(){
		return this.spineak;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  减
	 */
	public void setSpineak(String spineak){
		this.spineak = spineak;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  脾围
	 */

	@Column(name ="SPINEAL",nullable=true,length=15)
	public String getSpineal(){
		return this.spineal;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  脾围
	 */
	public void setSpineal(String spineal){
		this.spineal = spineal;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  数量
	 */

	@Column(name ="SPINEAM",nullable=true,length=15)
	public String getSpineam(){
		return this.spineam;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  数量
	 */
	public void setSpineam(String spineam){
		this.spineam = spineam;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  M2
	 */

	@Column(name ="SPINEAN",nullable=true,length=15)
	public String getSpinean(){
		return this.spinean;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  M2
	 */
	public void setSpinean(String spinean){
		this.spinean = spinean;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  加误率
	 */

	@Column(name ="SPINEAO",nullable=true,length=15)
	public String getSpineao(){
		return this.spineao;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  加误率
	 */
	public void setSpineao(String spineao){
		this.spineao = spineao;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  直
	 */

	@Column(name ="SPINEAP",nullable=true,length=15)
	public String getSpineap(){
		return this.spineap;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  直
	 */
	public void setSpineap(String spineap){
		this.spineap = spineap;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  横
	 */

	@Column(name ="SPINEAQ",nullable=true,length=15)
	public String getSpineaq(){
		return this.spineaq;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  横
	 */
	public void setSpineaq(String spineaq){
		this.spineaq = spineaq;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  合计
	 */

	@Column(name ="SPINEAR",nullable=true,length=15)
	public String getSpinear(){
		return this.spinear;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  合计
	 */
	public void setSpinear(String spinear){
		this.spinear = spinear;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  合计M2
	 */

	@Column(name ="SPINEAS",nullable=true,length=15)
	public String getSpineas(){
		return this.spineas;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  合计M2
	 */
	public void setSpineas(String spineas){
		this.spineas = spineas;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  备注
	 */

	@Column(name ="SPINEAT",nullable=true,length=50)
	public String getSpineat(){
		return this.spineat;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  备注
	 */
	public void setSpineat(String spineat){
		this.spineat = spineat;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  衣长
	 */

	@Column(name ="SPINFF",nullable=true,length=50)
	public String getSpinff(){
		return this.spinff;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  衣长
	 */
	public void setSpinff(String spinff){
		this.spinff = spinff;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  减
	 */

	@Column(name ="SPINFG",nullable=true,length=50)
	public String getSpinfg(){
		return this.spinfg;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  减
	 */
	public void setSpinfg(String spinfg){
		this.spinfg = spinfg;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  胸围
	 */

	@Column(name ="SPINFH",nullable=true,length=50)
	public String getSpinfh(){
		return this.spinfh;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  胸围
	 */
	public void setSpinfh(String spinfh){
		this.spinfh = spinfh;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  数量
	 */

	@Column(name ="SPINFI",nullable=true,length=50)
	public String getSpinfi(){
		return this.spinfi;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  数量
	 */
	public void setSpinfi(String spinfi){
		this.spinfi = spinfi;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  M2
	 */

	@Column(name ="SPINFJ",nullable=true,length=50)
	public String getSpinfj(){
		return this.spinfj;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  M2
	 */
	public void setSpinfj(String spinfj){
		this.spinfj = spinfj;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  袖长
	 */

	@Column(name ="SPINFK",nullable=true,length=50)
	public String getSpinfk(){
		return this.spinfk;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  袖长
	 */
	public void setSpinfk(String spinfk){
		this.spinfk = spinfk;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  减
	 */

	@Column(name ="SPINFL",nullable=true,length=50)
	public String getSpinfl(){
		return this.spinfl;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  减
	 */
	public void setSpinfl(String spinfl){
		this.spinfl = spinfl;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  袖肥
	 */

	@Column(name ="SPINFM",nullable=true,length=50)
	public String getSpinfm(){
		return this.spinfm;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  袖肥
	 */
	public void setSpinfm(String spinfm){
		this.spinfm = spinfm;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  数量
	 */

	@Column(name ="SPINFN",nullable=true,length=50)
	public String getSpinfn(){
		return this.spinfn;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  数量
	 */
	public void setSpinfn(String spinfn){
		this.spinfn = spinfn;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  M2
	 */

	@Column(name ="SPINFO",nullable=true,length=50)
	public String getSpinfo(){
		return this.spinfo;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  M2
	 */
	public void setSpinfo(String spinfo){
		this.spinfo = spinfo;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  帽长
	 */

	@Column(name ="SPINFP",nullable=true,length=50)
	public String getSpinfp(){
		return this.spinfp;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  帽长
	 */
	public void setSpinfp(String spinfp){
		this.spinfp = spinfp;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  帽宽
	 */

	@Column(name ="SPINFQ",nullable=true,length=50)
	public String getSpinfq(){
		return this.spinfq;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  帽宽
	 */
	public void setSpinfq(String spinfq){
		this.spinfq = spinfq;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  数量
	 */

	@Column(name ="SPINFR",nullable=true,length=50)
	public String getSpinfr(){
		return this.spinfr;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  数量
	 */
	public void setSpinfr(String spinfr){
		this.spinfr = spinfr;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  M2
	 */

	@Column(name ="SPINFS",nullable=true,length=50)
	public String getSpinfs(){
		return this.spinfs;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  M2
	 */
	public void setSpinfs(String spinfs){
		this.spinfs = spinfs;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  领宽
	 */

	@Column(name ="SPINFT",nullable=true,length=50)
	public String getSpinft(){
		return this.spinft;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  领宽
	 */
	public void setSpinft(String spinft){
		this.spinft = spinft;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  领高
	 */

	@Column(name ="SPINFU",nullable=true,length=50)
	public String getSpinfu(){
		return this.spinfu;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  领高
	 */
	public void setSpinfu(String spinfu){
		this.spinfu = spinfu;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  数量
	 */

	@Column(name ="SPINFV",nullable=true,length=50)
	public String getSpinfv(){
		return this.spinfv;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  数量
	 */
	public void setSpinfv(String spinfv){
		this.spinfv = spinfv;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  M2
	 */

	@Column(name ="SPINFW",nullable=true,length=50)
	public String getSpinfw(){
		return this.spinfw;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  M2
	 */
	public void setSpinfw(String spinfw){
		this.spinfw = spinfw;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  加误率
	 */

	@Column(name ="SPINFX",nullable=true,length=50)
	public String getSpinfx(){
		return this.spinfx;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  加误率
	 */
	public void setSpinfx(String spinfx){
		this.spinfx = spinfx;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  直
	 */

	@Column(name ="SPINFY",nullable=true,length=50)
	public String getSpinfy(){
		return this.spinfy;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  直
	 */
	public void setSpinfy(String spinfy){
		this.spinfy = spinfy;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  横
	 */

	@Column(name ="SPINFZ",nullable=true,length=50)
	public String getSpinfz(){
		return this.spinfz;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  横
	 */
	public void setSpinfz(String spinfz){
		this.spinfz = spinfz;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  合计
	 */

	@Column(name ="SPINFAA",nullable=true,length=50)
	public String getSpinfaa(){
		return this.spinfaa;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  合计
	 */
	public void setSpinfaa(String spinfaa){
		this.spinfaa = spinfaa;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  合计M2
	 */

	@Column(name ="SPINFAB",nullable=true,length=50)
	public String getSpinfab(){
		return this.spinfab;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  合计M2
	 */
	public void setSpinfab(String spinfab){
		this.spinfab = spinfab;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  备注
	 */

	@Column(name ="SPINFAC",nullable=true,length=50)
	public String getSpinfac(){
		return this.spinfac;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  备注
	 */
	public void setSpinfac(String spinfac){
		this.spinfac = spinfac;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  领宽
	 */

	@Column(name ="SPINGF",nullable=true,length=50)
	public String getSpingf(){
		return this.spingf;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  领宽
	 */
	public void setSpingf(String spingf){
		this.spingf = spingf;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  领高
	 */

	@Column(name ="SPINGG",nullable=true,length=50)
	public String getSpingg(){
		return this.spingg;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  领高
	 */
	public void setSpingg(String spingg){
		this.spingg = spingg;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  数量
	 */

	@Column(name ="SPINGH",nullable=true,length=50)
	public String getSpingh(){
		return this.spingh;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  数量
	 */
	public void setSpingh(String spingh){
		this.spingh = spingh;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  M2
	 */

	@Column(name ="SPINGI",nullable=true,length=50)
	public String getSpingi(){
		return this.spingi;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  M2
	 */
	public void setSpingi(String spingi){
		this.spingi = spingi;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  12宽
	 */

	@Column(name ="SPINGJ",nullable=true,length=50)
	public String getSpingj(){
		return this.spingj;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  12宽
	 */
	public void setSpingj(String spingj){
		this.spingj = spingj;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  高
	 */

	@Column(name ="SPINGK",nullable=true,length=50)
	public String getSpingk(){
		return this.spingk;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  高
	 */
	public void setSpingk(String spingk){
		this.spingk = spingk;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  数量
	 */

	@Column(name ="SPINGL",nullable=true,length=50)
	public String getSpingl(){
		return this.spingl;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  数量
	 */
	public void setSpingl(String spingl){
		this.spingl = spingl;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  M2
	 */

	@Column(name ="SPINGM",nullable=true,length=50)
	public String getSpingm(){
		return this.spingm;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  M2
	 */
	public void setSpingm(String spingm){
		this.spingm = spingm;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  12宽
	 */

	@Column(name ="SPINGN",nullable=true,length=50)
	public String getSpingn(){
		return this.spingn;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  12宽
	 */
	public void setSpingn(String spingn){
		this.spingn = spingn;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  高
	 */

	@Column(name ="SPINGO",nullable=true,length=50)
	public String getSpingo(){
		return this.spingo;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  高
	 */
	public void setSpingo(String spingo){
		this.spingo = spingo;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  数量
	 */

	@Column(name ="SPINGP",nullable=true,length=50)
	public String getSpingp(){
		return this.spingp;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  数量
	 */
	public void setSpingp(String spingp){
		this.spingp = spingp;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  M2
	 */

	@Column(name ="SPINGQ",nullable=true,length=50)
	public String getSpingq(){
		return this.spingq;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  M2
	 */
	public void setSpingq(String spingq){
		this.spingq = spingq;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  加误率
	 */

	@Column(name ="SPINGR",nullable=true,length=50)
	public String getSpingr(){
		return this.spingr;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  加误率
	 */
	public void setSpingr(String spingr){
		this.spingr = spingr;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  直
	 */

	@Column(name ="SPINGS",nullable=true,length=50)
	public String getSpings(){
		return this.spings;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  直
	 */
	public void setSpings(String spings){
		this.spings = spings;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  横
	 */

	@Column(name ="SPINGT",nullable=true,length=50)
	public String getSpingt(){
		return this.spingt;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  横
	 */
	public void setSpingt(String spingt){
		this.spingt = spingt;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  合计
	 */

	@Column(name ="SPINGU",nullable=true,length=50)
	public String getSpingu(){
		return this.spingu;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  合计
	 */
	public void setSpingu(String spingu){
		this.spingu = spingu;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  合计M2
	 */

	@Column(name ="SPINGV",nullable=true,length=50)
	public String getSpingv(){
		return this.spingv;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  合计M2
	 */
	public void setSpingv(String spingv){
		this.spingv = spingv;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  备注
	 */

	@Column(name ="SPINGW",nullable=true,length=50)
	public String getSpingw(){
		return this.spingw;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  备注
	 */
	public void setSpingw(String spingw){
		this.spingw = spingw;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  订单数件
	 */

	@Column(name ="SPINHE",nullable=true,length=50)
	public String getSpinhe(){
		return this.spinhe;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  订单数件
	 */
	public void setSpinhe(String spinhe){
		this.spinhe = spinhe;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  三标
	 */

	@Column(name ="SPINHF",nullable=true,length=50)
	public String getSpinhf(){
		return this.spinhf;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  三标
	 */
	public void setSpinhf(String spinhf){
		this.spinhf = spinhf;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  装饰
	 */

	@Column(name ="SPINHG",nullable=true,length=50)
	public String getSpinhg(){
		return this.spinhg;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  装饰
	 */
	public void setSpinhg(String spinhg){
		this.spinhg = spinhg;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  缝线
	 */

	@Column(name ="SPINHH",nullable=true,length=50)
	public String getSpinhh(){
		return this.spinhh;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  缝线
	 */
	public void setSpinhh(String spinhh){
		this.spinhh = spinhh;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  绳带
	 */

	@Column(name ="SPINHI",nullable=true,length=50)
	public String getSpinhi(){
		return this.spinhi;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  绳带
	 */
	public void setSpinhi(String spinhi){
		this.spinhi = spinhi;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  贴条
	 */

	@Column(name ="SPINHJ",nullable=true,length=50)
	public String getSpinhj(){
		return this.spinhj;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  贴条
	 */
	public void setSpinhj(String spinhj){
		this.spinhj = spinhj;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  金属
	 */

	@Column(name ="SPINHK",nullable=true,length=50)
	public String getSpinhk(){
		return this.spinhk;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  金属
	 */
	public void setSpinhk(String spinhk){
		this.spinhk = spinhk;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  树脂
	 */

	@Column(name ="SPINHL",nullable=true,length=50)
	public String getSpinhl(){
		return this.spinhl;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  树脂
	 */
	public void setSpinhl(String spinhl){
		this.spinhl = spinhl;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  尼龙
	 */

	@Column(name ="SPINHM",nullable=true,length=50)
	public String getSpinhm(){
		return this.spinhm;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  尼龙
	 */
	public void setSpinhm(String spinhm){
		this.spinhm = spinhm;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  平
	 */

	@Column(name ="SPINHN",nullable=true,length=50)
	public String getSpinhn(){
		return this.spinhn;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  平
	 */
	public void setSpinhn(String spinhn){
		this.spinhn = spinhn;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  圆
	 */

	@Column(name ="SPINHO",nullable=true,length=50)
	public String getSpinho(){
		return this.spinho;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  圆
	 */
	public void setSpinho(String spinho){
		this.spinho = spinho;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  金属
	 */

	@Column(name ="SPINHP",nullable=true,length=50)
	public String getSpinhp(){
		return this.spinhp;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  金属
	 */
	public void setSpinhp(String spinhp){
		this.spinhp = spinhp;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  树脂
	 */

	@Column(name ="SPINHQ",nullable=true,length=50)
	public String getSpinhq(){
		return this.spinhq;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  树脂
	 */
	public void setSpinhq(String spinhq){
		this.spinhq = spinhq;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  控制
	 */

	@Column(name ="SPINHR",nullable=true,length=50)
	public String getSpinhr(){
		return this.spinhr;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  控制
	 */
	public void setSpinhr(String spinhr){
		this.spinhr = spinhr;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  气眼
	 */

	@Column(name ="SPINHS",nullable=true,length=50)
	public String getSpinhs(){
		return this.spinhs;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  气眼
	 */
	public void setSpinhs(String spinhs){
		this.spinhs = spinhs;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  粘衬
	 */

	@Column(name ="SPINHT",nullable=true,length=50)
	public String getSpinht(){
		return this.spinht;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  粘衬
	 */
	public void setSpinht(String spinht){
		this.spinht = spinht;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  其它
	 */

	@Column(name ="SPINHU",nullable=true,length=50)
	public String getSpinhu(){
		return this.spinhu;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  其它
	 */
	public void setSpinhu(String spinhu){
		this.spinhu = spinhu;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  辅料合计
	 */

	@Column(name ="SPINHV",nullable=true,length=50)
	public String getSpinhv(){
		return this.spinhv;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  辅料合计
	 */
	public void setSpinhv(String spinhv){
		this.spinhv = spinhv;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  吊牌
	 */

	@Column(name ="SPINHW",nullable=true,length=50)
	public String getSpinhw(){
		return this.spinhw;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  吊牌
	 */
	public void setSpinhw(String spinhw){
		this.spinhw = spinhw;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  贴纸
	 */

	@Column(name ="SPINHX",nullable=true,length=50)
	public String getSpinhx(){
		return this.spinhx;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  贴纸
	 */
	public void setSpinhx(String spinhx){
		this.spinhx = spinhx;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  拷贝纸
	 */

	@Column(name ="SPINHY",nullable=true,length=50)
	public String getSpinhy(){
		return this.spinhy;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  拷贝纸
	 */
	public void setSpinhy(String spinhy){
		this.spinhy = spinhy;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  防伪标
	 */

	@Column(name ="SPINHZ",nullable=true,length=50)
	public String getSpinhz(){
		return this.spinhz;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  防伪标
	 */
	public void setSpinhz(String spinhz){
		this.spinhz = spinhz;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  衣架
	 */

	@Column(name ="SPINHAA",nullable=true,length=50)
	public String getSpinhaa(){
		return this.spinhaa;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  衣架
	 */
	public void setSpinhaa(String spinhaa){
		this.spinhaa = spinhaa;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  胶袋
	 */

	@Column(name ="SPINHAB",nullable=true,length=50)
	public String getSpinhab(){
		return this.spinhab;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  胶袋
	 */
	public void setSpinhab(String spinhab){
		this.spinhab = spinhab;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  纸箱
	 */

	@Column(name ="SPINHAC",nullable=true,length=50)
	public String getSpinhac(){
		return this.spinhac;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  纸箱
	 */
	public void setSpinhac(String spinhac){
		this.spinhac = spinhac;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  其它
	 */

	@Column(name ="SPINHAD",nullable=true,length=50)
	public String getSpinhad(){
		return this.spinhad;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  其它
	 */
	public void setSpinhad(String spinhad){
		this.spinhad = spinhad;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  包装合计
	 */

	@Column(name ="SPINHAE",nullable=true,length=50)
	public String getSpinhae(){
		return this.spinhae;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  包装合计
	 */
	public void setSpinhae(String spinhae){
		this.spinhae = spinhae;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  备注
	 */

	@Column(name ="SPINHAF",nullable=true,length=50)
	public String getSpinhaf(){
		return this.spinhaf;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  备注
	 */
	public void setSpinhaf(String spinhaf){
		this.spinhaf = spinhaf;
	}

	public String getMllx() {
		return mllx;
	}

	public void setMllx(String mllx) {
		this.mllx = mllx;
	}

	public String getCcdw() {
		return ccdw;
	}

	public void setCcdw(String ccdw) {
		this.ccdw = ccdw;
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
