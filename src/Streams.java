import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Streams {
    
    public List<String> main(String[] args) {
        
        System.out.println("Digite o nome da pessoa e seu genero  Pedro,Masculino");
        
        List<String> pessoas = new ArrayList<>();
        Boolean variavel = true;
        Scanner scanner = new Scanner(System.in);
        
        
        while (variavel) {
            
            String nome = scanner.nextLine();
            pessoas.add(nome);
            
            System.out.println("Deseja adicionar um novo nome? caso NÃO digite 0 caso queira basta escrever nome,genero");
            
            if (nome.equals("0"))
                variavel = false;
            
            
        }
        scanner.close();
        
       List<String> mulheres = filtrarMulheres(pessoas);
        
        
        System.out.println("\nLista de mulheres:");
        mulheres.forEach(System.out::println);
        return mulheres;
    }
    
     
        public List<String> filtrarMulheres(List<String> pessoas) {
            return pessoas.stream()
                    .filter(v -> v.toLowerCase().contains(",feminino"))
                    .map(v -> v.replace("(?i),feminino", ""))
                    .map(v -> v.replaceAll("(?i),feminino", ""))
                    .collect(Collectors.toList());
        }
    }
    