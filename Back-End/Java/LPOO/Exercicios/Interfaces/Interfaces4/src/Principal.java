public class Principal {
    public static void main(String[] args) {
        SmartTV smart = new SmartTV();
        smart.alterarCanal();
        smart.acessarInternet();

        OldTV old = new OldTV();
        old.alterarVolume();


    }
}
