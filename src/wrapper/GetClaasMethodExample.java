package wrapper;

import java.lang.reflect.Method;

public class GetClaasMethodExample {

    public static void main(String[] args) {

        var hello = "hello!";
        var strClass = hello.getClass();

        System.out.println("strClass.getName() = " + strClass.getName());
        System.out.println("strClass.getSimpleName() = " + strClass.getSimpleName());
        System.out.println("strClass.getPackageName() = " + strClass.getPackageName());
        System.out.println("strClass = " + strClass);

        for (Method method : strClass.getMethods())
            System.out.println("method.getName() = " + method.getName());

        var num = (Integer) 34;
        var intClass = num.getClass();
        var objClass = intClass.getSuperclass().getSuperclass();
        System.out.println("intClass.getSuperclass() = " + intClass.getSuperclass());
        System.out.println("intClass.getSuperclass() = " + intClass.getSuperclass().getSuperclass());

        for (Method method : objClass.getMethods())
            System.out.println("method.getName()  = " + method.getName());

    }
}
