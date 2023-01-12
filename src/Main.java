public class Main {
    public static void main(String[] args) {

        /**
         * Seccion 4
         * sentencias de control
         */

        //if
        int numeroIf = 0;
        if (numeroIf>0){
            System.out.println("positivo");
        } else if (numeroIf==0) {
            System.out.println("0");
        }else{
            System.out.println("negativo");
        }
        int numeroWhile=0;

        //while
        while (numeroWhile<3){
            System.out.println("While se ejecuto "+(numeroWhile+1)+" veces");
            numeroWhile++;
        }

        //do while
        int doWhile = 0;
        do {
            System.out.println("Do while se ejecuto "+(doWhile+1)+" veces");
        }while (false);

        //for
        for (int numeroFor = 0; numeroFor <=3; numeroFor++) {
            System.out.println("For se ejecuto "+ (numeroFor+1)+ " veces");
        }

        //Switch
        int estacion=0;
        switch (estacion){
            case 1:
                System.out.println("primavera");
                break;
            case 2:
                System.out.println("verano");

                break;
            case 3:
                System.out.println("otoño");
                break;
            case 4:
                System.out.println("invierno");
                break;
            default:
                System.out.println("no es una estación");
                break;
        }

    }
}