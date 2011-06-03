package nisbet.duncan.phraseomatic;


public class PhraseOMatic {
    
    private String bob = "Dunc";
    public int currentValue = 3;
//  private String[] wordListOne = {"24/7", "multi-tier", "30,000 foot"};
//  private String[] wordListTwo = {"empowered", "sticky", "value-added"};
//  private String[] wordListThree = {"process", "tipping point", "solution"};
//    public static void main (String[] args){
//        String[] wordListOne = {"24/7", "multi-tier", "30,000 foot"};
//        String[] wordListTwo = {"empowered", "sticky", "value-added"};
//        String[] wordListThree = {"process", "tipping point", "solution"};
//        
//        int oneLength = wordListOne.length;
//        int twoLength = wordListTwo.length;
//        int threeLength = wordListThree.length;
//        
//        int rand1 = (int) (Math.random()* oneLength);
//        int rand2 = (int) (Math.random()* twoLength);
//        int rand3 = (int) (Math.random()* threeLength);
//        
//        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
//        
//        System.out.println("What we need is a " + phrase);
//    }

    public void add5()
    {
            currentValue += 5;
    }
    
    public int getCurrentValue(){
        return currentValue;
    }

        
        
    }


