public class Titan extends Planet
{

    public Titan( )
    {
        try{Thread.sleep(1000);}catch (Exception e){}

        setPlanetName("Titan");
        setPlanetAge(450300011); // 4 Million yo.
        setCraterType("Mead");  // Crater Type of Titan Planet
        setClimateConditions("Gaia"); //Ouranos Mnemosyne Hyperion Theia Antares
        setAverageTemperature(-85);  // -65 celcius
        setDiameter(67779);
        setGasPriceRatio(6.5);
        setAmountOfGasRequiredToReachThePlanet(60);

        setInstantGasTankValue(30.0);//Example

        printPlanetInformation();
    }

    public void WelcomeToThePlanet(String s)
    {
            System.out.println("\n\nWELCOME TO THE PLANET " + s);
    }

}
