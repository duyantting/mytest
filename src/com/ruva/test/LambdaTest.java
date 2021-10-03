package com.ruva.test;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.function.Consumer;

public class LambdaTest {

    //无参、无返回值：
    @Test
    public void test01() {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("我爱北京轻松的高薪工作");
            }
        };
        r1.run();
        System.out.println("===================================");

        Runnable r2 = () -> {
            System.out.println("我特别爱北京轻松的高薪工作");
        };
        r2.run();
    }

    @Test
    public void test02() {
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };
        int compare1 = com1.compare(12, 21);
        System.out.println(compare1);

        System.out.println("===============================");
        Comparator<Integer> com2 = (o1, o2) -> Integer.compare(o1, o2);

        int compare2 = com2.compare(32, 21);
        System.out.println(compare2);

        System.out.println("===============================");
        Comparator<Integer> com3 = Integer::compare;

        int compare3 = com3.compare(1, 1);
        System.out.println(compare3);

    }

    @Test
    public void test03() {
        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con.accept("好想吃土豆炖洋芋！");

        System.out.println("========================");
        Consumer<String> con1 = (String s) -> {
            System.out.println(s);
        };
        con1.accept("好想吃马铃薯炒洋芋！");
    }

    //数据类型可以忽略，因为可以由编译器推断得出，称为“类型推断”
    @Test
    public void test04() {
        Consumer<String> con1 = (String s) -> {
            System.out.println(s);
        };
        con1.accept("好想吃马铃薯炒洋芋！");

        System.out.println("==============================");
        Consumer<String> con2 = (s) -> {
            System.out.println(s);
        };
        con2.accept("好想吃马铃薯炒洋芋！");
    }

    @Test
    public void test05() {
        Consumer<String> con1 = (s) -> {
            System.out.println(s);
        };
        con1.accept("好想吃马铃薯炒洋芋！");

        System.out.println("==============================");
        Consumer<String> con2 = s-> {
            System.out.println(s);
        };
        con2.accept("好想吃马铃薯炒洋芋！");
    }

    @Test
    public void test06() {
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };
        int compare1 = com1.compare(12, 21);
        System.out.println(compare1);

        System.out.println("===============================");
        Comparator<Integer> com2 = (o1, o2) -> {
            return o1.compareTo(o2);
        };
        int compare2 = com2.compare(10, 4);
        System.out.println(compare2);
    }

    @Test
    public void test07() {
        Comparator<Integer> com1 = (o1, o2) -> {
            return o1.compareTo(o2);
        };
        int compare1 = com1.compare(10, 4);
        System.out.println(compare1);

        System.out.println("===============================");
        Comparator<Integer> com2 = (o1, o2) -> o1.compareTo(o2);
        System.out.println(com2.compare(0,1));
    }

    @Test
    public void test() {
        InterfaceOwn interfaceOwn = (a, b) -> {
            return a + b;
        };
        Integer add = interfaceOwn.add(2, 5);
        System.out.println("a + b的值为：" + add);

        System.out.println("==================================");
        InterfaceOwn interfaceOwn1 = (a, b) -> a + b;
        System.out.println("两数之和为：" + interfaceOwn1.add(12, 21));
    }
}
