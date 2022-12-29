public class Luna extends Planet
{
    public Luna()
    {
        try{Thread.sleep(1000);}catch (Exception e){}

        setPlanetName("Luna");
        setPlanetAge(85124803); // 85 Million yo.
        setCraterType("Veneneia");  // Crater Type of Titan Planet
        setClimateConditions("Antares"); //Ouranos Mnemosyne Hyperion Theia Antares
        setAverageTemperature(333);  // 167 celcius
        setDiameter(48956);
        setGasPriceRatio(3.2);
        setAmountOfGasRequiredToReachThePlanet(40);

        setInstantGasTankValue(30.0);


        printPlanetInformation();
    }
    public void WelcomeToThePlanet(String s)
    {
        System.out.println("\n\nWELCOME TO THE PLANET " + s);
    }
}
