public class SmartTV implements Televisao, Smart{

    @Override
    public void ligar() {
        System.out.println("Ligar SmartTV");
    }

    @Override
    public void desligar() {
        System.out.println("Desligar SmartTV");
    }

    @Override
    public void alterarVolume() {
        System.out.println("Alterar volugar SmartTV");
    }

    @Override
    public void alterarCanal() {
        System.out.println("Alterar canal SmartTV");
    }

    @Override
    public void acessarInternet() {
        System.out.println("Acessando a internet");
    }

    @Override
    public void baizarApp() {
        System.out.println("Baixando app");
    }
}
