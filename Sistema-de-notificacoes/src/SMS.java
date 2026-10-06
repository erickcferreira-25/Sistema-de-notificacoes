class SMS implements Notificador {

    public void enviar(String mensagem) {
        IO.println("Enviando SMS: " + mensagem);
    }
}