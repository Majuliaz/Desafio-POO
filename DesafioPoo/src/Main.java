public class Main {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

    
        meuIphone.selecionarMusica("Vanish Into You - Lady Gaga");
        meuIphone.tocar();
        meuIphone.pausar();

        meuIphone.ligar("123456789");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        meuIphone.exibirPagina("https://www.apple.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}