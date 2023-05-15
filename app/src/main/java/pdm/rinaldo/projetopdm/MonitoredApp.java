package pdm.rinaldo.projetopdm;

public class MonitoredApp {
    private String name;
    private double usedHours, hoursLeft, totalHours;

    //TODO buscar saber como retornar o nome de um app instalado através de seu pacote

    public MonitoredApp(String name, double usedHours, double hoursLeft, double totalHours) {
        this.name = name;
        this.usedHours = usedHours;
        this.hoursLeft = hoursLeft;
        this.totalHours = totalHours;
    }

}
