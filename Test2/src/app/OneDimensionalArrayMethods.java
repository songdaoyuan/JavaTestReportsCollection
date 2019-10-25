package app;
/*
编写并验证如下方法：
    对一维数组进行从大到小排序。
    求一维数组所有元素的平均值。
    查找某个数据在数组中的出现位置。

*/

import java.util.Arrays;

public class OneDimensionalArrayMethods {
    public static void main(String[] args) throws Exception {
        int[] OneDimensionalArray = { 1, 42, 64, 88, 29, 547, 86, 36, 79, 25, 28, 24, 107, 252, 527, 252 };
        OneDimensionalArraySort(OneDimensionalArray);
        System.out.println("对一维数组从大到小排序后的结果为：");
        System.out.println(Arrays.toString(OneDimensionalArray));
        System.out.println("一维数组所有元素的平均值为："+ OneDimensionalArrayAverage(OneDimensionalArray));
        System.out.println("一维数中36出现的位置为："+ OneDimensionalArrayElementIndex(OneDimensionalArray, 36));
    }

    public static void OneDimensionalArraySort(int[] array){
        //使用插入排序
        for (int i = 1; i < array.length; i++) {
			int key = array[i];
			int j = i - 1;
			while (j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = key;
		}
    }

    public static double OneDimensionalArrayAverage (int[] array){
        double sum = 0, Average = 0;
        for (int i=0; i<array.length; i++){
            sum +=array[i];
        }
        Average = sum/array.length;
        
        return Average;
    }

    public static int OneDimensionalArrayElementIndex (int[] array, int ElementValue){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == ElementValue) {
                return i+1;
            }
        }
        return -1;//如果未找到返回-1
    }
}    