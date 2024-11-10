import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FormulaRestoration {

  public String[] solution(String[] expressions) {
    String[] answer = {};
    List<String> XList = new ArrayList<>();
    List<String> numberList = new ArrayList<>();
    int maxDecimal = 0;
    List<String> result = new ArrayList<>();
    int solutionDecimal = 0;

    for (String e : expressions) {
      maxDecimal = Math.max(maxDecimal, findBigInt(e) + 1);
      if (e.contains("X")) {
        XList.add(e);
      } else {
        numberList.add(e);

      }
    }

    for (String e : numberList) {
      int index = 0;
      int solution = 0;
      for (int i = maxDecimal; i <= 9; i++) {
        if (findDecimal(e, i)) {
          index++;
          solution = i;
        }
      }
      if (index == 1) {
          solutionDecimal = solution;
      }
    }
    for (String e : XList) {
      int decimal = findBigInt(e) + 1;
      maxDecimal = Math.max(maxDecimal, decimal);
      String[] split = e.split(" ");
      String answerStr = null;

      if (solutionDecimal >= maxDecimal) {
        int answerInt = split[1].equals("+") ? Integer.parseInt(split[0], solutionDecimal) + Integer.parseInt(split[2], solutionDecimal)
            : Integer.parseInt(split[0], solutionDecimal) - Integer.parseInt(split[2], solutionDecimal);
        answerStr = e.replace("X", Integer.toString(answerInt, solutionDecimal));
      } else {
        for (int i = maxDecimal; i <= 9; i++) {
          int answerInt = split[1].equals("+") ? Integer.parseInt(split[0], i) + Integer.parseInt(split[2], i)
              : Integer.parseInt(split[0], i) - Integer.parseInt(split[2], i);
          if (answerStr == null) {
            answerStr = e.replace("X", Integer.toString(answerInt, i));
          } else {
            String answerStrSplit = answerStr.split(" ")[4];
            if (!answerStrSplit.equals(Integer.toString(answerInt, i))) {
              answerStr = e.replace("X", "?");
            }
          }
        }
      }
        result.add(answerStr);
    }
    answer = result.toArray(new String[0]);

    return answer;
  }

  public boolean findDecimal(String input, int decimal) {
    //1 + 1 = 2
    String[] split = input.split(" ");
    int result;
    if (split[1].equals("+")) {
      result = Integer.parseInt(split[0], decimal) + Integer.parseInt(split[2], decimal);
    } else {
      result = Integer.parseInt(split[0], decimal) - Integer.parseInt(split[2], decimal);
    }
    return result == Integer.parseInt(split[4], decimal);
  }

  public int findBigInt(String input) {
    int maxDigit = Integer.MIN_VALUE;
    Pattern pattern = Pattern.compile("\\d"); // 각 자리 숫자를 찾기 위한 정규식
    Matcher matcher = pattern.matcher(input);

    while (matcher.find()) {
      int digit = Integer.parseInt(matcher.group()); // 각 숫자를 int로 변환
      if (digit > maxDigit) {
        maxDigit = digit;
      }
    }

    return maxDigit;
  }

}
