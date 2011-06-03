package nisbet.duncan.animals;


public class BeTheCompiler {
    public static void main(String [] args){
        BeTheCompiler btc = new BeTheCompiler();
        btc.go();
    }
    void go(){
        int y= 7;
        for(int x = 1; x<8; x++) {
            y++;
            if (x > 4) {
                System.out.print(++y + " ");
            }
            if (y > 14) {
                System.out.println(" x = " + x);
                break;
            }
        }
    }

}
