### Java基础
* 基本概念
    * java语言的优点（简单、安全、健壮性、平台无关）
    * public static void main (String[] args) （java程序的入口，每个参数的意义，是否有其他形式）
    * 在main方法执行前输出"Hello World"（静态代码块）
    * 一个java文件里是否可以定义多个类（可以，但是编译的时候会生成多个.class文件，且只能有一个是public）
    * 什么是构造函数（对象实例化时初始化对象成员变量的函数；父类没有构造函数，子类要显示的super调用父类的无参构造）
    * 为什么java终有些接口没有方法（接口是抽象方法的集合，是一种特殊的抽象类；标识接口，类属于某种特定的类型）
    * java中的clone方法有什么用（clone拷贝值；浅复制，深复制）
    * 什么是反射机制（在运行时对类进行动态的装载，不恰当引用会影响性能）
    * 创建对象的方式（new 反射 clone 反序列化）
    * package（提供多层命名空间，解决命名冲突；类功能分类，组织清晰）
    * 如何实现函数指针的功能（刚摆脱指针，又回去，脑子有包？？）
* 面向对象技术
    * 面向对象面向过程（数据与数据的操作放在一起；面向过程是以事件为中心）
    * 面向对象有哪些特征（1.抽象 2.封装 3.继承 4.多态）
    * 面向对象的优点（1.较高的开发效率 2.鲁棒性 3.高可维护性）
    * 什么是继承（extends）
    * 组合和继承有什么区别（is a 与 has a ）
    * 多态的实现机制（重载 重写）
    * 重载和重写有什么区别（重载 - 一个类中参数不同/重写 - 继承关系中，重写方法）
    * 抽象类与接口中有什么区别（如果一个类中有抽象方法，那就是抽象类）
    * 内部类有哪些（静态内部类 成员内部类 局部内部类 匿名内部类）
    * 如何获取父类的类名（getClass.getName()）
    * this 与 super (this指当前的实例对象，super访问父类方法与成员变量)
* 关键字
    * 变量命名有哪些规则（别瞎起）
    * break、continue、return
    * final、finally、finalize（有个麻瓜关系，分别解释一下）
    * assert作用(断言 软件调试，正确性检查)
    * static关键字（分别修饰成员变量成员方法代码块和内部类）
    * switch( int类型 java7之后支持String数据类型)
    * volatile(从内存中取，不用缓存里的值)
    * instanceof (对象属于某个类)
    * stricfp(修饰类时保证浮点数运算的精确性)
* 基本类型与运算
    * 基本类型（shot int long double float char boolean byte 声明之后立刻在栈上分配内存空间）
    * 不可变类（实例后不能修改其值 String Integer）
    * 值传递和引用传递（说是都说值传递，但是其实还是有区别滴）
    * 不同数据类型的转换（类型自动转换 类型强制转换）
    * 强制类型转换的注意事项 （ s1 = s1 + 1; s += 1）
    * 运算符的优先级（括号就完事）
    * Math类中的round() 、ceil() 和 floor()方法
    * ++i 和 i++ （先加还是后加）
    * 如何实现无符号数的右移操作 （>> >>>）
    * char 类型中是否可以存储中文汉字（可以）
* 字符串与数组
    * 字符串创建和存储的机制是什么（栈 堆 常量区）
    * == equals 和hashCode有什么区别（hashCode将内存中的地址值计算为Int值）
    * String、StringBuffer、StringBuilder和StringTokenizer有什么区别（StringBuilder单线程，StringBuffer线程安全）
    * Java中数组是不是对象（是 封装：属性+行为 instanceof判断数据类型）
    * 数组的初始化方式（声明、初始化）
    * length属性和length()方法有什么区别（length属性，数组；length方法字符串）
* 异常处理【建议多看几次书中的例子】
    * finally块中的代码什么时候被执行（return之前，finally中有return,将会覆盖函数中其他的return语句，多看几次例子）
    * 异常处理的原理是什么（定义的违反语义规则）
    * 运行时异常和普通异常有什么区别
* 输入输出流
    * java io流的实现机制是什么 （流可以被看做是一种有序的字节集合，数据在两设备之间的传输 字节流和字符流 Decorator设计模式）
    * 管理文件和管理目录的类是什么（File）
    * Java Socket是什么（网络上的两个程序通过一个双向的通信是实现数据的交换 TCP UDP Decorator装饰器设计模式）
    * Java NIO是什么（非阻塞IO Reactor反应器设计模式）
    * 什么是java序列化（对象持久化方式：序列化+外部序列化）
    * System.out.println()方法有哪些需要注意的地方（控制台输出、IO、自动toString调用）
* java平台内存管理
    * 为什么说Java是平台独立性语言（中间码 虚拟机 编译成中间码，JVM解释执行 解释执行的三步：1.代码装入（类装载器）2.代码核验（字节码校验器） 3.代码执行（即时编译、解释执行））
    * Java平台与其他平台有什么区别（纯软件 可以运行在基于硬件的平台上 有完善的硬件架构（处理器、堆栈、寄存器、指令系统））
    * JVM加载class文件的原理机制是什么
        * 类只有被加载到JVM中后才能运行，当运行指令程序时，JVM会将编译生成的.class文件按照需求和一定规则加载到内存中，并组织成一个完整的java程序。
        * 类加载器本身也是一个类，其实质是把类文件从硬盘读到内存中。
        * 隐式加载->new 显示加载->class.forName()
        * 类加载器是动态的，并不会一次性将所有类全部加载后再运行。
        * 系统类 BootstrapLoader jre/lib/rt.jar
        * 扩展类 ExtClassLoader jar/lib/ext/*.jar
        * 自定义类 AppClassLoader classpath
        * 类加载的主要步骤（装载 链接 初始化）
* 容器
    * Java Collection框架是什么？（一个集合接口，包含了List、Queue、Set、Stack）
    * 什么是迭代器？（是一个对象，提供一种病访问容器对象中各个元素又不暴露该对象内部细节的方法 CocurrentModificationException）
    * ArrayList、Vector、LinkedList区别？（线程是否安全，底层实现机制）
    * HashMap、Hashtable、TreeMap、WeakHashMap有什么区别？（允许null、线程安全与否、实现机制）
    * 用自定义类作为HashMap或Hashtable的key时有哪些需要注意的？（key-hashCode-h1-equals 替换或不替换 对象与对象内容的区别）
    * Collection与Collections的区别与联系（Collections是个包装类，里面提供了各种静态方法）
* 多线程
    * 什么是线程，它与进程有什么区别，为什么要使用多线程？（线程是程序代码的执行单元，进程是一段正在执行的程序）
    * 同步和异步有什么区别？（同步保证数据安全，异步加快效率）
    * 如何实现Java多线程？（ 有三种方法，通过写代码去实现吧）
    * run（）方法和start()方法有什么区别（start()启动-就绪状态-run()-运行状态-运行结束-结束状态 直接调run不会同步）
    * 多线程同步实现的方法有哪些（sychronized wait()与notify Lock()）
    * sleep()方法与wait方法有什么区别（sleep 线程自身控制 wait线程间通信 ）
    * 终止线程的方法（Thread.stop与suspend）
    * sychronied与Lock有什么区别（用法不一；性能不一；锁机制不一样）
    * 什么是守护线程（服务进程、精灵线程、后台服务，典型的GC）
    * join（）方法的作用（调用完run，调用join方法）
* java数据库操作
    * 如何通过JDBC访问数据库？
    * JDBC处理事物采用什么方法？
    * Class.forName()作用（把类加载到内存）
    * getString()与getObject(getString一次读取到内存中，getObject从数据库中取)
    * 使用JDBC需要注意哪些问题？（1.建立连接 2.关闭连接）
    * JDO、DAO(Java Data Object Java数据对象   Dao Data Access Object数据访问接口层)
    * JDBC与Hibernate(写入到配置文件中)