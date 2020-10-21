import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Method;

public class Base64ClassLoder extends ClassLoader {

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {

        FileInputStream classStream = null;

        try {
            File classFile = new File("Hello.xlass");
            byte[] buffer = new byte[(int)classFile.length()];
            byte[] b = new byte[(int)classFile.length()];
            classStream = new FileInputStream(classFile);
            classStream.read(buffer);
            for(int i = 0; i < buffer.length; i++) {
                b[i] = (byte) ((- buffer[i]) + 255);
            }

            return defineClass(name, b, 0, b.length);
        } catch (Exception e) {

        }
        return super.findClass(name);
    }

    public static void main(String[] args) throws Exception {
        Base64ClassLoder myClassLoder = new Base64ClassLoder();

        Class clazz = myClassLoder.loadClass("Hello");
        Method hello = clazz.getMethod("hello");

        Object object = clazz.newInstance();

        hello.invoke(object);
    }
}
