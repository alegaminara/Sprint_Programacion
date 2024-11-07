import java.util.Scanner;

public class S05_Gaminara {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numRegistro, hermanoCentro, viveMismaPoblacion, padresTrabajanMismaPoblacion, tieneDiscapacidad, esFamiliaNumerosa, familiarEscolarizado;
        
        int puntos = 0;

        final int PUNTAJE_HERMANO = 40;
        final int PUNTAJE_VIVE_MISMA_POBLACION = 30;
        final int PUNTAJE_PADRE_TRABAJA = 20;
        final int PUNTAJE_DISCAPACIDAD = 10;
        final int PUNTAJE_FAMILIA_NUMEROSA = 15;
        final int PUNTAJE_FAMILIAR_ESCOLARIZADO = 5;

        System.out.println("Ingrese el número de registro");
        if (input.hasNextInt()) {
            numRegistro = input.nextInt();
            if (numRegistro < 1 || numRegistro > 499) {
                System.out.println("ERROR. El registro no puede ser mayor que 499 ni más pequeño que 1");
            } else {
                System.out.println("Numero de Registro: " + numRegistro);
                System.out.println("¿Tiene algún hermano que ya estudie en el centro? (1[Sí]/0[No])");
                hermanoCentro = input.nextInt();
                System.out.println("¿Vive cerca de la zona donde se ubica la escuela? (1[Sí]/0[No])");
                viveMismaPoblacion = input.nextInt();
                System.out.println("¿Alguno de los padres trabaja cerca de donde se ubica la escuela? (1[Sí]/0[No])");
                padresTrabajanMismaPoblacion = input.nextInt();
                System.out.println("¿Tiene el niño alguna discapacidad o enfermedad crónica? (1[Sí]/0[No])");
                tieneDiscapacidad = input.nextInt();
                System.out.println("¿Son familia numerosa o monoparental? (1[Sí]/0[No])");
                esFamiliaNumerosa = input.nextInt();
                System.out.println("¿Algún familiar es ex-alumno del centro? (1[Sí]/0[No])");
                familiarEscolarizado = input.nextInt();
        
                if (hermanoCentro == 1) {
                    puntos = puntos + PUNTAJE_HERMANO;
                } if (viveMismaPoblacion == 1) {
                    puntos = puntos + PUNTAJE_VIVE_MISMA_POBLACION;
                } if (padresTrabajanMismaPoblacion == 1) {
                    puntos = puntos + PUNTAJE_PADRE_TRABAJA;
                } if (tieneDiscapacidad == 1) {
                    puntos = puntos + PUNTAJE_DISCAPACIDAD;
                } if (esFamiliaNumerosa == 1) {
                    puntos = puntos + PUNTAJE_FAMILIA_NUMEROSA;
                } if (familiarEscolarizado == 1) {
                    puntos = puntos + PUNTAJE_FAMILIAR_ESCOLARIZADO;
                } if (hermanoCentro > 1 || viveMismaPoblacion > 1 || padresTrabajanMismaPoblacion > 1 || tieneDiscapacidad > 1 || esFamiliaNumerosa > 1 || familiarEscolarizado > 1) {
                    System.out.println("Error. La respuesta solo puede ser 1 para Sí y 0 para no");
                } if (hermanoCentro < 0 || viveMismaPoblacion < 0 || padresTrabajanMismaPoblacion < 0 || tieneDiscapacidad < 0 || esFamiliaNumerosa < 0 || familiarEscolarizado < 0) {
                    System.out.println("Error. La respuesta solo puede ser 1 para Sí y 0 para no");
                }
                
    
                System.out.println("El puntaje del niño es de " + puntos);
            
            }
        } else {
            System.out.println("ERROR. El Número de Registro no puede tener decimales");
        }

        
        input.close();
    }
}