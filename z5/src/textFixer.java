public class textFixer {
    public String capitalize(String str) {
        if (str.isEmpty()) {return str;}
        return str.substring(0, 1).toUpperCase() + str.substring(1);}
    public String fixText(String text) {
        if (text == null) return null;
        text = text.trim();
        text = text.replace("„", "«").replace("“", "»");
        text = text.replace("цевилизаций", "цивилизаций");
        return capitalize(text);
    }
}
