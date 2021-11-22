package interfacer;

public class ColorPrintCopyMachine extends PrintCopyMachine{
    @Override
    public void copy() {
        System.out.println("彩色打印复印机，复印功能");
    }

    @Override
    public void print() {
        System.out.println("彩色打印复印机，打印功能");
    }
}
