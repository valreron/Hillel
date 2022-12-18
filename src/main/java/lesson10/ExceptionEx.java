package lesson10;

import java.io.FileNotFoundException;

public class ExceptionEx {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        ConfigUtil configUtil = new ConfigUtil();
//
//        try {
//            configUtil.getConfigPropert();
//            System.out.println("after try");
//        }catch (Exception e){
//            System.out.println("some exception");
//        }
//
//        System.out.println("before method");
//
//        try {
//            System.out.println("before try");
//            configUtil.methodWithException();
//            System.out.println("after try");
//        }catch (Exception e){
//            System.out.println("inside catch");
//        }
//
//        System.out.println("after method");


        configUtil.clickButton();
    }


}
