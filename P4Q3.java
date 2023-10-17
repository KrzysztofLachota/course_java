public class P4Q3 {
    public static int indexOfFirstOccurrence(String[] stringArray, String target){
        int length = stringArray.length;
        int res = -1;
        for(int i=0; i<length; i++){
            if (stringArray[i].equals(target)) {
                res = i;
                break;
            }
            }
        return res;
        }

    public static void main(String[] args) {
        String[] sentence = {"Learning", "quite", "Java", "is", "fun."};
        int indexOfWordJava = indexOfFirstOccurrence(sentence, "Java");
        System.out.println(indexOfWordJava);
    }
}
