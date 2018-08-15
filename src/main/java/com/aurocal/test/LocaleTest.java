package com.aurocal.test;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleTest {

    public static void main(String args[]){
        //使用默认的Locale  zh_CN
        /*Locale loc= Locale.getDefault();*/
//        System.out.println(loc);
//        System.out.println(Locale.SIMPLIFIED_CHINESE);

        /*Locale [] locales=Locale.getAvailableLocales();
        for (Locale lo : locales) {
            System.out.println("Locale:"+lo);
        }*/


    }

    public static void testDiffDateLocales(){
        //date 为
        Date date=new Date(113,8,19,14,22,30);
        //创建“简体中文”的Locale
        Locale localeCN=Locale.SIMPLIFIED_CHINESE;
        //创建“英文、美国”的Locale
        Locale localeUS=new Locale("en","US");
        //获取“简体中文”对应的date字符串
        String cn=DateFormat.getDateInstance(DateFormat.MEDIUM,localeCN).format(date);
        //获取“英文/美国”对应的date字符串
        String us=DateFormat.getDateInstance(DateFormat.MEDIUM,localeUS).format(date);
        System.out.printf("cn=%s\nus=%s\n",cn,us);

    }

    /**
     * 显示所有的Locales
     */
    public static void testAllLocales(){
        Locale[] ls=Locale.getAvailableLocales();

        System.out.print("All Locales:");
        for (Locale locale:ls) {
            System.out.printf(locale+",");
        }
        System.out.println();


        Locale currentLocale=null;
        ResourceBundle rb=ResourceBundle.getBundle("",currentLocale);

    }


















}
