package banksystem;

/**
 * Lớp Violation đã sửa lỗi thụt lề 2-space.
 */
public class Violation {
    // Dòng 8: 'member def modifier' - Thụt lề đúng 2 spaces
    private int value;

    /**
     * Phương thức kiểm tra.
     */
    // Dòng 13: 'method def modifier' - Thụt lề đúng 2 spaces
    public void testMethod() {
        // Dòng 15 & 16: 'method def' child - Thụt lề đúng 4 spaces (2+2)
        int shortName = 10;
        System.out.println(value + shortName);
    } // Dòng 17: 'method def rcurly' - Thụt lề đúng 2 spaces
}