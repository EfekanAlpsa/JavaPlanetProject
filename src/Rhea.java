public class Rhea extends Planet
{
    public Rhea()
    {
        try{Thread.sleep(1000);}catch (Exception e){}

        setPlanetName("Rhea");
        setPlanetAge(700349024); // 700 Million yo.
        setCraterType("Kerwan");  // Crater Type of Titan Planet
        setClimateConditions("Ouranos"); //Ouranos Mnemosyne Hyperion Theia Antares
        setAverageTemperature(-10);  // -23 celcius
        setDiameter(239156);
        setGasPriceRatio(8.1);
        setAmountOfGasRequiredToReachThePlanet(70);

        setInstantGasTankValue(30.0);


        printPlanetInformation();
    }
    public void WelcomeToThePlanet(String s)
    {
        System.out.println("\n\nWELCOME TO THE PLANET " + s);
    }
}
