public class Alfheim extends Planet
{
    public Alfheim()
    {
        try{Thread.sleep(1000);}catch (Exception e){}

        setPlanetName("Alfheim");
        setPlanetAge(765301040);             // 765 Million yo.
        setCraterType("Hellas Planitia");    // Crater Type of Titan Planet
        setClimateConditions("Theia");       // Ouranos Mnemosyne Hyperion Theia Antares
        setAverageTemperature(-320);         // -195 celcius
        setDiameter(32548);
        setGasPriceRatio(9.6);
        setAmountOfGasRequiredToReachThePlanet(110);

        setInstantGasTankValue(30.0);


        printPlanetInformation();
    }

    public void WelcomeToThePlanet(String s)
    {
        System.out.println("\n\nWELCOME TO THE PLANET " + s);
    }
}
