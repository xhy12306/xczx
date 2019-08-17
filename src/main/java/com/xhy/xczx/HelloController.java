package com.xhy.xczx;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;

/**
 * 〈Hello测试类〉
 *
 * @author Barrett
 * @version 1.0.0
 * @time 2019/8/17
 */
@RestController
public class HelloController {

    private String string= "测试成功";

    @Value("${com.xhy.name}")
    private String name;

    @Value("${com.xhy.age}")
    private String age;

    @Value("${com.xhy.message}")
    private String message;

    @RequestMapping("/test")
    public String helloTest() {
        System.out.println(age);
        return string;
    }

    @RequestMapping("/test1")
    public String helloTest1(){
        try {
            name = new String(name.getBytes("iso8859-1"), "utf8");
            message = new String(message.getBytes("iso8859-1"), "utf8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(name);
        System.out.println(age);
        System.out.println(message);
        return message;
    }
}
