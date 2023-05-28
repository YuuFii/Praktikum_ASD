package Hackerrank_Searching;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.nextLine();

        for (int i = 0; i < n; i++) {
            String iniString = in.nextLine();
            String iniEvaluasi = in.nextLine();

            String[] iniStringSplitted = iniString.split("");
            String[] iniEvaluasiSplitted = iniEvaluasi.split("");

            for (int j = 0; j < iniEvaluasiSplitted.length; j++) {
                ArrayList<Integer> indexHasilSearch = sequentialSearch(iniStringSplitted, iniEvaluasiSplitted[j]);
                if (indexHasilSearch.isEmpty()) {
                    System.out.print("-1 ");
                } else {
                    for (int index : indexHasilSearch) {
                        System.out.print(index + " ");
                    }
                }
            }
            System.out.println();
        }
        in.close();
    }

    public static ArrayList<Integer> sequentialSearch(String[] arr, String target) {
        ArrayList<Integer> index = new ArrayList<Integer>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i].equals(target)) {
                index.add(i);
            }
        }
        return index;
    }
}
