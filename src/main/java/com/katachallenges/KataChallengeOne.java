package com.katachallenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Esta clase pretende implementar toda la lógica necesaria para resolver el reto 1 de Kata
 * @author Steven
 *
 */

public class KataChallengeOne {

    /**
     *
     * @param array con la lista de números
     * @param S número generado en el MD5
     * @return Devuelve un array creado sin el número S
     */
    public List<String> createArrayWithoutDigit(ArrayList<String> array, int S) {
        ArrayList<String> newCreatedArray = new ArrayList<>();
        int deletedDigit = 0;
        for(String element: array){
            if(Integer.parseInt(element) >= S){
                if(Integer.parseInt(element) != S){
                    deletedDigit = deleteDigit(element, S);
                    newCreatedArray.add(Integer.toString(deletedDigit));
                }
            }else{
                newCreatedArray.add(element);
            }
        }
        if(newCreatedArray.size() > S){
            var result = newCreatedArray.subList(0,S+1);
            Collections.reverse(result);
            return result;
        }
        Collections.reverse(newCreatedArray);
        return newCreatedArray;
    }

    /**
     *
     * @param element número tipo String
     * @param S número generado en el MD5
     * @return Devuelve un int con el valor s eliminado del element
     */
    public int deleteDigit(String element, int S) {
        int result=0; int positionDigit=1; int Digit=0;
        StringBuilder strb = new StringBuilder(element);
        element = strb.reverse().toString();
        for(char number: element.toCharArray()){
            Digit = Character.getNumericValue(number) % 10;
            if(Digit != S){
                result = result +( Digit * positionDigit);
                positionDigit = positionDigit * 10;
            }
        }
        return result;
    }
}
