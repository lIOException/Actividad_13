import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Enero");
        lista.add("Febrero");
        lista.add("Marzo");
        lista.add("Abril");
        lista.add("Mayo");
        lista.add("Junio");
        lista.add("Julio");
        lista.add("Agosto");
        lista.add("Septiembre");
        lista.add("Octubre");
        lista.add("Noviembre");
        lista.add("Diciembre");

        //Clase anonima alfabetica
        lista.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println("Clase anonima alfabetica");
        imprimirLista(lista);

        //Expresion Lambda alfabetica
        lista.sort(((o1, o2) -> o1.compareTo(o2)));
        System.out.println("Expresion Lambda alfabetica");
        imprimirLista(lista);

        //Metodo de referencia alfabetica
        lista.sort(Main::metodoReferenciaAlfabetico);
        System.out.println("Metodo de referencia alfabetica");
        imprimirLista(lista);

        //Clase anonima longitud
        lista.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1.length() > o2.length()) ? 1 : (o1.length() < o2.length()) ? -1 : 0;
            }
        });
        System.out.println("Clase anonima longitud");
        imprimirLista(lista);

        //Expresion Lambda alfabetica
        lista.sort((o1, o2) -> (o1.length() > o2.length()) ? 1 : (o1.length() < o2.length()) ? -1 : 0);
        System.out.println("Expresion Lambda alfabetica");
        imprimirLista(lista);

        //Metodo de referencia longitud
        lista.sort(Main::metodoReferenciaLongitud);
        System.out.println("Metodo de referencia longitud");
        imprimirLista(lista);
    }

    public static int metodoReferenciaAlfabetico(String o1, String o2){
        return o1.compareTo(o2);
    }
    public static int metodoReferenciaLongitud(String o1, String o2){
        return (o1.length() > o2.length()) ? 1 : (o1.length() < o2.length()) ? -1 : 0;
    }
    
    public static void imprimirLista(ArrayList<String> lista){
        System.out.println("================");
        for (String elemento : lista){
            System.out.println(elemento);
        }
    }
}