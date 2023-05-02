package com.gfa.exam.UniqueNumber;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UniqueNumbers {
    public List<Integer> getUniqueNumbers(int[][] matrixInput){
        List<Integer> output= new ArrayList<>();
        HashMap<Integer,Integer> countOfNumber = new HashMap<>();
        for (int i = 0; i < matrixInput.length; i++) {
            for (int j = 0; j < matrixInput[i].length; j++) {
                if (countOfNumber.containsKey(matrixInput[i][j])){
                    countOfNumber.put(matrixInput[i][j],countOfNumber.get(matrixInput[i][j])+1);
                }else{
                    countOfNumber.put(matrixInput[i][j],1);
                }
            }
        }
        Integer[] arrOfKeys = countOfNumber.keySet().toArray(new Integer[0]);
        for (int i = 0; i < countOfNumber.keySet().size(); i++) {
            output.add(arrOfKeys[i]);
        }
        return output;
    }
}
