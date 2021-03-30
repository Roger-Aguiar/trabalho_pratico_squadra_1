import java.util.ArrayList;

public class CozinhaItaliana implements ICozinha 
{
    ArrayList<String> funcionarios = new ArrayList<String>();   
    ArrayList<String> ingredientes = new ArrayList<String>();

    @Override
    public void CriarCozinha() 
    {        
        ingredientes.add("Molho");
        ingredientes.add("Macarrão");
        ingredientes.add("Carne");
        
        Funcionario funcionario1 = new Funcionario("Rafaela", "Chefe de cozinha");
        Funcionario funcionario2 = new Funcionario("Ana", "Cozinheira");
        
        
        funcionarios.add(funcionario1.ObterNomeFuncionario() + "\t\tAtividade: " + funcionario1.ObterAtividadeFuncionario());
        funcionarios.add(funcionario2.ObterNomeFuncionario() + "\t\tAtividade: " + funcionario1.ObterAtividadeFuncionario());
                
        Cozinha cozinha = new Cozinha(13, 22, "Yakissoba", ingredientes, funcionarios); 
        this.ExibirCozinha(cozinha);       
        
    }

    @Override
    public void ExibirCozinha(Cozinha cozinha) 
    {
        String funcionariosEatividades = this.ObterFuncionarios();
        String listaDeIngredientes = this.ObterIngredientes();

        System.out.println("Cozinha Italiana" + "\nHorário de funcionamento: De " + 
                            cozinha.ObterHoraDeAbertura() + "h às " + cozinha.ObterHoraDeFechamento() + "h" +
                            "\nPrato Principal: " + cozinha.ObterPratoPrincipal() +
                            "\n\nIngredientes\n\n" + listaDeIngredientes +
                            "\n\nFuncionários\n\n" + funcionariosEatividades); 
        
    }

    @Override
    public String ObterFuncionarios() 
    {
        String layout = "";

        for(int i = 0; i < this.funcionarios.size(); i++)
        {
            layout += funcionarios.get(i) + "\n";
        }
        return layout;
    }

    @Override
    public String ObterIngredientes() 
    {
        String ingredientes = "";

        for(int i = 0; i < this.ingredientes.size(); i++)
        {
            Ingrediente dataDeValidade = new Ingrediente();
            ingredientes += this.ingredientes.get(i) + "\t\tData de validade: " + dataDeValidade.ObterDataDeValidade() + "\n";
        }

        return ingredientes;
    }
    
}
