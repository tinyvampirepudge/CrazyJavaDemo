package lambda;

import javax.swing.JFrame;

interface Eatable {
	void taste();
}

interface Flyable {
	void fly(String weather);
}

interface Addable {
	int add(int a, int b);
}

// 引用类方法1
@FunctionalInterface
interface Converter {
	Integer convert(String from);
}

@FunctionalInterface
interface Converter2 {
	String convert(String str1, String str2, Integer i);

	int a = 1;
}

@FunctionalInterface
interface MyTest {
	String test(String a, int b, int c);
}

@FunctionalInterface
interface YourTest {
	JFrame win(String title);
}

@FunctionalInterface
interface PersonInterfaceDefault {
	Person getStr();
}

@FunctionalInterface
interface PersonInterfaceName {
	Person getStr(String name);
}

@FunctionalInterface
interface PersonInterfaceAll {
	Person getStr(String name, int age);
}

public class LambdaQs {

	// 调用该方法需要Eatable对象
	public void eat(Eatable eatable) {
		System.out.println(eatable);
		eatable.taste();
	}

	// 调用该方法需要Flyable对象
	public void drive(Flyable f) {
		System.out.println("我正在驾驶：" + f);
		f.fly("【碧空如洗的晴日】");
	}

	// 调用该方法需要Addable对象
	public void test(Addable a) {
		System.out.println("5和3的和为：" + a.add(3, 5));
	}

	public static void main(String[] args) {
		LambdaQs lambdaQs = new LambdaQs();
		// lambda表达式的代码块只有一条语句，可以省略花括号
		lambdaQs.eat(() -> System.out.println("苹果的味道不错！"));
		// lambda表达式的形参列表只有一个形参，可以省略圆括号
		lambdaQs.drive(weather -> {
			System.out.println("今天的天气是：" + weather);
			System.out.println("直升机飞行平稳");
		});
		// lambda表达式的代码块只有一条语句，可以省略花括号
		// 代码块中只有一条语句，即使该表达式需要返回值，也可以省略return关键字
		lambdaQs.test((m, n) -> m + n);

		// 一、引用类方法。
		// 1、创建Converter对象
		// Converter converter = from -> Integer.valueOf(from);
		Converter converter = Integer::valueOf;
		// 2、调用Converter对象的方法
		Integer val = converter.convert("99");
		System.out.println("val --> " + val);

		Converter2 converter2 = (str1, str2, integer) -> {
			return str1 + str2 + integer;
		};
		String result = converter2.convert("hello ", "world, ", 10086);
		System.out.println(result);

		// 二、引用特定对象的实例方法
		// Converter converter3 = from -> "fkit.org".indexOf(from);
		Converter converter3 = "fkit.org"::indexOf;
		Integer value = converter3.convert("it");
		System.out.println("value --> " + value);

		// 三、引用某类对象的实例方法
		// MyTest myTest = (a,b,c) -> a.substring(b, c);
		// 方法引用替换Lambda表达式：引用某类对象的实例方法
		// 函数式接口中被实现方法的第一个参数作为调用者
		// 后面的参数全部传给该方法作为参数
		MyTest myTest = String::substring;
		String string = myTest.test("Java, I love you!", 6, 16);
		System.out.println("3 --> " + string);

		// 四、引用构造器
		// 下面代码使用Lambda表达式创建YourTest对象
		// YourTest yourTest = (String title) -> new JFrame(title);
		// 构造器音乐功能代替Lambda表达式
		// 函数式接口中被实现方法的全部参数传给该构造器作为参数
		YourTest yourTest = JFrame::new;
		JFrame jFrame = yourTest.win("我的窗口");
		System.out.println(jFrame);

		// PersonInterfaceDefault pDefault = () -> new Person().toString();
		PersonInterfaceDefault pDefault = Person::new;
		Person person1 = pDefault.getStr();
		System.out.println("person1 --> " + person1);

		// PersonInterfaceName pName = (name) -> new Person(name);
		PersonInterfaceName pName = Person::new;
		Person person2 = pName.getStr("tongtong");
		System.out.println("person1 --> " + person2);

		// PersonInterfaceAll pAll = (name,age) -> new Person(name, age);
		PersonInterfaceAll pAll = Person::new;
		Person person3 = pAll.getStr("hello world", 30);
		System.out.println("person3 --> " + person3);

		/**
		 * Lambda表达式与匿名内部类的联系和区别； Lambda表达式是匿名内部类的一种简化，因此它部分取代匿名内部类的作用，
		 * Lambda表大多数与匿名内部类存在如下相同点： 
		 * ①Lambda表达水与匿名内部类一样，都可以直接访问"effectively
		 * final" 的局部变量，以及外部类的成员变量（包括实例变量和类变量）。
		 * ②Lambda表达式创建的对象与匿名内部类生成的对象一样，都可以直接调用从接口中继承的默认方法。
		 * 
		 * Lambda表达式与匿名内部类主要存在如下区别。
		 * ①匿名内部类可以为任意接口创建实例——不管接口包含多少个抽象方法，只要匿名内部类实现了苏哦哦偶的抽象方法即可；
		 * 但Lambda表达式只能为函数式接口创建实例。
		 * ②匿名内部类可以为抽象类甚至爱普通类创建实例；但Lambda表达式只能为函数式接口创建实例。
		 * ③匿名内部类实现的抽象方法的方法体允许调用接口中定义的默认方法；但Lambda表达式的代码块不允许调用接口中定义的默认方法。
		 */
		
		lambdaQs.test();
	}

	private int age = 12;
	private static String name = "疯狂软件教育中心";
	
	public void test(){
		//这个book被lambda调用了，相当于隐式的被final修饰了，
		//因此book不允许被重新赋值。
		String book = "疯狂java讲义";
		Displayable displayable = () -> {
			//访问"effectively final"的局部变量
			System.out.println("book的局部变量为："+book);
			//访问外部类的实例变量和类变量
			System.out.println("外部类的age实例变量为：" + age);
			System.out.println("外部类的name类变量为："+ name);
			
			//匿名内部类实现的抽象方法的方法体允许调用接口中定义的默认方法；
			//但Lambda表达式的代码块不允许调用接口中定义的默认方法。
//			System.out.println(add(3,5));//调用不到
		};
		
		displayable.display();
		//调用displayable对象从接口中继承的add()方法。
		System.out.println("displayable.add(8, 10) --> "+displayable.add(8, 10));
	}
	
	interface Displayable {
		// 定义一个抽象方法和默认方法
		void display();

		default int add(int a, int b) {
			return a + b;
		}
	}
}
