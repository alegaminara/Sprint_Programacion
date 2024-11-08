public class Gaminara_2 {
    public static int Nota(int notaProva, int numeroEntregas, int Entregas, boolean noSeguidaAC, int notaEntregas, double notaFinal, int notaPractica){
        if (notaProva < 7) {
            System.out.println("Está usted suspendido para la prueba final");
        } else {
            if (numeroEntregas < (0.7*Entregas)) {
                System.out.println("Está usted suspendido. No ha seguido la evaluación contínua");
                noSeguidaAC = true;
            } else if (numeroEntregas == Entregas) {
                notaEntregas = 10;
                return notaEntregas;
            } else if (numeroEntregas >= (0.9*Entregas)) {
                notaEntregas = 8;
                return notaEntregas;
            } else if (numeroEntregas >= (0.8*Entregas)) {
                notaEntregas = 6;
                return notaEntregas;
            } else if (numeroEntregas >= (0.7*Entregas)) {
                notaEntregas = 4;
                return notaEntregas;
            } notaFinal = ((0.2*notaProva)+(0.1*notaEntregas)+(0.7*notaPractica));
            if (notaFinal < 5) {
                if (noSeguidaAC == true) {
                    System.out.println("Cabe seguir la evaluación contínua");
                } else {
                    System.out.println("Haga ejercicios preparatórios para la PAF2");
                }
            }
        }    
        return 0;
        
    }
    public static void main(String[] args) {
        Nota(8, 15, 20, false, 8, 0, 9);
    }
}
