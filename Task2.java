/* 2)* Реализуйте алгоритм сортировки пузырьком числового массива, 
результат после каждой итерации запишите в лог-файл. */

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Task2
{
    public static String file = "log.txt";
    public static void main(String[] args) {
        int[] array = new int[]{0,4,7,2,34,1,6,32,6};
    }
    public static void writeLog(String text){
        try(FileWriter writer = new FileWriter(file, true)){ 
            writer.append(text); 	      
        } 	
        catch(Exception e){
            System.out.println(e);
        }
    }

}
