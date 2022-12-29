import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner pC = new Scanner(System.in); // pC Means "Planet Choice"
        int choice;
        Planet planet = new Planet();
        Planet.UserInformationSystem info = planet.new UserInformationSystem();
        Titan n1 = new Titan();
        Alfheim n2 = new Alfheim();
        Luna n3 = new Luna();
        Rhea n4 = new Rhea();
        Midgard n5 = new Midgard();


        System.out.println("\n\n\nENTER THE AREA CODE OF THE PLANET YOU WANT TO TRAVEL ON BELOW");
        System.out.println("---------------------------------------------------------------------\n");
        System.out.println("PLANET : ");
        choice = pC.nextInt();


        switch (choice)
        {
            case 8359:
                while (Boolean.TRUE)
                {
                    if (n1.getInstantGasTankValue() < 60)
                    {
                        System.out.println("\n\nTo Go to Planet TITAN, The Fuel Tank Must Be At Least 60 Liter!");
                        n1.calculateGasPrice();

                    }
                    else
                    {
                        n1.WelcomeToThePlanet("TITAN");
                        System.out.println("\n\nGASOLINE FEE YOU SPENT ON THE JOURNEY : " + n1.getGasPrice());
                        System.out.println("-------------------------------------------");

                        break;
                    }


                }

                break;

            case 4514:
                while (Boolean.TRUE)
                {
                    if (n2.getInstantGasTankValue() < 110)
                    {
                        System.out.println("\n\nTo Go to Planet ALFHEIM, The Fuel Tank Must Be At Least 110 Liter!");
                        n2.calculateGasPrice();

                    }
                    else
                    {
                        n2.WelcomeToThePlanet("ALFHEIM");
                        System.out.println("\n\nGASOLINE FEE YOU SPENT ON THE JOURNEY : " + n2.getGasPrice());
                        System.out.println("-------------------------------------------");

                        break;
                    }
                }

                break;


            case 2772:
                while (Boolean.TRUE)
                {
                    if (n3.getInstantGasTankValue()< 40)
                    {
                        System.out.println("\n\nTo Go to Planet LUNA, The Fuel Tank Must Be At Least 40 Liter!");
                        n3.calculateGasPrice();

                    }
                    else
                    {
                        n3.WelcomeToThePlanet("LUNA");
                        System.out.println("\n\nGASOLINE FEE YOU SPENT ON THE JOURNEY : " + n3.getGasPrice());
                        System.out.println("-------------------------------------------");

                        break;
                    }
                }
                break;

            case 1347:
                while (Boolean.TRUE)
                {
                    if (n4.getInstantGasTankValue() < 70)
                    {
                        System.out.println("\n\nTo Go to Planet RHEA, The Fuel Tank Must Be At Least 70 Liter!");
                        n4.calculateGasPrice();

                    }
                    else
                    {
                        n4.WelcomeToThePlanet("RHEA");
                        System.out.println("\n\nGASOLINE FEE YOU SPENT ON THE JOURNEY : " + n4.getGasPrice());
                        System.out.println("-------------------------------------------");

                        break;
                    }
                }
                break;

            case 9026:
                while (Boolean.TRUE)
                {
                    if (n5.getInstantGasTankValue() < 90)
                    {
                        System.out.println("\n\nTo Go to Planet MIDGARD, The Fuel Tank Must Be At Least 90 Liter!");
                        n5.calculateGasPrice();

                    }
                    else
                    {
                        n1.WelcomeToThePlanet("MIDGARD");
                        System.out.println("\n\nGASOLINE FEE YOU SPENT ON THE JOURNEY : " + n5.getGasPrice());
                        System.out.println("-------------------------------------------");

                        break;
                    }
                }
                break;
            default:
                Planet.UserInformationSystem info2 = planet.new UserInformationSystem(404);
                break;

        }

        System.out.println("THANKS FOR THE JOURNEY!");
        System.exit(1);


    }
}