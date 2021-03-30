import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ingrediente 
{
    private String Nome;
    private LocalDate DataDeValidade;

    public Ingrediente()
    {        
        this.DataDeValidade = LocalDate.now();
        this.DataDeValidade = this.DataDeValidade.plusYears(2);
    }
    
    public String ObterNome()
    {
        return this.Nome;
    }

    public String ObterDataDeValidade()
    {
        DateTimeFormatter DataDeValidadeFormatada = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return DataDeValidade.format(DataDeValidadeFormatada);
    }
    
}
