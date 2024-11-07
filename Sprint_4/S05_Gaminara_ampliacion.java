import java.util.Scanner;

public class S05_Gaminara_ampliacion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int hermanoCentro, viveMismaPoblacion, padresTrabajanMismaPoblacion, tieneDiscapacidad, esFamiliaNumerosa, familiarEscolarizado;
        
        int numRegistro = 0;
        int puntos = 0;

        final int PUNTAJE_HERMANO = 40;
        final int PUNTAJE_VIVE_MISMA_POBLACION = 30;
        final int PUNTAJE_PADRE_TRABAJA = 20;
        final int PUNTAJE_DISCAPACIDAD = 10;
        final int PUNTAJE_FAMILIA_NUMEROSA = 15;
        final int PUNTAJE_FAMILIAR_ESCOLARIZADO = 5;

        boolean repetir = true;
        
        System.out.println("Ingrese el número de registro");
        
        while (repetir) {
            if (input.hasNextInt()) {
                numRegistro = input.nextInt();
                if (numRegistro < 1 || numRegistro > 499) {
                    System.out.println("ERROR. El registro no puede ser mayor que 499 ni más pequeño que 1");
                    System.out.println("Vuelva a ingresar un número de registro válido");
                } else {
                    System.out.println("Numero de registro correcto (" + numRegistro + ")");       
                    repetir = false; 
                }
            } else {
                System.out.println("ERROR. El Número de Registro no puede tener decimales");
                System.out.println("Vuelva a ingresar el número de registro");
                input.next();
            }
        } 
        
        System.out.println("¿Tiene algún hermano que ya estudie en el centro? (1[Sí]/0[No])");
        repetir = true;
        while (repetir) {
            if (input.hasNextInt()) {
                hermanoCentro = input.nextInt();
                if (hermanoCentro == 1) {
                    puntos += PUNTAJE_HERMANO;
                    System.out.println("El niño tiene un hermano cursando en el centro. Puntos actuales: " + puntos);
                } else if (hermanoCentro == 0) {
                    System.out.println("El niño no tiene hermanos cursando en el centro. Puntos actuales: " + puntos);
                } else {
                    System.out.println("ERROR. Solo puede responder con 1 para indicar 'Sí' y con 0 para indicar No.");
                    System.out.println("¿Tiene algún hermano que ya estudie en el centro? (1[Sí]/0[No])");
                    continue;
                }
                repetir = false;
            } else {
                System.out.println("ERROR. Solo puede responder con un número entero 1 o 0");
                System.out.println("¿Tiene algún hermano que ya estudie en el centro? (1[Sí]/0[No])");
                input.next();
            }
        }
        System.out.println("¿Vive cerca de la zona donde se ubica la escuela? (1[Sí]/0[No])");
        repetir = true;
        while (repetir) {
            if (input.hasNextInt()) {
                viveMismaPoblacion = input.nextInt();
                if (viveMismaPoblacion == 1) {
                    puntos += PUNTAJE_VIVE_MISMA_POBLACION;
                    System.out.println("El niño vive cerca del centro. Puntos actuales: " + puntos);
                } else if (viveMismaPoblacion == 0) {
                    System.out.println("El niño no vive cerca dell centro. Puntos actuales: " + puntos);
                } else {
                    System.out.println("ERROR. Solo puede responder con 1 para indicar 'Sí' y con 0 para indicar No.");
                    System.out.println("¿Vive cerca de la zona donde se ubica la escuela? (1[Sí]/0[No])");
                    continue;
                }
                repetir = false;
            } else {
                System.out.println("ERROR. Solo puede responder con un número entero 1 o 0");
                System.out.println("¿Vive cerca de la zona donde se ubica la escuela? (1[Sí]/0[No])");
                input.next();
            }
        }
        System.out.println("¿Alguno de los padres trabaja cerca de donde se ubica la escuela? (1[Sí]/0[No])");
        repetir = true;
        while (repetir) {
            if (input.hasNextInt()) {
                padresTrabajanMismaPoblacion = input.nextInt();
                if (padresTrabajanMismaPoblacion == 1) {
                    puntos += PUNTAJE_PADRE_TRABAJA;
                    System.out.println("Los padres del niño trabajan cerca del centro. Puntos actuales: " + puntos);
                } else if (padresTrabajanMismaPoblacion == 0) {
                    System.out.println("Los padres del niño no trabajan cerca del centro. Puntos actuales: " + puntos);
                } else {
                    System.out.println("ERROR. Solo puede responder con 1 para indicar 'Sí' y con 0 para indicar No.");
                    System.out.println("¿Alguno de los padres trabaja cerca de donde se ubica la escuela? (1[Sí]/0[No])");
                    continue;
                }
                repetir = false;
            } else {
                System.out.println("ERROR. Solo puede responder con un número entero 1 o 0");
                System.out.println("¿Alguno de los padres trabaja cerca de donde se ubica la escuela? (1[Sí]/0[No])");
                input.next();
            }
        }
        System.out.println("¿Tiene el niño alguna discapacidad o enfermedad crónica? (1[Sí]/0[No])");
        repetir = true;
        while (repetir) {
            if (input.hasNextInt()) {
                tieneDiscapacidad = input.nextInt();
                if (tieneDiscapacidad == 1) {
                    puntos += PUNTAJE_DISCAPACIDAD;
                    System.out.println("El niño tiene alguna discapacidad o enfermedad crónica. Puntos actuales: " + puntos);
                } else if (tieneDiscapacidad == 0) {
                    System.out.println("El niño no tiene alguna discapacidad o enfermedad crónica. Puntos actuales: " + puntos);
                } else {
                    System.out.println("ERROR. Solo puede responder con 1 para indicar 'Sí' y con 0 para indicar No.");
                    System.out.println("¿Tiene el niño alguna discapacidad o enfermedad crónica? (1[Sí]/0[No])");
                    continue;
                }
                repetir = false;
            } else {
                System.out.println("ERROR. Solo puede responder con un número entero 1 o 0");
                System.out.println("¿Tiene el niño alguna discapacidad o enfermedad crónica? (1[Sí]/0[No])");
                input.next();
            }
        }
        System.out.println("¿Son familia numerosa o monoparental? (1[Sí]/0[No])");
        repetir = true;
        while (repetir) {
            if (input.hasNextInt()) {
                esFamiliaNumerosa = input.nextInt();
                if (esFamiliaNumerosa == 1) {
                    puntos += PUNTAJE_FAMILIA_NUMEROSA;
                    System.out.println("El niño está en una familia numerosa o monoparental. Puntos actuales: " + puntos);
                } else if (esFamiliaNumerosa == 0) {
                    System.out.println("El niño no está en una familia numerosa o monoparental. Puntos actuales: " + puntos);
                } else {
                    System.out.println("ERROR. Solo puede responder con 1 para indicar 'Sí' y con 0 para indicar No.");
                    System.out.println("¿Son familia numerosa o monoparental? (1[Sí]/0[No])");
                    continue;
                }
                repetir = false;
            } else {
                System.out.println("ERROR. Solo puede responder con un número entero 1 o 0");
                System.out.println("¿Son familia numerosa o monoparental? (1[Sí]/0[No])");
                input.next();
            }
        }
        System.out.println("¿Algún familiar es ex-alumno del centro? (1[Sí]/0[No])");
        repetir = true;
        while (repetir) {
            if (input.hasNextInt()) {
                familiarEscolarizado = input.nextInt();
                if (familiarEscolarizado == 1) {
                    puntos += PUNTAJE_FAMILIAR_ESCOLARIZADO;
                    System.out.println("Algún familiar ya ha estado en este centro. Puntos actuales: " + puntos);
                } else if (familiarEscolarizado == 0) {
                    System.out.println("Ningún familiar ya ha estado en este centro. Puntos actuales: " + puntos);
                } else {
                    System.out.println("ERROR. Solo puede responder con 1 para indicar 'Sí' y con 0 para indicar No.");
                    System.out.println("¿Algún familiar es ex-alumno del centro? (1[Sí]/0[No])");
                    continue;
                }
                repetir = false;
            } else {
                System.out.println("ERROR. Solo puede responder con un número entero 1 o 0");
                System.out.println("¿Algún familiar es ex-alumno del centro? (1[Sí]/0[No])");
                input.next();
            }
        }

        System.out.println("Alumno con número de registro " + numRegistro + " inscrito exitosamente con " + puntos + " puntos");

        input.close();
    }
}