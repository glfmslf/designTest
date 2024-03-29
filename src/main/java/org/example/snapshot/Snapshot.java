package org.example.snapshot;

import lombok.ToString;

/**
 * @author yuyou
 * @since 2022/9/1 16:19
 */
@ToString
public class Snapshot {
    private String text;

    public Snapshot(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
