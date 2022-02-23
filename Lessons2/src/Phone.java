package Lessons2.src;

public class Phone {
    public String number;
    public String model;
    public double weight;

    public void reciveCall (String name, String n){
        System.out.println("Звонит " + name + ", номер: " + n);
    }
    public String getNumber () {
        return number;
    }
    public Phone(String n, String m, double w){
        number = n;
        model = m;
        weight = w;
    }
    public Phone(String n, String m){
        number = n;
        model = m;
    }
    public Phone(){ }
    public void sendMessage (String[] numbers) {
        String [] a = numbers;
        System.out.print("Сообщение отправлено номерам: ");
        for (int j = 0; j < a.length; j++){
            if (j != a.length - 1) {
                System.out.print(a[j] + ", ");
            } else{
                System.out.print(a[j]);
            }
        }
        System.out.println();
    }
    public String toString () {
        return number + ", " + model + ", " + weight;
    }
}
