package com.xhy.xczx.pojo;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data//可以自动生成getter/setter方法
@ToString//可以自动生成tostring方法。
public class User implements Serializable{

	private Integer id;
	private String name;
	private Integer age;

}
