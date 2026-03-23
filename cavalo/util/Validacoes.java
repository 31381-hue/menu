package util;

public class Validacoes {

    private Validacoes() {
        
    }

    public static boolean nomeValido(String nome) {
        return !(nome == null || nome.trim().isEmpty() || nome.matches(".*\\d+.*"));
    }

    public static String mensagemErroNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            return "Erro: O nome do cavalo não pode estar vazio!";
        } else if (nome.matches(".*\\d+.*")) {
            return "Erro: O nome não pode conter números!";
        }
        return "";
    }

    public static boolean idadeValida(int idade) {
        return idade >= 0 && idade <= 40; // cavalos vivem menos
    }

    public static String mensagemErroIdade(int idade) {
        if (idade < 0) {
            return "Erro: A idade não pode ser negativa!";
        } else if (idade > 40) {
            return "Erro: Idade inválida para um cavalo!";
        }
        return "";
    }
}