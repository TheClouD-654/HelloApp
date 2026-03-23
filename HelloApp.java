public class HelloApp {
    StringBuilder namebuilder = new StringBuilder();
    void main(String[] args, String name) {
        for (int i=0; i<args.length; i++) {
            namebuilder.append(args[i]);
            if (i < args.length - 1) {
                namebuilder.append(", ");
            }
            name = namebuilder.toString();
        }
    }
}