import java.time.LocalTime;
import java.util.LinkedList;

public class Cozinha 
{
    private LocalTime HoraDeAbertura;
    private LocalTime HoraDeFechamento;
    private String PratoPrincipal;
    private LinkedList<String> Ingredientes = new LinkedList<String>();
    private LinkedList<String> Funcionarios = new LinkedList<String>();


    public Cozinha(int horaDeAtertura, int horaDeFechamento, String pratoPrincipal)
    {
        this.HoraDeAbertura = LocalTime.of(horaDeAtertura, 0);
        this.HoraDeFechamento = LocalTime.of(horaDeFechamento, 0);
        this.PratoPrincipal = pratoPrincipal;
    }    

    public Cozinha(LinkedList<String> ingredientes , LinkedList<String> funcionarios, LinkedList<String> atividades)
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

    public LinkedList<String> ObterListaDeIngredientes()
    {
        return this.Ingredientes;
    }

    public LinkedList<String> ObterListaDeFuncionarios()
    {
        return this.Funcionarios;
    }
}
