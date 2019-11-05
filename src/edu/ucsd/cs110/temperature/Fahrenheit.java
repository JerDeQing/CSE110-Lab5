package edu.ucsd.cs110.temperature;
public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        Fahrenheit f = this;
        float val = f.getValue();
        val = (float) ((val - 32) / 1.8);
        Celsius c = new Celsius(val);
        return c;
    }

    @Override
    public Temperature toFahrenheit() {
        Fahrenheit f = this;
        return f;
    }

    public String toString()
    {
        String str = "" + this.getValue();
        str += " F";
        return str;
    }
}