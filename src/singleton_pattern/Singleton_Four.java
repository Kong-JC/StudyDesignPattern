package singleton_pattern;

/**
 * 双检锁/双重校验锁（DCL，即 double-checked locking）
 * 
 * @author Kong
 * 
 */
public class Singleton_Four {

	private volatile static Singleton_Four singleton_Four;

//	private static int number;
//	private static final String TAG = "Singleton_Four";
	
	private Singleton_Four() {
	}

	public static Singleton_Four getSingleton() {
		if (singleton_Four == null) {
			synchronized (Singleton_Four.class) {
				if (singleton_Four == null) {
					singleton_Four = new Singleton_Four();
//					number++;
				}
			}
		}
		return singleton_Four;
	}

	public void sendMessage() {
		System.out.println("\n4、双检锁/双重校验锁（DCL，即 double-checked locking）"
				+ "\n是否 Lazy 初始化：是" + "\n是否多线程安全：是" + "\n实现难度：较复杂"
				+ "\n描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。"
				+ "\ngetInstance() 的性能对应用程序很关键。");
		System.out.println("----- ----- ----- " /*+ TAG + " | " + number*/
				+ " ----- ----- -----");
		System.out
				.println("一般情况下，不建议使用第 1 种和第 2 种懒汉方式，建议使用第 3 种饿汉方式。"
						+ "\n只有在要明确实现 lazy loading 效果时，才会使用第 5 种登记方式。如果涉及到反序列化创建对象时，可以尝试使用第 6 种枚举方式。"
						+ "\n如果有其他特殊的需求，可以考虑使用第 4 种双检锁方式。\n\n");
	}

}