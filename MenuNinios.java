package restaurant;

public class MenuNinios extends Menu {

    private double valorHelado;
    private double valorPastel;

    public MenuNinios(String nombrePlato, double valorInicial,
            double valorHelado, double valorPastel) {

        super(nombrePlato, valorInicial);
        this.valorHelado = valorHelado;
        this.valorPastel = valorPastel;

        calcularValorMenu();
    }

    @Override
    public void calcularValorMenu() {
        valorFinal= valorInicial + valorHelado + valorPastel;
    }

    @Override
    public String toString() {
        return "\n--- MENU NINIOS ---"
                + "\nPlato: " + nombrePlato
                + "\nValor Inicial: $" + String.format("%.2f", valorInicial)
                + "\nHelado: $" + String.format("%.2f", valorHelado)
                + "\nPastel: $" + String.format("%.2f", valorPastel)
                + "\nValor Menu: $" + String.format("%.2f", valorFinal);
    }
}
