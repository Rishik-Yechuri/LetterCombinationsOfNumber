import java.util.ArrayList;
import java.util.List;
class LetterCombinationsOfNumber {
    public static void main(String[] args){
        System.out.println(letterCombinations("23"));
    }
    public static List<String> letterCombinations(String digits){
        List<String> holdThings = new ArrayList<String>();
        return letterCombinationsHelper(digits,holdThings,"");
    }
    public static List<String> letterCombinationsHelper(String digits,List<String> combosToReturn,String currentString) {
        char[] charArray = digits.toCharArray();
        int currentInt = 0;
        if(charArray.length == 1){
            currentInt = Character.getNumericValue(charArray[0]);
            for(int x=1;x<=3;x++){
                combosToReturn.add(currentString+convertIntToString(currentInt,x));
            }
            if(currentInt == 7 || currentInt == 9){
                combosToReturn.add(currentString+convertIntToString(currentInt,4));
            }
            digits = digits.substring(1);
            return combosToReturn;
        }else if(charArray.length > 1){
            currentInt = Character.getNumericValue(charArray[0]);
            String newString = digits.substring(1);
            for(int x=1;x<=3;x++){
                combosToReturn = letterCombinationsHelper(newString,combosToReturn,currentString + convertIntToString(currentInt,x));
            }
            if(currentInt == 7 || currentInt == 9){
                combosToReturn = letterCombinationsHelper(newString,combosToReturn,currentString + convertIntToString(currentInt,4));
            }
            digits = digits.substring(1);
            //return letterCombinationsHelper(digits,combosToReturn,currentString);
        }
        return combosToReturn;
    }
    public static String convertIntToString(int x,int selection){
        if(x==2){
            if(selection == 1){
                return "a";
            }else if(selection == 2){
                return "b";
            }else if(selection == 3){
                return "c";
            }
        }
        if(x==3){
            if(selection == 1){
                return "d";
            }else if(selection == 2){
                return "e";
            }else if(selection == 3){
                return "f";
            }
        }

        if(x==4){
            if(selection == 1){
                return "g";
            }else if(selection == 2){
                return "h";
            }else if(selection == 3){
                return "i";
            }
        }

        if(x==5){
            if(selection == 1){
                return "j";
            }else if(selection == 2){
                return "k";
            }else if(selection == 3){
                return "l";
            }
        }

        if(x==6){
            if(selection == 1){
                return "m";
            }else if(selection == 2){
                return "n";
            }else if(selection == 3){
                return "o";
            }
        }

        if(x==7){
            if(selection == 1){
                return "p";
            }else if(selection == 2){
                return "q";
            }else if(selection == 3){
                return "r";
            }else if(selection == 4){
                return "s";
            }
        }

        if(x==8){
            if(selection == 1){
                return "t";
            }else if(selection == 2){
                return "u";
            }else if(selection == 3){
                return "v";
            }
        }

        if(x==9){
            if(selection == 1){
                return "w";
            }else if(selection == 2){
                return "x";
            }else if(selection == 3){
                return "y";
            }else if(selection == 4){
                return "z";
            }
        }
        return "a";
    }
}
