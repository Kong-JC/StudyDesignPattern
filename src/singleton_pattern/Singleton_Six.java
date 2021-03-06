package singleton_pattern;

/**
 * 枚举
 * 
 * @author Kong
 * 
 */
public enum Singleton_Six {
	INSTANCE;

	// private static int number;
	// private static final String TAG = "Singleton_Six";

	public static Singleton_Six getSingleton() {
		// number++;
		return INSTANCE;
	}

	public void sendMessage() {
		System.out
				.println("\n6、枚举"
						+ "\n是否 Lazy 初始化：否"
						+ "\n是否多线程安全：是"
						+ "\n实现难度：易"
						+ "\n描述：这种实现方式还没有被广泛采用，但这是实现单例模式的最佳方法。它更简洁，自动支持序列化机制，绝对防止多次实例化。"
						+ "\n这种方式是 Effective Java 作者 Josh Bloch 提倡的方式，它不仅能避免多线程同步问题，而且还自动支持序列化机制，防止反序列化重新创建新的对象，绝对防止多次实例化。不过，由于 JDK1.5 之后才加入 enum 特性，用这种方式写不免让人感觉生疏，在实际工作中，也很少用。"
						+ "\n不能通过 reflection attack 来调用私有构造方法。");
		System.out.println("----- ----- ----- " /* + TAG + " | " + number */
				+ " ----- ----- -----");
		System.out
				.println("一般情况下，不建议使用第 1 种和第 2 种懒汉方式，建议使用第 3 种饿汉方式。"
						+ "\n只有在要明确实现 lazy loading 效果时，才会使用第 5 种登记方式。如果涉及到反序列化创建对象时，可以尝试使用第 6 种枚举方式。"
						+ "\n如果有其他特殊的需求，可以考虑使用第 4 种双检锁方式。\n\n");
	}

}