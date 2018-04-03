public enum NavigationInstruction {

    RIGHT('R'), LEFT('L'), MOVE_FORWARD('M');


    private final char navigationInstruction;

    NavigationInstruction(char navigationInstruction) {

        this.navigationInstruction = navigationInstruction;
    }

    public char value() {
        return navigationInstruction;
    }
}
