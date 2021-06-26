public interface IMultiFunction {
    public void print();
    public void getPrintSpoolDetails();
    public void scan();
    public void scanPhoto();
    public void fax();
    public void internetFax();
}

public interface IPrint {

    public void print();
    public void getPrintSpoolDetails();

}

public interface IScan {

    public void scan();
    public void scanPhoto();

}

public interface IFax {

    public void fax();
    public void internetFax();

}