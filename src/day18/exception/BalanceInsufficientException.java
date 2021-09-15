package day18.exception;

public class BalanceInsufficientException extends Exception{

    public BalanceInsufficientException(){

    }
    public BalanceInsufficientException(String message){
        System.out.println(message);
    }

}
