public class MatrizesBasicas {
    public static void main(String[] args) {
        String [][] matrizTest = new String[2][2];

        matrizTest[0][0] = "l1 - c1";
        matrizTest[0][1] = "l1 - c2";

        matrizTest[1][0] = "l2 - c1";
        matrizTest[1][1] = "l2 - c2";

        for (int i = 0; i< matrizTest.length; i++){
            for (int j = 0; j < matrizTest[i].length; j++){
                System.out.print("\t\t" + matrizTest [i][j]);
            }
            System.out.println();
        }
    }
}
