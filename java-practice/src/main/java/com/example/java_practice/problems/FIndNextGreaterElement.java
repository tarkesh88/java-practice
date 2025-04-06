package com.example.java_practice.problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Stack;

public class FIndNextGreaterElement {

    public static Integer[] nextLargerElement(int[] arr, int n)
    {
        // Your code here
        Stack<Integer> st = new Stack<Integer>();
        st.push(arr[0]);
        int next, element;
        Integer[] result = new Integer[n];
        int count =0;
        for(int i=1; i<n; i++) {
            next = arr[i];
            if(st.isEmpty()==false) {
                element = st.pop();
                while(element<next) {
                    /*System.out.println(element + " --> "
                            + next);*/
                    result[count] = arr[i];
                    count++;
                    if(st.isEmpty()== true) {
                        break;
                    }
                    element= st.pop();
                }

                if(element>next) {
                    st.push(next);
                }
            }
            st.push(next);
        }

        while (st.isEmpty() == false) {
            element = st.pop();
            next = -1;
            result[count] = -1;
            //System.out.println(element + " -- " + next);
        }
        return result;
    }

    public static void main(String[] arg) {

        int[] arr = {2,4,6,3,1,0,7,8};
        System.out.print(" input is ");
        for(int i = 0; i<arr.length; i++) {
            System.out.print(" "+arr[i]);
        }
        Integer[] result = nextLargerElement(arr,8);
        System.out.println(" output is ");
        for(int i = 0; i<result.length; i++) {
            System.out.print(" "+result[i]);
        }

        HashMap hm = new HashMap();

    }
}
