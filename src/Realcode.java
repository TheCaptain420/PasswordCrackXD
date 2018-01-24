public class Realcode {
    String[] tilladteSymboler = {"a", "b", "c", "d", "h"};
    String kode = "abda";
    String[] kodeSomArra = {"d","a","a","b","h"};

    public static void main(String[] args) {
        Realcode code = new Realcode();
        boolean codeGuessed = false;
        int place = 0;

        while( codeGuessed == false ) {
            code.runner(place);

            place++;
        }

        System.out.println("Hello my friend");
    }

    public String runner(int place) {
        for (int a = 0; a <= tilladteSymboler.length; a++) {

            if (tilladteSymboler[a].equals(kodeSomArra[place])) {
                System.out.println("koden er : " + tilladteSymboler[a]);
                return tilladteSymboler[a];



            }

        }
    return null;
    }
}

