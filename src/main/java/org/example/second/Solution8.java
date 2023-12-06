package org.example.second;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;

public class Solution8 {

    public static void main(String[] args) throws Exception {

        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine().trim());
            Object o;
            Inner outerInstance = new Inner();
            Class<?> inprivat = Solution8.Inner.Private.class;
            Constructor<?> constructor = inprivat.getDeclaredConstructor(Inner.class);
            constructor.setAccessible(true);
            o = constructor.newInstance(outerInstance);
            Inner.Private classForMethod = (Inner.Private) o;
            String out = classForMethod.powerof2(num);
            System.out.println(num+" is "+out);

            System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");

        }
        catch (Exception e) {
            System.out.println("Unsuccessful Termination!!");
            e.printStackTrace();
        }
    }
    static class Inner {
        private class Private {
            private String powerof2(int num) {
                return ((num & num - 1) == 0) ? "power of 2" : "not a power of 2";
            }
        }
    }
}

//class DoNotTerminate { //This class prevents exit(0)
//    public static class ExitTrappedException extends SecurityException {
//        private static final long serialVersionUID = 1L;
//    }
//
//    public static void forbidExit() {
//        final SecurityManager securityManager = new SecurityManager() {
//            @Override
//            public void checkPermission(Permission permission) {
//                if (permission.getName().contains("exitVM")) {
//                    throw new ExitTrappedException();
//                }
//            }
//        };
//        System.setSecurityManager(securityManager);
//    }
//}
