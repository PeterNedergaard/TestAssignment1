public class TempConverter {

    public double convertFtoC(double fahrenheit){
        return (fahrenheit - 32) * 5 / 9;
    }

    public double convertCtoF(double celsius){
        return celsius * 9 / 5 + 32;
    }

}
