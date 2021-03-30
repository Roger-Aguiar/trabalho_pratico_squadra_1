import java.time.LocalTime;
import java.util.ArrayList;

public class Cozinha 
{
    private LocalTime HoraDeAbertura;
    private LocalTime HoraDeFechamento;
    private String PratoPrincipal;

    private ArrayList<String> Ingredientes;
    private ArrayList<String> Funcionarios;


    public Cozinha(int horaDeAtertura, int horaDeFechamento, String pratoPrincipal,
                   ArrayList<String> ingredientes , ArrayList<String> funcionarios)
    {
        this.HoraDeAbertura = LocalTime.of(horaDeAtertura, 0);
        this.HoraDeFechamento = LocalTime.of(horaDeFechamento, 0);
        this.PratoPrincipal = pratoPrincipal;
        this.Ingredientes = ingredientes;
        this.Funcionarios = funcionarios;
    }    

    public Cozinha()
    {
        
    }


    public LocalTime ObterHoraDeAbertura()
    {
        return this.HoraDeAbertura;
    }

    public LocalTime ObterHoraDeFechamento()
    {
        return this.HoraDeFechamento;
    }

    public String ObterPratoPrincipal()
    {
        return this.PratoPrincipal;
    }

    public ArrayList<String> ObterListaDeIngredientes()
    {
        return this.Ingredientes;
    }

    public ArrayList<String> ObterListaDeFuncionarios()
    {
        return this.Funcionarios;
    }
}
