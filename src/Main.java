import exercicio1.GeradorRelatorioFianceiro;
import exercicio1.ReportSender;

public class Main {
    public static void main(String[] args) {
        GeradorRelatorioFianceiro gerador = new GeradorRelatorioFianceiro();
        ReportSender sender = new ReportSender() ;

        gerador.gerarRelatorio();

        sender.enviarPorEmail();

    }
}