public class CheckArrayList {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(5);
        a.add(7);
        a.add(3);
        System.out.println(a.get(1));
        System.out.println(a.size());
        System.out.println(a.remove(0));
        a.clear();
    }
}
