public class Midgard extends Planet //Dünya
{
    public Midgard()
    {
        try{Thread.sleep(1000);}catch (Exception e){}

        setPlanetName("Midgard");
        setPlanetAge(454356789); // 4 Million yo.
        setCraterType("Vredefort");  // Crater Type of Titan Planet
        setClimateConditions("Mnemosyne"); //Ouranos Mnemosyne Hyperion Theia Antares
        setAverageTemperature(59);  // 15 celcius
        setDiameter(12742);
        setGasPriceRatio(7.8);
        setAmountOfGasRequiredToReachThePlanet(90);

        setInstantGasTankValue(30.0);


        printPlanetInformation();
    }
    public void WelcomeToThePlanet(String s)
    {
        System.out.println("\n\nWELCOME TO THE PLANET " + s);
    }
}
