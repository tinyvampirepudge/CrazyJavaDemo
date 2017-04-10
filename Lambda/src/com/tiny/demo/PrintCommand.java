package com.tiny.demo;

public class PrintCommand implements Command {

	@Override
	public void process(int[] target) {
		// TODO Auto-generated method stub
		for (int i : target) {
			System.out.println("迭代输出目标数组的元素：" + i);
		}
	}

}
