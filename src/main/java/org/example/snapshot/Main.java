package org.example.snapshot;

import java.util.Scanner;

/**
 * @author yuyou
 * @since 2022/9/1 16:27
 */
public class Main {
    public static void main(String[] args) {
        InputText inputText = new InputText();
        SnapshotHolder snapshotsHolder = new SnapshotHolder();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            if (input.equals(":list")) {
                System.out.println(inputText);
            } else if (input.equals(":undo")) {
                Snapshot snapshot = snapshotsHolder.pop();
                System.out.println("撤销:" + snapshot);

                inputText.restoreSnapshot(snapshot);
            } else {
                snapshotsHolder.push(inputText.createSnapshot());
                inputText.append(input);
            }
        }
    }
}
