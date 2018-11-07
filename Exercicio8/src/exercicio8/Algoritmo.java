/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio8;

/**
 *
 * @author paulo
 */
public class Algoritmo {

    public int run (int a, int b)
    {
        String stringNumberA = String.valueOf(a);
        String stringNumberB = String.valueOf(b);
        int sizeOfA = stringNumberA.length();
        int sizeOfB = stringNumberB.length();
        int sizeOfSmaller;
        int sizeOfBigger;
        String biggestStringNumber;
        
        if (sizeOfA < sizeOfB) {
            sizeOfSmaller = sizeOfA;
            sizeOfBigger = sizeOfB;
            biggestStringNumber = stringNumberB;
        } else {
            sizeOfSmaller = sizeOfB;
            sizeOfBigger = sizeOfA;
            biggestStringNumber = stringNumberA;
        }
        
        String stringResult = "";
        for (int i = 0; i < sizeOfSmaller; i++) {
            stringResult  = stringResult + stringNumberA.charAt(i) + stringNumberB.charAt(i);
        }
        
        for (;sizeOfSmaller < sizeOfBigger; sizeOfSmaller++) {
            stringResult = stringResult + biggestStringNumber.charAt(sizeOfSmaller);
        }
        int result = Integer.parseInt(stringResult);
        
        if (result > 1000000) {
            return -1;
        }
        
        return result;
    }        
}
