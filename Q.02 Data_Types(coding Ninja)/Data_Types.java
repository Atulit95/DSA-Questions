public class Data_Types {
    public static int dataTypes(String type) {
        // Write your code here
        // int x=0;
        if (type.equals("Integer") || type.equals("Float")) {
            return 4;
        } else if (type.equals("Long") || type.equals("Double")) {
            return 8;
        } else if (type.equals("Character")) {
            return 1;
        }
        return -1;
    }
}