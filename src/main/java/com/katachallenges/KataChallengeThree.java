package com.katachallenges;

import com.katachallenges.util.ArrayUtil;
import java.util.ArrayList;

/**
 * Esta clase pretende implementar toda la lógica necesaria para resolver el reto 3 de Kata
 * @author Steven
 *
 */
public class KataChallengeThree {

    /**
     *
     * @param coins Recibe un arreglo de enteros que indican las monedas
     * @return Devuelve un entero con la minima moneda de cambio que no se puede devolver
     */
    public int calculateMinimumAmountOfChangeThatCannotGive(ArrayList<Integer> coins) {
        ArrayList<Integer> sortedCoins = ArrayUtil.orderArray(coins);
        int minimumAmountOfChange = 0;
        int minimumAmountOfChangeThatCantCreate ;
        for (int coin: sortedCoins){
            if(coin > minimumAmountOfChange + 1){
                minimumAmountOfChangeThatCantCreate = minimumAmountOfChange + 1;
                return minimumAmountOfChangeThatCantCreate;
            }
            minimumAmountOfChange = minimumAmountOfChange + coin;
        }
        minimumAmountOfChangeThatCantCreate = minimumAmountOfChange + 1;
        return minimumAmountOfChangeThatCantCreate;
    }
}
