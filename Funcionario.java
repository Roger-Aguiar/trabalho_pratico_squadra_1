public class Funcionario 
{
    private String Nome;
    private String Atividade;

    public Funcionario(String nome, String atividade)
    {
        this.Nome = nome;
        this.Atividade = atividade;
    } 

    public String ObterNomeFuncionario()
    {
        return this.Nome;         
    }

    public String ObterAtividadeFuncionario()
    {
        return this.Atividade;
    }
}
