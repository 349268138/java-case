package interfacer;

public class ThreeDPrintCopyMachine extends PrintCopyMachine{
    @Override
    public void copy() {
        System.out.println("3D打印复印机，复印功能");
    }

    @Override
    public void print() {
        System.out.println("3D打印复印机，打印功能");
    }
}
