package examencod;

public class ExamenCOD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int inicio = 11;
        if (metodoMio(inicio)) {
            System.out.println("Es numero primo");
        } else {
            System.out.println("NO es numero primo");
        }

        for (int var2 = 2; var2 < 1000; var2++) {
            if (metodoMio(var2)) {
                System.out.print(var2 + " ");
            }
        }
    }

    public static boolean metodoMio(int var3) {
        int varMet = 2;
        boolean auxMet = true;
        while ((auxMet) && (varMet != var3)) {
            if (var3 % varMet == 0) {
                auxMet = false;
            }
            varMet++;
        }
        return auxMet;
    }

}
