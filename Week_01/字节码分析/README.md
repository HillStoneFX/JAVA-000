# 字节码分析
~~~~
# 反编译二进制文件显示二进制的助记符，常量池、成员方法、代码对应行号
javap -l -c -v SimpleService.class
## 下面main方法中包含四则运算、if和for语句
Classfile /C:/Users/Smart/Desktop/classloderTest/SimpleService.class
  Last modified 2020-10-21; size 611 bytes
  MD5 checksum 07ecb717459ddbff0130ad877e65cae8
  Compiled from "SimpleService.java"
public class SimpleService
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
   #1 = Methodref          #6.#17         // java/lang/Object."<init>":()V
   #2 = Fieldref           #18.#19        // java/lang/System.out:Ljava/io/PrintStream;
   #3 = String             #20            // 杩愮畻:6 - 3 = 3
   #4 = Methodref          #21.#22        // java/io/PrintStream.println:(Ljava/lang/String;)V
   #5 = Class              #23            // SimpleService
   #6 = Class              #24            // java/lang/Object
   #7 = Utf8               <init>
   #8 = Utf8               ()V
   #9 = Utf8               Code
  #10 = Utf8               LineNumberTable
  #11 = Utf8               main
  #12 = Utf8               ([Ljava/lang/String;)V
  #13 = Utf8               StackMapTable
  #14 = Class              #25            // "[Ljava/lang/String;"
  #15 = Utf8               SourceFile
  #16 = Utf8               SimpleService.java
  #17 = NameAndType        #7:#8          // "<init>":()V
  #18 = Class              #26            // java/lang/System
  #19 = NameAndType        #27:#28        // out:Ljava/io/PrintStream;
  #20 = Utf8               杩愮畻:6 - 3 = 3
  #21 = Class              #29            // java/io/PrintStream
  #22 = NameAndType        #30:#31        // println:(Ljava/lang/String;)V
  #23 = Utf8               SimpleService
  #24 = Utf8               java/lang/Object
  #25 = Utf8               [Ljava/lang/String;
  #26 = Utf8               java/lang/System
  #27 = Utf8               out
  #28 = Utf8               Ljava/io/PrintStream;
  #29 = Utf8               java/io/PrintStream
  #30 = Utf8               println
  #31 = Utf8               (Ljava/lang/String;)V
{
  public SimpleService();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 1: 0

  public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=9, args_size=1
         0: iconst_3
         1: istore_1
         2: bipush        6
         4: istore_2
         5: iload_1
         6: iload_2
         7: iadd
         8: istore_3
         9: iload_2
        10: iload_1
        11: isub
        12: istore        4
        14: iload_1
        15: iload_2
        16: imul
        17: istore        5
        19: iload_2
        20: iload_1
        21: idiv
        22: istore        6
        24: iload         4
        26: iconst_3
        27: if_icmpne     38
        30: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
        33: ldc           #3                  // String 杩愮畻:6 - 3 = 3
        35: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        38: iconst_0
        39: istore        7
        41: iconst_0
        42: istore        8
        44: iload         8
        46: iconst_5
        47: if_icmpge     63
        50: iload         7
        52: iload         8
        54: iadd
        55: istore        7
        57: iinc          8, 1
        60: goto          44
        63: return
      LineNumberTable:
        line 3: 0
        line 4: 2
        line 5: 5
        line 6: 9
        line 7: 14
        line 8: 19
        line 10: 24
        line 11: 30
        line 14: 38
        line 15: 41
        line 16: 50
        line 15: 57
        line 18: 63
      StackMapTable: number_of_entries = 3
        frame_type = 255 /* full_frame */
          offset_delta = 38
          locals = [ class "[Ljava/lang/String;", int, int, int, int, int, int ]
          stack = []
        frame_type = 253 /* append */
          offset_delta = 5
          locals = [ int, int ]
        frame_type = 250 /* chop */
          offset_delta = 18
}
SourceFile: "SimpleService.java"