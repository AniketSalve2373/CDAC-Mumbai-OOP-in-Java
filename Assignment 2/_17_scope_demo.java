class _17_scope_demo {
    int x = 10;

    void method() {
        int x = 20;
        System.out.println("Local: " + x);
        System.out.println("Instance: " + this.x);
    }

    public static void main(String[] args) {
        _17_scope_demo obj = new _17_scope_demo();
        obj.method();
    }
}