public class Kelvin extends Temperatura{
    
    public Kelvin(double grausTemp) {
        super(grausTemp);
    }
    
    //CONVERTER KELVIN PARA CELSIUS
    public double paraCelsius(){
        return getGraus()-273.15;
    }
    
    //CONVERTER DE KELVIN PARA FAHRENHEIT
    public double paraFarenheit(){
        return ((getGraus()-273.15)*9/5)+32;
    }
}
