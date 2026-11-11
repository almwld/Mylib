package androidx.collection;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes.dex */
public abstract class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long[] f11813a = {-9187201950435737345L, -1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final P f11814b = new P(0);

    public static final int a(int i4) {
        if (i4 == 7) {
            return 6;
        }
        return i4 - (i4 / 8);
    }

    public static final int b(int i4) {
        if (i4 == 0) {
            return 6;
        }
        return (i4 * 2) + 1;
    }

    public static final int c(int i4) {
        if (i4 > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i4);
        }
        return 0;
    }

    public static final int d(int i4) {
        if (i4 == 7) {
            return 8;
        }
        return ((i4 - 1) / 7) + i4;
    }
}
