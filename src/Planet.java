import java.util.Scanner;

public class Planet implements printPlanetInformation,calculateGasPrice
{
    private int planetAge;
    private double averageTemperature;
    private String craterType;
    private String climateConditions;
    private String planetName;
    private int diameter;
    private double amountOfGasRequiredToReachThePlanet;
    private double gasPriceRatio;
    private double gasPrice;
    private double spaceshipFuelTankVolume = 120.0;
    private double amountOfGasolineToBePurchased;
    private double instantGasTankValue;


    public double getGasPrice(){return gasPrice;}
    public void setGasPrice(Double gasPrice){this.gasPrice = gasPrice;}

    public double getInstantGasTankValue(){ return this.instantGasTankValue;}

    public void setInstantGasTankValue(Double gasValue){ this.instantGasTankValue = gasValue;}

    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public int getPlanetAge()
    {
        return planetAge;
    }

    public void setPlanetAge(int planetAge)
    {
        this.planetAge = planetAge;
    }

    public double getAverageTemperature()
    {
        return averageTemperature;
    }

    public void setAverageTemperature(double averageTemperature)
    {
        this.averageTemperature = averageTemperature;
    }

    public String getCraterType()
    {
        return craterType;
    }

    public void setCraterType(String craterType)
    {
        this.craterType = craterType;
    }

    public String getClimateConditions()
    {
        return climateConditions;
    }

    public void setClimateConditions(String climateConditions)
    {
        this.climateConditions = climateConditions;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public double getGasPriceRatio() {
        return gasPriceRatio;
    }

    public void setGasPriceRatio(double gasPriceRatio) {
        this.gasPriceRatio = gasPriceRatio;
    }

    public double getAmountOfGasRequiredToReachThePlanet() {
        return amountOfGasRequiredToReachThePlanet;
    }

    public void setAmountOfGasRequiredToReachThePlanet(double amountOfGasRequiredToReachThePlanet) {
        this.amountOfGasRequiredToReachThePlanet = amountOfGasRequiredToReachThePlanet;
    }

    @Override
    public void printPlanetInformation() {
        System.out.println("PLANET INFORMATIONS");
        System.out.println("---------------------");
        System.out.println(
                "Planet Name                : " + getPlanetName()         + "\n" +
                "Planet Age                 : " + getPlanetAge()          + "\n" +
                "Planet Crater Type         : " + getCraterType()         + "\n" +
                "Planet Climate Conditions  : " + getClimateConditions()  + "\n" +
                "Planet Average Temperature : " + getAverageTemperature() + " Fahrenheit "    +"\n" +
                "Planet Diameter Value      : " + getDiameter()           + "\n" +
                "Gasoline Filling Rate      : " + getGasPriceRatio()      + "\n" +
                "Amount of Gas Required to Reach The Planet " + getPlanetName() + " : " + getAmountOfGasRequiredToReachThePlanet() + "\n"
        );
    }

    @Override
    public void calculateGasPrice()
    {
        Scanner calculateGasObject = new Scanner(System.in);
        System.out.println("The Amount of Gasoline In Your Tank : " + instantGasTankValue);
        System.out.println("\n\nHow Many Liters of Gasoline Do You Want to Buy ? : ");
        amountOfGasolineToBePurchased = calculateGasObject.nextDouble();
        if (amountOfGasolineToBePurchased > spaceshipFuelTankVolume )
        {
            System.out.println("The Amount of Gasoline You Want to Buy Is More Than The Volume of The Tank !");
            System.out.println("We will Automatically Fill Your Tank :) ");
            amountOfGasolineToBePurchased = spaceshipFuelTankVolume - instantGasTankValue;
            this.instantGasTankValue += amountOfGasRequiredToReachThePlanet;
            setInstantGasTankValue(instantGasTankValue);
            this.gasPrice = gasPriceRatio * amountOfGasolineToBePurchased;
            setGasPrice(gasPrice);

        }
        else
        {
            this.instantGasTankValue += amountOfGasRequiredToReachThePlanet;
            setInstantGasTankValue(instantGasTankValue);
            this.gasPrice = gasPriceRatio * amountOfGasolineToBePurchased;
            setGasPrice(gasPrice);
        }
    }

    class UserInformationSystem
    {
        public UserInformationSystem()
        {
            System.out.println("\n\nWELCOME TO INTERPLANETARY JOURNEY ! ");
            System.out.println("MAKE SURE YOU HAVE SUFFICIENT GASOLINE TO REACH THE PLANET YOU WANT TO TRAVEL!!! \n \n");
            System.out.println("AREA CODES OF THE PLANETS ");
            System.out.println("-----------------------------\n");
            System.out.println("""
                    TITAN   : 8359
                    ALFHEIM : 4514
                    LUNA    : 2772
                    RHEA    : 1347
                    MIDGARD : 9026\n\n\n""");
        }

        public UserInformationSystem(int errorCode)
        {
            System.out.println("THERE ARE NO PLANETS IN THIS CODE REFERENCE NAME !!\n\n");
            System.out.println("ERROR CODE : " + errorCode);

        }
    }

    public void WelcomeToThePlanet(){}
}
