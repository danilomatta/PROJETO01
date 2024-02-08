import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

    @Override
    public void tocar() {
        // Implementação específica para tocar música no iPhone
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        // Implementação específica para pausar a música no iPhone
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica() {
        // Implementação específica para selecionar uma música no iPhone
        System.out.println("Selecionando música: ");
    }

    @Override
    public void ligar() {
        // Implementação específica para ligar no iPhone
        System.out.println("Ligando para ");
    }

    @Override
    public void atender() {
        // Implementação específica para atender uma chamada no iPhone
        System.out.println("Atendendo chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
        // Implementação específica para iniciar o correio de voz no iPhone
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina() {
        // Implementação específica para exibir uma página no navegador do iPhone
        System.out.println("Exibindo página:");
    }

    @Override
    public void adicionarNovaAba() {
        // Implementação específica para adicionar uma nova aba no navegador do iPhone
        System.out.println("Adicionando nova aba: ");
    }

    @Override
    public void atualizarPagina() {
        // Implementação específica para atualizar a página no navegador do iPhone
        System.out.println("Atualizando página");
    
}
}
