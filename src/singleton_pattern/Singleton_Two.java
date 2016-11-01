package singleton_pattern;

/**
 * 懒汉式，线程安全
 * 
 * @author Kong
 * 
 */
public class Singleton_Two {

	private static Singleton_Two singleton_Two;
	
//	private static int number;
//	private static final String TAG = "Singleton_Two";

	private Singleton_Two() {
	}

	public static synchronized Singleton_Two getSingleton() {
		if (singleton_Two == null) {
			singleton_Two = new Singleton_Two();
//			number++;
		}
		return singleton_Two;
	}

	public void sendMessage() {
		System.out
				.println("\n2、懒汉式，线程安全"
						+ "\n是否 Lazy 初始化：是"
						+ "\n是否多线程安全：是"
						+ "\n实现难度：易"
						+ "\n描述：这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步。"
						+ "\n优点：第一次调用才初始化，避免内存浪费。"
						+ "\n缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。"
						+ "\ngetInstance() 的性能对应用程序不是很关键（该方法使用不太频繁）。");
		System.out.println("----- ----- ----- " /*+ TAG + " | " + number*/
				+ " ----- ----- -----");
		System.out
				.println("一般情况下，不建议使用第 1 种和第 2 种懒汉方式，建议使用第 3 种饿汉方式。"
						+ "\n只有在要明确实现 lazy loading 效果时，才会使用第 5 种登记方式。如果涉及到反序列化创建对象时，可以尝试使用第 6 种枚举方式。"
						+ "\n如果有其他特殊的需求，可以考虑使用第 4 种双检锁方式。\n\n");
	}

}