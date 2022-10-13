package com.katachallenges;

import com.katachallenges.util.ArrayUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Esta clase pretende implementar toda la lógica necesaria para resolver el reto 2 de Kata
 * @author Steven
 *
 */

public class KataChallengeTwo {

    /**
     *
     * @param array recibe un array de enteros ordenados en orden ascendente
     * @param S número generado en el MD5
     * @return Devuelve un array de enteros con cada uno de elementos del array recibido elevado al cuadrado
     */
    public List<Integer> calculateSortedSquaredArray(ArrayList<Integer> array, int S) {
        List<Integer> newCreatedArray;
        int SS = (S*10)+S;
        newCreatedArray = ArrayUtil.orderArray(array.stream()
                         .map(x->
                                 calculateSquareNumber(x)
                         ).collect(Collectors.toList()));

        var result = newCreatedArray.stream().filter(x-> x<=SS
        ).collect(Collectors.toList());
        return result;
    }

    /**
     *
     * @param number entero recibido
     * @return Devuelve el entero del número recibido por parámetro
     */
    public int calculateSquareNumber(int number) {
        return (number*number);
    }
}
