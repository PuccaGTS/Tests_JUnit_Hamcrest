public class ReverseString {
    public String reverseString (String line){
        if (line == null) {
            return "Нельзя перевернуть null";
        }
        if (line.equals("")){
            return "Тут нет текста \nобратитесь к разарботчику \nВася Иванов, телефон +7-999-444-45-65";
        }
        String reverse;
        StringBuilder sb = new StringBuilder(line);
        return reverse = sb.reverse().toString();
    }
}
