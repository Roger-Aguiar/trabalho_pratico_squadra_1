import java.util.ArrayList;

public class CozinhaMineira implements ICozinha
{ 
    ArrayList<String> funcionarios = new ArrayList<String>();   
    ArrayList<String> ingredientes = new ArrayList<String>();

    @Override
    public void CriarCozinha() 
    {
        ingredientes.add("Feijão");
        ingredientes.add("Farinha");
        ingredientes.add("Arroz");
        ingredientes.add("Carne de Porco");
        ingredientes.add("Linguiça");

        Funcionario funcionario1 = new Funcionario("Roger", "Cozinheiro");
        Funcionario funcionario2 = new Funcionario("Maria", "Cozinheira");
        Funcionario funcionario3 = new Funcionario("João", "Chefe de cozinha");
        Funcionario funcionario4 = new Funcionario("José", "Lavador de pratos");

        funcionarios.add(funcionario1.ObterNomeFuncionario() + "\tAtividade: " + funcionario1.ObterAtividadeFuncionario());
        funcionarios.add(funcionario2.ObterNomeFuncionario() + "\tAtividade: " + funcionario1.ObterAtividadeFuncionario());
        funcionarios.add(funcionario3.ObterNomeFuncionario() + "\tAtividade: " + funcionario1.ObterAtividadeFuncionario());
        funcionarios.add(funcionario4.ObterNomeFuncionario() + "\tAtividade: " + funcionario1.ObterAtividadeFuncionario());


        Cozinha cozinha = new Cozinha(14, 20, "Feijoada", ingredientes, funcionarios); 
        this.ExibirCozinha(cozinha);       
    }

    @Override
    public void ExibirCozinha(Cozinha cozinha) 
    {
        String funcionariosEatividades = this.ObterFuncionarios();
        String listaDeIngredientes = this.ObterIngredientes();

        System.out.println("Cozinha Mineira" + "\nHorário de funcionamento: De " + 
                            cozinha.ObterHoraDeAbertura() + "h às " + cozinha.ObterHoraDeFechamento() + "h" +
                            "\nPrato Principal: " + cozinha.ObterPratoPrincipal() +
                            "\n\nIngredientes\n" + listaDeIngredientes +
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
        String ingredientes = null;

        for(int i = 0; i < this.ingredientes.size(); i++)
        {
            Ingrediente dataDeValidade = new Ingrediente();
            ingredientes += this.ingredientes.get(i) + "\t\tData de validade: " + dataDeValidade.ObterDataDeValidade() + "\n";
        }

        return ingredientes;
    }
    
}
