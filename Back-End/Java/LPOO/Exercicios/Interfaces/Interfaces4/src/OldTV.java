public class OldTV implements Televisao{

    @Override
    public void ligar() {
        System.out.println("Ligar oldTV");
    }

    @Override
    public void desligar() {
        System.out.println("Desligar oldTV");
    }

    @Override
    public void alterarVolume() {
        System.out.println("Alterar volugar oldTV");
    }

    @Override
    public void alterarCanal() {
        System.out.println("Alterar canal oldTV");
    }
    
}
