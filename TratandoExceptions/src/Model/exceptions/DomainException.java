package Model.exceptions;

public class DomainException extends RuntimeException {
    private static final long serialVersionuid = 1L;

    public DomainException(String msg){
        super(msg);
    }

}
