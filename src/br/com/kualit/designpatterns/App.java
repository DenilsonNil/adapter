package br.com.kualit.designpatterns;

public class App {

    public static void main(String[] args) {

        TemperatureClassAdapter classAdapter = new TemperatureClassAdapter();
        classAdapter.setValue(30);

        System.out.println(classAdapter.getValue());
        System.out.println(classAdapter.getValueInFahrenheit());

        Temperature temperature = new Temperature();

        TemperatureObjectAdapter adapter = new TemperatureObjectAdapter(temperature);
        adapter.setValue(30);

        System.out.println(adapter.getValue());
        System.out.println(temperature.getValue());
    }
}
