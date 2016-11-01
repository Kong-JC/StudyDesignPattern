package singleton_pattern;

/**
 * 单例模式
 * 
 * @author Kong
 * 
 */
public class SingletonPatternDemo {

	public static void main(String[] args) {

		// for (int i = 0; i < 5; i++) {

		Singleton_One singleton_One = Singleton_One.getSingleton();
		singleton_One.sendMessage();

		Singleton_Two singleton_Two = Singleton_Two.getSingleton();
		singleton_Two.sendMessage();

		Singleton_Three singleton_Three = Singleton_Three.getSingleton();
		singleton_Three.sendMessage();

		Singleton_Four singleton_Four = Singleton_Four.getSingleton();
		singleton_Four.sendMessage();

		Singleton_Five singleton_Five = Singleton_Five.getSingleton();
		singleton_Five.sendMessage();

		Singleton_Six singleton_Six = Singleton_Six.getSingleton();
		singleton_Six.sendMessage();

		// }

	}

}
