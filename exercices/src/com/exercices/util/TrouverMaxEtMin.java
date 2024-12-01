package com.exercices.util;

public class TrouverMaxEtMin {
    public int [] filtrage(int ...tabs){
        if(tabs.length == 0  || tabs == null)
        {
            throw new IllegalArgumentException("Le tableau est vide");
        }
        int max =Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int tab : tabs){
            if(tab > max) max = tab;
            if(tab < min) min = tab;
        }
        return new int[] {max, min};
    }
}
