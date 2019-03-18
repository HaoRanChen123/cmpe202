public interface Handler {
    String check(String s);
    public void setNext(Handler handler);
}
