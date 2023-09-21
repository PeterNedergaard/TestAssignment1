public class NumeralConverter {

    public String ConvertArabToRoma(int arabNum){
        char[] num = Integer.toString(arabNum).toCharArray();
        String result = "";

        String one = "";
        String five = "";
        String ten = "";

        int i = num.length - 1;
        for (char digit : num){
            if (i == 0){
                one = "I";
                five = "V";
                ten = "X";
            } else if (i == 1){
                one = "X";
                five = "L";
                ten = "C";
            } else if (i == 2){
                one = "C";
                five = "D";
                ten = "M";
            } else if (i == 3){
                one = "M";
                five = "";
                ten = "";
            }

            int digitNum = Character.getNumericValue(digit);

            if (digitNum >= 1 && digitNum <= 3){
                for(int j = 0; j < digitNum; j++){
                    result = result.concat(one);
                }

            } else if (digitNum == 4) {
                result = result.concat(one + five);

            } else if (digitNum >= 5 && digitNum <= 8) {
                result = result.concat(five);
                for(int j = 0; j < digitNum-5; j++){
                    result = result.concat(one);
                }

            } else if (digitNum == 9) {
                result = result.concat(one + ten);
            }

            i --;
        }

        return result;
    }
}
