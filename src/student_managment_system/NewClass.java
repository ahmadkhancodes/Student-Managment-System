/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_managment_system;

import java.util.Arrays;

/**
 *
 * @author 92311
 */
public class NewClass {
    public static void main(String[] args) {
        String[] array={"Ahmad","Asim","Ali","Ashraf"};
        String[] newarray= new String[array.length];
        
        for (int i = 0; i < array.length; i++) {
            
            newarray[i]=array[i];
            System.out.print(newarray[i]+"");
            
            
            System.out.println("");
            
            
            
            
        }
        for (int i = 0; i < newarray.length; i++) {
            
            Arrays.sort(array);
            System.out.print(array[i]+"");
    }
    
}}
