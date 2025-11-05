import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        // arvoreSet();
        arvoreMap();
    }

    public static void arvoreSet(){
        TreeSet<Integer> arv = new TreeSet<>();

        arv.add(8);
        arv.add(4);
        arv.add(6);
        arv.add(3);
        arv.add(5);
        arv.add(10);
        arv.add(10);
        arv.add(12);
        arv.add(13);

        System.out.println("Elementos: "+ arv);

        arv.add(4);

        boolean existe = arv.contains(7);
        System.out.println("Existe: "+existe);

        System.out.println("Primeiro elemento: " + arv.first());
        System.out.println("Ultimo elemento: " + arv.last());

        System.out.println(">=5: " + arv.ceiling(5));

        System.out.println("<=5: " + arv.floor(5));

        System.out.println(">5: " + arv.higher(5));

        System.out.println("<5: " + arv.lower(5));

        System.out.println("Remove o primeiro: " + arv.pollFirst());
        System.out.println(arv);

        System.out.println("Remove o ultimo: " + arv.pollLast());
        System.out.println(arv);

        arv.remove(5);
        System.out.println(arv);

        System.out.println("Tamanho da arvore" + arv.size());

        arv.clear();
        System.out.println("Está vazia? "+arv.isEmpty());
    }

    public static void arvoreMap(){
        Map<Integer,String> alunos = new TreeMap<>();
        
        alunos.put(292123, "Michael");
        alunos.put(292124, "Leo");
        alunos.put(292125, "Edu");
        alunos.put(292126, "Davi");

        alunos.forEach((matricula, nome) -> System.out.println("Matricula: "+matricula+" Nome: "+nome));

        System.out.println(alunos.get(292126));
    }
}
