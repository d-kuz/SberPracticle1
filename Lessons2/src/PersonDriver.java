public class PersonDriver {
    public static void main(String[] args){
        Phone p1 = new Phone("1(111) 110-25-10", "fk35", 0.696);
        Phone p2 = new Phone("2(243) 243-23-45","0T2XV");
        Phone p3 = new Phone("3(246) 552-25-63", "KGKS_B_N", 0.413);
        Phone phone = new Phone();

        System.out.println(p1.getNumber());
        p1.reciveCall("Sara","4(542) 475-48-27");
        System.out.println("Модель p2" + p2.model);
        p2.number = "5(547) 636-75-78";

        phone.sendMessage(new String[]{"+7-944-433-32-22", "+7-999-999-99-99"});
        System.out.println(p3.toString());
    }
}
