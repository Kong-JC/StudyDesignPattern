package singleton_pattern;

/**
 * 登记式/静态内部类
 * 
 * @author Kong
 * 
 */
public class Singleton_Five {

//	private static int number;
//	private static final String TAG = "Singleton_Five";

	private static class SingletonHolder {
		private static final Singleton_Five singleton_five = new Singleton_Five();
	}

	private Singleton_Five() {
	}

	public static final Singleton_Five getSingleton() {
//		number++;
		return SingletonHolder.singleton_five;
	}

	public void sendMessage() {
		System.out
				.println("\n5、登记式/静态内部类"
						+ "\n是否 Lazy 初始化：是"
						+ "\n是否多线程安全：是"
						+ "\n实现难度：一般"
						+ "\n描述：这种方式能达到双检锁方式一样的功效，但实现更简单。对静态域使用延迟初始化，应使用这种方式而不是双检锁方式。这种方式只适用于静态域的情况，双检锁方式可在实例域需要延迟初始化时使用。"
						+ "\n这种方式同样利用了 classloder 机制来保证初始化 instance 时只有一个线程，它跟第 3 种方式不同的是：第 3 种方式只要 Singleton 类被装载了，那么 instance 就会被实例化（没有达到 lazy loading 效果），而这种方式是 Singleton 类被装载了，instance 不一定被初始化。因为 SingletonHolder 类没有被主动使用，只有显示通过调用 getInstance 方法时，才会显示装载 SingletonHolder 类，从而实例化 instance。想象一下，如果实例化 instance 很消耗资源，所以想让它延迟加载，另外一方面，又不希望在 Singleton 类加载时就实例化，因为不能确保 Singleton 类还可能在其他的地方被主动使用从而被加载，那么这个时候实例化 instance 显然是不合适的。这个时候，这种方式相比第 3 种方式就显得很合理。");
		System.out.println("----- ----- ----- " /* + TAG + " | " + number */
				+ " ----- ----- -----");
		System.out
				.println("一般情况下，不建议使用第 1 种和第 2 种懒汉方式，建议使用第 3 种饿汉方式。"
						+ "\n只有在要明确实现 lazy loading 效果时，才会使用第 5 种登记方式。如果涉及到反序列化创建对象时，可以尝试使用第 6 种枚举方式。"
						+ "\n如果有其他特殊的需求，可以考虑使用第 4 种双检锁方式。\n\n");
	}

}