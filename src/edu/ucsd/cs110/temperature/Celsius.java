package edu.ucsd.cs110.temperature;
public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        Celsius c = this;
        return c;
    }

    @Override
    public Temperature toFahrenheit() {
        Celsius c = this;
        float val = c.getValue();
        val = (float) ((val * 1.8) + 32);

        Fahrenheit f = new Fahrenheit(val);

        return f;
    }

    public String toString()
    {
        String str = "" + this.getValue();
        str += " C";
        return str;
    }
}