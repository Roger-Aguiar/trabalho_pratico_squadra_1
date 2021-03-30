import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    Ingrediente ingrediente = new Ingrediente();
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> funcionarios = new ArrayList<String>();
    ArrayList<String> atividades = new ArrayList<String>();

    public static void main(String[] args)
    {     
        Main metodos = new Main(); 
        Scanner cozinha = new Scanner(System.in);  
        
        System.out.println("Cozinha da Squadra\n");

        System.out.printf("Digite a quantidade de cozinhas que você deseja criar: ");
        int quantidadeDeCozinhas = cozinha.nextInt();
        
        for(int contadorDeCozinha = 0; contadorDeCozinha < quantidadeDeCozinhas; contadorDeCozinha++)
        {
            metodos.CriarCozinha();                         
            System.out.println("\n======================================================================================\n");
        }
        cozinha.close();                                    
    }

    public void CriarCozinha()
    {  
        Main metodos = new Main();

        System.out.printf("Digite o nome da cozinha: ");
        String nomeCozinha = scanner.next();
        
        System.out.printf("Digite o horário de abertura: ");
        int horarioDeAbertura = scanner.nextInt();
        
        System.out.printf("Digite o horário de fechamento: ");
        int horarioDeFechamento = scanner.nextInt();
        
        System.out.printf("Digite o prato principal: ");
        String pratoPrincipal = scanner.next();

        Cozinha cozinha = new Cozinha(horarioDeAbertura, horarioDeFechamento, pratoPrincipal);

        ArrayList<String> ingredientes = metodos.ObterIngredientes();
        metodos.ObterFuncionarios();

        System.out.println("\n======================================================================================\n");

        System.out.println("Cozinha: " + nomeCozinha + "\nHorário de funcionamento: De " + 
                            cozinha.ObterHoraDeAbertura() +
                            "h às " + cozinha.ObterHoraDeFechamento() + "h\nPrato principal: " + 
                            cozinha.ObterPratoPrincipal());   

        metodos.DisplayIngredientes(ingredientes);        
        ExibirFuncionariosEAtividades(funcionarios, atividades);                  
    }

    public void ObterFuncionarios()
    {
        System.out.println();
        
        System.out.printf("Digite o número de funcionários: ");
        int numeroDeFuncionarios = scanner.nextInt();
        System.out.printf("Digite a atividade dos funcionários: ");
        String atividade = scanner.next();

        for(int numeroFuncionario = 0; numeroFuncionario < numeroDeFuncionarios; numeroFuncionario++)
        {
            System.out.printf("Digite o nome do funcionário: ");
            Funcionario novoFuncionario = new Funcionario(scanner.next(), atividade);
            funcionarios.add(novoFuncionario.ObterNomeFuncionario());
            atividades.add(novoFuncionario.ObterAtividadeFuncionario());
        }    
               
    }

    public static void ExibirFuncionariosEAtividades(ArrayList<String> funcionarios, ArrayList<String> atividades)
    {
        System.out.println();
        for(int i = 0; i < funcionarios.size(); i++)
        {
            System.out.println("Funcionário: " + funcionarios.get(i) + "\tAtividade: " + atividades.get(i));
        }
    }

    public void DisplayIngredientes(ArrayList<String> ingredientes)
    {        
        System.out.println();
        for(int i = 0; i < ingredientes.size(); i++)
        {
            System.out.println(ingredientes.get(i) + "\t\tValido até " + ingrediente.ObterDataDeValidade());
        }
    }

    public ArrayList<String> ObterIngredientes()
    {
        ArrayList<String> ingredientes = new ArrayList<String>();
                        
        System.out.printf("\nDigite a quantidade de ingredientes: ");
        int quantidadeDeIngredientes = scanner.nextInt();
        System.out.println();

        for(int proximoIngrediente = 0; proximoIngrediente < quantidadeDeIngredientes; proximoIngrediente++)
        {
            System.out.printf("Digite o nome do ingrediente: ");                               
            ingredientes.add(scanner.next());
        }
        
        return ingredientes;
    }
}