public class Main {

    public static void main(String[] args) {

        System.out.println(removeOuterParentheses("((425))"));
        System.out.println(removeOuterParentheses("((()))"));
    }
        public static String removeOuterParentheses(String str) {
            StringBuilder sb = new StringBuilder();
            String output = "";
            int open=0, close=0, start=0;
            for(int i=0; i<str.length(); i++) {
                if(str.charAt(i) == '(') {
                    open++;
                } else if(str.charAt(i) == ')') {
                    close++;
                }
                if(open==close) {
                    sb.append(str.substring(start+1, i));
                    start=i+1;
                }
            }
            return sb.toString();
        }
    }

