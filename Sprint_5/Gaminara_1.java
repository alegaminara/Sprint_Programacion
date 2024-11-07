public class Gaminara_1 {
    public static void main(String[] args) {
        int edad, curs, cicle;

        curs = 0; 
        cicle = 0;
        edad = 10;

        switch (edad) {
            case 3:
                System.out.println("Eres muy pequeño");
                break;
            case 6:
                cicle = 0;
                break;
            case 7:
                cicle = 1;
                curs = 1; 
                System.out.println("El niño está en 1er curso");
                break;
                case 8:
                cicle = 1;
                curs = 2;
                System.out.println("El niño está en 2ºcurso");
                break;
                case 9:
                cicle = 2;
                curs = 3;
                System.out.println("El niño está en 3er curso");
                break;
                case 10:
                cicle = 2;
                curs = 4;
                System.out.println("El niño está en 4º curso");
                break;
                case 11:
                cicle = 3;
                curs = 5;
                System.out.println("El niño está en 5º curso");
                break;
                case 12:
                cicle = 3;
                curs = 6;
                System.out.println("El niño está en 6º curso");
                break;
        
            default:
                break;
        }
        
        switch (cicle) {
            case 0:
                System.out.println("El niño está en educación infantil");
                break;
            case 1:
                System.out.println("El niño está en educación primária. Ciclo inicial");
                break;
            case 2:
                System.out.println("El niño está en educación primária. Ciclo medio");
                break;
            case 3:
                System.out.println("El niño está en educación primária. Ciclo superior");
                break;
        
            default:
                break;
        }

    }
}