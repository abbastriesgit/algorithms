package com.abbastriesdevelopment.algorithms.search;

import org.springframework.stereotype.Component;

@Component
public class BinarySearch {

    public BinarySearch() {
        _test();
    }

    private void _test() {
        int[] array = new int[]{1,2,3,4,5,5,6,7,8,8,10,12};
        System.out.println(search(array,5)==4);
        System.out.println(search(array,0)==-1);
        System.out.println(search(array,13)==-1);
        System.out.println(search(array,12)==11);
        System.out.println(search(array,9)==-1);
        System.out.println(search(array,1)==0);
    }

    public int search(int[] array, int value){
        //need to test corner cases
        int end = array.length-1;
        int start = 0,mid;
        int ans = -1;
        while(end>=start){
            mid = (start + end)/2;
            if(array[mid]==value) {
                ans = mid;
                end = mid-1;
            }
            if(array[mid]<value)
                start = mid+1;
            else
                end = mid-1;
        }
        return  ans;
    }
}
