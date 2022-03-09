import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BankOnline extends BancOnlineException {
    public String cardNumber;
    public double sum;
    public void send(String cardNumber, double money) throws InvalidCardNamberException, NegativeSumException, OutLimitException, NullArgException {
        if(cardNumber.replaceAll(" ", "").length() != 16){
            throw new InvalidCardNamberException("Карта введена не правильно!");
        }
        try{
            FileReader fr = new FileReader("BlockCards.txt");
            BufferedReader br = new BufferedReader(fr);
            String s;
            do{
                s = br.readLine();
                if (cardNumber.equals(s)){
                    throw new BlokCardException("Перевод на заблокрованную карту.");
                }
            }while (s != null);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (BlokCardException e) {
            e.printStackTrace();
        }
        if(money < 0) {
            throw new NegativeSumException("Введена отрицательная сумма");
        }
        if (money > 50_000) {
            throw new OutLimitException("Превышен лимит в 50 000");
        }
        if ((money == 0) || cardNumber.equals("")){
            throw new  NullArgException("Один или два аргумента равны null");
        }
        System.out.println("Операция прошла успешно!");
    }
}
