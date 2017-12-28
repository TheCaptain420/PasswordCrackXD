public class Pincode {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] symboler = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] kode = new int[6];
        kode[0] = 2;
        kode[1] = 2;
        kode[2] = 1;
        kode[3] = 2;
        kode[4] = 5;
        kode[5] = 7;


        for (int i = 0; i < symboler.length; i++) {
            for (int j = 0; j < symboler.length; j++) {
                for (int k = 0; k < symboler.length; k++) {
                    for (int l = 0; l < symboler.length; l++) {
                        for (int m = 0; m < symboler.length; m++) {
                            for (int n = 0; n < symboler.length; n++) {

                                if (symboler[i] == kode[0] && symboler[j] == kode[1] && symboler[k] == kode[2] && symboler[l] == kode[3] && symboler[m] == kode[4] && symboler[n] == kode[5]) {
                                    System.out.println("Kode fundet:" + symboler[i] + " " + symboler[j] + " " + symboler[k] + " " + symboler[l] + " " + symboler[m] + " " + symboler[n]);
                                }
                            }
                        }
                    }
                }
            }
        }


    }
}
