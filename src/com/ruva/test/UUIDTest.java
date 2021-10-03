package com.ruva.test;

import org.junit.jupiter.api.Test;

import java.util.UUID;

public class UUIDTest {
    @Test
    public void test() {
        UUID uuid = UUID.randomUUID();
        String s = uuid.toString();
        System.out.println("生成的UUID为：" + s);
        System.out.println("长度为：" + s.length());

        s = s.replaceAll("-", "");
        System.out.println("去掉-之后的样子：" + s);
        System.out.println("新的UUID的长度：" + s.length());
    }
}
