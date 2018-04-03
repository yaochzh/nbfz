package com.jeecg.nbfz.service.impl;

import com.jeecg.nbfz.entity.BdSpinEntity;
import com.jeecg.nbfz.service.BdSpinServiceI;
import com.jeecg.utils.DoubleUtil;
import com.jeecg.utils.ObjectUtil;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import org.jeecgframework.core.util.ApplicationContextUtil;
import org.jeecgframework.core.util.MyClassLoader;
import org.jeecgframework.core.util.StringUtil;
import org.jeecgframework.web.cgform.enhance.CgformEnhanceJavaInter;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service("bdSpinService")
@Transactional
public class BdSpinServiceImpl extends CommonServiceImpl implements BdSpinServiceI {


    @Override
    public void delete(BdSpinEntity entity) throws Exception {
        super.delete(entity);
        //执行删除操作增强业务
        this.doDelBus(entity);
    }

    @Override
    public Serializable save(BdSpinEntity entity) throws Exception {
        Serializable t = super.save(entity);
        //执行新增操作增强业务
        this.doAddBus(entity);
        return t;
    }

    @Override
    public void saveOrUpdate(BdSpinEntity entity) throws Exception {
        super.saveOrUpdate(entity);
        //执行更新操作增强业务
        this.doUpdateBus(entity);
    }

    /**
     * 新增操作增强业务
     *
     * @param t
     * @return
     */
    private void doAddBus(BdSpinEntity t) throws Exception {
        //-----------------sql增强 start----------------------------
        //-----------------sql增强 end------------------------------
        calculate(t);
        //-----------------java增强 start---------------------------
        //-----------------java增强 end-----------------------------
    }

    /**
     * 更新操作增强业务
     *
     * @param t
     * @return
     */
    private void doUpdateBus(BdSpinEntity t) throws Exception {
        //-----------------sql增强 start----------------------------
        //-----------------sql增强 end------------------------------
        calculate(t);
        //-----------------java增强 start---------------------------
        //-----------------java增强 end-----------------------------
    }

    /**
     * 逻辑计算
     *
     * @param t
     */
    private void calculate(BdSpinEntity t) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        //计算前将空值设置为0
        ObjectUtil.setDoubleDefault(t, 0);
        int divxs = 8;
        Double mllxNum = Double.valueOf(1000);
        if(isMllx(t) == 0) {
            mllxNum = Double.valueOf(1000);
        }else if(isMllx(t) == 1) {
            mllxNum = Double.valueOf(100);
        }
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////汇总A
        //R=G4+H4+I4+J4+K4+L4+M4+N4+O4+P4+Q4
//		if(DoubleUtil.isOK(t.getSpinag(),t.getSpingh(),t.getSpinai(),t.getSpinaj(),t.getSpinak(),t.getSpinal(),t.getSpinam(),t.getSpinan(),t.getSpinao(),t.getSpinap(),t.getSpinaq())) {
        t.setSpinar(DoubleUtil.add(t.getSpinag(), t.getSpinah(), t.getSpinai(), t.getSpinaj(), t.getSpinak(), t.getSpinal(), t.getSpinam(), t.getSpinan(), t.getSpinao(), t.getSpinap(), t.getSpinaq()));
//		}
        //v=S4*T4*U4
        //if(DoubleUtil.isOK(t.getSpinas(),t.getSpinat(),t.getSpinau())) {
        t.setSpinav(DoubleUtil.mul(t.getSpinas(), DoubleUtil.div(t.getSpinat(),100), t.getSpinau()));
        //}
        //x=(R4+V4)/(1-W4)
        //if(DoubleUtil.isOK(t.getSpinar(), t.getSpinav(),t.getSpinaw())) {
        t.setSpinax(DoubleUtil.div(DoubleUtil.add(t.getSpinar(), t.getSpinav()), DoubleUtil.sub(1, DoubleUtil.div(t.getSpinaw(),100)), 2));
        //}
        //y=X4-R4
        //if(DoubleUtil.isOK(t.getSpinax(), t.getSpinar())) {
        t.setSpinay(DoubleUtil.sub(t.getSpinax(), t.getSpinar()));
        //}
        //z=Y4-Y4/1.17*0.17
        //if(DoubleUtil.isOK(t.getSpinay(),t.getSpinay())) {
        t.setSpinaz(DoubleUtil.sub(t.getSpinay(), DoubleUtil.mul(DoubleUtil.div(t.getSpinay(), 1.17), 0.17)));
        //}
        //aa==Z4-V4-X4*AB4
        //if(DoubleUtil.isOK(t.getSpinaz(), t.getSpinav(),t.getSpinax(), t.getSpinaab())) {
        t.setSpinaaa(DoubleUtil.sub(DoubleUtil.sub(t.getSpinaz(), t.getSpinav()), DoubleUtil.mul(t.getSpinax(),  DoubleUtil.div(t.getSpinaab(),100))));
        //}
        //ac=AA4/X4
        if (DoubleUtil.isOK(t.getSpinaaa(), t.getSpinax()) && t.getSpinax().compareTo(Double.valueOf("0")) > 0) {
            t.setSpinaac(DoubleUtil.div(t.getSpinaaa(), t.getSpinax()) * 100);
        }
        //ae=S4*AD4
        //if(DoubleUtil.isOK(t.getSpinas(), t.getSpinaad())) {
        t.setSpinaae(DoubleUtil.mul(t.getSpinas(), t.getSpinaad()));
        //}
        //ag=(R4+AE4)/(1-AF4)
        //if(DoubleUtil.isOK(t.getSpinar(), t.getSpinaae(),t.getSpinaaf())) {
        t.setSpinaag(DoubleUtil.div(DoubleUtil.add(t.getSpinar(), t.getSpinaae()), DoubleUtil.sub(1,  DoubleUtil.div(t.getSpinaaf(),100)), 2));
        //}
        //ah=AG4-R4
        //if(DoubleUtil.isOK(t.getSpinaag(), t.getSpinar())) {
        t.setSpinaah(DoubleUtil.sub(t.getSpinaag(), t.getSpinar()));
        //}
        //ai=AH4-AH4/1.17*0.17
        ////if(DoubleUtil.isOK(t.getSpinaah(),t.getSpinaah())) {
        t.setSpinaai(DoubleUtil.sub(t.getSpinaah(), DoubleUtil.mul(DoubleUtil.div(t.getSpinaah(), 1.17), 0.17)));
        //}
        //aj=AI4-AE4-AG4*AK4
        //if(DoubleUtil.isOK(t.getSpinaai(), t.getSpinaae(),t.getSpinaag(), t.getSpinaak())) {
        t.setSpinaaj(DoubleUtil.sub(DoubleUtil.sub(t.getSpinaai(), t.getSpinaae()), DoubleUtil.mul(t.getSpinaag(),  DoubleUtil.div(t.getSpinaak(),100))));
        //}
        //al=AJ4/AG4
        if (DoubleUtil.isOK(t.getSpinaaj(), t.getSpinaag()) && t.getSpinaag().compareTo(Double.valueOf("0")) > 0) {
            t.setSpinaal(DoubleUtil.div(t.getSpinaaj(), t.getSpinaag(), 2) * 100);
        }
       /* //am=AO4/AN4
        if (DoubleUtil.isOK(t.getSpinaao(), t.getSpinaan()) && t.getSpinaan().compareTo(Double.valueOf("0")) > 0) {
            t.setSpinaam(DoubleUtil.div(t.getSpinaao(), t.getSpinaan(), 2));
        }
        //aq=(R4+AO4)/(1-AP4)
        //if(DoubleUtil.isOK(t.getSpinar(), t.getSpinaao(),t.getSpinaap())) {
        t.setSpinaaq(DoubleUtil.div(DoubleUtil.add(t.getSpinar(), t.getSpinaao()), DoubleUtil.sub(1,  DoubleUtil.div(t.getSpinaap(),100)), 2));
        //}
        //ar=AQ4-R4
        //if(DoubleUtil.isOK(t.getSpinaaq(), t.getSpinar())) {
        t.setSpinaar(DoubleUtil.sub(t.getSpinaaq(), t.getSpinar()));
        //}
        //as=AR4-AR4/1.17*0.17
        //if(DoubleUtil.isOK(t.getSpinaar(),t.getSpinaar())) {
        t.setSpinaas(DoubleUtil.sub(t.getSpinaar(), DoubleUtil.mul(DoubleUtil.div(t.getSpinaar(), 1.17), 0.17)));
        //}
        //at=AS4-AO4-(AG4*AU4)
        //if(DoubleUtil.isOK(t.getSpinaas(), t.getSpinaao(),t.getSpinaag(), t.getSpinaau())) {
        t.setSpinaat(DoubleUtil.sub(DoubleUtil.sub(t.getSpinaas(), t.getSpinaao()), DoubleUtil.mul(t.getSpinaag(),  DoubleUtil.div(t.getSpinaau(),100))));
        //}
        //av=AT4/AQ4
        if (DoubleUtil.isOK(t.getSpinaat(), t.getSpinaaq()) && t.getSpinaaq().compareTo(Double.valueOf(0)) > 0) {
            t.setSpinaav(DoubleUtil.div(t.getSpinaat(), t.getSpinaaq()) * 100);
        }*/
        //ax=X4/AW4
        if (DoubleUtil.isOK(t.getSpinax(), t.getSpinaaw()) && t.getSpinaaw().compareTo(Double.valueOf(0)) > 0) {
            t.setSpinaax(DoubleUtil.div(t.getSpinax(), t.getSpinaaw(), 2));
        }
        //ay=AG4/AW4
        if (DoubleUtil.isOK(t.getSpinaag(), t.getSpinaaw()) && t.getSpinaaw().compareTo(Double.valueOf(0)) > 0) {
            t.setSpinaay(DoubleUtil.div(t.getSpinaag(), t.getSpinaaw(), 2));
        }
        //aaz=AQ4/AW4
//        if (DoubleUtil.isOK(t.getSpinaaq(), t.getSpinaaw()) && t.getSpinaaw().compareTo(Double.valueOf(0)) > 0) {
//            t.setSpinaaz(DoubleUtil.div(t.getSpinaaq(), t.getSpinaaw(), 2));
//        }
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////里面料汇总B
        //bh=F4/E4*100/(1-G4)
        if (DoubleUtil.isOK(t.getSpinbf(), t.getSpinbe(), t.getSpinbg()) && t.getSpinbe().compareTo(Double.valueOf(0)) > 0) {
            t.setSpinbh(DoubleUtil.div(DoubleUtil.mul(DoubleUtil.div(t.getSpinbf(), t.getSpinbe()), mllxNum), DoubleUtil.sub(1, DoubleUtil.div(t.getSpinbg(),100)), 2));
        }
        //bj=H4*I4
        //if(DoubleUtil.isOK(t.getSpinbh(), t.getSpinbi())) {
        t.setSpinbj(DoubleUtil.mul(t.getSpinbh(), t.getSpinbi()));
        //}
        //bn=L4/K4*100/(1-M4)
        if (DoubleUtil.isOK(t.getSpinbl(), t.getSpinbk(), t.getSpinbm()) && t.getSpinbk().compareTo(Double.valueOf(0)) > 0) {
            t.setSpinbn(DoubleUtil.div(DoubleUtil.mul(DoubleUtil.div(t.getSpinbl(), t.getSpinbk()), mllxNum), DoubleUtil.sub(1, DoubleUtil.div(t.getSpinbm(),100)), 2));
        }
        //bp=N4*O4
        //if(DoubleUtil.isOK(t.getSpinbn(),t.getSpinbo())) {
        t.setSpinbp(DoubleUtil.mul(t.getSpinbn(), t.getSpinbo()));
        //}
        //bt=R4/Q4*100/(1-S4)
        if (DoubleUtil.isOK(t.getSpinbr(), t.getSpinbq(), t.getSpinbs()) && t.getSpinbq().compareTo(Double.valueOf(0)) > 0) {
            t.setSpinbt(DoubleUtil.div(DoubleUtil.mul(DoubleUtil.div(t.getSpinbr(), t.getSpinbq()), mllxNum), DoubleUtil.sub(1, DoubleUtil.div(t.getSpinbs(),100)), 2));
        }
        //bv=T4*U4
        //if(DoubleUtil.isOK(t.getSpinbt(), t.getSpinbu())) {
        t.setSpinbv(DoubleUtil.mul(t.getSpinbt(), t.getSpinbu()));
        //}
        //bz=X4/W4*100/(1-Y4)
        if (DoubleUtil.isOK(t.getSpinbx(), t.getSpinbw(), t.getSpinby()) && t.getSpinbw().compareTo(Double.valueOf(0)) > 0) {
            t.setSpinbz(DoubleUtil.div(DoubleUtil.mul(DoubleUtil.div(t.getSpinbx(), t.getSpinbw()), mllxNum), DoubleUtil.sub(1, DoubleUtil.div(t.getSpinby(),100)), 2));
        }
        //bab=Z4*AA4
        //if(DoubleUtil.isOK(t.getSpinbz(), t.getSpinbaa())) {
        t.setSpinbab(DoubleUtil.mul(t.getSpinbz(), t.getSpinbaa()));
        //}
        //baf=AD4*AC4/1000/(1-AE4)
        //if(DoubleUtil.isOK(t.getSpinbad(), t.getSpinbac(),t.getSpinbae())) {
        t.setSpinbaf(DoubleUtil.div(DoubleUtil.div(DoubleUtil.mul(t.getSpinbad(), t.getSpinbac()), 1000, 2), DoubleUtil.sub(1, DoubleUtil.div(t.getSpinbae(),100)), 2));
        //}
        //bah=AF4*AG4
        //if(DoubleUtil.isOK(t.getSpinbaf(), t.getSpinbag())) {
        t.setSpinbah(DoubleUtil.mul(t.getSpinbaf(), t.getSpinbag()));
        //}
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////面料1用量c
        //cj=(F4+2-G4)*(H4+5)/10000*I4
        //=(F4-G4+2/2.54)*2.54*(H4+5/2.54)*2.54/10000*I4
        //if(DoubleUtil.isOK(t.getSpincf(), t.getSpincg(),t.getSpinch(),t.getSpinci())) {
        if (isCcdw(t) == 0) {
            t.setSpincj(DoubleUtil.mul(DoubleUtil.div(DoubleUtil.mul(DoubleUtil.sub(DoubleUtil.add(t.getSpincf(), 2), t.getSpincg()), DoubleUtil.add(t.getSpinch(), 5)), 10000,divxs), t.getSpinci()));
        } else if (isCcdw(t) == 1) {
            t.setSpincj(DoubleUtil.mul(DoubleUtil.div(DoubleUtil.mul(DoubleUtil.sub(DoubleUtil.add(t.getSpincf(), DoubleUtil.div(2, 2.54)), t.getSpincg()), DoubleUtil.add(t.getSpinch(), DoubleUtil.div(5, 2.54))), 10000,divxs), t.getSpinci()) * 2.54 * 2.54);
        }
        //}
        //co=(K4+2-L4)*(M4+2)/10000*N4
        //=(K4-L4+2/2.54)*2.54*(M4+2/2.54)*2.54/10000*N4
        //if(DoubleUtil.isOK(t.getSpinck(), t.getSpincl(),t.getSpincm(),t.getSpincn())) {
        if (isCcdw(t) == 0) {
            t.setSpinco(DoubleUtil.mul(DoubleUtil.div(DoubleUtil.mul(DoubleUtil.sub(DoubleUtil.add(t.getSpinck(), 2), t.getSpincl()), DoubleUtil.add(t.getSpincm(), 2)), 10000,divxs), t.getSpincn()));
        } else if (isCcdw(t) == 1) {
            t.setSpinco(DoubleUtil.mul(DoubleUtil.div(DoubleUtil.mul(DoubleUtil.sub(DoubleUtil.add(t.getSpinck(), DoubleUtil.div(2, 2.54)), t.getSpincl()), DoubleUtil.add(t.getSpincm(), DoubleUtil.div(2, 2.54))), 10000,divxs), t.getSpincn()) * 2.54 * 2.54);
        }
        //}
        //cs=(P4+2)*(Q4+4)/10000*R4
        //=(P4+2/2.54)*2.54*(Q4+4/2.54)*2.54/10000*R4
        //if(DoubleUtil.isOK(t.getSpincp(),t.getSpincq(),t.getSpincr())) {
        if (isCcdw(t) == 0) {
            t.setSpincs(DoubleUtil.mul(DoubleUtil.div(DoubleUtil.mul(DoubleUtil.add(t.getSpincp(), 2), DoubleUtil.add(t.getSpincq(), 4)), 10000,divxs), t.getSpincr()));
        } else if (isCcdw(t) == 1) {
            t.setSpincs(DoubleUtil.mul(DoubleUtil.div(DoubleUtil.mul(DoubleUtil.add(t.getSpincp(), DoubleUtil.div(2, 2.54)), DoubleUtil.add(t.getSpincq(), DoubleUtil.div(4, 2.54))), 10000,divxs), t.getSpincr()) * 2.54 * 2.54);
        }
        //}
        //cw=(T4+4)*(U4+3)/10000*V4
        //=(T4+4/2.54)*2.54*(U4+3/2.54)*2.54/10000*V4
        //if(DoubleUtil.isOK(t.getSpinct(),t.getSpincu(),t.getSpincv())) {
        if (isCcdw(t) == 0) {
            t.setSpincw(DoubleUtil.mul(DoubleUtil.div(DoubleUtil.mul(DoubleUtil.add(t.getSpinct(), 4), DoubleUtil.add(t.getSpincu(), 3)), 10000,divxs), t.getSpincv()));
        } else if (isCcdw(t) == 1) {
            t.setSpincw(DoubleUtil.mul(DoubleUtil.div(DoubleUtil.mul(DoubleUtil.add(t.getSpinct(), DoubleUtil.div(4, 2.54)), DoubleUtil.add(t.getSpincu(), DoubleUtil.div(3, 2.54))), 10000,divxs), t.getSpincv()) * 2.54 * 2.54);
        }
        //}
        //caa=(X4+2)*(Y4+2)/10000*Z4
        //=(X4+2/2.54)*2.54*(Y4+2/2.54)*2.54/10000*Z4
        //if(DoubleUtil.isOK(t.getSpincx(),t.getSpincy(),t.getSpincz())) {
        if (isCcdw(t) == 0) {
            t.setSpincaa(DoubleUtil.mul(DoubleUtil.div(DoubleUtil.mul(DoubleUtil.add(t.getSpincx(), 2), DoubleUtil.add(t.getSpincy(), 2)), 10000,divxs), t.getSpincz()));
        } else if (isCcdw(t) == 1) {
            t.setSpincaa(DoubleUtil.mul(DoubleUtil.div(DoubleUtil.mul(DoubleUtil.add(t.getSpincx(), DoubleUtil.div(2, 2.54)), DoubleUtil.add(t.getSpincy(), DoubleUtil.div(2, 2.54))), 10000,divxs), t.getSpincz()) * 2.54 * 2.54);
        }//}
        //cae=(AB4+2)*(AC4+2)/10000*AD4
        //=(AB4+2/2.54)*2.54*(AC4+2/2.54)*2.54/10000*AD4
        //if(DoubleUtil.isOK(t.getSpincab(),t.getSpincac(),t.getSpincad())) {
        if (isCcdw(t) == 0) {
            t.setSpincae(DoubleUtil.mul(DoubleUtil.div(DoubleUtil.mul(DoubleUtil.add(t.getSpincab(), 2), DoubleUtil.add(t.getSpincac(), 2)), 10000,divxs), t.getSpincad()));
        } else if (isCcdw(t) == 1) {
            t.setSpincae(DoubleUtil.mul(DoubleUtil.div(DoubleUtil.mul(DoubleUtil.add(t.getSpincab(), DoubleUtil.div(2, 2.54)), DoubleUtil.add(t.getSpincac(), DoubleUtil.div(2, 2.54))), 10000,divxs), t.getSpincad()) * 2.54 * 2.54);
        }//}
        //cai=(AF4+2)*(AG4+2)/10000*AH4
        //=(AF4+2/2.54)*2.54*(AG4+2/2.54)*2.54/10000*AH4
        //if(DoubleUtil.isOK(t.getSpincaf(),t.getSpincag(), t.getSpincah())) {
        if (isCcdw(t) == 0) {
            t.setSpincai(DoubleUtil.mul(DoubleUtil.div(DoubleUtil.mul(DoubleUtil.add(t.getSpincaf(), 2), DoubleUtil.add(t.getSpincag(), 2)), 10000,divxs), t.getSpincah()));
        } else if (isCcdw(t) == 1) {
            t.setSpincai(DoubleUtil.mul(DoubleUtil.div(DoubleUtil.mul(DoubleUtil.add(t.getSpincaf(), DoubleUtil.div(2, 2.54)), DoubleUtil.add(t.getSpincag(), DoubleUtil.div(2, 2.54))), 10000,divxs), t.getSpincah()) * 2.54 * 2.54);
        }
        //}
        //can=(AJ4+5-AK4)*(AL4+1)/10000*AM4
        //=(AJ4-AK4+5/2.54)*2.54*(AL4+1/2.54)*2.54/10000*AM4
        //if(DoubleUtil.isOK(t.getSpincaj(), t.getSpincak(),t.getSpincal())) {
        if (isCcdw(t) == 0) {
            t.setSpincan(DoubleUtil.mul(DoubleUtil.div(DoubleUtil.mul(DoubleUtil.sub(DoubleUtil.add(t.getSpincaj(), 5), t.getSpincak()), DoubleUtil.add(t.getSpincal(), 1)), 10000,divxs), t.getSpincam()));
        } else if (isCcdw(t) == 1) {
            t.setSpincan(DoubleUtil.mul(DoubleUtil.div(DoubleUtil.mul(DoubleUtil.sub(DoubleUtil.add(t.getSpincaj(), DoubleUtil.div(5, 2.54)), t.getSpincak()), DoubleUtil.add(t.getSpincal(), DoubleUtil.div(1, 2.54))), 10000,divxs), t.getSpincam()) * 2.54 * 2.54);
        }
        //}
        //car=AP4+AQ4
        //if(DoubleUtil.isOK(t.getSpincap(), t.getSpincaq())) {
        t.setSpincar(DoubleUtil.add(t.getSpincap(), t.getSpincaq()));
        //}
        //cas=(J4+O4+S4+W4+AA4+AE4+AI4+AN4)*(1+AO4)/(1-AR4/100)
//        if(DoubleUtil.isOK(t.getSpincj(), t.getSpinco(), t.getSpincs(), t.getSpincw(), t.getSpincaa(), t.getSpincae(), t.getSpincai(), t.getSpincan(), t.getSpincao(),t.getSpincar())) {
        t.setSpincas(DoubleUtil.div(DoubleUtil.mul(DoubleUtil.add(t.getSpincj(), t.getSpinco(), t.getSpincs(), t.getSpincw(), t.getSpincaa(), t.getSpincae(), t.getSpincai(), t.getSpincan()), DoubleUtil.add(1, DoubleUtil.div(t.getSpincao(),100))), DoubleUtil.sub(1, DoubleUtil.div(t.getSpincar(), 100, 2))));
//        }
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////面料2用量D
        //dj=(F4+2-G4)*(H4+5)/10000*I4
        //=(F4-G4+2/2.54)*2.54*(H4+5/2.54)*2.54/10000*I4
        if (isCcdw(t) == 0) {
            t.setSpindj(DoubleUtil.mul(DoubleUtil.div(DoubleUtil.mul(DoubleUtil.sub(DoubleUtil.add(t.getSpindf(), 2), t.getSpindg()), DoubleUtil.add(t.getSpindh(), 5)), 10000,divxs), t.getSpindi()));
        } else if (isCcdw(t) == 1) {
            t.setSpindj(DoubleUtil.mul(DoubleUtil.div(DoubleUtil.mul(DoubleUtil.sub(DoubleUtil.add(t.getSpindf(), DoubleUtil.div(2, 2.54)), t.getSpindg()), DoubleUtil.add(t.getSpindh(), DoubleUtil.div(5, 2.54))), 10000,divxs), t.getSpindi()) * 2.54 * 2.54);
        }
        //do=(K4+2-L4)*(M4+2)/10000*N4
        //=(K4-L4+2/2.54)*2.54*(M4+2/2.54)*2.54/10000*N4
        if (isCcdw(t) == 0) {
            t.setSpindo(DoubleUtil.mul(DoubleUtil.div(DoubleUtil.mul(DoubleUtil.sub(DoubleUtil.add(t.getSpindk(), 2), t.getSpindl()), DoubleUtil.add(t.getSpindm(), 2)), 10000,divxs), t.getSpindn()));
        } else if (isCcdw(t) == 1) {
            t.setSpindo(DoubleUtil.mul(DoubleUtil.div(DoubleUtil.mul(DoubleUtil.sub(DoubleUtil.add(t.getSpindk(), DoubleUtil.div(2, 2.54)), t.getSpindl()), DoubleUtil.add(t.getSpindm(), DoubleUtil.div(2, 2.54))), 10000,divxs), t.getSpindn()) * 2.54 * 2.54);
        }
        //ds=(P4+2)*(Q4+4)/10000*R4
        //=(P4+2/2.54)*2.54*(Q4+4/2.54)*2.54/10000*R4
        if (isCcdw(t) == 0) {
            t.setSpinds(DoubleUtil.mul(DoubleUtil.div(DoubleUtil.mul(DoubleUtil.add(t.getSpindp(), 2), DoubleUtil.add(t.getSpindq(), 4)), 10000,divxs), t.getSpindr()));
        } else if (isCcdw(t) == 1) {
            t.setSpinds(DoubleUtil.mul(DoubleUtil.div(DoubleUtil.mul(DoubleUtil.add(t.getSpindp(), DoubleUtil.div(2, 2.54)), DoubleUtil.add(t.getSpindq(), DoubleUtil.div(4, 2.54))), 10000,divxs), t.getSpindr()) * 2.54 * 2.54);
        }
        //dw=(T4+4)*(U4+3)/10000*V4
        //=(T4+4/2.54)*2.54*(U4+3/2.54)*2.54/10000*V4
        if (isCcdw(t) == 0) {
            t.setSpindw(DoubleUtil.mul(DoubleUtil.div(DoubleUtil.mul(DoubleUtil.add(t.getSpindt(), 4), DoubleUtil.add(t.getSpindu(), 3)), 10000,divxs), t.getSpindv()));
        } else if (isCcdw(t) == 1) {
            t.setSpindw(DoubleUtil.mul(DoubleUtil.div(DoubleUtil.mul(DoubleUtil.add(t.getSpindt(), DoubleUtil.div(4, 2.54)), DoubleUtil.add(t.getSpindu(), DoubleUtil.div(3, 2.54))), 10000,divxs), t.getSpindv()) * 2.54 * 2.54);
        }
        //daa=Y4+Z4
        t.setSpindaa(DoubleUtil.add(t.getSpindy(), t.getSpindz()));
        //dab=(J4+O4+S4+W4)*(1+X4)/(1-AA4/100)
        t.setSpindab(DoubleUtil.div(DoubleUtil.mul(DoubleUtil.add(t.getSpindj(), t.getSpindo(), t.getSpinds(), t.getSpindw()), DoubleUtil.add(1, DoubleUtil.div(t.getSpindx(),100))), DoubleUtil.sub(1, DoubleUtil.div(t.getSpindaa(), 100, 2)), 2));
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////里料1用量E
        //ej=(F4+2-G4)*(H4+5)/10000*I4 cm
        //ej=(F4-G4+2/2.54)*2.54*(H4+5/2.54)*2.54/10000*I4 yc
        if (isCcdw(t) == 0) {
            t.setSpinej(DoubleUtil.mul(DoubleUtil.div(DoubleUtil.mul(DoubleUtil.sub(DoubleUtil.add(t.getSpinef(), 2), t.getSpineg()), DoubleUtil.add(t.getSpineh(), 5)), 10000,divxs), t.getSpinei()));
        } else if (isCcdw(t) == 1) {
            t.setSpinej(DoubleUtil.mul(DoubleUtil.div(DoubleUtil.mul(DoubleUtil.sub(DoubleUtil.add(t.getSpinef(), DoubleUtil.div(2, 2.54)), t.getSpineg()), DoubleUtil.add(t.getSpineh(), DoubleUtil.div(5, 2.54))), 10000,divxs), t.getSpinei()) * 2.54 * 2.54);
        }
        //eo=(K4+2-L4)*(M4+2)/10000*N4
        //=(K4-L4+2/2.54)*2.54*(M4+2/2.54)*2.54/10000*N4
        if (isCcdw(t) == 0) {
            t.setSpineo(DoubleUtil.mul(DoubleUtil.div(DoubleUtil.mul(DoubleUtil.sub(DoubleUtil.add(t.getSpinek(), 2), t.getSpinel()), DoubleUtil.add(t.getSpinem(), 2)), 10000,divxs), t.getSpinen()));
        } else if (isCcdw(t) == 1) {
            t.setSpineo(DoubleUtil.mul(DoubleUtil.div(DoubleUtil.mul(DoubleUtil.sub(DoubleUtil.add(t.getSpinek(), DoubleUtil.div(2, 2.54)), t.getSpinel()), DoubleUtil.add(t.getSpinem(), DoubleUtil.div(2, 2.54))), 10000,divxs), t.getSpinen()) * 2.54 * 2.54);
        }
        //es=(P4+2)*(Q4+4)/10000*R4
        //=(P4+2/2.54)*2.54*(Q4+4/2.54)*2.54/10000*R4
        if (isCcdw(t) == 0) {
            t.setSpines(DoubleUtil.mul(DoubleUtil.div(DoubleUtil.mul(DoubleUtil.add(t.getSpinep(), 2), DoubleUtil.add(t.getSpineq(), 4)), 10000,divxs), t.getSpiner()));
        } else if (isCcdw(t) == 1) {
            t.setSpines(DoubleUtil.mul(DoubleUtil.div(DoubleUtil.mul(DoubleUtil.add(t.getSpinep(), DoubleUtil.div(2, 2.54)), DoubleUtil.add(t.getSpineq(), DoubleUtil.div(4, 2.54))), 10000,divxs), t.getSpiner()) * 2.54 * 2.54);
        }
        //ew=(T4+4)*(U4+3)/10000*V4
        //=(T4+4/2.54)*2.54*(U4+3/2.54)*2.54/10000*V4
        if (isCcdw(t) == 0) {
            t.setSpinem(DoubleUtil.mul(DoubleUtil.div(DoubleUtil.mul(DoubleUtil.add(t.getSpinet(), 4), DoubleUtil.add(t.getSpineu(), 3)), 10000,divxs), t.getSpinev()));
        } else if (isCcdw(t) == 1) {
            t.setSpinem(DoubleUtil.mul(DoubleUtil.div(DoubleUtil.mul(DoubleUtil.add(t.getSpinet(), DoubleUtil.div(4, 2.54)), DoubleUtil.add(t.getSpineu(), DoubleUtil.div(3, 2.54))), 10000,divxs), t.getSpinev()) * 2.54 * 2.54);
        }
        //eaa=(X4+2)*(Y4+2)/10000*Z4
        //=(X4+2/2.54)*2.54*(Y4+2/2.54)*2.54/10000*Z4
        if (isCcdw(t) == 0) {
            t.setSpineaa(DoubleUtil.mul(DoubleUtil.div(DoubleUtil.mul(DoubleUtil.add(t.getSpinex(), 2), DoubleUtil.add(t.getSpiney(), 2)), 10000,divxs), t.getSpinez()));
        } else if (isCcdw(t) == 1) {
            t.setSpineaa(DoubleUtil.mul(DoubleUtil.div(DoubleUtil.mul(DoubleUtil.add(t.getSpinex(), DoubleUtil.div(2, 2.54)), DoubleUtil.add(t.getSpiney(), DoubleUtil.div(2, 2.54))), 10000,divxs), t.getSpinez()) * 2.54 * 2.54);
        }
        //eae=(AB4+2)*(AC4+2)/10000*AD4
        //=(AB4+2/2.54)*2.54*(AC4+2/2.54)*2.54/10000*AD4
        if (isCcdw(t) == 0) {
            t.setSpineae(DoubleUtil.mul(DoubleUtil.div(DoubleUtil.mul(DoubleUtil.add(t.getSpineab(), 2), DoubleUtil.add(t.getSpineac(), 2)), 10000,divxs), t.getSpinead()));
        } else if (isCcdw(t) == 1) {
            t.setSpineaa(DoubleUtil.mul(DoubleUtil.div(DoubleUtil.mul(DoubleUtil.add(t.getSpinex(), DoubleUtil.div(2, 2.54)), DoubleUtil.add(t.getSpiney(), DoubleUtil.div(2, 2.54))), 10000,divxs), t.getSpinez()) * 2.54 * 2.54);
        }
        //eai=(AF4+2)*(AG4+2)/10000*AH4
        //=(AF4+2/2.54)*2.54*(AG4+2/2.54)*2.54/10000*AH4
        if (isCcdw(t) == 0) {
            t.setSpineai(DoubleUtil.mul(DoubleUtil.div(DoubleUtil.mul(DoubleUtil.add(t.getSpineaf(), 2), DoubleUtil.add(t.getSpineag(), 2)), 10000,divxs), t.getSpineah()));
        } else if (isCcdw(t) == 1) {
            t.setSpineai(DoubleUtil.mul(DoubleUtil.div(DoubleUtil.mul(DoubleUtil.add(t.getSpineaf(), DoubleUtil.div(2, 2.54)), DoubleUtil.add(t.getSpineag(), DoubleUtil.div(2, 2.54))), 10000,divxs), t.getSpineah()) * 2.54 * 2.54);
        }
        //ean=(AJ4+5-AK4)*(AL4+1)/10000*AM4
        //=(AJ4-AK4+5/2.54)*2.54*(AL4+1/2.54)*2.54/10000*AM4
        if (isCcdw(t) == 0) {
            t.setSpinean(DoubleUtil.mul(DoubleUtil.div(DoubleUtil.mul(DoubleUtil.sub(DoubleUtil.add(t.getSpineaj(), 5), t.getSpineak()), DoubleUtil.add(t.getSpineal(), 1)), 10000,divxs), t.getSpineam()));
        } else if (isCcdw(t) == 1) {
            t.setSpinean(DoubleUtil.mul(DoubleUtil.div(DoubleUtil.mul(DoubleUtil.sub(DoubleUtil.add(t.getSpineaj(), DoubleUtil.div(5, 2.54)), t.getSpineak()), DoubleUtil.add(t.getSpineal(), DoubleUtil.div(1, 2.54))), 10000,divxs), t.getSpineam()) * 2.54 * 2.54);
        }
        //ear=AP4+AQ4
        t.setSpinear(DoubleUtil.add(t.getSpineap(), t.getSpineaq()));
        //eas=(J4+O4+S4+W4+AA4+AE4+AI4+AN4)*(1+AO4)/(1-AR4/100)
        t.setSpineas(DoubleUtil.div(DoubleUtil.mul(DoubleUtil.add(t.getSpinej(), t.getSpineo(), t.getSpines(), t.getSpinew(), t.getSpineaa(), t.getSpineae(), t.getSpineai(), t.getSpinean()), DoubleUtil.add(1, DoubleUtil.div(t.getSpineao(),100))), DoubleUtil.sub(1, DoubleUtil.div(t.getSpinear(), 100, 2)), 2));
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////里料2用量F
        //fj=(F4+2-G4)*(H4+5)/10000*I4
        //=(F4-G4+2/2.54)*2.54*(H4+5/2.54)*2.54/10000*I4
        if (isCcdw(t) == 0) {
            t.setSpinfj(DoubleUtil.mul(DoubleUtil.div(DoubleUtil.mul(DoubleUtil.sub(DoubleUtil.add(t.getSpinff(), 2), t.getSpinfg()), DoubleUtil.add(t.getSpinfh(), 5)), 10000,divxs), t.getSpinfi()));
        } else if (isCcdw(t) == 1) {
            t.setSpinfj(DoubleUtil.mul(DoubleUtil.div(DoubleUtil.mul(DoubleUtil.sub(DoubleUtil.add(t.getSpinff(), DoubleUtil.div(2, 2.54)), t.getSpinfg()), DoubleUtil.add(t.getSpinfh(), DoubleUtil.div(5, 2.54))), 10000,divxs), t.getSpinfi()) * 2.54 * 2.54);
        }
        //fo=(K4+2-L4)*(M4+2)/10000*N4
        //=(K4-L4+2/2.54)*2.54*(M4+2/2.54)*2.54/10000*N4
        if (isCcdw(t) == 0) {
            t.setSpinfo(DoubleUtil.mul(DoubleUtil.div(DoubleUtil.mul(DoubleUtil.sub(DoubleUtil.add(t.getSpinfk(), 2), t.getSpinfl()), DoubleUtil.add(t.getSpinfm(), 2)), 10000,divxs), t.getSpinfn()));
        } else if (isCcdw(t) == 1) {
            t.setSpinfo(DoubleUtil.mul(DoubleUtil.div(DoubleUtil.mul(DoubleUtil.sub(DoubleUtil.add(t.getSpinfk(), DoubleUtil.div(2, 2.54)), t.getSpinfl()), DoubleUtil.add(t.getSpinfm(), DoubleUtil.div(2, 2.54))), 10000,divxs), t.getSpinfn()) * 2.54 * 2.54);
        }
        //fs=(P4+2)*(Q4+4)/10000*R4
        //=(P4+2/2.54)*2.54*(Q4+4/2.54)*2.54/10000*R4
        if (isCcdw(t) == 0) {
            t.setSpinfs(DoubleUtil.mul(DoubleUtil.div(DoubleUtil.mul(DoubleUtil.add(t.getSpinfp(), 2), DoubleUtil.add(t.getSpinfq(), 4)), 10000,divxs), t.getSpinfr()));
        } else if (isCcdw(t) == 1) {
            t.setSpinfs(DoubleUtil.mul(DoubleUtil.div(DoubleUtil.mul(DoubleUtil.add(t.getSpinfp(), DoubleUtil.div(2, 2.54)), DoubleUtil.add(t.getSpinfq(), DoubleUtil.div(4, 2.54))), 10000,divxs), t.getSpinfr()) * 2.54 * 2.54);
        }
        //fw=(T4+4)*(U4+3)/10000*V4
        //=(T4+4/2.54)*2.54*(U4+3/2.54)*2.54/10000*V4
        if (isCcdw(t) == 0) {
            t.setSpinfw(DoubleUtil.mul(DoubleUtil.div(DoubleUtil.mul(DoubleUtil.add(t.getSpinft(), 4), DoubleUtil.add(t.getSpinfu(), 3)), 10000,divxs), t.getSpinfv()));
        } else if (isCcdw(t) == 1) {
            t.setSpinfw(DoubleUtil.mul(DoubleUtil.div(DoubleUtil.mul(DoubleUtil.add(t.getSpinft(), DoubleUtil.div(4, 2.54)), DoubleUtil.add(t.getSpinfu(), DoubleUtil.div(3, 2.54))), 10000,divxs), t.getSpinfv()) * 2.54 * 2.54);
        }
        //faa=Y4+Z4
        t.setSpinfaa(DoubleUtil.add(t.getSpinfy(), t.getSpinfz()));
        //fab=(J4+O4+S4+W4)*(1+X4)/(1-AA4/100)
        t.setSpinfab(DoubleUtil.div(DoubleUtil.mul(DoubleUtil.add(t.getSpinfj(), t.getSpinfo(), t.getSpinfs(), t.getSpinfw()), DoubleUtil.add(1, DoubleUtil.div(t.getSpinfx(),100))), DoubleUtil.sub(1, DoubleUtil.div(t.getSpinfaa(), 100, 2)), 2));

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////螺纹用量G
        //gi=(F4+4)*(G4*2+2.5)/10000*H4
        //=(F4+4/2.54)*2.54*(G4*2+2.5/2.54)*2.54/10000*H4
        if (isCcdw(t) == 0) {
            t.setSpingi(DoubleUtil.mul(DoubleUtil.div(DoubleUtil.mul(DoubleUtil.add(t.getSpingf(), 4), DoubleUtil.add(DoubleUtil.mul(t.getSpingg(), 2), 2.5)), 10000,divxs), t.getSpingh()));
        } else if (isCcdw(t) == 1) {
            t.setSpingi(DoubleUtil.mul(DoubleUtil.div(DoubleUtil.mul(DoubleUtil.add(t.getSpingf(), DoubleUtil.div(4, 2.54)), DoubleUtil.add(DoubleUtil.mul(t.getSpingg(), 2), DoubleUtil.div(2.5, 2.54))), 10000,divxs), t.getSpingh()) * 2.54 * 2.54);
        }
        //gm=(J4+4)*2*(K4*2+2.5)/10000*L4
        //=(J4+4/2.54)*2.54*2*(K4*2+2.5/2.54)*2.54/10000*L4
        if (isCcdw(t) == 0) {
            t.setSpingm(DoubleUtil.mul(2, DoubleUtil.div(DoubleUtil.mul(DoubleUtil.add(t.getSpingj(), 4), DoubleUtil.add(DoubleUtil.mul(t.getSpingk(), 2), 2.5)), 10000,divxs), t.getSpingl()));
        } else if (isCcdw(t) == 1) {
            t.setSpingm(DoubleUtil.mul(2, DoubleUtil.div(DoubleUtil.mul(DoubleUtil.add(t.getSpingj(), DoubleUtil.div(4, 2.54)), DoubleUtil.add(DoubleUtil.mul(t.getSpingk(), 2), DoubleUtil.div(2.5, 2.54))), 10000,divxs), t.getSpingl()) * 2.54 * 2.54);
        }
        //gq=(N4+2)*2*(O4*2+2.5)/10000*P4
        //=(N4+2/2.54)*2.54*2*(O4*2+2.5/2.54)*2.54/10000*P4
        if (isCcdw(t) == 0) {
            t.setSpingq(DoubleUtil.mul(2, DoubleUtil.div(DoubleUtil.mul(DoubleUtil.add(t.getSpingn(), 2), DoubleUtil.add(DoubleUtil.mul(t.getSpingo(), 2), 2.5)), 10000,divxs), t.getSpingp()));
        } else if (isCcdw(t) == 1) {
            t.setSpingq(DoubleUtil.mul(2, DoubleUtil.div(DoubleUtil.mul(DoubleUtil.add(t.getSpingn(), DoubleUtil.div(2, 2.54)), DoubleUtil.add(DoubleUtil.mul(t.getSpingo(), 2), DoubleUtil.div(2.5, 2.54))), 10000,divxs), t.getSpingp()) * 2.54 * 2.54);
        }
        //gu=S4+T4
        t.setSpingu(DoubleUtil.add(t.getSpings(), t.getSpingt()));
        //gv=(I4+M4+Q4)*(1+R4)/(1-U4/100)
        t.setSpingv(DoubleUtil.div(DoubleUtil.mul(DoubleUtil.add(t.getSpingi(), t.getSpingm(), t.getSpingq()), DoubleUtil.add(1, DoubleUtil.div(t.getSpingr(),100))), DoubleUtil.sub(1, DoubleUtil.div(t.getSpingu(), 100, 2)), 2));
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////辅料汇总H

        //计算后将0设置为空值
        ObjectUtil.setDoubleDefault(t, 1);
    }

    /**
     * 0:针织，1：梭织
     *
     * @param t
     * @return
     */
    private int isMllx(BdSpinEntity t) {
        if (t.getMllx() != null && t.getMllx().equals("0")) {
            return 0;
        } else if (t.getMllx() != null && t.getMllx().equals("1")) {
            return 1;
        }
        return 3;
    }

    /**
     * 0：厘米，1：英寸
     *
     * @param t
     * @return
     */
    private int isCcdw(BdSpinEntity t) {
        if (t.getCcdw() != null && t.getCcdw().equals("0")) {
            return 0;
        } else if (t.getCcdw() != null && t.getCcdw().equals("1")) {
            return 1;
        }
        return 3;
    }

    /**
     * 删除操作增强业务
     *
     * @param t
     * @return
     */
    private void doDelBus(BdSpinEntity t) throws Exception {
        //-----------------sql增强 start----------------------------
        //-----------------sql增强 end------------------------------

        //-----------------java增强 start---------------------------
        //-----------------java增强 end-----------------------------
    }

    private Map<String, Object> populationMap(BdSpinEntity t) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("id", t.getId());
        map.put("create_name", t.getCreateName());
        map.put("create_by", t.getCreateBy());
        map.put("create_date", t.getCreateDate());
        map.put("update_name", t.getUpdateName());
        map.put("update_by", t.getUpdateBy());
        map.put("update_date", t.getUpdateDate());
        map.put("sys_org_code", t.getSysOrgCode());
        map.put("sys_company_code", t.getSysCompanyCode());
        map.put("bpm_status", t.getBpmStatus());
        map.put("mllx", t.getMllx());
        map.put("ccdw", t.getCcdw());
        map.put("spinaa", t.getSpinaa());
        map.put("spinab", t.getSpinab());
        map.put("spinac", t.getSpinac());
        map.put("spinad", t.getSpinad());
        map.put("spinae", t.getSpinae());
        map.put("spinaf", t.getSpinaf());
        map.put("spinag", t.getSpinag());
        map.put("spinah", t.getSpinah());
        map.put("spinai", t.getSpinai());
        map.put("spinaj", t.getSpinaj());
        map.put("spinak", t.getSpinak());
        map.put("spinal", t.getSpinal());
        map.put("spinam", t.getSpinam());
        map.put("spinan", t.getSpinan());
        map.put("spinao", t.getSpinao());
        map.put("spinap", t.getSpinap());
        map.put("spinaq", t.getSpinaq());
        map.put("spinar", t.getSpinar());
        map.put("spinas", t.getSpinas());
        map.put("spinat", t.getSpinat());
        map.put("spinau", t.getSpinau());
        map.put("spinav", t.getSpinav());
        map.put("spinaw", t.getSpinaw());
        map.put("spinax", t.getSpinax());
        map.put("spinay", t.getSpinay());
        map.put("spinaz", t.getSpinaz());
        map.put("spinaaa", t.getSpinaaa());
        map.put("spinaab", t.getSpinaab());
        map.put("spinaac", t.getSpinaac());
        map.put("spinaad", t.getSpinaad());
        map.put("spinaae", t.getSpinaae());
        map.put("spinaaf", t.getSpinaaf());
        map.put("spinaag", t.getSpinaag());
        map.put("spinaah", t.getSpinaah());
        map.put("spinaai", t.getSpinaai());
        map.put("spinaaj", t.getSpinaaj());
        map.put("spinaak", t.getSpinaak());
        map.put("spinaal", t.getSpinaal());
        map.put("spinaam", t.getSpinaam());
        map.put("spinaan", t.getSpinaan());
        map.put("spinaao", t.getSpinaao());
        map.put("spinaap", t.getSpinaap());
        map.put("spinaaq", t.getSpinaaq());
        map.put("spinaar", t.getSpinaar());
        map.put("spinaas", t.getSpinaas());
        map.put("spinaat", t.getSpinaat());
        map.put("spinaau", t.getSpinaau());
        map.put("spinaav", t.getSpinaav());
        map.put("spinaaw", t.getSpinaaw());
        map.put("spinaax", t.getSpinaax());
        map.put("spinaay", t.getSpinaay());
        map.put("spinaaz", t.getSpinaaz());
        map.put("spinaba", t.getSpinaba());
        map.put("spinabb", t.getSpinabb());
        map.put("spinabc", t.getSpinabc());
        map.put("spinabd", t.getSpinabd());
        map.put("spinbe", t.getSpinbe());
        map.put("spinbf", t.getSpinbf());
        map.put("spinbg", t.getSpinbg());
        map.put("spinbh", t.getSpinbh());
        map.put("spinbi", t.getSpinbi());
        map.put("spinbj", t.getSpinbj());
        map.put("spinbk", t.getSpinbk());
        map.put("spinbl", t.getSpinbl());
        map.put("spinbm", t.getSpinbm());
        map.put("spinbn", t.getSpinbn());
        map.put("spinbo", t.getSpinbo());
        map.put("spinbp", t.getSpinbp());
        map.put("spinbq", t.getSpinbq());
        map.put("spinbr", t.getSpinbr());
        map.put("spinbs", t.getSpinbs());
        map.put("spinbt", t.getSpinbt());
        map.put("spinbu", t.getSpinbu());
        map.put("spinbv", t.getSpinbv());
        map.put("spinbw", t.getSpinbw());
        map.put("spinbx", t.getSpinbx());
        map.put("spinby", t.getSpinby());
        map.put("spinbz", t.getSpinbz());
        map.put("spinbaa", t.getSpinbaa());
        map.put("spinbab", t.getSpinbab());
        map.put("spinbac", t.getSpinbac());
        map.put("spinbad", t.getSpinbad());
        map.put("spinbae", t.getSpinbae());
        map.put("spinbaf", t.getSpinbaf());
        map.put("spinbag", t.getSpinbag());
        map.put("spinbah", t.getSpinbah());
        map.put("spinbai", t.getSpinbai());
        map.put("spince", t.getSpince());
        map.put("spincf", t.getSpincf());
        map.put("spincg", t.getSpincg());
        map.put("spinch", t.getSpinch());
        map.put("spinci", t.getSpinci());
        map.put("spincj", t.getSpincj());
        map.put("spinck", t.getSpinck());
        map.put("spincl", t.getSpincl());
        map.put("spincm", t.getSpincm());
        map.put("spincn", t.getSpincn());
        map.put("spinco", t.getSpinco());
        map.put("spincp", t.getSpincp());
        map.put("spincq", t.getSpincq());
        map.put("spincr", t.getSpincr());
        map.put("spincs", t.getSpincs());
        map.put("spinct", t.getSpinct());
        map.put("spincu", t.getSpincu());
        map.put("spincv", t.getSpincv());
        map.put("spincw", t.getSpincw());
        map.put("spincx", t.getSpincx());
        map.put("spincy", t.getSpincy());
        map.put("spincz", t.getSpincz());
        map.put("spincaa", t.getSpincaa());
        map.put("spincab", t.getSpincab());
        map.put("spincac", t.getSpincac());
        map.put("spincad", t.getSpincad());
        map.put("spincae", t.getSpincae());
        map.put("spincaf", t.getSpincaf());
        map.put("spincag", t.getSpincag());
        map.put("spincah", t.getSpincah());
        map.put("spincai", t.getSpincai());
        map.put("spincaj", t.getSpincaj());
        map.put("spincak", t.getSpincak());
        map.put("spincal", t.getSpincal());
        map.put("spincam", t.getSpincam());
        map.put("spincan", t.getSpincan());
        map.put("spincao", t.getSpincao());
        map.put("spincap", t.getSpincap());
        map.put("spincaq", t.getSpincaq());
        map.put("spincar", t.getSpincar());
        map.put("spincas", t.getSpincas());
        map.put("spincat", t.getSpincat());
        map.put("spindf", t.getSpindf());
        map.put("spindg", t.getSpindg());
        map.put("spindh", t.getSpindh());
        map.put("spindi", t.getSpindi());
        map.put("spindj", t.getSpindj());
        map.put("spindk", t.getSpindk());
        map.put("spindl", t.getSpindl());
        map.put("spindm", t.getSpindm());
        map.put("spindn", t.getSpindn());
        map.put("spindo", t.getSpindo());
        map.put("spindp", t.getSpindp());
        map.put("spindq", t.getSpindq());
        map.put("spindr", t.getSpindr());
        map.put("spinds", t.getSpinds());
        map.put("spindt", t.getSpindt());
        map.put("spindu", t.getSpindu());
        map.put("spindv", t.getSpindv());
        map.put("spindw", t.getSpindw());
        map.put("spindx", t.getSpindx());
        map.put("spindy", t.getSpindy());
        map.put("spindz", t.getSpindz());
        map.put("spindaa", t.getSpindaa());
        map.put("spindab", t.getSpindab());
        map.put("spindac", t.getSpindac());
        map.put("spinef", t.getSpinef());
        map.put("spineg", t.getSpineg());
        map.put("spineh", t.getSpineh());
        map.put("spinei", t.getSpinei());
        map.put("spinej", t.getSpinej());
        map.put("spinek", t.getSpinek());
        map.put("spinel", t.getSpinel());
        map.put("spinem", t.getSpinem());
        map.put("spinen", t.getSpinen());
        map.put("spineo", t.getSpineo());
        map.put("spinep", t.getSpinep());
        map.put("spineq", t.getSpineq());
        map.put("spiner", t.getSpiner());
        map.put("spines", t.getSpines());
        map.put("spinet", t.getSpinet());
        map.put("spineu", t.getSpineu());
        map.put("spinev", t.getSpinev());
        map.put("spinew", t.getSpinew());
        map.put("spinex", t.getSpinex());
        map.put("spiney", t.getSpiney());
        map.put("spinez", t.getSpinez());
        map.put("spineaa", t.getSpineaa());
        map.put("spineab", t.getSpineab());
        map.put("spineac", t.getSpineac());
        map.put("spinead", t.getSpinead());
        map.put("spineae", t.getSpineae());
        map.put("spineaf", t.getSpineaf());
        map.put("spineag", t.getSpineag());
        map.put("spineah", t.getSpineah());
        map.put("spineai", t.getSpineai());
        map.put("spineaj", t.getSpineaj());
        map.put("spineak", t.getSpineak());
        map.put("spineal", t.getSpineal());
        map.put("spineam", t.getSpineam());
        map.put("spinean", t.getSpinean());
        map.put("spineao", t.getSpineao());
        map.put("spineap", t.getSpineap());
        map.put("spineaq", t.getSpineaq());
        map.put("spinear", t.getSpinear());
        map.put("spineas", t.getSpineas());
        map.put("spineat", t.getSpineat());
        map.put("spinff", t.getSpinff());
        map.put("spinfg", t.getSpinfg());
        map.put("spinfh", t.getSpinfh());
        map.put("spinfi", t.getSpinfi());
        map.put("spinfj", t.getSpinfj());
        map.put("spinfk", t.getSpinfk());
        map.put("spinfl", t.getSpinfl());
        map.put("spinfm", t.getSpinfm());
        map.put("spinfn", t.getSpinfn());
        map.put("spinfo", t.getSpinfo());
        map.put("spinfp", t.getSpinfp());
        map.put("spinfq", t.getSpinfq());
        map.put("spinfr", t.getSpinfr());
        map.put("spinfs", t.getSpinfs());
        map.put("spinft", t.getSpinft());
        map.put("spinfu", t.getSpinfu());
        map.put("spinfv", t.getSpinfv());
        map.put("spinfw", t.getSpinfw());
        map.put("spinfx", t.getSpinfx());
        map.put("spinfy", t.getSpinfy());
        map.put("spinfz", t.getSpinfz());
        map.put("spinfaa", t.getSpinfaa());
        map.put("spinfab", t.getSpinfab());
        map.put("spinfac", t.getSpinfac());
        map.put("spingf", t.getSpingf());
        map.put("spingg", t.getSpingg());
        map.put("spingh", t.getSpingh());
        map.put("spingi", t.getSpingi());
        map.put("spingj", t.getSpingj());
        map.put("spingk", t.getSpingk());
        map.put("spingl", t.getSpingl());
        map.put("spingm", t.getSpingm());
        map.put("spingn", t.getSpingn());
        map.put("spingo", t.getSpingo());
        map.put("spingp", t.getSpingp());
        map.put("spingq", t.getSpingq());
        map.put("spingr", t.getSpingr());
        map.put("spings", t.getSpings());
        map.put("spingt", t.getSpingt());
        map.put("spingu", t.getSpingu());
        map.put("spingv", t.getSpingv());
        map.put("spingw", t.getSpingw());
        map.put("spinhe", t.getSpinhe());
        map.put("spinhf", t.getSpinhf());
        map.put("spinhg", t.getSpinhg());
        map.put("spinhh", t.getSpinhh());
        map.put("spinhi", t.getSpinhi());
        map.put("spinhj", t.getSpinhj());
        map.put("spinhk", t.getSpinhk());
        map.put("spinhl", t.getSpinhl());
        map.put("spinhm", t.getSpinhm());
        map.put("spinhn", t.getSpinhn());
        map.put("spinho", t.getSpinho());
        map.put("spinhp", t.getSpinhp());
        map.put("spinhq", t.getSpinhq());
        map.put("spinhr", t.getSpinhr());
        map.put("spinhs", t.getSpinhs());
        map.put("spinht", t.getSpinht());
        map.put("spinhu", t.getSpinhu());
        map.put("spinhv", t.getSpinhv());
        map.put("spinhw", t.getSpinhw());
        map.put("spinhx", t.getSpinhx());
        map.put("spinhy", t.getSpinhy());
        map.put("spinhz", t.getSpinhz());
        map.put("spinhaa", t.getSpinhaa());
        map.put("spinhab", t.getSpinhab());
        map.put("spinhac", t.getSpinhac());
        map.put("spinhad", t.getSpinhad());
        map.put("spinhae", t.getSpinhae());
        map.put("spinhaf", t.getSpinhaf());
        return map;
    }

    /**
     * 替换sql中的变量
     *
     * @param sql
     * @param t
     * @return
     */
    public String replaceVal(String sql, BdSpinEntity t) {
        sql = sql.replace("#{id}", String.valueOf(t.getId()));
        sql = sql.replace("#{create_name}", String.valueOf(t.getCreateName()));
        sql = sql.replace("#{create_by}", String.valueOf(t.getCreateBy()));
        sql = sql.replace("#{create_date}", String.valueOf(t.getCreateDate()));
        sql = sql.replace("#{update_name}", String.valueOf(t.getUpdateName()));
        sql = sql.replace("#{update_by}", String.valueOf(t.getUpdateBy()));
        sql = sql.replace("#{update_date}", String.valueOf(t.getUpdateDate()));
        sql = sql.replace("#{sys_org_code}", String.valueOf(t.getSysOrgCode()));
        sql = sql.replace("#{sys_company_code}", String.valueOf(t.getSysCompanyCode()));
        sql = sql.replace("#{bpm_status}", String.valueOf(t.getBpmStatus()));
        sql = sql.replace("#{mllx}", String.valueOf(t.getMllx()));
        sql = sql.replace("#{ccdw}", String.valueOf(t.getCcdw()));
        sql = sql.replace("#{spinaa}", String.valueOf(t.getSpinaa()));
        sql = sql.replace("#{spinab}", String.valueOf(t.getSpinab()));
        sql = sql.replace("#{spinac}", String.valueOf(t.getSpinac()));
        sql = sql.replace("#{spinad}", String.valueOf(t.getSpinad()));
        sql = sql.replace("#{spinae}", String.valueOf(t.getSpinae()));
        sql = sql.replace("#{spinaf}", String.valueOf(t.getSpinaf()));
        sql = sql.replace("#{spinag}", String.valueOf(t.getSpinag()));
        sql = sql.replace("#{spinah}", String.valueOf(t.getSpinah()));
        sql = sql.replace("#{spinai}", String.valueOf(t.getSpinai()));
        sql = sql.replace("#{spinaj}", String.valueOf(t.getSpinaj()));
        sql = sql.replace("#{spinak}", String.valueOf(t.getSpinak()));
        sql = sql.replace("#{spinal}", String.valueOf(t.getSpinal()));
        sql = sql.replace("#{spinam}", String.valueOf(t.getSpinam()));
        sql = sql.replace("#{spinan}", String.valueOf(t.getSpinan()));
        sql = sql.replace("#{spinao}", String.valueOf(t.getSpinao()));
        sql = sql.replace("#{spinap}", String.valueOf(t.getSpinap()));
        sql = sql.replace("#{spinaq}", String.valueOf(t.getSpinaq()));
        sql = sql.replace("#{spinar}", String.valueOf(t.getSpinar()));
        sql = sql.replace("#{spinas}", String.valueOf(t.getSpinas()));
        sql = sql.replace("#{spinat}", String.valueOf(t.getSpinat()));
        sql = sql.replace("#{spinau}", String.valueOf(t.getSpinau()));
        sql = sql.replace("#{spinav}", String.valueOf(t.getSpinav()));
        sql = sql.replace("#{spinaw}", String.valueOf(t.getSpinaw()));
        sql = sql.replace("#{spinax}", String.valueOf(t.getSpinax()));
        sql = sql.replace("#{spinay}", String.valueOf(t.getSpinay()));
        sql = sql.replace("#{spinaz}", String.valueOf(t.getSpinaz()));
        sql = sql.replace("#{spinaaa}", String.valueOf(t.getSpinaaa()));
        sql = sql.replace("#{spinaab}", String.valueOf(t.getSpinaab()));
        sql = sql.replace("#{spinaac}", String.valueOf(t.getSpinaac()));
        sql = sql.replace("#{spinaad}", String.valueOf(t.getSpinaad()));
        sql = sql.replace("#{spinaae}", String.valueOf(t.getSpinaae()));
        sql = sql.replace("#{spinaaf}", String.valueOf(t.getSpinaaf()));
        sql = sql.replace("#{spinaag}", String.valueOf(t.getSpinaag()));
        sql = sql.replace("#{spinaah}", String.valueOf(t.getSpinaah()));
        sql = sql.replace("#{spinaai}", String.valueOf(t.getSpinaai()));
        sql = sql.replace("#{spinaaj}", String.valueOf(t.getSpinaaj()));
        sql = sql.replace("#{spinaak}", String.valueOf(t.getSpinaak()));
        sql = sql.replace("#{spinaal}", String.valueOf(t.getSpinaal()));
        sql = sql.replace("#{spinaam}", String.valueOf(t.getSpinaam()));
        sql = sql.replace("#{spinaan}", String.valueOf(t.getSpinaan()));
        sql = sql.replace("#{spinaao}", String.valueOf(t.getSpinaao()));
        sql = sql.replace("#{spinaap}", String.valueOf(t.getSpinaap()));
        sql = sql.replace("#{spinaaq}", String.valueOf(t.getSpinaaq()));
        sql = sql.replace("#{spinaar}", String.valueOf(t.getSpinaar()));
        sql = sql.replace("#{spinaas}", String.valueOf(t.getSpinaas()));
        sql = sql.replace("#{spinaat}", String.valueOf(t.getSpinaat()));
        sql = sql.replace("#{spinaau}", String.valueOf(t.getSpinaau()));
        sql = sql.replace("#{spinaav}", String.valueOf(t.getSpinaav()));
        sql = sql.replace("#{spinaaw}", String.valueOf(t.getSpinaaw()));
        sql = sql.replace("#{spinaax}", String.valueOf(t.getSpinaax()));
        sql = sql.replace("#{spinaay}", String.valueOf(t.getSpinaay()));
        sql = sql.replace("#{spinaaz}", String.valueOf(t.getSpinaaz()));
        sql = sql.replace("#{spinaba}", String.valueOf(t.getSpinaba()));
        sql = sql.replace("#{spinabb}", String.valueOf(t.getSpinabb()));
        sql = sql.replace("#{spinabc}", String.valueOf(t.getSpinabc()));
        sql = sql.replace("#{spinabd}", String.valueOf(t.getSpinabd()));
        sql = sql.replace("#{spinbe}", String.valueOf(t.getSpinbe()));
        sql = sql.replace("#{spinbf}", String.valueOf(t.getSpinbf()));
        sql = sql.replace("#{spinbg}", String.valueOf(t.getSpinbg()));
        sql = sql.replace("#{spinbh}", String.valueOf(t.getSpinbh()));
        sql = sql.replace("#{spinbi}", String.valueOf(t.getSpinbi()));
        sql = sql.replace("#{spinbj}", String.valueOf(t.getSpinbj()));
        sql = sql.replace("#{spinbk}", String.valueOf(t.getSpinbk()));
        sql = sql.replace("#{spinbl}", String.valueOf(t.getSpinbl()));
        sql = sql.replace("#{spinbm}", String.valueOf(t.getSpinbm()));
        sql = sql.replace("#{spinbn}", String.valueOf(t.getSpinbn()));
        sql = sql.replace("#{spinbo}", String.valueOf(t.getSpinbo()));
        sql = sql.replace("#{spinbp}", String.valueOf(t.getSpinbp()));
        sql = sql.replace("#{spinbq}", String.valueOf(t.getSpinbq()));
        sql = sql.replace("#{spinbr}", String.valueOf(t.getSpinbr()));
        sql = sql.replace("#{spinbs}", String.valueOf(t.getSpinbs()));
        sql = sql.replace("#{spinbt}", String.valueOf(t.getSpinbt()));
        sql = sql.replace("#{spinbu}", String.valueOf(t.getSpinbu()));
        sql = sql.replace("#{spinbv}", String.valueOf(t.getSpinbv()));
        sql = sql.replace("#{spinbw}", String.valueOf(t.getSpinbw()));
        sql = sql.replace("#{spinbx}", String.valueOf(t.getSpinbx()));
        sql = sql.replace("#{spinby}", String.valueOf(t.getSpinby()));
        sql = sql.replace("#{spinbz}", String.valueOf(t.getSpinbz()));
        sql = sql.replace("#{spinbaa}", String.valueOf(t.getSpinbaa()));
        sql = sql.replace("#{spinbab}", String.valueOf(t.getSpinbab()));
        sql = sql.replace("#{spinbac}", String.valueOf(t.getSpinbac()));
        sql = sql.replace("#{spinbad}", String.valueOf(t.getSpinbad()));
        sql = sql.replace("#{spinbae}", String.valueOf(t.getSpinbae()));
        sql = sql.replace("#{spinbaf}", String.valueOf(t.getSpinbaf()));
        sql = sql.replace("#{spinbag}", String.valueOf(t.getSpinbag()));
        sql = sql.replace("#{spinbah}", String.valueOf(t.getSpinbah()));
        sql = sql.replace("#{spinbai}", String.valueOf(t.getSpinbai()));
        sql = sql.replace("#{spince}", String.valueOf(t.getSpince()));
        sql = sql.replace("#{spincf}", String.valueOf(t.getSpincf()));
        sql = sql.replace("#{spincg}", String.valueOf(t.getSpincg()));
        sql = sql.replace("#{spinch}", String.valueOf(t.getSpinch()));
        sql = sql.replace("#{spinci}", String.valueOf(t.getSpinci()));
        sql = sql.replace("#{spincj}", String.valueOf(t.getSpincj()));
        sql = sql.replace("#{spinck}", String.valueOf(t.getSpinck()));
        sql = sql.replace("#{spincl}", String.valueOf(t.getSpincl()));
        sql = sql.replace("#{spincm}", String.valueOf(t.getSpincm()));
        sql = sql.replace("#{spincn}", String.valueOf(t.getSpincn()));
        sql = sql.replace("#{spinco}", String.valueOf(t.getSpinco()));
        sql = sql.replace("#{spincp}", String.valueOf(t.getSpincp()));
        sql = sql.replace("#{spincq}", String.valueOf(t.getSpincq()));
        sql = sql.replace("#{spincr}", String.valueOf(t.getSpincr()));
        sql = sql.replace("#{spincs}", String.valueOf(t.getSpincs()));
        sql = sql.replace("#{spinct}", String.valueOf(t.getSpinct()));
        sql = sql.replace("#{spincu}", String.valueOf(t.getSpincu()));
        sql = sql.replace("#{spincv}", String.valueOf(t.getSpincv()));
        sql = sql.replace("#{spincw}", String.valueOf(t.getSpincw()));
        sql = sql.replace("#{spincx}", String.valueOf(t.getSpincx()));
        sql = sql.replace("#{spincy}", String.valueOf(t.getSpincy()));
        sql = sql.replace("#{spincz}", String.valueOf(t.getSpincz()));
        sql = sql.replace("#{spincaa}", String.valueOf(t.getSpincaa()));
        sql = sql.replace("#{spincab}", String.valueOf(t.getSpincab()));
        sql = sql.replace("#{spincac}", String.valueOf(t.getSpincac()));
        sql = sql.replace("#{spincad}", String.valueOf(t.getSpincad()));
        sql = sql.replace("#{spincae}", String.valueOf(t.getSpincae()));
        sql = sql.replace("#{spincaf}", String.valueOf(t.getSpincaf()));
        sql = sql.replace("#{spincag}", String.valueOf(t.getSpincag()));
        sql = sql.replace("#{spincah}", String.valueOf(t.getSpincah()));
        sql = sql.replace("#{spincai}", String.valueOf(t.getSpincai()));
        sql = sql.replace("#{spincaj}", String.valueOf(t.getSpincaj()));
        sql = sql.replace("#{spincak}", String.valueOf(t.getSpincak()));
        sql = sql.replace("#{spincal}", String.valueOf(t.getSpincal()));
        sql = sql.replace("#{spincam}", String.valueOf(t.getSpincam()));
        sql = sql.replace("#{spincan}", String.valueOf(t.getSpincan()));
        sql = sql.replace("#{spincao}", String.valueOf(t.getSpincao()));
        sql = sql.replace("#{spincap}", String.valueOf(t.getSpincap()));
        sql = sql.replace("#{spincaq}", String.valueOf(t.getSpincaq()));
        sql = sql.replace("#{spincar}", String.valueOf(t.getSpincar()));
        sql = sql.replace("#{spincas}", String.valueOf(t.getSpincas()));
        sql = sql.replace("#{spincat}", String.valueOf(t.getSpincat()));
        sql = sql.replace("#{spindf}", String.valueOf(t.getSpindf()));
        sql = sql.replace("#{spindg}", String.valueOf(t.getSpindg()));
        sql = sql.replace("#{spindh}", String.valueOf(t.getSpindh()));
        sql = sql.replace("#{spindi}", String.valueOf(t.getSpindi()));
        sql = sql.replace("#{spindj}", String.valueOf(t.getSpindj()));
        sql = sql.replace("#{spindk}", String.valueOf(t.getSpindk()));
        sql = sql.replace("#{spindl}", String.valueOf(t.getSpindl()));
        sql = sql.replace("#{spindm}", String.valueOf(t.getSpindm()));
        sql = sql.replace("#{spindn}", String.valueOf(t.getSpindn()));
        sql = sql.replace("#{spindo}", String.valueOf(t.getSpindo()));
        sql = sql.replace("#{spindp}", String.valueOf(t.getSpindp()));
        sql = sql.replace("#{spindq}", String.valueOf(t.getSpindq()));
        sql = sql.replace("#{spindr}", String.valueOf(t.getSpindr()));
        sql = sql.replace("#{spinds}", String.valueOf(t.getSpinds()));
        sql = sql.replace("#{spindt}", String.valueOf(t.getSpindt()));
        sql = sql.replace("#{spindu}", String.valueOf(t.getSpindu()));
        sql = sql.replace("#{spindv}", String.valueOf(t.getSpindv()));
        sql = sql.replace("#{spindw}", String.valueOf(t.getSpindw()));
        sql = sql.replace("#{spindx}", String.valueOf(t.getSpindx()));
        sql = sql.replace("#{spindy}", String.valueOf(t.getSpindy()));
        sql = sql.replace("#{spindz}", String.valueOf(t.getSpindz()));
        sql = sql.replace("#{spindaa}", String.valueOf(t.getSpindaa()));
        sql = sql.replace("#{spindab}", String.valueOf(t.getSpindab()));
        sql = sql.replace("#{spindac}", String.valueOf(t.getSpindac()));
        sql = sql.replace("#{spinef}", String.valueOf(t.getSpinef()));
        sql = sql.replace("#{spineg}", String.valueOf(t.getSpineg()));
        sql = sql.replace("#{spineh}", String.valueOf(t.getSpineh()));
        sql = sql.replace("#{spinei}", String.valueOf(t.getSpinei()));
        sql = sql.replace("#{spinej}", String.valueOf(t.getSpinej()));
        sql = sql.replace("#{spinek}", String.valueOf(t.getSpinek()));
        sql = sql.replace("#{spinel}", String.valueOf(t.getSpinel()));
        sql = sql.replace("#{spinem}", String.valueOf(t.getSpinem()));
        sql = sql.replace("#{spinen}", String.valueOf(t.getSpinen()));
        sql = sql.replace("#{spineo}", String.valueOf(t.getSpineo()));
        sql = sql.replace("#{spinep}", String.valueOf(t.getSpinep()));
        sql = sql.replace("#{spineq}", String.valueOf(t.getSpineq()));
        sql = sql.replace("#{spiner}", String.valueOf(t.getSpiner()));
        sql = sql.replace("#{spines}", String.valueOf(t.getSpines()));
        sql = sql.replace("#{spinet}", String.valueOf(t.getSpinet()));
        sql = sql.replace("#{spineu}", String.valueOf(t.getSpineu()));
        sql = sql.replace("#{spinev}", String.valueOf(t.getSpinev()));
        sql = sql.replace("#{spinew}", String.valueOf(t.getSpinew()));
        sql = sql.replace("#{spinex}", String.valueOf(t.getSpinex()));
        sql = sql.replace("#{spiney}", String.valueOf(t.getSpiney()));
        sql = sql.replace("#{spinez}", String.valueOf(t.getSpinez()));
        sql = sql.replace("#{spineaa}", String.valueOf(t.getSpineaa()));
        sql = sql.replace("#{spineab}", String.valueOf(t.getSpineab()));
        sql = sql.replace("#{spineac}", String.valueOf(t.getSpineac()));
        sql = sql.replace("#{spinead}", String.valueOf(t.getSpinead()));
        sql = sql.replace("#{spineae}", String.valueOf(t.getSpineae()));
        sql = sql.replace("#{spineaf}", String.valueOf(t.getSpineaf()));
        sql = sql.replace("#{spineag}", String.valueOf(t.getSpineag()));
        sql = sql.replace("#{spineah}", String.valueOf(t.getSpineah()));
        sql = sql.replace("#{spineai}", String.valueOf(t.getSpineai()));
        sql = sql.replace("#{spineaj}", String.valueOf(t.getSpineaj()));
        sql = sql.replace("#{spineak}", String.valueOf(t.getSpineak()));
        sql = sql.replace("#{spineal}", String.valueOf(t.getSpineal()));
        sql = sql.replace("#{spineam}", String.valueOf(t.getSpineam()));
        sql = sql.replace("#{spinean}", String.valueOf(t.getSpinean()));
        sql = sql.replace("#{spineao}", String.valueOf(t.getSpineao()));
        sql = sql.replace("#{spineap}", String.valueOf(t.getSpineap()));
        sql = sql.replace("#{spineaq}", String.valueOf(t.getSpineaq()));
        sql = sql.replace("#{spinear}", String.valueOf(t.getSpinear()));
        sql = sql.replace("#{spineas}", String.valueOf(t.getSpineas()));
        sql = sql.replace("#{spineat}", String.valueOf(t.getSpineat()));
        sql = sql.replace("#{spinff}", String.valueOf(t.getSpinff()));
        sql = sql.replace("#{spinfg}", String.valueOf(t.getSpinfg()));
        sql = sql.replace("#{spinfh}", String.valueOf(t.getSpinfh()));
        sql = sql.replace("#{spinfi}", String.valueOf(t.getSpinfi()));
        sql = sql.replace("#{spinfj}", String.valueOf(t.getSpinfj()));
        sql = sql.replace("#{spinfk}", String.valueOf(t.getSpinfk()));
        sql = sql.replace("#{spinfl}", String.valueOf(t.getSpinfl()));
        sql = sql.replace("#{spinfm}", String.valueOf(t.getSpinfm()));
        sql = sql.replace("#{spinfn}", String.valueOf(t.getSpinfn()));
        sql = sql.replace("#{spinfo}", String.valueOf(t.getSpinfo()));
        sql = sql.replace("#{spinfp}", String.valueOf(t.getSpinfp()));
        sql = sql.replace("#{spinfq}", String.valueOf(t.getSpinfq()));
        sql = sql.replace("#{spinfr}", String.valueOf(t.getSpinfr()));
        sql = sql.replace("#{spinfs}", String.valueOf(t.getSpinfs()));
        sql = sql.replace("#{spinft}", String.valueOf(t.getSpinft()));
        sql = sql.replace("#{spinfu}", String.valueOf(t.getSpinfu()));
        sql = sql.replace("#{spinfv}", String.valueOf(t.getSpinfv()));
        sql = sql.replace("#{spinfw}", String.valueOf(t.getSpinfw()));
        sql = sql.replace("#{spinfx}", String.valueOf(t.getSpinfx()));
        sql = sql.replace("#{spinfy}", String.valueOf(t.getSpinfy()));
        sql = sql.replace("#{spinfz}", String.valueOf(t.getSpinfz()));
        sql = sql.replace("#{spinfaa}", String.valueOf(t.getSpinfaa()));
        sql = sql.replace("#{spinfab}", String.valueOf(t.getSpinfab()));
        sql = sql.replace("#{spinfac}", String.valueOf(t.getSpinfac()));
        sql = sql.replace("#{spingf}", String.valueOf(t.getSpingf()));
        sql = sql.replace("#{spingg}", String.valueOf(t.getSpingg()));
        sql = sql.replace("#{spingh}", String.valueOf(t.getSpingh()));
        sql = sql.replace("#{spingi}", String.valueOf(t.getSpingi()));
        sql = sql.replace("#{spingj}", String.valueOf(t.getSpingj()));
        sql = sql.replace("#{spingk}", String.valueOf(t.getSpingk()));
        sql = sql.replace("#{spingl}", String.valueOf(t.getSpingl()));
        sql = sql.replace("#{spingm}", String.valueOf(t.getSpingm()));
        sql = sql.replace("#{spingn}", String.valueOf(t.getSpingn()));
        sql = sql.replace("#{spingo}", String.valueOf(t.getSpingo()));
        sql = sql.replace("#{spingp}", String.valueOf(t.getSpingp()));
        sql = sql.replace("#{spingq}", String.valueOf(t.getSpingq()));
        sql = sql.replace("#{spingr}", String.valueOf(t.getSpingr()));
        sql = sql.replace("#{spings}", String.valueOf(t.getSpings()));
        sql = sql.replace("#{spingt}", String.valueOf(t.getSpingt()));
        sql = sql.replace("#{spingu}", String.valueOf(t.getSpingu()));
        sql = sql.replace("#{spingv}", String.valueOf(t.getSpingv()));
        sql = sql.replace("#{spingw}", String.valueOf(t.getSpingw()));
        sql = sql.replace("#{spinhe}", String.valueOf(t.getSpinhe()));
        sql = sql.replace("#{spinhf}", String.valueOf(t.getSpinhf()));
        sql = sql.replace("#{spinhg}", String.valueOf(t.getSpinhg()));
        sql = sql.replace("#{spinhh}", String.valueOf(t.getSpinhh()));
        sql = sql.replace("#{spinhi}", String.valueOf(t.getSpinhi()));
        sql = sql.replace("#{spinhj}", String.valueOf(t.getSpinhj()));
        sql = sql.replace("#{spinhk}", String.valueOf(t.getSpinhk()));
        sql = sql.replace("#{spinhl}", String.valueOf(t.getSpinhl()));
        sql = sql.replace("#{spinhm}", String.valueOf(t.getSpinhm()));
        sql = sql.replace("#{spinhn}", String.valueOf(t.getSpinhn()));
        sql = sql.replace("#{spinho}", String.valueOf(t.getSpinho()));
        sql = sql.replace("#{spinhp}", String.valueOf(t.getSpinhp()));
        sql = sql.replace("#{spinhq}", String.valueOf(t.getSpinhq()));
        sql = sql.replace("#{spinhr}", String.valueOf(t.getSpinhr()));
        sql = sql.replace("#{spinhs}", String.valueOf(t.getSpinhs()));
        sql = sql.replace("#{spinht}", String.valueOf(t.getSpinht()));
        sql = sql.replace("#{spinhu}", String.valueOf(t.getSpinhu()));
        sql = sql.replace("#{spinhv}", String.valueOf(t.getSpinhv()));
        sql = sql.replace("#{spinhw}", String.valueOf(t.getSpinhw()));
        sql = sql.replace("#{spinhx}", String.valueOf(t.getSpinhx()));
        sql = sql.replace("#{spinhy}", String.valueOf(t.getSpinhy()));
        sql = sql.replace("#{spinhz}", String.valueOf(t.getSpinhz()));
        sql = sql.replace("#{spinhaa}", String.valueOf(t.getSpinhaa()));
        sql = sql.replace("#{spinhab}", String.valueOf(t.getSpinhab()));
        sql = sql.replace("#{spinhac}", String.valueOf(t.getSpinhac()));
        sql = sql.replace("#{spinhad}", String.valueOf(t.getSpinhad()));
        sql = sql.replace("#{spinhae}", String.valueOf(t.getSpinhae()));
        sql = sql.replace("#{spinhaf}", String.valueOf(t.getSpinhaf()));
        sql = sql.replace("#{UUID}", UUID.randomUUID().toString());
        return sql;
    }

    /**
     * 执行JAVA增强
     */
    private void executeJavaExtend(String cgJavaType, String cgJavaValue, Map<String, Object> data) throws Exception {
        if (StringUtil.isNotEmpty(cgJavaValue)) {
            Object obj = null;
            try {
                if ("class".equals(cgJavaType)) {
                    //因新增时已经校验了实例化是否可以成功，所以这块就不需要再做一次判断
                    obj = MyClassLoader.getClassByScn(cgJavaValue).newInstance();
                } else if ("spring".equals(cgJavaType)) {
                    obj = ApplicationContextUtil.getContext().getBean(cgJavaValue);
                }
                if (obj instanceof CgformEnhanceJavaInter) {
                    CgformEnhanceJavaInter javaInter = (CgformEnhanceJavaInter) obj;
                    javaInter.execute("bd_spin", data);
                }
            } catch (Exception e) {
                e.printStackTrace();
                throw new Exception("执行JAVA增强出现异常！");
            }
        }
    }
}
