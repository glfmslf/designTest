package org.example.snapshot;

import java.util.Stack;

/**
 * @author yuyou
 * @since 2022/9/1 16:26
 */
public class SnapshotHolder {

    private Stack<Snapshot> snapshots = new Stack<>();

    public Snapshot pop() {
        return snapshots.pop();
    }

    public void push(Snapshot snapshot) {
        snapshots.push(snapshot);
    }
}
