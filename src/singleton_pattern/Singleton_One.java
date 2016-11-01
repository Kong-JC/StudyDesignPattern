package singleton_pattern;

/**
 * 懒汉式，线程不安全
 * 
 * @author Kong
 * 
 */
public class Singleton_One {

	private static Singleton_One singleton_one;

//	private static int number;
//	private static final String TAG = "Singleton_One";

	private Singleton_One() {
	}

	public static Singleton_One getSingleton() {
		if (singleton_one == null) {
			singleton_one = new Singleton_One();
//			number++;
		}
		return singleton_one;
	}

	public void sendMessage() {
		System.out
				.println("\n1、懒汉式，线程不安全"
						+ "\n是否 Lazy 初始化：是"
						+ "\n是否多线程安全：否"
						+ "\n实现难度：易"
						+ "\n描述：这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。因为没有加锁 synchronized，所以严格意义上它并不算单例模式。"
						+ "\n这种方式 lazy loading 很明显，不要求线程安全，在多线程不能正常工作。");
		System.out.println("----- ----- ----- " /*+ TAG + " | " + number*/
				+ " ----- ----- -----");
		System.out
				.println("一般情况下，不建议使用第 1 种和第 2 种懒汉方式，建议使用第 3 种饿汉方式。"
						+ "\n只有在要明确实现 lazy loading 效果时，才会使用第 5 种登记方式。如果涉及到反序列化创建对象时，可以尝试使用第 6 种枚举方式。"
						+ "\n如果有其他特殊的需求，可以考虑使用第 4 种双检锁方式。\n\n");
	}

}