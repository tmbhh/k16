public class FindRepeats {
    int numberOfRepeats(String text, String substring) {
        if (text == null || substring == null) {
            return 0; // Обработка null значений
        }
        int count = 0;
        int index = 0;
        while ((index = text.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length();
        }
        return count;
    }
}
