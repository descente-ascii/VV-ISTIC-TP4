package fr.istic.vv;

public class RomanNumeraUtils {

        private enum RomanNumeral {
                I('I'), V('V'), X('X'), C('C'), L('L'), D('D'), M('M');

                private final char i;

                RomanNumeral(char i) {
                        this.i = i;
                }

                public char getRomanNumeral(){
                        return this.i;
                }
        }
    
        public static boolean isValidRomanNumeral(String value) { return false; }
    
        public static int parseRomanNumeral(String numeral) {
                int result = 0;

                if (numeral == null){
                        throw new IllegalArgumentException();
                }
                if (numeral.isBlank() || numeral.isEmpty()){
                        return 0;
                }
                numeral = numeral.toUpperCase();

                for(int i=0 ; i<numeral.length(); i++){
                        int tmp = 0;
                        switch (numeral.charAt(i)){
                        }
                }
                return 0;
        }
    
        public static String toRomanNumeral(int number) { return ""; }
    
}
