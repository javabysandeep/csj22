package arrayPractice;

public class StringQuestions {
    public static void main(String[] args) {
        String str = "abcNdgM";
        if(str==null || str.isEmpty()){
            return;
        }
        str = str.trim();
        StringBuilder stringBuilder = new StringBuilder(str);
        for (int index = 0; index < str.length(); index++) {

            if(str.charAt(index)=='M'){
//                stringBuilder.deleteCharAt(str.charAt(index));
                stringBuilder.replace(index,index, String.valueOf(str.charAt(index-1)));
            }
            if(str.charAt(index)=='N'){
                stringBuilder.replace(index, index+1, "");
               // stringBuilder.deleteCharAt(str.charAt(index+1));
            }
        }
        System.out.println(stringBuilder);
        //output: abcgg

    }
}
