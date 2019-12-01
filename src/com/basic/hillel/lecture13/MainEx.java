package com.basic.hillel.lecture13;

/**
 * Created by alpa on 12/1/19
 */
public class MainEx {

    public static void main(String[] args) {
        System.out.println("Start application");

        try {
            int result = 10/0;
//            String result = null;
//            System.out.println("result: " + result.toUpperCase());
            System.out.println("result: " + result);
//        } catch (NullPointerException | ArithmeticException e) {
//        } catch (Exception e) {
        } catch (ArithmeticException e) {
//            e.printStackTrace();
            System.out.println("ArithmeticException");
//            System.out.println("Exception");
//            System.err.println(e.getMessage());
//            StackTraceElement[] stackTrace = e.getStackTrace();
//            for (StackTraceElement stackTraceElement: stackTrace) {
//                System.err.println(stackTraceElement.getClassName());
//                System.err.println(stackTraceElement.getLineNumber());
//            }
        } catch (Exception e) {
            System.out.println("Exception");
        }

        System.out.println("Stop application");

    }

}
