package com.jeecg.utils;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.regex.Pattern;

/**
 * 由于Java的简单类型不能够精确的对浮点数进行运算，这个工具类提供精
 * 确的浮点数运算，包括加减乘除和四舍五入。
 */
@SuppressWarnings("AlibabaAvoidPatternCompileInMethod")
public class DoubleUtil {

    //默认除法运算精度
    private static final int DEF_DIV_SCALE = 10;

    //这个类不能实例化
    private DoubleUtil() {
    }

    /**
     * 提供精确的加法运算。
     *
     * @param v1 被加数
     * @return 两个参数的和
     */
    public static double add(double... v1) {
        BigDecimal s = new BigDecimal(BigInteger.ZERO);
        for (double v : v1) {
            s = s.add(new BigDecimal(Double.toString(v)));
        }
        return s.doubleValue();
    }

    /**
     * 提供精确的减法运算。
     *
     * @param v1 被减数
     * @param v2 减数
     * @return 两个参数的差
     */
    public static double sub(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.subtract(b2).doubleValue();
    }

    /**
     * 提供精确的乘法运算。
     *
     * @param v1 被乘数
     * @return 两个参数的积
     */
    public static double mul(double ...v1) {
        BigDecimal b1 = new BigDecimal(1);
        for(double v : v1) {
            b1 = b1.multiply(new BigDecimal(Double.toString(v)));
        }
        return b1.doubleValue();
    }

    /**
     * 提供（相对）精确的除法运算，当发生除不尽的情况时，精确到
     * 小数点以后10位，以后的数字四舍五入。
     *
     * @param v1 被除数
     * @param v2 除数
     * @return 两个参数的商
     */
    public static double div(double v1, double v2) {
        return div(v1, v2, DEF_DIV_SCALE);
    }

    /**
     * 提供（相对）精确的除法运算。当发生除不尽的情况时，由scale参数指
     * 定精度，以后的数字四舍五入。
     *
     * @param v1    被除数
     * @param v2    除数
     * @param scale 表示表示需要精确到小数点以后几位。
     * @return 两个参数的商
     */
    public static double div(double v1, double v2, int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException(
                    "The scale must be a positive integer or zero");
        }
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    /**
     * 判断传进来的参数是不是可参与计算：1.不为空，2.为数字
     * @param objects
     * @return
     */
    public static boolean isOK(Object ... objects) {
        for(Object obj : objects) {
            //采用正则表达式的方式来判断一个字符串是否为数字，这种方式判断面比较全
            //可以判断正负、整数小数

            if(obj  == null){
                return false;
            }
            boolean isInt = Pattern.compile("^-?[1-9]\\d*$").matcher(obj.toString()).find();
            boolean isDouble = Pattern.compile("^-?([1-9]\\d*\\.\\d*|0\\.\\d*[1-9]\\d*|0?\\.0+|0)$").matcher(obj.toString()).find();

            if(!isInt && !isDouble) {
                return false;
            }
        }
        return true;
    }
    /**
     * 提供精确的小数位四舍五入处理。
     *
     * @param v     需要四舍五入的数字
     * @param scale 小数点后保留几位
     * @return 四舍五入后的结果
     */
    public static double round(double v, int scale) {

        if (scale < 0) {
            throw new IllegalArgumentException(
                    "The scale must be a positive integer or zero");
        }
        BigDecimal b = new BigDecimal(Double.toString(v));
        BigDecimal one = new BigDecimal("1");
        return b.divide(one, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }
    public static void main(String arg[]) {
        Double a = Double.parseDouble("2");
        Double b = Double.parseDouble("4");
        System.out.println(add(a,b,a));
        System.out.println(sub(a,b));
        System.out.println(mul(a,b,a));
        System.out.println(div(a,b,2));
    }
}