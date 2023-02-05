// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class S3_2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 17, 15, 16, 7, 8, 10));
 
        int min = Collections.min(list); 
        int max = Collections.max(list); 
 
        double average; 
        int sum = 0; 
 
        for (int number : list) { 
            sum += number; 
        } 
        average = (double)sum / list.size(); 

        System.out.println("Minimum: " + min); 
        System.out.println("Maximum: " + max); 
        System.out.println("Average: " + average);
    }
}
