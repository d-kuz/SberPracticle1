public class Test {
    public static void main(String[] args) {
        BankOnline card = new BankOnline();
        try {
            card.send("1563 5654 4568 4865", 5000);
        }catch (NullArgException e) {
            e.printStackTrace();
        }catch (OutLimitException e) {
            e.printStackTrace();
        }catch (NegativeSumException e) {
            e.printStackTrace();
        }catch (InvalidCardNamberException e) {
            e.printStackTrace();
        }
        try {
            card.send("1563 5654 4568 486", 500000);
        } catch (NullArgException e) {
            e.printStackTrace();
        } catch (OutLimitException e) {
            e.printStackTrace();
        } catch (NegativeSumException e) {
            e.printStackTrace();
        } catch (InvalidCardNamberException e) {
            e.printStackTrace();
        }
        try {
            card.send("1563 5654 4568 4865", -55);
        } catch (NullArgException e) {
            e.printStackTrace();
        } catch (OutLimitException e) {
            e.printStackTrace();
        } catch (NegativeSumException e) {
            e.printStackTrace();
        } catch (InvalidCardNamberException e) {
            e.printStackTrace();
        }
        try {
            card.send("1234 1234 1234 1234", 0);
        } catch (NullArgException e) {
            e.printStackTrace();
        } catch (OutLimitException e) {
            e.printStackTrace();
        } catch (NegativeSumException e) {
            e.printStackTrace();
        } catch (InvalidCardNamberException e) {
            e.printStackTrace();
        }
    }
}
