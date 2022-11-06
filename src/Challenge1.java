import java.util.ArrayList;

public class Challenge1 {
    public static class ContentGenerator{
        public String generateNumber(String type){
            int randomNumber;
            String prefix="";
            String suffix="";
            final int NUMBER_LENGHT=8;

            for (int i=1; i <=NUMBER_LENGHT; i++){
                randomNumber=(int)(Math.random()*9);
                suffix+=randomNumber;
            }
            if (type.equals("Tipo A")){
                prefix="54";
            }else if (type.equals("Tipo B")){
                prefix="08";
            }else {
                System.out.println("You must specify a type code");
                suffix="Empty";
            }
            System.out.println("Your number is: "+prefix+suffix);
            return prefix+suffix;
        }

        public boolean belongToListChecker(String element, ArrayList<String> products) {
            boolean status=true;
            for (String product : products) {
                if (product.equals(element)) {
                    status=false;
                    System.out.println("The "+product+" belong to the list");
                    break;
                }
            }
            System.out.println("The element is not on the list? "+ status);
            return status;
        }

    }

    public static void main(String[] args) {
        System.out.println("Exercise #1");

        ContentGenerator myNumber=new ContentGenerator();
        myNumber.generateNumber("Tipo A");
        myNumber.generateNumber("Tipo B");
        myNumber.generateNumber("Tipo C");

        System.out.println("\nExercise #2");

        ContentGenerator myProduct=new ContentGenerator();
        ArrayList<String> myFruits = new ArrayList <String>();
        myFruits.add("Apple");
        myFruits.add("Orange");
        myFruits.add("Grapes");
        myFruits.add("Mango");
        myFruits.add("Guava");
        myFruits.add("Pineapple");

        myProduct.belongToListChecker("Apple",myFruits);
        myProduct.belongToListChecker("Coconout",myFruits);
    }
}
