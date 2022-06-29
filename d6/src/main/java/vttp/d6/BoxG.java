// Parameterisation to give T any identity type

package vttp.d6;

public class BoxG<T> {

    private T content;

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}
