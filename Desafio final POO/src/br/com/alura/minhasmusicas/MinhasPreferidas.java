package br.com.alura.minhasmusicas;

public class MinhasPreferidas {
    public void inclui(Audio audio) {
        if (audio.getClassificacao() > 8 ) {
            System.out.println(audio.getTitulo() + " é um sucesso");
        } else {
            System.out.println(audio.getTitulo() + " é ruim");
        }
    }
}
