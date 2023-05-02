package com.gfa.exam.UniqueNumber;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class UniqueNumbersTest {
    UniqueNumbers uniqueNumbers;
    @BeforeEach
    public void setup(){
        uniqueNumbers = new UniqueNumbers();
    }
    @Test
    public void isUnique1(){
        int[][] input= {{1,1},{4,2}};
        List<Integer> output= new ArrayList<>();
        output.add(1);
        output.add(2);
        output.add(4);
        assertEquals(output,uniqueNumbers.getUniqueNumbers(input));
    }
    @Test
    public void isUnique2(){
        int[][] input= {{4,3,-1},{10,2,5},{-2,3,4}};
        List<Integer> output= new ArrayList<>();
        output.add(-1);
        output.add(-2);
        output.add(2);
        output.add(3);
        output.add(4);
        output.add(5);
        output.add(10);
        assertEquals(output,uniqueNumbers.getUniqueNumbers(input));
    }
}