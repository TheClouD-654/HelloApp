public class HelloApp {
    void main(String[] args) {
        StringBuilder nameBuilder = new StringBuilder();
        boolean first = true;
        for (String arg : args) {
            if (!first) {
                nameBuilder.append(" ");
            }
            nameBuilder.append(arg);
            first = false;
        }
    }
}