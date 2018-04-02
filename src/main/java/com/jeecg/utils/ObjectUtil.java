package com.jeecg.utils;/**
 * Created by ycz on 2017-12-27.
 */

import org.apache.poi.ss.formula.functions.T;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Type Description：
 * Author：yaochzh
 * Create Date：2017-12-27-15:12
 */
public class ObjectUtil {
    /**
     * 给实体类的double属性赋默认值
     *
     * @param model
     * @param type 赋值类型，0：null设置为0,1:0设置为null
     * @throws NoSuchMethodException
     * @throws IllegalAccessException
     * @throws IllegalArgumentException
     * @throws InvocationTargetException
     */
    public static void setDoubleDefault(Object model,Integer type) throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
        Class<T> clazz = (Class<T>) model.getClass();
        //获取所有的bean中所有的成员变量
        Field[] fields = clazz.getDeclaredFields();
        for (int j = 0; j < fields.length; j++) {
            //获取所有的bean中变量类型为String的变量
            if ("Double".equals(fields[j].getType().getSimpleName())) {
                try {
                    //获取get方法名
                    String methodName = "get" + fields[j].getName().substring(0, 1).toUpperCase()
                            + fields[j].getName().replaceFirst("\\w", "");
                    Method getMethod = clazz.getDeclaredMethod(methodName);
                    //打破封装
                    getMethod.setAccessible(true);
                    //得到该方法的值
                    Object methodValue = getMethod.invoke(model);
                    //判断值是否为空或者为null,非的话这过滤前后空格
                    //获取set方法名
                    String setMethodName = "set" + fields[j].getName().substring(0, 1).toUpperCase()
                            + fields[j].getName().replaceFirst("\\w", "");
                    //得到get方法的Method对象,带参数
                    Method setMethod = clazz.getDeclaredMethod(setMethodName, fields[j].getType());
                    setMethod.setAccessible(true);
                    if (methodValue == null && type == 0) {
                        //赋值
                        setMethod.invoke(model, (Object) Double.valueOf(0));
                    }else if(methodValue.toString().equals("0.0") && type == 1){
                        fields[j].setAccessible(true);
                        fields[j].set(model,null);
                    }
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                } catch (SecurityException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String args[]) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        System.out.println(3*3*3.3);
    }
}
