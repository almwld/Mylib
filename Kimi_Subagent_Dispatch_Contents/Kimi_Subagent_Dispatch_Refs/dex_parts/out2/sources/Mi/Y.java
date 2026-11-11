package Mi;

import ub.U4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class Y {
    public static final Y a;
    public static final Y b;
    public static final Y c;
    public static final /* synthetic */ Y[] d;

    static {
        Y y = new Y("Chat", 0);
        a = y;
        Y y2 = new Y("Image", 1);
        b = y2;
        Y y3 = new Y("KimiPlus", 2);
        c = y3;
        Y[] yArr = {y, y2, y3};
        d = yArr;
        U4.o(yArr);
    }

    public static Y valueOf(String str) {
        return (Y) Enum.valueOf(Y.class, str);
    }

    public static Y[] values() {
        return (Y[]) d.clone();
    }
}
