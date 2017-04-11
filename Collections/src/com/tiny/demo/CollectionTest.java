package com.tiny.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Queue;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection collection = new ArrayList<>();
		// 添加元素
		collection.add("孙悟空");
		// 虽然集合里面不能放基本类型的值，但java支持自动装箱
		collection.add(6);
		collection.add(true);
		System.out.println("c集合的元素个数是 --> " + collection.size());
		System.out.println("collection.remove(\"false\") --> "+collection.remove(false));;
		System.out.println("collection.remove(\"true\") --> "+collection.remove(true));;
		
		Collection books = new HashSet<>();
		books.add("轻量级Java EE企业应用实战");
		books.add("疯狂Java讲义");
		System.out.println("c集合的元素："+collection);
		books.clear();
		books.add("孙悟空");
		System.out.println("c集合是否完全包含books：" +collection.containsAll(books));
		
		System.out.println("c集合的元素："+collection);
		
		Object[] objects = collection.toArray();
		System.out.println("Arrays.toString(objects) :" + Arrays.toString(objects));
		
	}

}
