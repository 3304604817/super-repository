package com.supers.basic.util.arithmetic;

/**
 * 排序算法算法
 * @author gaoyang
 * @date 2020/5/16 19:20
 */
public class Sort {
    /**
     * 冒泡排序
     * 1、比较相邻的元素。如果第一个比第二个大，就交换它们两个；
     * 2、对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对，这样在最后的元素会是最大的数；
     * 3、针对所有的元素重复以上的步骤，除了最后一个；
     * 4、重复步骤1~3，直到排序完成。
     * @param array
     * @return
     */
    public static int[] bubbleSort(int[] array){
        if(array.length == 0){
            return array;
        }
        for(int i = 0; i < array.length - 1; i++){
            for(int j = 0; j < array.length - i - 1; j++){
                if(array[j] > array[j + 1]){
                    int switchNum = array[j + 1];
                    array[j] = array[j + 1];
                    array[j + 1] = switchNum;
                }
            }
        }
        return array;
    }
}
