

public class Main
{
    public static void main(String[] args)
    {                  
        System.out.println("Cozinha da Squadra\n");

        CozinhaMineira cozinhaMineira = new CozinhaMineira();
        cozinhaMineira.CriarCozinha();

        System.out.println("==========================================================================================");
        
        CozinhaChinesa cozinhaChinesa = new CozinhaChinesa();
        cozinhaChinesa.CriarCozinha();                                        

        System.out.println("==========================================================================================");

        CozinhaItaliana cozinhaItaliana = new CozinhaItaliana();
        cozinhaItaliana.CriarCozinha();
    }    
}