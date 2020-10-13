package solution;
/*
public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] input = new String[num];
        int max = 0;
        int index = 0;
        String tmp = "";


        for (int i = 0; i < num; i++) {
            input[i] = br.readLine();
        }

        for (int i = 0; i < num; i++) {
            max = input[i].length();
            for (int j = i + 1; j < num; j++) {
                if (max < input[j].length()) {
                    max = input[j].length();
                    index = j;
                }
            }
            if (max != input[i].length()) {
                tmp = input[i];
                input[i] = input[index];
                input[index] = tmp;

            }
        }
        index = input[0].length();
        int test = 9;
        while (index > 0){
            for(int i = 0; i < num; i++){
                if(index - input[i].length() < 1){
                    tmp = input[i].substring(input[i].length() - index, input[i].length() - index + 1);
                    if(tmp.matches(".*[A-Z].*")){
                        for(int j = 0; j < num; j++){
                            input[j] = input[j].replace(tmp, Integer.toString(test));
                        }
                        test--;
                    }
                }
            }
            index--;
        }
        int answer = 0;
        for(int i = 0; i < num; i++){
            answer += Integer.parseInt(input[i]);
            System.out.println(input[i]);
        }
        System.out.println(answer);

    }
    /////////////////////////////////////
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] input = new String[num];
        int max = 0;
        int index = 0;
        String tmp = "";


        for (int i = 0; i < num; i++) {
            input[i] = br.readLine();
        }

        for (int i = 0; i < num; i++) {
            max = input[i].length();
            for (int j = i + 1; j < num; j++) {
                if (max < input[j].length()) {
                    max = input[j].length();
                    index = j;
                }
            }
            if (max != input[i].length()) {
                tmp = input[index];
                for(int j = index; j > i; j--){
                    input[j] = input[j-1];
                }
                input[i] = tmp;

            }
        }
        index = input[0].length();
        int test = 9;
        while (index > 0){
            for(int i = 0; i < num; i++){
                if(index - input[i].length() < 1){
                    tmp = input[i].substring(input[i].length() - index, input[i].length() - index + 1);
                    if(tmp.matches(".*[A-Z].*")){
                        for(int j = 0; j < num; j++){
                            input[j] = input[j].replace(tmp, Integer.toString(test));
                        }
                        test--;
                    }
                }
            }
            index--;
        }
        int answer = 0;
        for(int i = 0; i < num; i++){
            answer += Integer.parseInt(input[i]);
            System.out.println(input[i]);
        }
        System.out.println(answer);

    }
    ////////////////////////////////////////////////////////////
    public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] alphabet = new int[26];
        int ans = 0;
        int value = 9;

        for (int i = 0; i < num; i++) {
            char[] array = br.readLine().toCharArray();
            int pos = (int) Math.pow(10, array.length - 1);
            for (char c : array) {
                alphabet[c - 'A'] += pos;
                pos /= 10;
            }
        }

        Arrays.sort(alphabet);
        for (int i = alphabet.length - 1; i > -1; i--) {
            if (value == 0) {
                break;
            }

            ans += alphabet[i] * value--;
        }
        System.out.println(ans);

    }
}
 */
public class WordMath {
}
