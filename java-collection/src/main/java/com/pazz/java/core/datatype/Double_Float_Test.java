package com.pazz.java.core.datatype;

/**
 * @author: 彭坚
 * @create: 2018/12/12 22:27
 * @description: 基数,底数
 */
public class Double_Float_Test {

    public static void main(String[] args) {
        //f结尾有 / d结尾无  / 默认结尾无
        double a = 0.2f;
        double b = 0.3d;
        double c = 0.4;
        Double d = Double.valueOf("0.55");
        System.out.println("double: " + a);      // 0.20000000298023224
        System.out.println("double: " + b);      // 0.3
        System.out.println("double: " + c);      // 0.4
        System.out.println("valueOf: " + d);     // 0.55
        System.out.println("************************************************");

        float f1 = 10f;
        float f2 = 20l;
        float f3 = 30;
        float f4 = Float.valueOf("99999.9999");
        System.out.println("float: " + f1);     //10.0
        System.out.println("float: " + f2);     //20.0
        System.out.println("float: " + f3);     //30.0
        System.out.println("float: " + f4);     //100000.0
    }

}
