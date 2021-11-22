package interfacer;

public class Test {
    public static void main(String[] args) {
        // PrintInterface: void print()
        // CopyInterface: void copy()
        // PrintCopyMachine（抽象类）: 实现PrintInterface与CopyInterface
        // CommonPrintCopyMachine: 黑白打印复印机，继承PrintCopyMachine
        // ColorPrintCopyMachine: 彩色打印复印机，继承PrintCopyMachine
        // ThreeDPrintCopyMachine: 3D打印复印机，继承PrintCopyMachine


         PrintInterface printer = new ThreeDPrintCopyMachine();
         printer.print();

         CopyInterface copyer = new ThreeDPrintCopyMachine();
         copyer.copy();

         PrintCopyMachine machine = new ThreeDPrintCopyMachine();
         machine.print();
         machine.copy();
    }
}
