
public class Licao {
    public static void main(String[] args) {

        
         int x;

        // "=" (atribuição simples)
        x = 5; // coloca o valor 5 dentro da variável x

        // "+="
        x += 3; // x = x + 3 → soma 3 ao valor atual de x

        // "-="
        x -= 2; // x = x - 2 → subtrai 2 do valor atual de x

        // "*="
        x *= 4; // x = x * 4 → multiplica o valor de x por 4

        // "/="
        x /= 2; // x = x / 2 → divide o valor de x por 2

        // "%="
        x %= 3; // x = x % 3 → guarda o RESTO da divisão de x por 3

        // "&="
        x &= 1; 
        // x = x & 1 → compara bit a bit
        // só fica 1 onde os DOIS bits forem 1
        // exemplo: 0101 & 0001 = 0001
        // uso comum: "filtrar" bits (ex: pegar último bit)

        // "|="
        x |= 2; 
        // x = x | 2 → compara bit a bit
        // vira 1 se PELO MENOS um dos bits for 1
        // exemplo: 0101 | 0010 = 0111
        // uso comum: "ligar" certos bits

        // "^="
        x ^= 3; 
        // x = x ^ 3 → compara bit a bit
        // vira 1 só quando os bits são DIFERENTES
        // exemplo: 0101 ^ 0011 = 0110
        // uso comum: inverter bits

        // ">>="
        x >>= 1; 
        // x = x >> 1 → move os bits 1 casa pra direita
        // exemplo: 1000 >> 1 = 0100
        // efeito prático: divide por 2

        // "<<="
        x <<= 2; 
        // x = x << 2 → move os bits 2 casas pra esquerda
        // exemplo: 0010 << 2 = 1000
        // efeito prático: multiplica por 4

        System.out.println("Valor final de x: " + x);
    }
}