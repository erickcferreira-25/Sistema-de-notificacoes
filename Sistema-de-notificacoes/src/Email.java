class Email implements Notificador {

    public void enviar(String mensagem) {
        IO.println("Enviando Email: " + mensagem);
    }
}