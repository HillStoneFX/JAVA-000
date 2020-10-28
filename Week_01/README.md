1、Java 字节码技术

字节码是由单字节的指令组成
根据指令的性质，主要分为四大类：
（1）栈操作指令
（2）流程控制指令 （Java语法）
（3）对象操作指令
（4）算术运算以及类型转换指令  

2、JVM 类加载器 
加载class文件过程
（1）加载
（2）验证
（3）准备
（4）解析
（5）初始化
（6）使用
（7）卸载

三类加载器
（1）启动类加载器（BootstrapClassLoader）
（2）扩展类加载器（ExtClassLoader）
（3）应用类加载器（AppClassLoader）

3、JVM 内存模型
JVM内存包含线程栈、堆内存、非堆和JVM自身用到的一些内存
（1）每启动一个线程，JVM 就会在栈空间栈分配对应的线程栈；每执行到一个方法，就会创建
对应的栈帧
（2）堆内存是所有线程共用的内存空间，JVM 将Heap 内存分为年轻代和 老年代
（3）年轻代还划分为 3 个内存池，新生代和存活区（2个）
（4）非堆包含Metaspace、CCS（Compressed Class Space）和 Code Cache
 
4、JVM 启动参数
（1）-D 设置系统属性，-X 开头为非标准参数（一些内存大小），–XX：开头为非稳定参数（用于控制 JVM
的行为）
例如
-Dfile.encoding=UTF-8 指定文件编码格式
-Xmx4g 指定堆内存空间的初始大小
-XX：+UseG1GC：使用 G1 垃圾回收器

5、命令行工具
命令行
jps、jstat、jstack、jmap、jcmd、jjs
图形工具
jconsole、jmc、jvisualvm

6、gc
串行gc、并行gc、G1 gc、zgc
