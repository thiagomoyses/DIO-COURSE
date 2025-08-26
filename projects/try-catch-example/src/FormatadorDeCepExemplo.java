public class FormatadorDeCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("2376564");
            System.err.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.err.println("O CEP nao corresponde as regras de negocio");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if(cep.length() != 8)
            throw new CepInvalidoException();
            return "23.765-064";
    }
}
