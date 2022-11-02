package UsuarioJuego;

public class main1 {

    public static void main(String[] args)  {

        UsuarioJuego usuarioJuego1 = new UsuarioJuego("Jorge","123456");

        usuarioJuego1.aumentarPuntaje();
        usuarioJuego1.subirNivel();

        System.out.println(usuarioJuego1);


        usuarioJuego1.bonus(58);

        System.out.println(usuarioJuego1);


    }

}
