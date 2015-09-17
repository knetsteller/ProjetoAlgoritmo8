/**
 * Pequeno programa que retorna verdadeiro se o um número, maior ou igual a 0 e 
 * menor ou igual a 999 é igual à soma do cubo de três números.
 */


package br.ufg.inf.es.construcaodesoftware.projetoalgoritmo8;

/**
 * @param n é o número natural, maior ou igual que 0 e menor ou igual a 999 a 
 * ser verificado.
 * 
 */

public class SomaDosCubos {
    
    public static boolean isSomaDosCubos(int n) {
        
        if (n < 0 || n > 999 ) {
            throw new IllegalArgumentException("O valor de n deve ser maior ou "
                    + "igual a 0 e menor ou igual a 999.");
        }
        
        int i;
        int j;
        int k;
        boolean isSomaDosCubos;
        
        i = n / 100;
        j = (n - 100 * i) / 10;
        k = n % 10;
        
        if ((Math.pow(i, 3) + Math.pow(j, 3) + Math.pow(k, 3)) == n) {
            isSomaDosCubos = true;
        } else {
            isSomaDosCubos = false;
        }
        
        return isSomaDosCubos;
    }
    
}
