package com.uas.diagonalmatriks;

import java.io.File;
import java.io.*;

public class App
{
    public static void main( String[] args ) throws Exception {
        File matriks = new File ("D:\\KULIAH\\SEMESTER 4\\Pr RPL-BO (Dendy)\\TAS-71200542\\DiagonalMatriks\\file.txt");
        BufferedReader br = new BufferedReader(new FileReader(matriks));
        String st;
        st = br.readLine();
        int n = Integer.parseInt(st);
        for (int i = 0; i < n; i++) {
            int total = 0;
            st = br.readLine();
            String[] arr = st.split(" ");
            if (!arr[0].equals(arr[1])) {
                System.out.println("-1");
                for (int j = 0; j < Integer.parseInt(arr[0]); j++) {
                    br.readLine();
                }
            } else {
                    int index = 0;
                    for (int j = 0; j < Integer.parseInt(arr[0]); j++) {
                        st = br.readLine();
                        String[] arr2 = st.split(" ");
                        total += Integer.parseInt(arr2[index]);
                        index++;
                    }
                        System.out.println(total);
                }
            }
        }
}







