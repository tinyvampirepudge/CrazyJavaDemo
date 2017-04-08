package lambda;

interface Eatable{
	void taste();
}
interface Flyable{
	void fly(String weather);
}
interface Addable{
	int add(int a,int b);
}

public class LambdaQs {
	
	//调用该方法需要Eatable对象
	public void eat(Eatable eatable){
		System.out.println(eatable);
		eatable.taste();
	}
	
	//调用该方法需要Flyable对象
	public void drive(Flyable f){
		System.out.println("我正在驾驶："+f);
		f.fly("【碧空如洗的晴日】");
	}

	//调用该方法需要Addable对象
	public void test(Addable a){
		System.out.println("5和3的和为："+a.add(3, 5));
	}
	
	public static void main(String[] args) {
		LambdaQs  lambdaQs = new LambdaQs();
		//lambda表达式的代码块只有一条语句，可以省略花括号
		lambdaQs.eat(() -> System.out.println("苹果的味道不错！"));
		//lambda表达式的形参列表只有一个形参，可以省略圆括号
		lambdaQs.drive(weather -> {
			System.out.println("今天的天气是："+weather);
			System.out.println("直升机飞行平稳");
		});
		//lambda表达式的代码块只有一条语句，可以省略花括号
		//代码块中只有一条语句，即使该表达式需要返回值，也可以省略return关键字
		lambdaQs.test((m,n) -> m+n);
	}
}
