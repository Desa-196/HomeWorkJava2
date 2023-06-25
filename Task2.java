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
        bubbleSort(array);
    }
    public static void writeLog(String text){
        try(FileWriter writer = new FileWriter(file, true)){ 
            writer.append(text); 	      
        } 	
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for(int j = 0; j < array.length - i - 1; j++) {
                if(array[j + 1] < array[j]) {
                    int swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
                writeLog(Arrays.toString(array)+'\n');
            }
        }
    }
}
