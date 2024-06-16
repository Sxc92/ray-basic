package org.ray.basic.pattern.singleton;

/**
 * 懒汉式单例类。
 * 采用静态初始化的方式，在类加载时就初始化实例，确保了线程安全，但可能导致不必要的内存占用。
 *
 * @author shixiecheng
 */
@SuppressWarnings("InstantiationOfUtilityClass")
public class LazySingleton {

    /**
     * 私有构造方法，防止外部实例化对象。
     * 使用私有构造方法确保了这个类不能通过new操作符被实例化，
     * 保证了单例模式的唯一性。
     */
    private LazySingleton() {
    }

    /**
     * 静态内部类方式的单例实现。
     * 这种实现利用了Java类加载机制保证线程安全：
     * 当且仅当第一个线程访问getInstance()时，InstanceHolder类才会被加载，
     * 从而INSTANCE实例被创建，实现了懒加载。
     * 由于类加载是线程安全的，这种方式确保了在多线程环境下也能正确地初始化单例。
     */
    private static final class InstanceHolder {
        /**
         * 静态实例变量，在类加载时初始化，保证了线程安全。
         * 使用静态最终变量确保了INSTANCE在初始化后不能被修改，
         * 从而保证了单例的唯一性。
         */
        private static final LazySingleton INSTANCE = new LazySingleton();
    }

    /**
     * 获取单例实例。
     * 由于实例在类加载时已经初始化，因此这里主要起获取实例的作用。
     * 由于使用了静态内部类的方式，这里不再需要synchronized关键字来保证线程安全，
     * 因此在性能上比传统的同步方法有优势。
     *
     * @return 单例实例。
     */
    public static LazySingleton getInstance() {
        // 直接返回InstanceHolder类中的静态实例，实现了线程安全的懒加载。
        return InstanceHolder.INSTANCE;
    }

    // 示例：如果需要支持序列化，可以考虑添加以下方法
    // 注意：这里没有实际实现，因为原始要求中没有提到序列化的需求。
    // private Object readResolve() {
    //     return getInstance();
    // }

    // 单元测试示例（实际代码中应位于独立的测试类中）
    // public static void main(String[] args) {
    //     LazySingleton instance1 = LazySingleton.getInstance();
    //     LazySingleton instance2 = LazySingleton.getInstance();
    //     System.out.println(instance1 == instance2 ? "Same instance" : "Different instances");
    // }
}
