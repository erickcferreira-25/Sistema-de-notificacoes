public class Main {
        public static void main(String[] args) {

            Notificador notificador = new Email();
            notificador.enviar("Codigo: 240.562.220.67");

            notificador = new SMS();
            notificador.enviar("Numero:11 99420-6767!");
        }
}