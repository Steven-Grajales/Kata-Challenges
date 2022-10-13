package com.katachallenges.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Esta clase pretende la implementación de métodos y atributos comunes del sistema
 * @author Steven
 *
 */
public class ArrayUtil {

    /**
     *
     * @param array Recibe un array de enteros
     * @return Devuelve un array de enteros ordenados
     */
    public static ArrayList<Integer> orderArray(List<Integer> array) {
        Collections.sort(array);
        return (ArrayList<Integer>) array;
    }
}
