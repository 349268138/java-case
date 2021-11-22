package interfacer;

public class CommonPrintCopyMachine extends PrintCopyMachine{
    @Override
    public void copy() {
        System.out.println("黑白打印复印机，复印功能");
    }

    @Override
    public void print() {
        System.out.println("黑白打印复印机，打印功能");
    }
}
