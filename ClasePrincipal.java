import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;



public class ClasePrincipal {
	public static void main(String[] args) {
		String a1= "Hola me llamo Manolo.";
		String a2="Hola";
		String a3= "Hola me llamo Jose";
		String a4= "Adios";
		
		List < String > lista = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<String> pred = x -> (x.length()>10)?true:false;

		lista.stream().filter(pred).forEach(System.out::println);
		
		Function<String , Integer> funcion= a -> a.length();
		lista.stream().map(funcion).forEach(x->System.out.println(x));
		
 	}
}
