package singleton_pattern;

/**
 * 饿汉式
 * 
 * @author Kong
 * 
 */
public class Singleton_Three {

	private static Singleton_Three singleton_Three = new Singleton_Three();

//	private static int number;
//	private static final String TAG = "Singleton_Three";
	
	private Singleton_Three() {
	}

	public static Singleton_Three getSingleton() {
//		number++;
		return singleton_Three;
	}

	public void sendMessage() {
		System.out
				.println("\n3、饿汉式"
						+ "\n是否 Lazy 初始化：否"
						+ "\n是否多线程安全：是"
						+ "\n实现难度：易"
						+ "\n描述：这种方式比较常用，但容易产生垃圾对象。"
						+ "\n优点：没有加锁，执行效率会提高。"
						+ "\n缺点：类加载时就初始化，浪费内存。"
						+ "\n它基于 classloder 机制避免了多线程的同步问题，不过，instance 在类装载时就实例化，虽然导致类装载的原因有很多种，在单例模式中大多数都是调用 getInstance 方法， 但是也不能确定有其他的方式（或者其他的静态方法）导致类装载，这时候初始化 instance 显然没有达到 lazy loading 的效果。");
		System.out.println("----- ----- ----- " /*+ TAG + " | " + number*/
				+ " ----- ----- -----");
		System.out
				.println("一般情况下，不建议使用第 1 种和第 2 种懒汉方式，建议使用第 3 种饿汉方式。"
						+ "\n只有在要明确实现 lazy loading 效果时，才会使用第 5 种登记方式。如果涉及到反序列化创建对象时，可以尝试使用第 6 种枚举方式。"
						+ "\n如果有其他特殊的需求，可以考虑使用第 4 种双检锁方式。\n\n");
	}

}