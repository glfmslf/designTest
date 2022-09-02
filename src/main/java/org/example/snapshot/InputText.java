package org.example.snapshot;

import lombok.ToString;

/**
 * @author yuyou
 * @since 2022/9/1 16:19
 */
@ToString
public class InputText {
    private StringBuilder text = new StringBuilder();

    public String getText() {
        return text.toString();
    }

    public void append(String str) {
        text.append(str);
    }

    public Snapshot createSnapshot() {
        return new Snapshot(text.toString());
    }

    public void restoreSnapshot(Snapshot snapshot) {
        if (snapshot == null) {
            return;
        }
        this.text.replace(0, this.text.length(), snapshot.getText());
    }
}
