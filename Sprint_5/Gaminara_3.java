public class Gaminara_3 {
    public static int temperatura(double grados, int edadNiño, int dosisParacetamol, int kilosNiño) {
        if (grados < 38) {
            System.out.println("El niño está bien");
        } else {
            if (grados < 39) {
                if (edadNiño < 3) {
                    System.out.println("Debe ir al médico");
                } else if (edadNiño < 12) {
                    dosisParacetamol = (15*kilosNiño);
                    return dosisParacetamol;
                } else if (edadNiño >= 12) {
                    dosisParacetamol = 500;
                    System.out.println("Dar " + dosisParacetamol + "mg cada 8 horas");
                }
                System.out.println("Es aconsejable dar al niño un paño húmedo");
            } else if (grados >= 40) {
                System.out.println("Corre al hospital");
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        temperatura(38.5, 11, 0, 56);
    }
}
