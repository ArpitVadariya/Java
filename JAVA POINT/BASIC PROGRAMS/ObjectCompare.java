public class ObjectCompare {
    public static void main(String[] args) {
        Double d = new Double(123.4567);
        Long l = new Long(1234567);

        System.out.println("Objects are not equal hence it returns " + d.equals(l));
        System.out.println("Objects are equal hence it returns " + d.equals(123.4567));
    }
}