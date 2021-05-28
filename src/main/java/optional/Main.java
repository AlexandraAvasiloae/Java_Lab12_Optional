package optional;

import optional.TestClass.TestClasses;

import java.io.File;
import java.net.MalformedURLException;

public class Main {

    public static void main(String[] args) throws MalformedURLException, ClassNotFoundException {
        
        ClassAnalyzer solver = new ClassAnalyzer();
        ClassLoader classLoader = TestClasses.class.getClassLoader();
        File file = new File("C:\\Users\\Alexandra\\OneDrive\\Desktop\\LAB12_PA\\src\\main\\java\\compulsory\\TestClass");
        try {
            Class aClass = classLoader.loadClass("optional.TestClass.TestClasses");
            solver.info(aClass);
            solver.invoke(aClass);
            solver.invoke2(aClass);
            System.out.println("-----EXPLORE-----");
            solver.explore(file);
            solver.statistics();
        } catch (ClassNotFoundException e) {
            //e.printStackTrace();
        }

    }
}
