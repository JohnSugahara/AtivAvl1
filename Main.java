import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {

        int esc = 0;
        int cont = 0;
        int x;
        String y;
        String z;
        int not1 = 1;
        float not2 = 1;
        float calculaponto;


        Scanner entradaint = new Scanner(System.in);
        Scanner entradastring = new Scanner(System.in);
        Scanner entradaint2 = new Scanner(System.in);
        Scanner entradastring2 = new Scanner(System.in);

        Rapper rappers[] = new Rapper[20];
        Rapper r1 = new Rapper("jose", 0, 12, "Dourado");
        
        rappers[0] = r1;

        Microfone microfone = new Microfone();
        Arena arena = new Arena();

        System.out.println("Bem vido a batalha de Rap!");
        


        while(esc != 1)
        {
            System.out.println("Adicionar competidor:");


            System.out.println("Idade:");
            x = entradaint.nextInt();
            rappers[cont].idade = x;


            System.out.println("Nome:");
            y = entradastring.nextLine();
            rappers[cont].nome = y;

            System.out.println("Material do Microfone:");
            z= entradastring2.nextLine();
            rappers[cont].microfone.material = z;

            if(z == "Dourado" || z == "dourado")
            {
                not2 = 1.75F;
            }
            else if (z == "Madeira" || z == "madeira")
            {
                not2 = 1.5F;
            }
            else if (z == "Plastico" || z == "plastico")
            {
                not2 = 1.25F;
            }

            Random r = new Random();
            not1 = r.nextInt(10);

            if (not1 <= 4)
            {
                System.out.println("O Rapper "+ rappers[cont].nome + " tropeçou no palco!");

            }
            else if(not1 > 4 && not1 <= 9 )
            {
                System.out.println("O Rapper "+ rappers[cont].nome + " foi muito bem!");
            }
            else if(not1 == 10 )
            {
                System.out.println("O Rapper "+ rappers[cont].nome + " perfeito. até deu um mortal!");
            }

            calculaponto = not1*not2;

            rappers[cont].nota = calculaponto;




            if (cont >= 2)
            {
                System.out.println("Deseja Iniciar a competição?: Sim(1) | Adicionar novo competidor(2)");
                esc = entradaint2.nextInt();
            }

            cont += 1;
        }


        System.out.println("HORA DE APRESENTAR OS "+ cont +" PARTICIPANTES DESTA NOITE!!!!");
        
        for (int i = 0; i < cont; i++)
        {
            arena.mostraInfo();

        }

        System.out.println("A COMPETIÇÃO ACIRRADA TERMINOU!! AQUI ESTÁ O RANKING!!");

        arena.ranking();


        
     








        




    }
}
