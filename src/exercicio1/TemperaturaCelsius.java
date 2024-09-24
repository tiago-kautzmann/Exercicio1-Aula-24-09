package exercicio1;

public class TemperaturaCelsius {

    private double valor;

    public double getValor(){
        return this.valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    public double obtemValorEmFahrenheit(){
        return this.valor * 1.8 + 32;
    }

    public double obtemValorEmKelvin(){
        return this.valor + 273.15;
    }

}



