// usando o while e incrementando mais um, usando o if para parar onde quero
// com mais um incremento antes de imprimir, para não repitir o mesmo numero (quero o numero 27)

public class Breack {
    public static void main(String[] args) {

        int i = 0;
        while (i <= 50){
            System.out.println("Imprimindo..." + i);
            if (i == 26){
                System.out.println("O dia do meu nascimento é : " + (++i));
                break;
            }
            i++;
        }
    }
}
