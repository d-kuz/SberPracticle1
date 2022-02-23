package Lessons2.src;

public class PersonDriver {
    public static void main(String[] args){
        Phone fly = new Phone("1(111) 110-25-10", "fk35", 0.696);
        Phone oppo = new Phone("2(243) 243-23-45","0T2XV");
        Phone nok = new Phone("3(246) 552-25-63", "KGKS_B_N", 0.413);
        Phone phone = new Phone();

        System.out.println(fly.getNumber());
        fly.reciveCall("Sara","4(542) 475-48-27");
        System.out.println("Модель oppo" + oppo.model);
        oppo.number = "5(547) 636-75-78";

        phone.sendMessage(new String[]{"79444333222", "+79999999999"});
        nok.toString();
    }
}
