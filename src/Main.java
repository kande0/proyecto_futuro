public class Main {
    public static void main(String[] args) {
        System.out.println("Estudiante: " + args[0]);

        System.out.println(veredicto(args[2],args[1]));
    }
    private static String veredicto(String valor1, String valor2){
        if (valor1.equals(valor2)) {
            return "Bien. Pero una hora de estudio para cada m\u00f3dulo puede ser insuficiente.";
        }
        if (Integer.valueOf(valor1) > Integer.valueOf(valor2)){
            return "Poco tiempo de estudio. Debes dedicar m\u00e1s tiempo.";
        }
        return "Ideal. Trabajas los contenidos en casa.";
    }
}