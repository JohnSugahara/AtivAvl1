public class Arena {

    String nome;
    String lugar;
    boolean i;
    int j;
    Rapper rappers[];
    boolean dourado = false;
    int maior = -1;


    void mostraInfo()
    {

        for (j = 0; j < rappers.length; j++)
        {
            if (rappers[j] != null)
            {
                rappers[j].mostraInfo();

            }

        }


    }

    void microfoneDou()
    {
        if (rappers[j].microfone.material == "Dourado")
        {
            System.out.println("ELE TEM UM MICROFONE DOURADO?! ");
        }
        

    }

    void ranking()
    {
        for (j = 0; j < rappers.length; j++)
        {
            if (rappers[j] != null)
            {
                System.out.println("PARTICIPANTE: "+ rappers[j].nome + " TEM O TOTAL DE PONTOS DE: "+ rappers[j].nota);
            }
        }
    }
    
}
