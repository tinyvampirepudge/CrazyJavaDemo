package com.tiny.demo;

public class AddCommand implements Command {

	@Override
	public void process(int[] target) {
		// TODO Auto-generated method stub
			int sum = 0;
			for (int i : target) {
				sum += i;
			}
			System.out.println("数组元素的总和是："+sum);
	}

}
